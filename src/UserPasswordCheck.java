import java.util.Scanner;

public class UserPasswordCheck {
    public static void main(String[] args) {
        /*
        Kullanıcıdan kullanıcı adı ve şifre bilgisini al.

        Kullanıcı adı: java
        Şifre: 1234

        Şifre yalnış ise şifreyi sıfırlamak isteyip istemediğini sor.

        Yeni girilen şifre hatalı girdiği ve unuttuğu şifre ile aynı ise Şifre oluşturulamadı yazdır.

         */
        Scanner input = new Scanner(System.in);
        String userName, password;
        System.out.print("Kullanıcı adı giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifre giriniz: ");
        password = input.nextLine();

        if (userName.equals("java") && password.equals("1234")) {
            System.out.print("Giriş yaptınız.");
        } else {
            System.out.print("Hatalı giriş yaptınız. Şifrenizi sıfırlamak ister misiniz?\n1-Evet\n2-Hayır\nSeçim: ");
            int select = input.nextInt();

            switch (select) {
                case 1:
                    input.nextLine();
                    System.out.print("Yeni şifre giriniz: ");
                    String newPassword = input.nextLine();
                    if (newPassword.equals("1234")) {
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre girerek tekrar deneyin.");
                    } else {
                        System.out.print("Şifre oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.print("Giriş başarısız. Tekrar deneyin.");
                    break;
                default:
                    System.out.print("Hatalı giriş yaptınız. Tekrar deneyin.");
            }
        }
    }
}
