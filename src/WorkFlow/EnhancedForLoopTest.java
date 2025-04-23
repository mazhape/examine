package WorkFlow;

import java.util.ArrayList;

public class EnhancedForLoopTest {
    public static void main(String[] args) {
        ArrayList<String> exams= new ArrayList<String>();
        exams.add("Java");
        exams.add("Oracle");
        ArrayList<String> levels= new ArrayList<String>();
        levels.add("Basic");
        levels.add("Advanced");
        ArrayList<String> grades= new ArrayList<String>();
        grades.add("Pass");
        grades.add("Fail");

        ArrayList<ArrayList<String>> nestedArrayList =
                new ArrayList< ArrayList<String>>();
        nestedArrayList.add(exams);
        nestedArrayList.add(levels);
        nestedArrayList.add(grades);

        for (ArrayList<String> nestedListElement : nestedArrayList)
            for (String element : nestedListElement)
                System.out.println(element);
    }
}

//Java
//Oracle
//Basic
//Advanced
//Pass
//Fail