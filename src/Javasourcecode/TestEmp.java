package Javasourcecode;

class Emp {
    String name;
    static int bankVault;
}
class TestEmp {
    public static void main(String[] args) {
        Emp emp1 = new Emp();
        Emp emp2 = new Emp();
        emp1.bankVault = 10;
        emp2.bankVault = 20;
        System.out.println(emp1.bankVault);
        System.out.println(emp2.bankVault);
        System.out.println(Emp.bankVault);
    }
}

//20
//20
//20

//In the preceding code example, emp1.bankVault, emp2.bankVault, and Emp.bankVault all refer to the same static attribute: bankVault.