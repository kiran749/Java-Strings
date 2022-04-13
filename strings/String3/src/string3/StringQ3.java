package string3;


public class StringQ3 {
	public static void main(String[] args) {
		String str = "Java String pool refers to collection of Strings which are stored in heap memory";
		//a. Print the string to console in lowercase
		System.out.println(str.toLowerCase());
		
		//b. Print the string to console in uppercase
		System.out.println(str.toUpperCase());
		
		//c. Replace all �a� character in the string with $ sign
		System.out.println(str.replace('a', '$'));
		
		//d. Check if the original String contains the word �collection�
		System.out.println(str.contains("collection"));
		
		//e. Check if the following String �java string pool refers to collection of strings which are stored in heap memory� matches the original
		System.out.println(str.equals("java String pool refers to collection of Strings which are stored in heap memory"));
		
		//f. If the string does not match check if there is another method which can be used to check if the strings are equal
        System.out.println(str=="java String pool refers to collection of Strings which are stored in heap memory");
	}

}