#include <stdio.h>
#include <string>
# include <iostream>
#define LUA_LIB

extern "C"{
#include "lua.h"
#include "lualib.h"
#include "lauxlib.h"
}


int main(int argCount, char** args)
{
    printf("Assignment #3-1, Charles Graven, c.j.gravenn@gmail.com\n");
    lua_State *state = luaL_newstate();
    
    luaL_openlibs(state);

    luaL_dofile(state,args[1]);

    // Load the program; this supports both source code and bytecode files.
    //result = luaL_loadfile(state, args[0]);

    //if ( result != LUA_OK ) {
     //   return 0;
    //}
    
    lua_pcall(state,0,0,0);
    
    lua_close(state);
    
    return 0;
}
