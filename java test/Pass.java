import java.util.Scanner;

public class Pass {
    
public static final int PASSWORD_LENGTH = 8;

public static boolean Valid(String password) {

        if (password.length() < PASSWORD_LENGTH) {
            return false;
        }

        int chars = 0;
        int numbers = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);
            ch = Character.toUpperCase(ch);
            if(ch >= '0' && ch <= '9') {
                numbers++;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                chars++;
            }
            else return false;
        }
        return (chars >= 2 && numbers >= 2);
    }


public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): ");
        String s = sc.nextLine();

        if (Valid(s)) {
            System.out.println("Password is valid: " + s);
        } else {
            System.out.println("Not a valid password: " + s);
        }

    }
}


