package Javadatatype;

public class CharPuzzle {
    public static void main(String[] args) {
        char ch = 'A';        // ASCII 65
        ch = (char) (ch + 3); // Line 1
        ch++;                 // Line 2
        System.out.println(ch); // Line 3
        System.out.println((int) ch); // Line 4
    }
}

//E
//69

//Let’s break it down step by step:
//char ch = 'A';
//ch is 'A' which has ASCII value 65.
//ch = (char)(ch + 3);
//→ 65 + 3 = 68 → ch = 'D'
//ch++;
//→ 'D' (68) becomes 'E' (69)
//System.out.println(ch);
//→ 'E'
//System.out.println((int) ch);
//→ 69