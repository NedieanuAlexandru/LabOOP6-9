package two;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String lecture;
    List<Student> student = new ArrayList<>();

    public Group(String lecture) {
        this.lecture = lecture;
    }

    // 1 requirement
    public void addStudent(Student studentToBeAdded) {
        this.student.add(studentToBeAdded);
        System.out.println(studentToBeAdded.name + " added to the Group.");
    }

    // 2 requirement => To display the students from each group
    public void displayAllStudents() {
        for(Student studentParse: this.student) {
            System.out.println(studentParse.name + " age " + studentParse.age);
        }
    }

    public String getLecture() {
        return lecture;
    }
}
