import java.util.*;
public class Science extends Main{
    Scanner in = new Scanner(System.in);
    String decision;
    String next;
    String question1;
    double points=0.0;
    double score;
    int chance=2;
    String improve;
     
    void questions(){
       System.out.println( "Press 'Enter' to continue or if you want to quit type 'quit'");
       decision=in.nextLine();
       if(decision.equals("quit")){
           System.exit(0);
       }
       else{
           System.out.println("Now you can proceed!");
           System.out.println("FOR Example:- \n 1.Who bulit Taj Mahal\n A.Sheru Mugaliya\n B.Akbar\n C.Chengiz Khan\n D.Shah Jahan\n answer:-D");
           System.out.println("                            ");
       }
       System.out.println(" 1. What is formula of Work?");
       System.out.println("A.Mass x Displacement");
       System.out.println("B.Time x Displacement");
       System.out.println("C.speed x Displacement");
       System.out.println("D.None of the above");
       System.out.println("                    ");
       System.out.println("Choose the correct option 🙂") ;
       question1= in.nextLine();
       if(question1.equals("A")){
           System.out.println("Correct Answer!!! 👍 10 points");
           points+=10;
       }
       else{
           System.out.println("Wrong Answer!!!😯 better luck next time");
       }
        System.out.println( "Press 'Enter' to continue or if you want to quit type 'quit'");
       decision=in.nextLine();
       if(decision.equals("quit")){
           System.exit(0);
       }
       else{
           System.out.println("Now you can proceed!");
           System.out.println("                            ");
       }
       System.out.println(" 2. Which of the following is an acid?");
       System.out.println("A.KOH");
       System.out.println("B.NaOH");
       System.out.println("C.HCL");
       System.out.println("D.CH4");
       System.out.println("                    ");
       System.out.println("Choose the correct option 🙂") ;
       question1=in.nextLine();
       if(question1.equals("C")){
           System.out.println("Correct Answer!!! 👍 10 points");
           points+=10;
       }
       else{
           System.out.println("Wrong Answer!!!😯 better luck next time");
       }
        System.out.println( "Press 'Enter' to continue or if you want to quit type 'quit'");
       decision=in.nextLine();
       if(decision.equals("quit")){
           System.exit(0);
       }
       else{
           System.out.println("Now you can proceed!");
           System.out.println("                            ");
       }
       System.out.println(" 3. In Guttation, the loss of water is from which part ?");
       System.out.println("A.Roots");
       System.out.println("B.Hydathodes");
       System.out.println("C.lenticels");
       System.out.println("D.Stem");
       System.out.println("                    ");
       System.out.println("Choose the correct option 🙂") ;
       question1=in.nextLine();
       if(question1.equals("B")){
           System.out.println("Correct Answer!!! 👍 10 points");
           points+=10;
       }
       else{
           System.out.println("Wrong Answer!!!😯 better luck next time");
       }
        System.out.println( "Press 'Enter' to continue or if you want to quit type 'quit'");
       decision=in.nextLine();
       if(decision.equals("quit")){
           System.exit(0);
       }
       else{
           System.out.println("Now you can proceed!");
           System.out.println("                            ");
       }
       System.out.println(" 4. Which of the following yeilds Hydronium ions when reacted with water?");
       System.out.println("A.Acid");
       System.out.println("B.Salt");
       System.out.println("C.Base");
       System.out.println("D.Alkali");
       System.out.println("                    ");
       System.out.println("Choose the correct option 🙂") ;
       question1=in.nextLine();
       if(question1.equals("A")){
           System.out.println("Correct Answer!!! 👍 10 points");
           points+=10;
       }
       else{
           System.out.println("Wrong Answer!!!😯 better luck next time");
       }
        System.out.println( "Press 'Enter' to continue or if you want to quit type 'quit'");
       decision=in.nextLine();
       if(decision.equals("quit")){
           System.exit(0);
       }
       else{
           System.out.println("Now you can proceed!");
           System.out.println("                            ");
       }
       System.out.println("5. What is the formula of kinetic energy?");
       System.out.println("A.½m²v");
       System.out.println("B.½mv²");
       System.out.println("C.mv²");
       System.out.println("D.½(mv)²");
       System.out.println("                    ");
       System.out.println("Choose the correct option 🙂") ;
       question1=in.nextLine();
       if(question1.equals("B")){
           System.out.println("Correct Answer!!! 👍 10 points");
           points+=10;
       }
       else{
           System.out.println("Wrong Answer!!!😯 better luck next time");
       }
        System.out.println( "Press 'Enter' to continue or if you want to quit type 'quit'");
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
     
  
   