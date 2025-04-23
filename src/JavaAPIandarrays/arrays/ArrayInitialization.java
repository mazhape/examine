package JavaAPIandarrays.arrays;

class ArrayInitialization {
    public static void main(String[] args) {
        int intArray[];//Array declaration
        intArray = new int[2];//Array allocation
        for (int i=0; i<intArray.length; i++) {////Initializes array using a for loop
            intArray[i] = i + 5;//Initializes array using a for loop
        }
        intArray[0] = 10;//Reinitializes individual array elements
        intArray[1] = 1870;//Reinitializes individual array elements
    }
}
