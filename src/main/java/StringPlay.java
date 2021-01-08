import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;


public class StringPlay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something: ");
        String input = sc.nextLine();
        System.out.printf("You entered: %s%n", input);

        if(!StringUtils.isNumeric(input)) {
            System.out.printf("\"%s\" is not numeric%n", input);
        }else{
            System.out.printf("\"%s\" is numeric%n", input);
        }
        System.out.printf("Flipped Case: %s%n", StringUtils.swapCase(input));
        System.out.printf("Reversed: %s%n", StringUtils.reverse(input));
    }



}