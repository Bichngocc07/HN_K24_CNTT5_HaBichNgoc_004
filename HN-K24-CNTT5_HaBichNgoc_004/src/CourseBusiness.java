import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class CourseBusiness {
    private static CourseBusiness instance;
    private List<CourseBusiness> list = new ArrayList<>();

    private void TransactionBusiness() {}

    public static CourseBusiness courseBusiness() {
        if (instance == null) {
            instance = new CourseBusiness();
        }
        return instance;
    }

    // Hiển thị
    public void displayData() {
        if (list.isEmpty()) {
            System.out.println("Chưa có khóa");
            return;
        }
        System.out.println("----------------------------------------------------------------");
        list.forEach(::displayData);
    }

    // Thêm
    public boolean addCourse(CourseBusiness t) {
        boolean exists = list.stream()
                .anyMatch(x -> x.getTransactionId().equalsIgnoreCase(t.getTransactionId()));

        if (exists) {
            System.out.println("Khóa học đã tồn tại!");
            return false;
        }
        list.add(t);
        return true;
    }

    private String getCourseBusiness() {
        return null;
    }

    // Update
    public void update(String id, Scanner sc) {
        Optional<CourseBusiness> opt = list.stream()
                .filter(x -> {
                    assert x.getCourseBusiness() != null;
                    return x.getCourseBusiness().equalsIgnoreCase(id);
                })
                .findFirst();

        if (!opt.isPresent()) {
            System.out.println("Không tìm thấy!");
            return;
        }

        CourseBusiness t = opt.get();

        System.out.println("1. ");
        int choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                System.out.print("Hiển thị danh sách khóa học: ");
                t.CourseBusuness(sc.nextLine());
                break;
            case 2:
                System.out.print("Bạn có muốn thêm tiếp không: ");
                t.setMessage(sc.nextLine());
                break;
            case 3:
                double amount;
                do {
                    System.out.print("Cập nhật mã khóa học: ");
                    amount = Double.parseDouble(sc.nextLine());
                } while (amount <= 0);
                t.setAmount(amount);
                break;
        }
        System.out.println("Cập nhật thành công!");
    }


    private void CourseBusuness(String s) {
    }

    private boolean getCourseBusiness() {
        return false;
    }

    private void setAmount(double amount) {
    }

    private void setMessage(String s) {
    }

    private void setStudentName(String s) {
    }
