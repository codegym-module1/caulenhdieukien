import java.util.Scanner;

public class TinhLuongNhanVien {
    public static void main(String[] args) {
        int hesoluong;
        int sonamlamviec;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap he so luong");
        hesoluong = scanner.nextInt();
        System.out.println("Nhap so nam lam lam viec");
        sonamlamviec= scanner.nextInt();
        int luongthang = (hesoluong * 4000000) + (sonamlamviec * 500000);

        switch (hesoluong) {
            case 1:
                System.out.print("Luong thang nay la: " + luongthang);
                break;
            case 2:
                System.out.print("Luong thang nay la: " + luongthang);
                break;
            case 3:
                System.out.print("Luong thang nay la: " + luongthang);
                break;
            case 4:
                System.out.print("Luong thang nay la: " + luongthang);
                break;
            case 5:
                System.out.print("Luong thang nay la: " + luongthang);
                break;
                default:
                    System.out.println("OUT");
                    break;


        }
    }
}
