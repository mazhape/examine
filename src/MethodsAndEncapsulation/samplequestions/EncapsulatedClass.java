package MethodsAndEncapsulation.samplequestions;

public class EncapsulatedClass {
    //Which option defines a well-encapsulated class?
    //a class Template {
    // public String font;
    //}
    //b class Template2 {
    // public String font;
    // public void setFont(String font) {
    // this.font = font;
    // }
    // public String getFont() {
    // return font;
    // }
    //}
    //c class Template3 {
    // private String font;
    // public String author;
    // public void setFont(String font) {
    // this.font = font;
    // }
    // public String getFont() {
    // return font;
    // }
    // public void setAuthor(String author) {
    // this.author = author;
    // }
    // public String getAuthor() {
    // return author;
    // }
    //}
    //d None of the above
}


//Answer: D
//Explanation: Options (a), (b), and (c) are incorrect because they all define a public
//instance variable. A well-encapsulated class should be like a capsule, hiding its instance
//variables from the outside world. The only way you should access and modify instance
//variables is through the public methods of a class to ensure that the outside world
//can access only the variables the class allows it to. By defining methods to assign values to its instance variables, a class can control the range of values that can be assigned
//to them.