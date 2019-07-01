/**
 * 
 */
package cs141.robward;

/**
 * @author Robert Ward
 *
 */
public interface Converter {

	
	//public Converter(String encodingfile); << good idea
	/**
	 * Prints a list of the key values pairs used to encode and decode strings.
	 * 
	 */
	public void printKeyValuePairs();
	
	/**
	 * Encodes a sentence based on the Key Value Pairs.
	 * For Example if the encode file contained 
	 *  the letter 'a' would be replaced with .- wherever it was in the string  
	 *  There should be three spaces between each word
	 *  so the text can be decoded back into separate words
	 * @param  textToEncode the String to encode
     * @return returns the encoded version of the sentence
	 */
	public String encodeSentence(String textToEncode);
	
	/**
	 * Encodes a word based on the Key Value Pairs.
	 * For Example if the word the letter 'a' 
	 * it would be replaced in the return string with .- 
	 * wherever it was in the string  
	 * @param  textToEncode the String to encode
     * @return returns the encoded version of the sentence
     */
	public String encodeWord(String textToEncode);
	
	/**
	 * Decodes a sentence based on the Key Value Pairs.
	 * For Example if the encode file contained Morse code .-
	 *  it would be replaced with 'a' wherever it was in the string  
	 *  Words are separated by three spaces -
	 *  while letter are separated by a single word.
	 * @param  textToDecode the String to decode
     * @return returns the decode version of the sentence
     */
	public String decodeSentence(String textToDecode);
	
	/**
	 * Decodes a word based on the Key Value Pairs.
	 * For Example if the encode word contained Morse code .-
	 *  it would be replaced with 'a' wherever it was in the string  
	 *  Letters should be separated by a single space character
	 * @param  wordToDecode the String to decode
     * @return returns the decode version of the word
     * @throws IllegalArgumentException if textToEncode has more than one space in a row
	 */
	public String decodeWord(String wordToDecode);
	
	
	/**
	 * Encodes a the text contained by the file of the given filename based on the Key Value Pairs.
	 * Saves the result to a new file the will contain the Morse code version of the text.
	 * version of the text.  
	 * @param  plainTextFileName the name of the file whose contents we want encode and save
	 * @param  encodedTextFileName name of the file to save the encoded text in
     * @return returns true if the file is encoded and saved successfully
	 */
	public boolean encodeFileToFile(String plainTextFileName, String encodedTextFileName );
	
	/**
	 * Decodes the text contained in the given filename based on the Key Value Pairs.
	 * Saves the result to a new file the will contain the plain text version of the Morse code. 
	 * version of the text.  
	 * @param  encodedTextFileName name of the file whose contents we want to decode and save
	 * @param  plainTextFileName the name of the file where we want to save the decode text.
     * @return returns true if the file is encoded and saved successfully
	 */
	public boolean decodeFileToFile( String encodedTextFileName, String plainTextFileName);
	
}
