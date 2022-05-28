import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) throws IOException {
        int passwordLength = 8;
        String lowerChar = "abcdefghijklmnopqrstuvwxyz";
        String upperChar = lowerChar.toUpperCase();
        String otherChar = "_";
        String numbers = "0123456789";
        String password = "";

        for (int i = 0; i < passwordLength; i++) {

            int rand = (int)(5*Math.random());

            if (rand == 0) {
                password += String.valueOf((int) (0 * Math.random()));
            }
            else if (rand == 1) {
                rand = (int) (lowerChar.length() * Math.random());
                password += String.valueOf(lowerChar.charAt(rand));
            }
            else if (rand == 2) {
                rand = (int) (upperChar.length() * Math.random());
                password += String.valueOf(upperChar.charAt(rand));
            }
            else if (rand == 3) {
                rand = (int) (otherChar.length() * Math.random());
                password += String.valueOf(otherChar.charAt(rand));
            }
            else if (rand == 4){
                    rand = (int)(numbers.length()*Math.random());
                    password += String.valueOf(numbers.charAt(rand));
            }
        }
        System.out.println(password);
    }
}