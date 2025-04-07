package Javasourcecode;

class Empp {
    String name;
    static int bankVault;

    static int getBankVaultValue() {
        return bankVault;
    }
}

class Office {
    public static void main(String[] args) {
        Empp empp = null;
        System.out.println(empp.bankVault);
        System.out.println(empp.getBankVaultValue());
    }
}



//EXAM TIP You can access static variables and methods using a null reference
