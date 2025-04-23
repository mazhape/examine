package JavaAPIandarrays.arrays;

public class CombiningArray {
    public static void main(String[] args) {
        int intArray[] = {0, 1};
        String[] strArray = {"Summer", "Winter"};
        int multiArray[][] = { {0, 1}, {3, 4, 5} };
        int intArray2[] = new int[]{0, 1};
        String[] strArray2 = new String[]{"Summer", "Winter"};
        int multiArray2[][] = new int[][]{ {0, 1}, {3, 4, 5}
        int intArrays2[] = new int[2]{0, 1};//You can’t specify both the size AND the initializer list in the same array creation statement.
        String[] strArrays2 = new String[2]{"Summer", "Winter"};//You’re specifying both a size and an initializer, which is not allowed.
        int multiArrays2[][] = new int[2][]{ {0, 1}, {3, 4, 5}};//You can’t mix fixed outer dimension [2] with initializer { ... }.
    }
}

//Notice that the previous code
//■ Doesn’t use the keyword new to initialize an array
//■ Doesn’t specify the size of the array
//■ Uses a single pair of braces to define values for a one-dimensional array and
//multiple pairs of braces to define a multidimensional array