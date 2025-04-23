package JavaAPIandarrays.Sampleexamquestions;

class EJavaGuruArray2 {
    public static void main(String args[]) {
        int[] arr1;
        int[] arr2 = new int[3];
        char[] arr3 = {'a', 'b'};
        arr1 = arr2;
        arr1 = arr3;
        System.out.println(arr1[0] + ":" + arr1[1]);
    }
}

//e Compilation error
//Explanation: Because a char value can be assigned to an int value, you might assume
//that a char array can be assigned to an int array. But we’re talking about arrays of int
//and char primitives, which aren’t the same as a primitive int or char.
// Arrays themselves are reference variables, which refer to a collection of objects of similar type.