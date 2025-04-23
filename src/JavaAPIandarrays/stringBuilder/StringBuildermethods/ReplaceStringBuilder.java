package JavaAPIandarrays.stringBuilder.StringBuildermethods;

class ReplaceStringBuilder {
    public static void main(String args[]) {
        StringBuilder sb1 = new StringBuilder("0123456");
        sb1.replace(2, 4, "ABCD");
        System.out.println(sb1);//Prints 01ABCD456
    }
}