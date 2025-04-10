//Examine the following code and select the correct option(s):
//public class Person {
// public int height;
// public void setHeight(int newHeight) {
// if (newHeight <= 300)
// height = newHeight;
// }
//}
//a The height of a Person can never be set to more than 300.
//b The preceding code is an example of a well-encapsulated class.
//c The class would be better encapsulated if the height validation weren’t set
//to 300.
//d Even though the class isn’t well encapsulated, it can be inherited by other classes

package MethodsAndEncapsulation.samplequestions;

public class Person {
    public int height;
    public void setHeight(int newHeight) {
        if (newHeight <= 300)
            height = newHeight;
    }
}


//Even though the class isn’t well encapsulated, it can be inherited by other classes
//Answer: d
//Explanation: This class isn’t well encapsulated because its instance variable height is
//defined as a public member. Because the instance variable can be directly accessed
//by other classes, the variable doesn’t always use the method setHeight to set its
//height. The class Person can’t control the values that can be assigned to its public
//variable height.