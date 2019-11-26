// Modified by Dakota Albritton
// Modified on 11/19/2019
// This program splits a name into its parts

import java.util.Scanner;

public class NameParserApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean again = true;

        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        String[] nameParts = name.split(" ");
        
        while(again == true) {
            if(nameParts.length <= 1 || nameParts.length > 3) {
                System.out.println("Error Wrong Amount Of Words");
                System.out.print("Enter a name: ");
                name = sc.nextLine();
                nameParts = name.split(" ");
            } else {
                for(int i = 0; i < nameParts.length; i++) {
                    System.out.println(nameParts[i]);
                }
                again = false;
            }
        }
    }
}
