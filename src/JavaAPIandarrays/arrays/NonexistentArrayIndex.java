package JavaAPIandarrays.arrays;

public class NonexistentArrayIndex {
    public static void main(String[] args) {
        int intArray[] = new int[2];//Length of intArray is 2
        System.out.println(intArray[3]);//3 isn’t a valid index position for intArray.

        int intArray1[] = new int[2];//Length of intArray is 2
        System.out.println(intArray1[-10]);//Will compile successfully even though it tries to access array element at negative index
        System.out.println(intArray[1.2]);//Won’t compile; can’t specify array index using floating-point number
    }
}

//will throw a runtime exception, ArrayIndexOutOfBoundsException.
//For an array of size 2


