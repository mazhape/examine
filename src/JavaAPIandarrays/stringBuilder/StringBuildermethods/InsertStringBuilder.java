package JavaAPIandarrays.stringBuilder.StringBuildermethods;

class InsertStringBuilder {
    public static void main(String args[]) {
        StringBuilder sb1 = new StringBuilder("Bon");
        sb1.insert(2, 'r');
        System.out.println(sb1);//Born

        StringBuilder sb = new StringBuilder("123");
        char[] name = {'J', 'a', 'v', 'a'};
        sb.insert(1, name, 1, 3);
        System.out.println(sb);//1ava23
    }
}


//Breakdown:
//Original string: "123"
//name: {'J', 'a', 'v', 'a'}
//name[1] to name[3] → 'a', 'v', 'a' (3 characters)
//Inserting at index 1 in "123"
//So:
//Before insertion: "123"
//After insertion at index 1: "1" + "ava" + "23"