package JavaAPIandarrays.Sampleexamquestions;

class EJavaGuruStringBuilder2 {
    public static void main(String args[]) {
        StringBuilder sb1 = new StringBuilder("123456");
        sb1.subSequence(2, 4);
        sb1.deleteCharAt(3);
        sb1.reverse();
        System.out.println(sb1);
    }
}

//65321
//Explanation: Like the method substring, the method subSequence doesn’t modify
//the contents of a StringBuilder. Hence, the value of the variable sb1 remains
//123456, even after the execution of the following line of code:
//sb1.subSequence(2, 4);
//The method deleteCharAt deletes a char value at position 3. Because the positions
//are zero-based, the digit 4 is deleted from the value 123456, resulting in 12356. The
//method reverse modifies the value of a StringBuilder by assigning to it the reverse
//representation of its value. The reverse of 12356 is 65321.