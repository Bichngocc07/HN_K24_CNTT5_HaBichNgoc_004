import java.util.ArrayList;
import java.util.Scanner;

public class CourseBusiness {
    private ArrayList<Course> list = new ArrayList<>();

    public void displayAll() {
        if (list.isEmpty()) {
            System.out.println("Danh sách rỗng");
            return;
        }

        System.out.printf("%-10s | %-20s | %-5s | %-10s | %-20s | %-5s\n",
                "ID", "Name", "Cre", "Fee", "Instructor", "Status");

        for (Course c : list) {
            c.displayData();
        }
    }

    public void addCourse(Scanner sc) {
        Course c = new Course();
        c.inputData(sc);

        for (Course x : list) {
            if (x.getCourseId().equals(c.getCourseId())) {
                System.out.println("Trùng mã");
                return;
            }
        }

        list.add(c);
        System.out.println("Thêm thành công");
    }

    public void updateCourse(Scanner sc) {
        System.out.print("Nhập mã: ");
        String id = sc.nextLine();

        for (Course c : list) {
            if (c.getCourseId().equals(id)) {
                System.out.print("Tên mới: ");
                c.setCourseName(sc.nextLine());

                System.out.print("Tín chỉ: ");
                c.setCredit(Integer.parseInt(sc.nextLine()));

                System.out.print("Học phí: ");
                c.setTuitionFee(Double.parseDouble(sc.nextLine()));

                System.out.println("Đã cập nhật");
                return;
            }
        }

        System.out.println("Không tìm thấy");
    }

    public void deleteCourse(Scanner sc) {
        System.out.print("Nhập mã: ");
        String id = sc.nextLine();

        for (Course c : list) {
            if (c.getCourseId().equals(id)) {
                list.remove(c);
                System.out.println("Đã xóa");
                return;
            }
        }

        System.out.println("Không tìm thấy");
    }
}
