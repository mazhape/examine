package JavaAPIandarrays.arrays;

public class InitializeTwodimensional {
    public static void main(String[] args) {
        int[] multiArr[];//Array declaration
        multiArr = new int[2][3];//Array allocation
        for (int i=0; i<multiArr.length; i++) {//Initializes array using a for loop
            for (int j=0; j<multiArr[i].length; j++) {//Initializes array using a for loop
                multiArr[i][j] = i + j;//Initializes array using a for loop
            }
        }
        multiArr[0][0] = 10;//Initializes array without using a for loop
        multiArr[1][2] = 1210;//Initializes array without using a for loop
        multiArr[0][1] = 110;//Initializes array without using a for loop
        multiArr[0][2] = 1087;//Initializes array without using a for loop
    }
}
