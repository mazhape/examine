package MethodsAndEncapsulation;

class MyPhone {
    static boolean softKeyboard = true;//Class variable softKeyboard
    String phoneNumber;//Instance variable phoneNumber
    void myMethod() {
        boolean softKeyboard = true;//Local variable softKeyboard can coexist with class variable softKeyboard
        String phoneNumber;//Local variable phoneNumber can coexist with instance variable phoneNumber
    }
}
