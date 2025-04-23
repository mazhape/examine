package JavaAPIandarrays.Sampleexamquestions;

class EJavaGuruArray {
    public static void main(String args[]) {
        int[] arr = new int[5];
        byte b = 4; char c = 'c'; long longVar = 10;
        arr[0] = b;
        arr[1] = c;
        arr[3] = longVar;
        System.out.println(arr[0] + arr[1] + arr[2] + arr[3]);
    }
}

//Compilation error
//Explanation: The code in this question won’t compile due to
//arr[3] = longVar;
//The preceding line of code tries to assign a value of type long to a variable of type int.
//Because Java doesn’t support implicit narrowing conversions (for example, long to
//int in this case), the assignment fails. Also, this code tries to trick you regarding your
//understanding of the following:
//■ Assigning a char value to an int array element (arr[1] = c)
//■ Adding a byte value to an int array element (arr[0] = b)
//■ Whether an unassigned int array element is assigned a default value (arr[2])
//■ Whether arr[0] + arr[1] + arr[2] + arr[3] prints the sum of all these values
//or a concatenated value
//When answering questions in the OCA Java SE 8 Java Programmer I exam, be careful
//about such tactics. If any of the answers lists a compilation error or a runtime exception as an option, look for obvious lines of code that could result in it. In this example,
//arr[3] = longVar will result in a compilation error.