import java.util.Scanner;
 public class scase {
  public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);
  System.out.println("Enter your role ");
  String role = keyboard.next();	
 switch (role){
   case " Administrator":
    System.out.println("Welcome Administrator !");
    break;
   case "Faculty":
    System.out.println("Welcome Faculty !");
    break;
   case "Staff":
    System.out.println("Welcome Staff !");
    break;		
   case "Student":
    System.out.println("Welcome Student !");
    break;
   case "Guest":
    System.out.println("Welcome Guest !");
    break;
   default: 
    System.out.println("Not a valid role");
  }
 }
}

