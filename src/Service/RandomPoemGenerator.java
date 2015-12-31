package Service;

import Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomPoemGenerator {
	public void generatePoem(Grammar grammar){

		// Get the main/starting rule
        Rule mainRule = grammar.getRules().get(grammar.getMainRule());
        
        // Get the references to be executed by the main rule
        List<Rule> ruleQueues= new ArrayList<Rule>();
        for(String ruleName: mainRule.getReferencesAndKeywords()){     	
        	ruleQueues.add(grammar.getRules().get(ruleName.substring(1, ruleName.length() - 1)));
        }
        
        // Execute references
        for(Rule rule: ruleQueues){
        	ruleOutput(rule, grammar);
        }
	}
	
    private static void ruleOutput(Rule rule, Grammar grammar) {
    	
    	// If the rule has words, print a random one 
    	if (rule.getWords()!=null){
	        List<String> words = rule.getWords();
	        int random = getRandomNumber(0, words.size());
	        String word = words.get(random);
	        System.out.print(word+" "); 
    	}
    	
    	// Get a random references and keywords
        List<String> ReferencesAndKeywords=rule.getReferencesAndKeywords();
        int random = getRandomNumber(0, ReferencesAndKeywords.size());
        String refKeyString = ReferencesAndKeywords.get(random);
        
        if (refKeyString.matches("<[A-Z]+>")) {
        	// The random selection is a Rule
        	// Execute the rule
        	Rule nextRule = grammar.getRules().get(refKeyString.substring(1, refKeyString.length() - 1));
        	ruleOutput(nextRule, grammar);
        }
        else {
        	// The random selection is a Keyword
        	// Print it
        	Rule.Keywords valueOf = Rule.Keywords.valueOf(refKeyString);
        	System.out.print(valueOf.getValue());
        }
    }
    
    // Method to generate random numbers in a range
    private static int getRandomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min) + min;
    }
}
