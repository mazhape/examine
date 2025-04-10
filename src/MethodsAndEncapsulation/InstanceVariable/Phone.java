package MethodsAndEncapsulation.InstanceVariable;

class Phone {
    private boolean tested;//Instance variable tested
    public void setTested(boolean val) {//Variable tested is accessible in method setTested
        tested = val;
    }
    public boolean isTested() {//Variable tested is also accessible in method isTested
        return tested;
    }
}


//