package JavaAPIandarrays.arrays;

public class StringArray {
    public static void main(String[] args) {
        String[] strArray;//Array declaration
        strArray = new String[4];//Array allocation
        for (int i=0; i<strArray.length; i++) {//Initializes array using a for loop
            strArray[i] = new String("Hello" + i);////Initializes array using a for loop
        }
        strArray[1] = "Summer";//Initializes array without using a for loop
        strArray[3] = "Winter";//Initializes array without using a for loop
        strArray[0] = "Autumn";//Initializes array without using a for loop
        strArray[2] = "Spring";//Initializes array without using a for loop
    }
}
