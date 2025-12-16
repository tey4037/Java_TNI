import java.util.Scanner;

public class Lab504 {

    public static boolean check_password(String pass) {

        if (pass == null) return false;

        if (pass.length() < 8) return false;

        boolean hasLetter = false;
        boolean hasDigit  = false;

        for (int i = 0; i < pass.length(); i++) {
            char c = pass.charAt(i);
            if (Character.isLetter(c)) hasLetter = true;
            if (Character.isDigit(c))  hasDigit  = true;

            if (hasLetter && hasDigit) break;
        }
        return hasLetter && hasDigit;
    }


    public static boolean check_password(String pass, String confirm_pass ){
        if (pass == null || confirm_pass == null) return false;
        return pass.equals(confirm_pass);

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        while (true) {
            System.out.print("Create password: ");
            password = sc.nextLine();
            if (check_password(password)) {
                break;
            } else {
                System.out.println("Invalid Password! Create password: " + password);
            }
            while (true) {
                System.out.print("\nEnter confirm password: ");
                String confirm = sc.nextLine();
                if (check_password(password, confirm)) {
                    break;
                } else {
                    System.out.println("Password do not match! Enter confirm password: " + confirm);
                }
            }
            System.out.println("\nPassword set successfully!!");
            sc.close();

        }

    }
}
