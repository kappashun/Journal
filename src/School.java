
public class School {
    String name;
    String adress;
    Employee[] employees;
    Teacher[] teachers;
    Student[] students;
    Class[] classes;
    Section[] sections;
    Elective[] electives;
    public void getListTeachers(Teacher[] teachers){
        for(int i = 0; i < teachers.length; i++){
            System.out.println(teachers[i]);
        }
    }
    public void getListEmployees(Teacher[] teachers){
        for(int i = 0; i < employees.length; i++){
            System.out.println(employees[i]);
        }
    }
    public void getListStudents(Teacher[] teachers){
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
    }
}
