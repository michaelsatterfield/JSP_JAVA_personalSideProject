import org.mindrot.jbcrypt.BCrypt;

import java.util.Scanner;

public class BCryptDemo {
    public static void main(String[] args) {
        String password = "happy123";
        String hash = BCrypt.hashpw(password,BCrypt.gensalt());
//        System.out.println("hash = " + hash);
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter the passkey");
        String answer = scan.nextLine();


        boolean userResponse = BCrypt.checkpw(answer,hash);
        System.out.println("User Password = " + userResponse);
//
//         while(!userResponse){
//             System.out.println("not granted");
//             System.out.println("please enter the passkey");
//             scan.nextLine();
//             boolean userRes2  = BCrypt.checkpw(answer,hash);
//             if (userRes2) {
//                 System.out.println("granted");
//                 break;
//
//             }
//         }



       while (!userResponse)  {
           System.out.println("sorry that's incorrect please try again");
           System.out.println("please enter the passkey");
           scan.nextLine();
           if(userResponse){
               System.out.println("Access Granted");
               break;
           }
         }
    }
}


