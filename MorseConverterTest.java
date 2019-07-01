package cs141.robward;




import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;



class MorseConverterTest {

	private static MorseConverter mc = new MorseConverter("MorseCodeTable.txt");
	
	@Test
	void testConvertSentenceToMorse() {
		
		
		assertEquals("- .... .   --.- ..- .. -.-. -.-   -... .-. --- .-- -.   ..-. --- -..-", mc.encodeSentence("The quick Brown fox"));
		
	}
	
	@Test
	void testConvertMorseToSentence() {
		
		
		assertEquals("the quick brown fox", mc.decodeSentence("- .... .   --.- ..- .. -.-. -.-   -... .-. --- .-- -.   ..-. --- -..-"));
		
	}
	
	@Test
	void testConvertLetterToMorse() {
		
		assertAll(() -> assertEquals(".-", mc.encodeWord("a")),
				  () -> assertEquals("-...", mc.encodeWord("b")),
				  () -> assertEquals("-.-.", mc.encodeWord("c")),
				  () -> assertEquals("-..", mc.encodeWord("d")),
				  () -> assertEquals(".", mc.encodeWord("e")),
				  () -> assertEquals("..-.", mc.encodeWord("f")),
				  () -> assertEquals("--.", mc.encodeWord("g")),
				  () -> assertEquals("....", mc.encodeWord("h")),
				  () -> assertEquals("..", mc.encodeWord("i")),
				  () -> assertEquals(".---", mc.encodeWord("j")),
				  () -> assertEquals("-.-", mc.encodeWord("k")),
				  () -> assertEquals(".-..", mc.encodeWord("l")),
				  () -> assertEquals("--", mc.encodeWord("m")),
				  () -> assertEquals("-.", mc.encodeWord("n")),
				  () -> assertEquals("---", mc.encodeWord("o")),
				  () -> assertEquals(".--.", mc.encodeWord("p")),
				  () -> assertEquals("--.-", mc.encodeWord("q")),
				  () -> assertEquals(".-.", mc.encodeWord("r")),
				  () -> assertEquals("...", mc.encodeWord("s")),
				  () -> assertEquals("-", mc.encodeWord("t")),
				  () -> assertEquals("..-", mc.encodeWord("u")),
				  () -> assertEquals("...-", mc.encodeWord("v")),
				  () -> assertEquals(".--", mc.encodeWord("w")),
				  () -> assertEquals("-..-", mc.encodeWord("x")),
				  () -> assertEquals("-.--", mc.encodeWord("y")),
				  () -> assertEquals("--..", mc.encodeWord("z"))
				 
				  
				);
		
	}
	
	@Test
	void testConvertLetterCapToMorse() {
		
		assertAll(() -> assertEquals(".-", mc.encodeWord("A")),
				  () -> assertEquals("-...", mc.encodeWord("B")),
				  () -> assertEquals("-.-.", mc.encodeWord("C")),
				  () -> assertEquals("-..", mc.encodeWord("D")),
				  () -> assertEquals(".", mc.encodeWord("E")),
				  () -> assertEquals("..-.", mc.encodeWord("F")),
				  () -> assertEquals("--.", mc.encodeWord("G")),
				  () -> assertEquals("....", mc.encodeWord("H")),
				  () -> assertEquals("..", mc.encodeWord("I")),
				  () -> assertEquals(".---", mc.encodeWord("J")),
				  () -> assertEquals("-.-", mc.encodeWord("K")),
				  () -> assertEquals(".-..", mc.encodeWord("L")),
				  () -> assertEquals("--", mc.encodeWord("M")),
				  () -> assertEquals("-.", mc.encodeWord("N")),
				  () -> assertEquals("---", mc.encodeWord("O")),
				  () -> assertEquals(".--.", mc.encodeWord("P")),
				  () -> assertEquals("--.-", mc.encodeWord("Q")),
				  () -> assertEquals(".-.", mc.encodeWord("R")),
				  () -> assertEquals("...", mc.encodeWord("S")),
				  () -> assertEquals("-", mc.encodeWord("T")),
				  () -> assertEquals("..-", mc.encodeWord("U")),
				  () -> assertEquals("...-", mc.encodeWord("V")),
				  () -> assertEquals(".--", mc.encodeWord("W")),
				  () -> assertEquals("-..-", mc.encodeWord("X")),
				  () -> assertEquals("-.--", mc.encodeWord("Y")),
				  () -> assertEquals("--..", mc.encodeWord("Z"))
				 
				  
				);
		
	}
	
	@Test
	void testConvertMorseToLetter() {
		
		assertAll(() -> assertEquals("a", mc.decodeWord(".-")),
				  () -> assertEquals("b", mc.decodeWord("-...")),
				  () -> assertEquals("c", mc.decodeWord("-.-.")),
				  () -> assertEquals("d", mc.decodeWord("-..")),
				  () -> assertEquals("e", mc.decodeWord(".")),
				  () -> assertEquals("f", mc.decodeWord("..-.")),
				  () -> assertEquals("g", mc.decodeWord("--.")),
				  () -> assertEquals("h", mc.decodeWord("....")),
				  () -> assertEquals("i", mc.decodeWord("..")),
				  () -> assertEquals("j", mc.decodeWord(".---")),
				  () -> assertEquals("k", mc.decodeWord("-.-")),
				  () -> assertEquals("l", mc.decodeWord(".-..")),
				  () -> assertEquals("m", mc.decodeWord("--")),
				  () -> assertEquals("n", mc.decodeWord("-.")),
				  () -> assertEquals("o", mc.decodeWord("---")),
				  () -> assertEquals("p", mc.decodeWord(".--.")),
				  () -> assertEquals("q", mc.decodeWord("--.-")),
				  () -> assertEquals("r", mc.decodeWord(".-.")),
				  () -> assertEquals("s", mc.decodeWord("...")),
				  () -> assertEquals("t", mc.decodeWord("-")),
				  () -> assertEquals("u", mc.decodeWord("..-")),
				  () -> assertEquals("v", mc.decodeWord("...-")),
				  () -> assertEquals("w", mc.decodeWord(".--")),
				  () -> assertEquals("x", mc.decodeWord("-..-")),
				  () -> assertEquals("y", mc.decodeWord("-.--")),
				  () -> assertEquals("z", mc.decodeWord("--.."))
				 
				  
				);
		
	}


}
