/**
 * 
 */
package cs141.robward;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Robert Ward
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MorseConverter mc = new MorseConverter("MorseCodeTable.txt");
		mc.printKeyValuePairs();
		System.out.print("Encode The: ");
		System.out.println(mc.encodeWord("The"));
		System.out.println(mc.encodeWord("abcdefghijklmnopqrstuvwxyz"));
		System.out.print("Encode Rick: Weddings are basically funerals with cake: ");
		System.out.println(mc.encodeSentence("Rick: Weddings are basically funerals with cake"));
		
		System.out.print("Decode The: ");
		System.out.println(mc.decodeWord(mc.encodeWord("The")));
		System.out.println(mc.decodeSentence(mc.encodeSentence("Rick: Weddings are basically funerals with cake")));
		
		
		mc.encodeFileToFile("Quote2.txt", "Quote2Encoded.txt");
		
		mc.decodeFileToFile("Quote2Encoded.txt", "Quote2Decoded.txt");
		
		mc.decodeFileToFile("Quote2Morse.txt", "Quote2Decoded.txt");
		mc.decodeFileToFile("Quote3Morse.txt", "Quote3Decoded.txt");
		mc.decodeFileToFile("Quote4Morse.txt", "Quote4Decoded.txt");
		mc.decodeFileToFile("Quote5Morse.txt", "Quote5Decoded.txt");
		mc.decodeFileToFile("Quote6Morse.txt", "Quote6Decoded.txt");
		
		//String builder example
		//Strings are immutable
		// it is better to use Stringbuilder when you need to append things
		String fileName = "Quote1.txt";
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line = "";

			while ((line = br.readLine()) != null) {

				sb.append(line);

			}
		} catch (FileNotFoundException e) {
			System.out.print(fileName + " File Not found");

		} catch (IOException e) {
			e.printStackTrace();

		}

	

		
	}

}
