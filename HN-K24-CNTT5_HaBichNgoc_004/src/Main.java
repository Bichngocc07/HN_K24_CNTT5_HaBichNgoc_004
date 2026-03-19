import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseBusiness bus = new CourseBusiness();

        while (true) {
            System.out.println("==========QUẢN LÝ KHÓA HỌC==========");
            System.out.println("1. Hiển thị danh sách toàn bộ khóa học");
            System.out.println("2. Thêm mới khóa học");
            System.out.println("3. Cập nhật thông tin khóa học theo mã");
            System.out.println("4. Xóa khóa học theo mã");
            System.out.println("5. Tìm kiếm khóa hojctheo tên giảng viên");
            System.out.println("6. Lọc khóa học đang mở");
            System.out.println("7. Sắp xếp khóa học theo học phí giảm dần");
            System.out.println("8. Thoát");
            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Sai dữ liệu");
                continue;
            }

            switch (choice) {
                case 1:
                    bus.displayAll();
                    break;
                case 2:
                    bus.addCourse(sc);
                    break;
                case 3:
                    bus.updateCourse(sc);
                    break;
                case 4:
                    bus.deleteCourse(sc);
                    break;
                 case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Chỉ chọn 1-4");
            }
        }
    }
}
