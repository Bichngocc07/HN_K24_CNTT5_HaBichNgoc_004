import java.util.Scanner;

public class Course {
    private String courseId;
    private String courseName;
    private int credit;
    private double tuitionFee;
    private String instructor;
    private boolean status;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Course(String courseId, String courseName, int credit, double tuitionFee, String instructor, boolean status) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credit = credit;
        this.tuitionFee = tuitionFee;
        this.instructor = instructor;
        this.status = status;

    }
    public void inputData(Scanner sc){
        while (true){
            System.out.println("Nhập mã khóa học");
            courseId = sc.nextLine();
            if (courseId.matches("CD\d(3)"));
            break;
            System.out.println("Sai định dạng thông tin");
        }
        while (true){
            System.out.println("Nhập tên khóa học");
            courseName = sc.nextLine();
            if (courseName.length()>=5);
            break;
            System.out.println("Tên khóa học phải trên 5 kí tự ");
        }
    }
    public void displayData(){
        System.out.println("%-10s | %-20s | %-10d | %-10.2f | %-20s|\n"
                courseId,courseName,credit,tuitionFee,instructor,status);
    }
}

