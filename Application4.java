package javaapplication4;
import java.util.Scanner;

public class JavaApplication4 {

    
    public static void main(String[] args) {
        menu();

       
    }
    public static void menu(){
        System.out.print("• Enter 1 to display all contacts\n" +
"• Enter 2 to add contact\n" +
"• Enter 3 to remove contact\n" +
"• Enter 4 to edit a contact\n" +
"• Enter 5 to load contacts from a text file.\n" +
"• Enter 6 to save contacts to the text file.\n" +
"• Enter 7 to exit from the program\n");
       Scanner num=new Scanner(System.in);
       int number=num.nextInt();
       while(number>7 || number<1){
           System.out.println("Wrong input...");
           System.out.print("• Enter 1 to display all contacts\n" +
"• Enter 2 to add contact\n" +
"• Enter 3 to remove contact\n" +
"• Enter 4 to edit a contact\n" +
"• Enter 5 to load contacts from a text file.\n" +
"• Enter 6 to save contacts to the text file.\n" +
"• Enter 7 to exit from the program\n");
           number=num.nextInt();
           
           
       }
    }
    
}
