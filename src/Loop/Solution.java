package Loop;

import java.util.*;
import java.util.stream.Collectors;

class StudentComparator implements Comparator<Student>{


    @Override
    public int compare(Student o1, Student t1) {
        if(Double.compare(o1.getCgpa(), t1.getCgpa()) == 0 && o1.getName().compareTo(t1.getName()) == 0){
            return o1.getId() - t1.getId();

        } else if (Double.compare(o1.getCgpa(), t1.getCgpa()) == 0) {
            return o1.getName().compareTo(t1.getName());
        }

        return Double.compare(t1.getCgpa(), o1.getCgpa());
    }
}
class Student{

    private int id;
    private String name;
    private double cgpa;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.cgpa, cgpa) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cgpa);
    }

}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Student> studentList = new ArrayList<>();


        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            Student student = new Student(id, name, cgpa);
            studentList.add(student);
        }
        StudentComparator studentComparator = new StudentComparator();
        Collections.sort(studentList, studentComparator);
        for (Student s : studentList){
            System.out.println(s.getName());
        }


    }
}