#include <stdio.h>
#include <string>
# include <iostream>
#define LUA_LIB

extern "C"{
#include "lua.h"
#include "lualib.h"
#include "lauxlib.h"
}

using namespace std;

int main()
{
    char line[260];

    printf("Assignment #3-3, Charles Graven, c.j.gravenn@gmail.com\n");
    
    fgets(line,sizeof(line),stdin);

    lua_State* L = luaL_newstate();
    
    luaL_openlibs(L);

    int result;

    result = luaL_loadfile(L,"prog3_2.lua");

    lua_pcall(L,0,0,0); //priming

    lua_getglobal(L,"InfixToPostfix");

    if(result!=LUA_OK){
        //failed
    }

    lua_pushstring(L,line);

	lua_pcall(L,1,1,0);

    const char *str = lua_tostring(L,-1);

    printf("%s", str);

    lua_pop(L,1);

	lua_close(L);

	return 0;
}
