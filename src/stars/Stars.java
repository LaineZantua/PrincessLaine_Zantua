
package stars;

import java.util.Scanner;


    
public class Stars {

        public static int RecursionStars(int n){
    
            if(n == 0){
                return 0;
             }else{
                System.out.println("*");
                return RecursionStars(n - 1);       
            }
        }

        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
        
            System.out.println("How many stars? ");
            int stars = scn.nextInt();
            System.out.println("");
            RecursionStars(stars);
        
    }

}
    

