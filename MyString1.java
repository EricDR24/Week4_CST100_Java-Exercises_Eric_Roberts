/** Program:  10.22 String Class
  * File:     mainTax.java 
  * Summary:  Chapter 10, Excersise 22, create a Course Class
  * Author:   Eric Roberts
  * Date:     July 17, 2016
**/
public class MyString1 {
	
	//data fields
	private char[] chars;
	
	//constructor for MyString1
	public MyString1(char[] chars) {
		this.chars = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			this.chars[i] = chars[i];
		}
	}
	
	//methods
	public char charAt(int index) {
		return chars[index];
	}
	
	public int length() {
		return chars.length;
	}
	
	//substring
	public MyString1 toLowerCase() {
		char[] ch = new char[chars.length];
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= 'A' && chars[i] <= 'Z')
				ch[i] = (char)(chars[i] + 32);
			else
				ch[i] = chars[i];
		}
		return new MyString1(ch);
	}
	
	//boolean return true if strings are the same
	public boolean sameStrings(MyString1 s) {
		if (chars.length != s.length())
			return false;
		for (int i = 0; i < chars.length; i++) {
			if(chars[i] != s.charAt(i))
				return false;
		}
		return true;
	}
	

	public static MyString1 valueOf(int i) {
		// Count i
		int length = 0; 
		int n = i;
		while (n >= 1) {
			n /= 10;
			length++;
		}

		// Create a char array of the length of i
		char[] ch = new char[length];
		
		// Put i into the array
		for (int j = 0, k = (int)Math.pow(10, length - 1); 
			j < length; j++, k /= 10) {
			ch[j] = Character.forDigit((i / k), 10);
			i %= k; 
		}

		return new MyString1(ch);
	}

	public MyString1 substring(int begin, int end) {
		char[] ch = new char[end - begin];
		for (int i = begin, j = 0; i < end; i++, j++) {
		 	ch[j] = chars[i];
		}
		return new MyString1(ch); 
	}
	
}
