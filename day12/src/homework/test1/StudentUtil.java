package homework.test1;

public class StudentUtil {
    public static int compareByScore(Student s1, Student s2) {
        return s2.getScore() - s1.getScore();
    }

    public void printStudent(Student s) {
        System.out.println(s.getId() + " - " + s.getName() + " - " + s.getScore());
    }
}