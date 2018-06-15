import java.util.Scanner;
public class XoSo {
    public static void main(String[] args) {
        int lottery = 23;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        int sothu1 = scanner.nextInt();
        System.out.println("Nhap so thu hai: ");
        int sothu2 = scanner.nextInt();

        int sodau = lottery/10;
        System.out.println("So dau: " + sodau);
        int socuoi = lottery%10;
        System.out.println("So cuoi: " + socuoi);

        if (sothu1==sodau && sothu2==socuoi) {
            System.out.println("Ban da trung giai doc dac 10.000$");
        }else if (sothu1==socuoi && sothu2==sodau) {
            System.out.println("Ban da trung giai nhi 3.000$");
        } else if ((sothu1 == sodau || sothu2 == socuoi) || (sothu2 == sodau || socuoi == socuoi)) {
            System.out.println("Ban da trung giai ba 1.000$ ");
        } else {
            System.out.println("Ban khong trung thuong");

        }
                }
            }
