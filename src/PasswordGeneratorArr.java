import java.util.Random;
import java.util.Scanner;

public class PasswordGeneratorArr {
    static private String[] source = {"q","w","e","r","t","y","u","i","o","p","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m","Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Z","X","C","V","B","N","M","1","2","3","4","5","6","7","8","9","0","_"};
    static private int randomNum(int min, int max){
        Random n = new Random();
        return n.nextInt(max) + min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String S = sc.nextLine();
            int passwordLength = 8;
            String[] p = new String[passwordLength];
            for (int i = 0; i < passwordLength; i++){
                p[i] = source[randomNum(0,source.length)];
            }
            String password = "";
            for (String j : p) {
                password+=j;
            }
            System.out.println(password);
        }
    }
}
