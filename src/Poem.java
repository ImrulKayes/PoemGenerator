import Model.*;
import Service.GrammerRulesParser;
import Service.RandomPoemGenerator;

public class Poem {

	public static void main(String[] args) {
		// Input file name
		String INPUT_FILE_NAME = "Grammar.txt";
		
		// Read the input file and parse the grammar
		GrammerRulesParser grammerRulesParser= new GrammerRulesParser();
		Grammar grammar= grammerRulesParser.readInputFile(INPUT_FILE_NAME);
		
		// Generate a random poem using the grammar
		RandomPoemGenerator randomPoemGenerator= new RandomPoemGenerator();
		randomPoemGenerator.generatePoem(grammar);
		
	}

}
