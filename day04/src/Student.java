public class Student {
    private String studentId;  // 学号
    private String name;       // 姓名
    private String major;      // 专业

    public Student(String studentId, String name, String major) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
    }
    public String toString() {
        return studentId + "，" + name + "，" + major;
    }
}
