package MethodsAndEncapsulation;

class Phone {
    String phoneNumber = "123456789"; // instance variable

    void setNumber() {
        String phoneNumber; // local variable with same name
        phoneNumber = "987654321"; // assigns to the local variable
        //this.phoneNumber = "987654321"; // modifies the instance variable
    }
}

class TestPhone {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setNumber();
        System.out.println(p1.phoneNumber);
    }
}

//123456789

//Explanation:
//In the Phone class, you have an instance variable called phoneNumber.
//
//Inside the setNumber() method, you declare a local variable also named phoneNumber. This shadows the instance variable.
//
//When you assign "987654321" to phoneNumber inside setNumber(), you're assigning it to the local variable, not the instance variable.
//
//Therefore, when System.out.println(p1.phoneNumber); runs, it prints the original instance variable value "123456789" because it was never changed.