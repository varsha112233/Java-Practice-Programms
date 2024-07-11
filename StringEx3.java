package string;
public class StringEx3 {
        public static void main(String[] args) {
        	// Creating strings
        	String str1 = "Hello, World!";
        	String str2 = new String("Hello, World!");
        	// Concatenating strings
        	String firstName = "John";
        	String lastName = "Doe";
        	String fullName = firstName + " " + lastName;
        	// Finding string length
        	String text = "This is a sample text.";
        	int length = text.length();
        	// String comparison
        	String java1 = "Java";
        	String java2 = "Java";
        	boolean areEqual = java1.equals(java2); // Content comparison
        	boolean areSame = (java1 == java2); // Reference comparison
        	// Substring
        	String sentence = "The quick brown fox jumps over the lazy dog.";
        	String substring = sentence.substring(10, 15); // Extracts "brown"
        	// Searching in strings
        	String sentence2 = "Java is a popular programming language.";
        	int indexOfJava = sentence2.indexOf("Java"); // Find the index of "Java"
        	boolean containsJava = sentence2.contains("Java"); // Check if it contains "Java"
		
       }

}
