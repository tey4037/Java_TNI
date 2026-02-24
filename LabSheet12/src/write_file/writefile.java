package write_file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class writefile {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("sec/WriteFile/user2.txt");
        PrintWriter writer = new PrintWriter(file);

        writer.println("Hello");
        writer.close();
    }
}
