package JavaAPIandarrays.stringBuilder.StringBuildermethods;

class DeleteStringBuildereCharAt {
    public static void main(String args[]) {
        StringBuilder sb1 = new StringBuilder("0123456");
        sb1.deleteCharAt(2);//Deletes character at position 2
        System.out.println(sb1);//Prints 013456
    }
}
//