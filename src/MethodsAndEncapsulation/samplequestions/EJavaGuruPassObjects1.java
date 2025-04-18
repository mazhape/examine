package MethodsAndEncapsulation.samplequestions;

class Personie {
    public String name;
    public int height;
}
class EJavaGuruPassObjects1 {
    public static void main(String args[]) {
        Personie p = new Personie();
        p.name =  "EJava";
        anotherMethod(p);
        System.out.println(p.name);
        someMethod(p);
        System.out.println(p.name);
    }
    static void someMethod(Personie p) {
        p.name = "someMethod";
        System.out.println(p.name);
    }
    static void anotherMethod(Personie p) {
        p = new Personie();
        p.name = "anotherMethod";
        System.out.println(p.name);
    }
}


//anotherMethod
//EJava
//someMethod
//someMethod

//Explanation: The class EJavaGuruPassObject1 defines two methods, someMethod and
//anotherMethod. The method someMethod modifies the value of the object parameter
//passed to it. Hence, the changes are visible within this method and in the calling
//method (method main). But the method anotherMethod reassigns the reference variable passed to it. Changes to any of the values of this object are limited to this method.
//They aren’t reflected in the calling method (the main method).