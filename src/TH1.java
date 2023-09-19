import java.util.Scanner;

public class TH1 {
    public static void main(String[] args) {
        System.out.println("Phương trình bậc nhất: ax + b = c");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = sc.nextInt();
        System.out.println("Nhập b: ");
        int b = sc.nextInt();
        System.out.println("Nhập c: ");
        int c = sc.nextInt();
        if(a!= 0){
            System.out.println("Phương trình có nghiệp x = " + ((c-b)/a));
        }else  {
            if(b == c){
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
                
            }
        }

    }
}
