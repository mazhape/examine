package WorkFlow.Sampleexamquestions;


class Loop2Test {
    public static void main(String[] args) {
        int i = 10;
        do
            while (i++ < 15)
                i = i + 20;
        while (i < 2);
        System.out.println(i);
    }
}

//32