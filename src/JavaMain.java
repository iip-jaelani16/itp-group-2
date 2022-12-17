import java.util.Scanner;

public class JavaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";
        // loop if empty
        Boolean validName = false;
        while (!validName) {
            System.out.print("Masukan nama anda [1..25]: ");
            name = input.nextLine();
            if (name.length() > 0 &&  name.length() < 25) {
                validName = true;
            } else {
                System.out.println("Nama harus minimal 1 karakter dan maksimal 25 karakter");
            }
        }
    }
}