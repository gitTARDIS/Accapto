package org.accapto;

import java.io.File;

import org.accapto.helper.InputParser;
import org.accapto.helper.Logger;
import org.accapto.tool.AppScaffolder;
import org.accapto.tool.ModelParser;

public class AccaptoMain {

	public static void main(String[] args) {

		InputParser inputParser = new InputParser(args);
		
		File inputFile = inputParser.getInputFile(); 
		Logger logger = inputParser.getLogger();
				

		// Parse XML File and create Java Model
		if (inputFile != null) {
			ModelParser parser = new ModelParser(inputFile, logger);
			parser.parseDSL();
		
		
			//create Scaffold
			AppScaffolder scaffold = new AppScaffolder(parser.getApp(), logger, inputParser.getOutputArg());
			scaffold.generate();
		}
		

	}

}