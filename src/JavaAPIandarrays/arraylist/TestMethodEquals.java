package JavaAPIandarrays.arraylist;

import java.util.ArrayList;

class TestMethodEquals {
    public static void main(String args[]) {
        BankAccount b1 = new BankAccount();
        b1.acctNumber = "0023490"; b1.acctType = 4;
        ArrayList<BankAccount> list = new ArrayList<BankAccount>();
        list.add(b1);
        BankAccount b2 = new BankAccount();
        b2.acctNumber = "0023490"; b2.acctType = 4;
        System.out.println(list.contains(b2));
    }
}

//True

//If you hadn’t overridden equals(), this would’ve returned false, because the default equals() in Object checks reference equality (b1 != b2)




// ✅ The equals() Contract — Key Rules You Must Know:
//Reflexive
//x.equals(x) must return true.
//
//Symmetric
//x.equals(y) must return true if and only if y.equals(x) returns true.
//
//Transitive
//If x.equals(y) and y.equals(z), then x.equals(z) must return true.
//
//Consistent
//Multiple calls to x.equals(y) should return the same result unless something changes in the data used for comparison.
//
//Non-nullity
//x.equals(null) must always return false.
//If it returns true, you violate the contract..

//🚨 Big Don'ts (These Break the Contract):
//Returning true when comparing to null:

//if (obj == null) return true; // ❌ bad
//Modifying the state of either object inside equals():

//this.name = other.name; // ❌ never modify inside equals
//✅ Correct Template for equals():
//@Override
//public boolean equals(Object obj) {
//    if (this == obj) return true;
//    if (obj == null || getClass() != obj.getClass()) return false;
//    MyClass other = (MyClass) obj;
//    return this.someField.equals(other.someField);
//}