import org.mindrot.jbcrypt.BCrypt;

import java.util.Scanner;

public class BCryptDemo {
    public static void main(String[] args) {
        String password = "happy123";
        String hash = BCrypt.hashpw(password,BCrypt.gensalt());
        System.out.println("hash = " + hash);

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the passkey");
        String answer = scan.nextLine();


        boolean userResponse = BCrypt.checkpw(answer,hash);

        System.out.println("User Password = " + userResponse);

            if (userResponse) {
                System.out.println("Access Granted");
            } else {

                System.out.println("sorry that's incorrect please try again");
            }

    }
}

