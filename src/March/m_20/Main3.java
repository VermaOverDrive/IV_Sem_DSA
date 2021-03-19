package March.m_20;

import java.util.List;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {
        TeacherHelper obj=new TeacherHelper();
        List<Employee> allteachers=obj.allTeachers();
        System.out.println("Printing all the tecahers");
        obj.printTeachers(allteachers);
        String subject="Subject2";
        List<Employee> particularSubject=obj.findSubjectTeacher(allteachers,subject);
        System.out.println("Printing teachers who teaches "+subject);
        obj.printTeachers(particularSubject);
        Set<Employee> increment=obj.getBusyTeachers(allteachers);
        System.out.println("Printing teachers whose salary is incremented");
        for(Employee current:increment){
            System.out.println(current);
        }

    }
}