package cs141.robward;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class MorseConverter implements Converter {
	private HashMap <String, String> morseToLetter = new HashMap <String, String>();

	private HashMap<String, String> letterToMorse  = new HashMap <String, String>();
	
	
	public MorseConverter(String encodingfile)
	{
		

		try (BufferedReader br = new BufferedReader(new FileReader("MorseCodeTable.txt")))
		{
			String line = "";
			while ((line = br.readLine()) != null)
			{
				String parts [] = line.split(" ");
				
				morseToLetter.put(parts[1], parts[0]);
				letterToMorse.put(parts[0], parts[1]);
				
				
			}
				
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
		}
	
	}
	@Override
	public void printKeyValuePairs() {
		for (String name : morseToLetter.keySet())
		{
			String morse = name.toString();
			String letter = morseToLetter.get(name).toString();
			System.out.println(morse  + " " + letter);
		}
		for (String name : letterToMorse.keySet())
		{
			String letter = name.toString();
			String morse = letterToMorse.get(name).toString();
			System.out.println(letter  + " " + morse);
		}
		

	}
	

	
	@Override
	public String encodeSentence(String textToEncode) {
		
		String words [] = textToEncode.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < words.length; i++)
		{
			sb.append(encodeWord(words[i]));
			sb.append("   ");
		}
		return sb.toString().trim();
	
		
	}

	@Override
	public String encodeWord(String textToEncode) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < textToEncode.length(); i ++)
		{
			String letter = (textToEncode.charAt(i)  +"").toLowerCase();
			
			sb.append( letterToMorse.get(letter));
			sb.append(" ");
			
			
		}
		return sb.toString().trim();
	}

	@Override
	public String decodeSentence(String textToDecode) {
		
	StringBuilder sb = new StringBuilder();
	String words [] = textToDecode.split("   ");
	
	for (int i = 0; i < words.length; i ++)
	{
		sb.append(decodeWord(words[i]));
		sb.append(" ");
		
	}
	return sb.toString().trim();
	
		
	}

	@Override
	public String decodeWord(String wordToDecode) {
		StringBuilder sb = new StringBuilder();
		String letters[] = wordToDecode.split(" ");
		
		for (int i = 0; i < letters.length; i ++)
		{
		sb.append(morseToLetter.get(letters[i]));
		}
		
		return sb.toString().trim();
	}

	@Override
	public boolean encodeFileToFile(String plainTextFileName, String encodedTextFileName) {
ArrayList<String> list = new ArrayList<String>();

		try (BufferedReader br = new BufferedReader(new FileReader(plainTextFileName)))
		{
			String line = "";
			while ((line = br.readLine()) != null)
			{
				list.add(encodeSentence(line));
			    
			}
				
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
		}


try {
	writeFileLines(encodedTextFileName, list);
} catch (IOException e) {
	e.printStackTrace();
}
      
		return false;
	}

	private void writeFileLines(String encodedTextFileName, ArrayList<String> list) throws IOException {
		FileWriter file = new FileWriter(encodedTextFileName);
      	for (String write : list) {
      		file.write(String.format("%s%n",write));
      	}
      	file.close();
		
	}
	private void writeFileLines2(String plainTextFileName, ArrayList<String> list2) throws IOException {
		FileWriter file = new FileWriter(plainTextFileName);
      	for (String write : list2) {
      		file.write(String.format("%s%n",write));
      	}
      	file.close();
		
	}
	@Override
	public boolean decodeFileToFile(String encodedTextFileName, String plainTextFileName) {
		ArrayList<String> list2 = new ArrayList<String>();

		try (BufferedReader br = new BufferedReader(new FileReader(encodedTextFileName)))
		{
			String line = "";
			while ((line = br.readLine()) != null)
			{
				list2.add(decodeSentence(line));
			    
			}
				
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
		}


try {
	writeFileLines2(plainTextFileName, list2);
} catch (IOException e) {
	e.printStackTrace();
}
		return false;
	}
	


}
