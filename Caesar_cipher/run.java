import Decode.decode;//package for decrypting 
import Encode.encode;//package for encrypting 
import java.util.*;

class run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        encode ob = new encode();
        decode ob1 = new decode();
        try {
            while (true) {
                System.out.println("____Menu____");
                System.out.println("1. Encode");
                System.out.println("2. Decode");
                System.out.println("3. Exit");
                System.out.println("____________");
                System.out.println("Enter your choice: ");
                switch (sc.nextInt()) {
                    case 1:
                        System.out.println("Enter the Function \'n\' value and the text to Encrypt ");
                        int n = sc.nextInt();
                        String text = sc.nextLine();// to take string with backspace as input
                        System.out.println("Encrypted form of \" " + text + "\" is " + ob.en(text, n));
                        break;
                    case 2:
                        System.out.println("Enter the Function\'n\' value and the text to Decrypt ");
                        int n2 = sc.nextInt();
                        String text2 = sc.nextLine();// to take string with backspace as input
                        System.out.println("Decrypted form of \" " + text2 + "\" is " + ob1.de(text2, n2));
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Enter valid option");
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        } finally {
            sc.close();
        }
    }
}
