package string;
public class StringEx4 {
        public static void main(String[] args) {
        	// Splitting strings
        	String csvData = "John,Doe,30";
        	String[] parts = csvData.split(",");
        	// Converting case
        	String mixedCase = "ThIs Is A MiXeD CaSe StRiNg";
        	String uppercase = mixedCase.toUpperCase();
        	String lowercase = mixedCase.toLowerCase();
        	// Trimming whitespace
        	String paddedString = " Some Text with Spaces ";
        	String trimmedString = paddedString.trim();
        	// Checking for empty or null strings
        	String emptyString = "";
        	String nullString = null;
        	boolean isEmpty1 = emptyString.isEmpty(); // Check if empty
        	boolean isEmpty2 = nullString == null || nullString.isEmpty();
        	// Replace characters or substrings
        	String originalText = "I love cats. Cats are cute!";
        	String replacedText = originalText.replace("cats", "dogs");
        	// String format
        	String formattedString = String.format("Hello, %s! You are %d years old.", "Alice",
        	25);

	}

}
