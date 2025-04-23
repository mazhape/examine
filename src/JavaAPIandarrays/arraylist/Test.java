package JavaAPIandarrays.arraylist;


class BankAccount {
    String acctNumber;
    int acctType;
    public boolean equals(Object anObject) {
        if (anObject instanceof BankAccount) {
            BankAccount b = (BankAccount)anObject;
            return (acctNumber.equals(b.acctNumber) &&
                    acctType == b.acctType);
        }
        else
            return false;
    }
}
class Test {
    public static void main(String args[]) {
        BankAccount b1 = new BankAccount();
        b1.acctNumber = "0023490";
        b1.acctType = 4;
        BankAccount b2 = new BankAccount();
        b2.acctNumber = "11223344";
        b2.acctType = 3;
        BankAccount b3 = new BankAccount();
        b3.acctNumber = "11223344";
        b3.acctType = 3;
        System.out.println(b1.equals(b2));
        System.out.println(b2.equals(b3));
        System.out.println(b1.equals(new String("abc")));
    }
}



//false
//true
//false

//Now the comparisons:
//System.out.println(b1.equals(b2)); // false
//acctNumber mismatch: "0023490" vs "11223344"

//acctType mismatch: 4 vs 3 ✅ Result: false
//System.out.println(b2.equals(b3)); // true
//acctNumber match: "11223344" == "11223344"

//acctType match: 3 == 3 ✅ Result: true
//System.out.println(b1.equals(new String("abc"))); // false
//"abc" is not a BankAccount instance ✅ Result: false