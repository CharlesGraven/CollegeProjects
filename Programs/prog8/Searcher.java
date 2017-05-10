package Sunshine.core;

import twitter4j.Status;

/**
 *  Program #8
 *  Searcher contains methods that
 *  check and sum the words of a tweet
 *  CS108-3
 *  Date 5/1/2017
 *  @author Charles Graven
 */
public class Searcher {

	/**
	 * Adds how many long words are in a tweet 
	 * @param tweet the tweet to be analyzed
	 * @param length the length that you consider a big word to be
	 * @return the amount of long words in the tweet
	 */
	public static int isBigWord(Status tweet, int length){
		int amount = 0;
		
		String[] words = tweet.getText().split(" ");
		for(int i = 0; i <words.length;i++){
				if(words[i].length()>=length){
					amount++;
				}
		}
		return amount;
	}
	
	/**
	 * Searches a tweet for a word and adds how many
	 * times that specific word appears
	 * @param tweet to be searched
	 * @param searchWord word to be searched
	 * @return the amount of times the word came up
	 */
	public static int searchWord(Status tweet, String searchWord){
		int amount = 0;
		
		String newWord = searchWord.toLowerCase();
		String[] words = tweet.getText().split(" ");
		for(int i = 0; i <words.length;i++){
				String a = words[i].toLowerCase();
				if(a.contains(searchWord)){
					amount++;
				}
		}
		return amount;
	}
	
	/**
	 * Searches a tweet for a word and returns if the
	 * word appears in the tweet
	 * @param tweet to be searched
	 * @param searchWord word to be searched
	 * @return if the word is in the tweet
	 */
	public static boolean hasSaid(Status tweet, String searchWord){
		
		String[] words = tweet.getText().split(" ");
		for(int i = 0; i <words.length;i++){
				if(words[i].contains(searchWord)){
					return true;
				}
		}
		return false;
	}
}
