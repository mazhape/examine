package JavaAPIandarrays.arrays;


interface MyInterface {}
class MyClass1 implements MyInterface {}
class MyClass2 implements MyInterface {}
 class InterfaceTypeTest {
     MyInterface[] interfaceArray = new MyInterface[]
             {
                     new MyClass1(),
                     null,
                     new MyClass2()
             };
}


//interfaceArray[0] instanceof MyClass1 → true
//interfaceArray[1] == null → true
//interfaceArray[2] instanceof MyClass2 → true
//The array interfaceArray has length 3.
//It can store any object that implements MyInterface — or null.