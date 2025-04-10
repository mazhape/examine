package MethodsAndEncapsulation.objectfield;

class Employees {
    private String name;

    public void setName(String val) {
        name = val;
    }
    public String getName() {
        return name;
    }
    public int daysOffWork(int... days) {
        int daysOff = 0;
        for (int i = 0; i < days.length; i++)
            daysOff += days[i];
        return daysOff;
    }
}
public class Test {
    public static void main(String args[]) {
        Employees e = new Employees();
        String name = e.getName();//Assign method’s return value to a variable Won’t compile
        e.setName(e.getName());//Pass method’s return value to another method
        int val = e.getName();//You can’t assign the String returned from method getName to an int variable.
        System.out.println(e.daysOffWork(1, 2, 3, 4));//Call method daysOffWork with four method arguments
        System.out.println(e.daysOffWork(1, 2, 3));//Call method daysOffWork with three method arguments
    }
}


//10
//6

//In the preceding code, the return type of the method setName is void; therefore, you
//can’t use it to assign a value to a variable: