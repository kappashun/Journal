
public class Section {
    String name;
    Student[] students;
    Teacher SectionTeacher;
    public void getList(Student[] students){
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
    }
    public void getListParents(Student[] students){
        for(int i = 0; i < students.length; i++){
            for(int j = 0; j < students[i].parents.length; j++) {
                System.out.println(students[i].parents[j]);
            }
        }
    }
}
