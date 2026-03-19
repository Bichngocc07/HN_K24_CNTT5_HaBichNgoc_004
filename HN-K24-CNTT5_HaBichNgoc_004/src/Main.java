import java.util.Scanner;

public class Main {
    public static void Main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("==========QUẢN LÝ KHÓA HỌC==========");
            System.out.println("1. Hiển thị danh sách toàn bộ khóa học");
            System.out.println("2. Thêm mới khóa học");
            System.out.println("3. Cập nhật thông tin khóa học theo mã");
            System.out.println("4. Xóa khóa học theo mã");
            System.out.println("5. Tìm kiếm khóa hojctheo tên giảng viên");
            System.out.println("6. Lọc khóa học đang mở");
            System.out.println("7. Sắp xếp khóa học theo học phí giảm dần");
            System.out.println("8. Thoát");
            choice = sc.nextInt();
            switch (choice){
                case 1 :
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                case 4 :
                    break;
                case 5 :
                    break;
                case 6 :
                    break;
                case 7 :
                    break;
                case 8 :
                    System.out.println("Thoát ");
                    break;
                default:
                    System.out.println("Lựa chọn của bạn hợp lệ");
            }
        }while (true);
    }
}