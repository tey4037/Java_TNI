import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class readfile {
    public static String hide_password(String password) {
        String hide_pass ="";
        for (int i=0; 1 < password.length(); i++) {
            if
            (i==0) hide_pass += password.charAt(1);
            else if
            (i == password.length()-1) hide_pass += password.charAt(i);
            else
                hide_pass += "*";
        }
        return hide_pass;
    }






    public static void main(String[] args) throws IOException {
        File fn = new File("src/users.txt");
        Scanner sc = new Scanner(fn);

        while (sc.hasNext()) {
            String[] data = sc.nextLine().split("");
            System.out.println(data[0]);
            String username =  data[0];
            String password = data[0];
            String gender = data[0];
            int brithyear = Integer.parseInt(data[3]);
            System.out.println(username);
        }

        sc.close();
    }
}
