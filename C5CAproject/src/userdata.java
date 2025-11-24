import java.util.*;
public class userdata extends Main{
Scanner in = new Scanner(System.in);
String name,email,password;
int age;
void input(){
   System.out.println("Enter your email address :-");
   email=in.nextLine();
   System.out.println("Enter your password");
   password=in.nextLine();
   System.out.println("Enter your Name :-"); 
   name=in.nextLine();
   System.out.println("Enter your age :-");
   age=in.nextInt();
}
void display(){
    if(age<=12){
            System.out.println("SORRY AGE REQUIREMENT NOT MET !");
            System.exit(0);
        }
        else{
           System.out.println("                                ");
           System.out.println("THANK YOU! YOU CAN PROCEED.");
           System.out.println("WELCOME TO Quiz:- 'I am Smarticus!😊'");
           System.out.println("*****Note:-The Certificate of excellance is rewarded when you score above 70%*****");
        }
    System.out.println("Name :-"+ name);
    System.out.println("Age :-"+ age);
    System.out.println(" ");
    System.out.println("Please select the category from the following :-");
    System.out.println(" ");
    System.out.println("1.Science");
    System.out.println("2.Maths");
    System.out.println("3.Computer Applications");
     
}
}