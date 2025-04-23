package JavaAPIandarrays.stringBuilder.StringBuildermethods;

class DeleteStringBuilder {
    public static void main(String args[]) {
        StringBuilder sb1 = new StringBuilder("0123456");
        sb1.delete(2, 4);//Removes characters at positions starting from 2 to 4, excluding 4
        System.out.println(sb1);//Prints 01456
    }
}