package MethodsAndEncapsulation.objectfield;

class Office {
    public static void main(String args[]) {
          // Create two Employee objects
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        //// Set names for each employee
        e1.name = "Selvan";
        e2.setName("Harry");
        e1.printEmp();
        e2.printEmp();
    }
}

//name = Selvan age = 22
//name = Harry age = 22