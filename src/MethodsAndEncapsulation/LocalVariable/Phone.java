package MethodsAndEncapsulation.LocalVariable;

class Phone {
    private boolean tested;
    public void setTested(boolean val) {//Method parameter val is accessible only in method setTested
        tested = val;
    }
    public boolean isTested() {//Variable val can’t be accessed in method isTested
        val = false;//This line of code won’t compile.
        return tested;
    }
}

//In the preceding code, you can access the method parameter val only within the
//method setTested. It can’t be accessed in any other method.