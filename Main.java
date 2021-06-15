import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pwd = "";
        boolean check = false;
        Pattern letter = Pattern.compile("[A-Z]");
        Pattern digit = Pattern.compile("[0-9]");
        Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
        while (check == false) {
            System.out.print("Nhập mật khẩu: ");
            pwd = scanner.nextLine();
            Matcher hasLetter = letter.matcher(pwd);
            Matcher hasDigit = digit.matcher(pwd);
            Matcher hasSpecial = special.matcher(pwd);
            if (pwd.length() < 10) {
                System.out.println("Mật khẩu yếu, hãy nhập mật khẩu khác");
            } else if (hasLetter.find() == false || hasDigit.find() == false || hasSpecial.find() == false) {
                System.out.println("Mật khẩu chưa đủ mạnh, hãy nhập mật khẩu khác");
            } else check = true;
        }
        System.out.println("Tạo mật khẩu thành công!");
    }
}