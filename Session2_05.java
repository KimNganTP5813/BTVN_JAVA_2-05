import java.util.Scanner;

public class Session2_05 {
    public static void main(String[] args) {
        // Tạo đối tượng Scanner để nhập dữ liệu từ người dùng
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập một số nguyên từ 1 đến 12
        System.out.print("Nhập một số nguyên từ 1 đến 12: ");
        int dayNumber = scanner.nextInt();

        // Sử dụng cấu trúc switch-case để xác định ngày trong tháng
        switch (dayNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng có 30 ngày");
                break;
            case 2:
                System.out.println("Tháng có 28 hoặc 29 ngày");
                break;
            default:
                if ( dayNumber<=0 || dayNumber>12) {
                    System.out.println("Tháng không hợp lệ.");
                }
                break;
                
        }

        // Đóng scanner
        scanner.close();
    }
}
