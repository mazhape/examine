package JavaAPIandarrays.arrays;

public class StrArrayTesrt {
    public static void main(String[] args) {
        String[] strArray = new String[] {"Autumn", "Summer", "Spring", "Winter"};//Define an array of String objects
        strArray[2] = null;//Can you remove an array position like this?
        for (String val : strArray)
            System.out.println(val);//Outputs four values
    }
}
//Autumn
//Summer
//null
//Winter