package Javasourcecode;

class MyClass {
    static int x = result();
    static int result() { return 20; }
    int nonStaticResult() { return result(); }
}