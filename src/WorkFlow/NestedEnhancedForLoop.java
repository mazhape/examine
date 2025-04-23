package WorkFlow;

import java.util.ArrayList;

public class NestedEnhancedForLoop {
    public static void main(String[] args) {
        ArrayList<String> exams= new ArrayList<String>();
        exams.add("Java"); exams.add("Oracle");
        ArrayList<String> levels= new ArrayList<String>();
        levels.add("Basic"); levels.add("Advanced");
        ArrayList<String> grades= new ArrayList<String>();
        grades.add("Pass"); grades.add("Fail");
        for (String exam : exams)
            for (String level : levels)
                for (String grade : grades)
                    System.out.println(exam+":"+level+":"+grade);
    }
}

//Java:Basic:Pass
//Java:Basic:Fail
//Java:Advanced:Pass
//Java:Advanced:Fail
//Oracle:Basic:Pass
//Oracle:Basic:Fail
//Oracle:Advanced:Pass
//Oracle:Advanced:Fail