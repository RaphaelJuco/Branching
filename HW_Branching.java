
/**
 * Write a description of class HW_Branching here.
 *
 * @author (Raphael Juco)
 * @version (1/28/2018)
 */
import java.util.Scanner;
public class HW_Branching
{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the sales for store 1: ");
        double store1 = keyboard.nextDouble(); 
        System.out.println("Enter the sales for store 2: ");
        double store2 = keyboard.nextDouble();
        System.out.println("Enter the sales for store 3: ");
        double store3 = keyboard.nextDouble(); 
        System.out.println("Enter the sales threshold: ");
        double threshold = keyboard.nextDouble();
        
        if(store1 >= threshold && threshold > store2 && threshold > store3){
            System.out.println("Store 1 did great!");
            System.out.println("The average sales for exceeding store: " + store1);
        }
        else if(store2 >= threshold && threshold > store1 && threshold > store3){       
            System.out.println("Store 2 did great!");
            System.out.println("The average sales for exceeding store: " + store2);
        }
        else if(store3 >= threshold && threshold > store2 && threshold > store1){
            System.out.println("Store 3 did great!");
            System.out.println("The average sales for exceeding store: " + store3);
        }
       else if(store1 >= threshold && store2 >= threshold && store3 < threshold){
           double x = (store1 +  store2) / 2.0;
           System.out.println("Store 1 and 2 did great!");
           System.out.println("The average sales for exceeding store: " + x);
        }
        else if(store1 >= threshold && store3 >= threshold && store2 < threshold){
           double x = (store1 +  store3) / 2.0;
           System.out.println("Store 1 and 3 did great!");
           System.out.println("The average sales for exceeding store: " + x);
        }
        else if(store2 >= threshold && store3 >= threshold && store1 < threshold){
           double x = (store2 +  store3) / 2.0;
           System.out.println("Store 2 and 3 did great!");
           System.out.println("The average sales for exceeding store: " + x);
        }
        else if(store1 < threshold && store3 < threshold && store2 < threshold){
           System.out.println("No store met the threshold");
        }
        
        
        
        
        
        
        
}
}
