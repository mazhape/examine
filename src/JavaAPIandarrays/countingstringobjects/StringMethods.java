package JavaAPIandarrays.countingstringobjects;

public class StringMethods {
    public static void main(String[] args) {
        String name = new String("Paul");
        System.out.println(name.charAt(0));//prints P
        System.out.println(name.charAt(2));//prints u
        System.out.println(name.charAt(4));//will throw an exception at runtime:

        String letters = "ABCAB";
        System.out.println(letters.indexOf('B'));//Prints 1
        System.out.println(letters.indexOf("S"));//Prints –1
        System.out.println(letters.indexOf("CA"));//Prints 2
        System.out.println(letters.indexOf('B', 2));//prints 4

        String exam = "Oracle";
        String sub = exam.substring(2);
        System.out.println(sub);//Prints acle
        String result = exam.substring(2, 4);
        System.out.println(result);//Prints ac

        String varWithSpaces = " AB CB ";//String with white space
        System.out.print(":");
        System.out.print(varWithSpaces);
        System.out.print(":");//Prints : AB CB :
        System.out.print(":");
        System.out.print(varWithSpaces.trim());
        System.out.print(":");//Prints :AB CB:

        String letteres = "ABCAB";
        System.out.println(letters.replace('B', 'b'));//Prints AbCAb
        System.out.println(letters.replace("CA", "12"));//Prints AB12B
        System.out.println(letters.replace('B', "b"));//Won’t compile
        System.out.println(letters.replace("B", 'b'));//Won’t compile  this method doesn’t—or can’t—change the value of the variableletters

        System.out.println("Shreya".length());//prints 6

        String letter = "ABCAB";
        System.out.println(letters.startsWith("AB"));//Prints true
        System.out.println(letters.startsWith("a"));//Prints false
        System.out.println(letters.startsWith("A", 3));//Prints true
        System.out.println(letters.endsWith("CAB"));//Prints true
        System.out.println(letters.endsWith("B"));////Prints true
        System.out.println(letters.endsWith("b"));////Prints false

        String day = "SunDday";
        day.replace('D', 'Z').substring(3);
        System.out.println(day);//String is immutable—no change in the value variable day; prints SunDday
        day = day.replace('D', 'Z').substring(3);
        System.out.println(day);//Prints Zday

        String lettrs = "ABCAB";
        System.out.println(letters.substring(0, 2)//→ "AB"
                .startsWith('A'));//Because 'A' is a char, this line won’t compile.
    }
}


// Length of String returned by substring() = end - start

//Core String Methods (OCA Focus)

//Method	                      Description	                              Example
//length()	                     Returns number of characters in the string 	"Java".length() → 4
//charAt(int index)            	 Returns character at given index (0-based)	    "Java".charAt(1) → 'a'
//substring(int start)	         Returns substring from index to end	        "Hello".substring(2) → "llo"
//substring(int start, int end)	 Returns substring from start to end-1	        "Hello".substring(1, 4) → "ell"
//equals(Object obj)	         Compares contents of strings	                "hi".equals("hi") → true
//equalsIgnoreCase(String str)	 Ignores case during comparison	                "Hi".equalsIgnoreCase("hi") → true
//startsWith(String prefix)	     Checks if string starts with prefix	        "hello".startsWith("he") → true
//endsWith(String suffix)	     Checks if string ends with suffix	            "hello".endsWith("lo") → true
//contains(CharSequence seq)	 Checks if string contains sequence	             "hello".contains("ll") → true
//replace(char old, char new)	 Replaces characters	                        "java".replace('a', 'o') → "jovo"
//trim()	                     Removes leading and trailing spaces	        " hi ".trim() → "hi"
//toLowerCase()	                 Converts to lowercase	                        "Java".toLowerCase() → "java"
//toUpperCase()	                 Converts to uppercase	                        "Java".toUpperCase() → "JAVA"
//concat(String str)	         Joins strings	                                "a".concat("b") → "ab"
//isEmpty()	                     Returns true if string length is 0	            "".isEmpty() → true
//indexOf(char)	                 First index of character	                    "banana".indexOf('a') → 1
//indexOf(char, fromIndex)	     Index from specific position	                "banana".indexOf('a', 2) → 3
//lastIndexOf(char)	             Last index of character	                    "banana".lastIndexOf('a') → 5