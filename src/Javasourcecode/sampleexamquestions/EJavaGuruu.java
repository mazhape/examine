//what is the output of EJavaGuru, if it is executed using the following command?
//java EJavaGuru one two three four

package Javasourcecode.sampleexamquestions;

public class EJavaGuruu {
    public static void main(String[] args) {
        System.out.println(args[1]+":"+ args[2]+":"+ args[3]);
    }
}


//two:three:four

//Explanation: The command-line arguments passed to the main method of a class do
//not contain the word Java and the name of the class.
// Because the position of an array is zero-based, the method argument is assigned
//the following values:
//args[0] -> one
//args[1] -> two
//args[2] -> three
//args[3] -> four
//The class prints two:three:four.