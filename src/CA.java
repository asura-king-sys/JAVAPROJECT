import java.util.*;
public class CA extends Main{
    Scanner in = new Scanner(System.in);
    String decision;
    String next;
    String question;
    double points=0.0;
    double score;
    int chance=2;
    String improve;
     
    void questions(){
       System.out.println("Press 'Enter' to continue or if you want to quit type 'quit'");
       decision=in.nextLine();
       if(decision.equals("quit")){
           System.exit(0);
       }
       else{
           System.out.println("Now you can proceed!");
           System.out.println("FOR Example:- \n 1.Who bulit Taj Mahal\n A.Sheru Mugaliya\n B.Akbar\n C.Chengiz Khan\n D.Shah Jahan\n answer:-D");
           System.out.println("                            ");
       }
       System.out.println(" 1. The process of restricting the free flow of data from the outside world is known as");
       System.out.println("A.Class");
       System.out.println("B.Polymorphism");
       System.out.println("C.Encapsulation");
       System.out.println("D.Data Abstraction");
       System.out.println("                    ");
       System.out.println("Choose the correct option 🙂") ;
       question= in.nextLine();
       if(question.equals("C")){
           System.out.println("Correct Answer!!! 👍 10 points");
           points+=10;
       }
       else{
           System.out.println("Wrong Answer!!!😯 better luck next time");
       }
        System.out.println("Press 'Enter' to continue or if you want to quit type 'quit'");
       decision=in.nextLine();
       if(decision.equals("quit")){
           System.exit(0);
       }
       else{
           System.out.println("Now you can proceed!");
           System.out.println("                            ");
       }
       System.out.println("2. Who developed Java");
       System.out.println("A.Bill Gates");
       System.out.println("B.Jassi Gosling");
       System.out.println("C.James Gosling");
       System.out.println("D.Steve Jobs");
       System.out.println("                    ");
       System.out.println("Choose the correct option 🙂") ;
       question=in.nextLine();
       if(question.equals("C")){
           System.out.println("Correct Answer!!! 👍 10 points");
           points+=10;
       }
       else{
           System.out.println("Wrong Answer!!!😯 better luck next time");
       }
        System.out.println("Press 'Enter' to continue or if you want to quit type 'quit'");
       decision=in.nextLine();
       if(decision.equals("quit")){
           System.exit(0);
       }
       else{
           System.out.println("Now you can proceed!");
           System.out.println("                            ");
       }
       System.out.println(" 3. What was Java Originally called");
       System.out.println("A.Banana");
       System.out.println("B.Oak");
       System.out.println("C.Java");
       System.out.println("D.Trek");
       System.out.println("                    ");
       System.out.println("Choose the correct option 🙂") ;
       question=in.nextLine();
       if(question.equals("B")){
           System.out.println("Correct Answer!!! 👍 10 points");
           points+=10;
       }
       else{
           System.out.println("Wrong Answer!!!😯 better luck next time");
       }
        System.out.println("Press 'Enter' to continue or if you want to quit type 'quit'");
       decision=in.nextLine();
       if(decision.equals("quit")){
           System.exit(0);
       }
       else{
           System.out.println("Now you can proceed!");
           System.out.println("                            ");
       }
       System.out.println(" 4. In object oriented programming,the stress given on");
       System.out.println("A.Procedure");
       System.out.println("B.Methods");
       System.out.println("C.Class");
       System.out.println("D.Data");
       System.out.println("                    ");
       System.out.println("Choose the correct option 🙂") ;
       question=in.nextLine();
       if(question.equals("D")){
           System.out.println("Correct Answer!!! 👍 10 points");
           points+=10;
       }
       else{
           System.out.println("Wrong Answer!!!😯 better luck next time");
       }
        System.out.println("Press 'Enter' to continue or if you want to quit type 'quit'");
       decision=in.nextLine();
       if(decision.equals("quit")){
           System.exit(0);
       }
       else{
           System.out.println("Now you can proceed!");
           System.out.println("                            ");
       }
       System.out.println("5. If a=8; Find the value of a- = ++a + a++ + 4");
       System.out.println("A.-16");
       System.out.println("B.-15");
       System.out.println("C.-25");
       System.out.println("D.-14");
       System.out.println("                    ");
       System.out.println("Choose the correct option 🙂") ;
       question=in.nextLine();
       if(question.equals("D")){
           System.out.println("Correct Answer!!! 👍 10 points");
           points+=10;
       }
       else{
           System.out.println("Wrong Answer!!!😯 better luck next time");
       }
        System.out.println("Press 'Enter' to continue or if you want to quit type 'quit'");
       decision=in.nextLine();
       if(decision.equals("quit")){
           System.exit(0);
       }
   }
   void result(){
       score=(points/50)*100;
       System.out.println("your points are :-" + points);
       System.out.println("your score is :-" + score);
        
        
   }
   
}