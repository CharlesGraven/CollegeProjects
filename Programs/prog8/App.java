package Sunshine.core;

import java.util.Scanner;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import Sunshine.core.Searcher;

/**
 *  Program #8
 *  This program will get user data from any
 *  twitter account and also analyze hashtags
 *  CS108-3
 *  Date 5/1/17
 *  @author Charles Graven
 */
public class App {

	public static void main(String[] args) throws TwitterException{
		
		//Getting authenticated
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		.setOAuthConsumerKey("WCY0kYfMFLUaefRwkzMTkHsEU")
		.setOAuthConsumerSecret("aOu5xG115BrVQbyTQw5TVeDpU2J1dqBcllLDfJORpYDXl5YLGr")
		.setOAuthAccessToken("2562012669-PXcFoeOeFC738wWEfctClbaBfUTlbhnpSFatsGp")
		.setOAuthAccessTokenSecret("7SkgjkYrVwzxR0T9XYT9FAjbj8aCPn9PFTXiQakN3Q8ka");
		
		TwitterFactory tFactory = new TwitterFactory(cb.build());
		Twitter twitter = tFactory.getInstance();
		
		Scanner scnr = new Scanner(System.in);
		String userName = "";
		
		System.out.println("Program 6, Charles Graven, cssc0505");
		
		System.out.println("Please enter a hashtag that you are interested in...");
		String hashtag = scnr.nextLine();
		
		//Query the results of the given hashtag
		Query q = new Query(hashtag);
		QueryResult result = twitter.search(q);
		
		System.out.println("Please enter in a word that you would like to find in conjunction to the recent hashtag...");
		String word = scnr.nextLine();
		
		System.out.println("What size word would you like a tally for?");
		int length = 0;
		
		length = scnr.nextInt();
		int numberWord = 0;
		int bigWords = 0;
		
		/*
		 * Count the number of times the word shows up
		 * Count how many big words are in the hashtag
		 */
		for(Status s : result.getTweets()){
			numberWord+=Searcher.searchWord(s, word);
			bigWords += Searcher.isBigWord(s, length);
		}
		
		//Give user back data
		System.out.println("The word '" + word + "' comes up "+numberWord+""
				+ " times in recent tweets about the hashtag #"+hashtag+"\n");
		System.out.println("There are "+bigWords+" big words associated with the current hashtag #"+hashtag);
		
	}
	
}
