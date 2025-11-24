import java.util.*;
public class Maths extends Main  {
    Scanner in = new Scanner(System.in);
    String decision;
    String next;
    String question;
    double points;
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
       System.out.println(" 1. When Mr. Mukherjee stayed in a hotel for 2 days he had to pay 7080 including 18% GST. What is  the amount he paid without GST");
       System.out.println("A.5607.5");
       System.out.println("B.5006.5");
       System.out.println("C.5000");
       System.out.println("D.5806.5");
       System.out.println("                    ");
       System.out.println("Choose the correct option 🙂") ;
       question= in.nextLine();
       if(question.equals("D")){
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
       System.out.println("2. |–4| + |4| – 4 + 4 = ?");
       System.out.println("A.0");
       System.out.println("B.4");
       System.out.println("C.8");
       System.out.println("D.12");
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
        System.out.println( "Press 'Enter' to continue or if you want to quit type 'quit'");
       decision=in.nextLine();
       if(decision.equals("quit")){
           System.exit(0);
       }
       else{
           System.out.println("Now you can proceed!");
           System.out.println("                            ");
       }
       System.out.println(" 3. What is 1004 divided by 2?");
       System.out.println("A.52");
       System.out.println("B.502");
       System.out.println("C.102");
       System.out.println("D.520");
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
        System.out.println( "Press 'Enter' to continue or if you want to quit type 'quit'");
       decision=in.nextLine();
       if(decision.equals("quit")){
           System.exit(0);
       }
       else{
           System.out.println("Now you can proceed!");
           System.out.println("                            ");
       }
       System.out.println(" 4. 106 × 106 – 94 × 94 = ?");
       System.out.println("A.2004");
       System.out.println("B.2040");
       System.out.println("C.2404");
       System.out.println("D.2400");
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
        System.out.println( "Press 'Enter' to continue or if you want to quit type 'quit'");
       decision=in.nextLine();
       if(decision.equals("quit")){
           System.exit(0);
       }
       else{
           System.out.println("Now you can proceed!");
           System.out.println("                            ");
       }
       System.out.println("5. Which of the following numbers gives 240 when added to its own square?");
       System.out.println("A.16");
       System.out.println("B.15");
       System.out.println("C.25");
       System.out.println("D.20");
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
    