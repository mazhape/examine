package JavaAPIandarrays.stringBuilder.StringBuildermethods;

class SubSequenceStringBuilder {
    public static void main(String args[]) {
        StringBuilder sb1 = new StringBuilder("0123456");
        System.out.println(sb1.subSequence(2, 4));//Prints 23
        System.out.println(sb1);//Prints 0123456
    }
}
