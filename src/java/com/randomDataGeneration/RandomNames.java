package com.randomDataGeneration;

import java.util.List;
import java.util.Random;

import com.io.ReadFile;

public class RandomNames {

	public String[] geneateRandomNames(int numberOfNames) {
		String[] namesGenerated = new String[numberOfNames];
		
		ReadFile readFile = new ReadFile();
		List<String> firstNames = readFile.readRowsFromFile("first names.csv");
		List<String> lastNames = readFile.readRowsFromFile("last names.csv");
		int numberOfFirstNames = firstNames.size();
		int numberOfLastNames = lastNames.size();
		
		for(int i=0;i<numberOfNames;i++) {
			
			Random randomGenerator = new Random();
			int firstNameIndex = randomGenerator.nextInt(numberOfFirstNames);
			int lastNameIndex = randomGenerator.nextInt(numberOfLastNames);
			namesGenerated[i] = firstNames.get(firstNameIndex)+" "+lastNames.get(lastNameIndex);
			
		}
		
		return namesGenerated;
	}
}
