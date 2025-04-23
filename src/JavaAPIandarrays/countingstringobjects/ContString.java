package JavaAPIandarrays.countingstringobjects;

class ContString {
    public static void main(String... args) {
        String summer = new String("Summer");
        String summer2 = "Summer";
        System.out.println("Summer");
        System.out.println("autumn");
        System.out.println("autumn" == "summer");
        String autumn = new String("Summer");
    }
}


//The previous code creates a total of five String objects.
//3 in the String Pool: "Summer", "autumn", "summer"
//2 in the Heap via new String(...)

//Step-by-Step Object Count:
//String summer = new String("Summer");
//
//"Summer" literal goes into the String Pool → 1 object
//
//new String("Summer") creates a new object in the heap → 2nd object
//
//String summer2 = "Summer";
//
//Reuses the "Summer" in the String Pool → no new object → still 2 total
//
//System.out.println("Summer");
//
//"Summer" is already in the pool → no new object → still 2
//
//System.out.println("autumn");
//
//"autumn" is a new literal, added to the pool → 3rd object
//
//System.out.println("autumn" == "summer");
//
//"summer" is a new literal, added to the pool → 4th object
//
//String autumn = new String("Summer");
//
//"Summer" is already in the pool → no new pool object
//
//new String("Summer") → new heap object → 5th object