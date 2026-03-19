import java.util.Scanner;

public class Course {
    private String courseId;
    private String courseName;
    private int credit;
    private double tuitionFee;
    private String instructor;
    private boolean status;

    public Course() {}

    public Course(String courseId, String courseName, int credit,
                  double tuitionFee, String instructor, boolean status) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credit = credit;
        this.tuitionFee = tuitionFee;
        this.instructor = instructor;
        this.status = status;
    }

    public String getCourseId() {
        return courseId; }
    public void setCourseId(String courseId) {
        this.courseId = courseId; }

    public String getCourseName() { return courseName; }
    public void setCourseName(String courseName) { this.courseName = courseName; }

    public int getCredit() {
        return credit; }
    public void setCredit(int credit) {
        this.credit = credit; }

    public double getTuitionFee() {
        return tuitionFee; }
    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee; }

    public String getInstructor() {
        return instructor; }
    public void setInstructor(String instructor) {
        this.instructor = instructor; }

    public boolean isStatus() { return status; }
    public void setStatus(boolean status) { this.status = status; }

    public void inputData(Scanner sc) {
        while (true) {
            System.out.print("Nhập mã (CO001): ");
            courseId = sc.nextLine();
            if (courseId.matches("CO\\d{3}")) break;
            System.out.println("Sai định dạng");
        }

        while (true) {
            System.out.print("Nhập tên: ");
            courseName = sc.nextLine();
            if (courseName.length() >= 5) break;
            System.out.println(">= 5 ký tự");
        }

        System.out.print("Nhập tín chỉ: ");
        credit = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập học phí: ");
        tuitionFee = Double.parseDouble(sc.nextLine());

        System.out.print("Nhập giảng viên: ");
        instructor = sc.nextLine();

        System.out.print("Trạng thái (true/false): ");
        status = Boolean.parseBoolean(sc.nextLine());
    }

    public void displayData() {
        System.out.printf("%-10s | %-20s | %-5d | %-10.2f | %-20s | %-5s\n",
                courseId, courseName, credit, tuitionFee, instructor, status);
    }
}
