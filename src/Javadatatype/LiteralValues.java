//let’s define and initialize some long primitive variables that use underscores in the literal values assigned to them. Determine which of
//these does this job correctly:

package Javadatatype;

public class LiteralValues {
    public static void main(String[] args) {
        long var1 = 0_100_267_760;
//        long var2 = 0_x_4_13;
//        long var3 = 0b_x10_BA_75;
//        long var4 = 0b_10000_10_11;
//        long var5 = 0xa10_AG_75;
        long var6 = 0x1_0000_10;
        long var7 = 100__12_12;
    }
}


//long var6 = 0x1_0000_10;
// long var7 = 100__12_12;
//long var1 = 0_100_267_760;