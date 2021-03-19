package March.m_20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TeacherHelper {
    List<Employee> particularSubjects=new ArrayList<>();
    List<Employee> total=new ArrayList<>();

    public List<Employee> findSubjectTeacher(List<Employee> allTeachers,String subjectName){
        for(Employee current:allTeachers){
            int sizeOfSubjectsOfCurrentTeacher=current.getSubjects().size();
            for(String currentSubject: current.getSubjects()){
                if(currentSubject.equals(subjectName)) {
                    particularSubjects.add(current);
                }
            }
        }
        return particularSubjects;

    }

    public List<Employee> allTeachers(){

        int teachers=5;
        for (int i = 1; i <=teachers ; i++) {
            List<String> subject=new ArrayList<>();
            String id="Empid"+i;
            String name="Teacher.Employee"+i;
            double salary=(int)(Math.random()*50000+1);
            int subjects=((int)(Math.random()*5)+2);
            for(int j = 1; j<subjects ; j++) {
                subject.add("Subject"+j);
            }
            Employee obj=new Employee(id,name,salary,subject);
            total.add(obj);
        }
        return total;
    }
    public void printTeachers(List<Employee> teachers){
        for(Employee current:teachers){
            System.out.println(current);
        }
    }

    public Set<Employee> getBusyTeachers(List<Employee> allTeachers){
        Set<Employee> incrementSalaryList=new HashSet<>();
        for(Employee current :allTeachers){
            if(current.getSubjects().size()>=3){
                double salary=current.getSalary()+0.05* current.getSalary();
                current.setSalary(salary);
                incrementSalaryList.add(current);
            }

        }
        return incrementSalaryList;
    }
}