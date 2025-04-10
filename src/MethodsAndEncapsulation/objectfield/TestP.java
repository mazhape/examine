package MethodsAndEncapsulation.objectfield;

class Person {
    private String name;
    Person(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }
    public void setName(String val) {
        name = val;
    }
}
public class TestP {
    public static void swap(Person p1, Person p2) {//Method to swap two object references
        Person temp = p1;
        p1 = p2;
        p2 = temp;
    }
    public static void main(String args[]) {
        Person person1 = new Person("John");//Creates object
        Person person2 = new Person("Paul");////Creates object
        System.out.println(person1.getName()
                + ":" + person2.getName());//Prints John:Paul before passing objects referred by variable person1 and person2 to method swap
        swap(person1, person2);//Executes method swap
        System.out.println(person1.getName()
                + ":" + person2.getName());//Prints John:Paul after method swap completes execution
    }
}


//John:Paul
//John:Paul



//If you wanted to swap the data inside the objects, you’d have to do this:

//public static void swap(Person p1, Person p2) {
//    String tempName = p1.getName();
//    p1.setName(p2.getName());
//    p2.setName(tempName);
//}
//That would result in:

//John:Paul
//Paul:John