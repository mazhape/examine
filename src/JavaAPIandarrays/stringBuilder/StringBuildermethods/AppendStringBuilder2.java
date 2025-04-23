package JavaAPIandarrays.stringBuilder.StringBuildermethods;


class Person {
    String name;
    Person(String str) { name = str; }
}
class AppendStringBuilder2 {
    public static void main(String args[]) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Java");
        sb1.append(new Person("Oracle"));
        System.out.println(sb1);//JavaPerson@126b249
    }
}

//JavaPerson@126b249