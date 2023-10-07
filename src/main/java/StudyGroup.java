import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    private List<Student> studyList;
    private String nameGroup;

    public StudyGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public void addStudents(Student student){
        List<Student> studyList = new ArrayList<>();
        studyList.add(student);
    }

    public List<Student> getStudyList() {
        return studyList;
    }

    @Override
    public String toString() {
        return nameGroup;
    }


}
