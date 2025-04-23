package JavaAPIandarrays.stringBuilder;

    class CreateStringBuilderObjects {
        public static void main(String args[]) {
            StringBuilder sb1 = new StringBuilder();//1.No-argument constructor
            StringBuilder sb2 = new StringBuilder(sb1);//2. Constructor that accepts a StringBuilder object
            StringBuilder sb3 = new StringBuilder(50);//3Constructor that accepts an int value specifying initial capacity of StringBuilder object d
            StringBuilder sb4 = new StringBuilder("Shreya Gupta");//4 Constructor that accepts a String
        }
    }

//1.constructs a StringBuilder object with no characters in it and an initial capacity of16 characters.
// 2.constructs a StringBuilder object that contains the same set of characters as contained by the StringBuilder object passed to it.
// 3.constructs a StringBuilder object with no characters and an initial capacity of 50 characters.
// 4.constructs a StringBuilder object with an initial value as contained by the String object.