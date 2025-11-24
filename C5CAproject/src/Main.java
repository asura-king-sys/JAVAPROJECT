import java.util.*;
public class Main {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int choice;
    char again='y';
    while(again=='y'){
    userdata ob = new userdata(); //To save data input of the user.
    ob.input(); //To accept the answers and all other data of the user.
    ob.display(); //To display the outputs and all other items present in code.
    System.out.println("Please Choose Number According To The Following Category");
    choice=in.nextInt(); //Accepts whether the user wants to opt Science, Maths, or Computer Application.
    Science ob1 = new Science(); //Used to accept all the inputs,commands in the following classes.
    Maths ob2 = new Maths();
    CA ob3 = new CA();
    switch(choice){
        case 1:
            System.out.println("You Have Selected Science.");
            int chance=2; //Shows the total number of chances you are available with.
            char improve=' ';
            while(chance>=0){
            ob1.questions();
            ob1.result();
            if(ob1.score>70.0){
                System.out.println(" ");
                System.out.println("\t C E R T I F I C A T E   O F   E X C E L L E N C E \t"); //To show your rewarded certificate for getting good marks;)
                System.out.println("\t Name :-"+ob.name+"\t"); //To show the name of user
                System.out.println("\t Age :-"+ob.age+ "\t"); //Shows the age of user.
                System.out.println("\t Percentage :-"+ob1.score+ "\t"); //To show total marks obtained
                System.out.println(" ");
                 
            }
            
            if(chance==0){
                System.out.println("You don't have any chances left");
                System.out.println("WE ARE DELIGHTED THAT YOU PLAYED 'I AM SMARTICUS!', THANK YOU FOR USING OUR SERVICES?");
                System.exit(0);
                System.exit(0);
            }
            else{
                 System.out.println("Do you want to improve?, if yes then type 'y'or if you don't want to then type 'n'");
                 improve=in.next().charAt(0);
            }
            if(improve=='y'&&chance>0){ 
                chance--;
                System.out.println("You can now answer the questions again \n (note:- you have only "+chance +"chance left");
                ob3.points=0;
                
            }
            else{
                System.out.println("WE ARE DELIGHTED THAT YOU PLAYED 'I AM SMARTICUS!', THANK YOU FOR USING OUR SERVICES?");
                System.exit(0);
            }
        }
        
        break;
        case 2:
            System.out.println("You Have Selected Maths."); //Shows when you opt Maths
             chance=2;
             improve=' ';
            while(chance>=0){
            ob2.questions();
            ob2.result();
            if(ob2.score>70.0){
                 System.out.println(" ");
                System.out.println("\t C E R T I F I C A T E   O F   E X C E L L E N C E \t"); //To show you your rewarded certificate for good marks;)
                System.out.println("\t Name :-"+ob.name+"\t");
                System.out.println("\t Age :-"+ob.age+ "\t");
                System.out.println("\t Percentage :-"+ob2.score+ "\t");
                System.out.println(" ");
                
            }
            if(chance==0){
                System.out.println("You don't have any chances left");
                System.out.println("WE ARE DELIGHTED THAT YOU PLAYED 'I AM SMARTICUS!', THANK YOU FOR USING OUR SERVICES?");
                System.exit(0);
                System.exit(0);
            }
            else{
                 System.out.println("Do you want to improve?, if yes then type 'y'or if you don't want to then type 'n'");
                 improve=in.next().charAt(0);
            }
            if(improve=='y'&&chance>0){ 
                chance--;
                System.out.println("You can now answer the questions again \n (note:- you have only "+chance +"chance left");
                ob3.points=0;
                
            }
            else{
                System.out.println("WE ARE DELIGHTED THAT YOU PLAYED 'I AM SMARTICUS!', THANK YOU FOR USING OUR SERVICES?");
                System.exit(0);
            }
        }
        
        break;
        case 3:
            System.out.println("You Have Selected Computer Applications."); //Showed when you opt CA as your choice.
             chance=2;
             improve=' '; //To improve your bad marks:(
            while(chance>=0){
            ob3.questions();
            ob3.result();
            if(ob3.score>70.0){
                 System.out.println(" ");
                System.out.println("\t C E R T I F I C A T E   O F   E X C E L L E N C E \t"); //Shows your rewarded certificate for good marks
                System.out.println("\t Name :-"+ob.name+"\t");
                System.out.println("\t Age :-"+ob.age+ "\t");
                System.out.println("\t Percentage :-"+ob3.score+ "\t");
                System.out.println(" ");
                
            }
            if(chance==0){
                System.out.println("You don't have any chances left");
                System.out.println("WE ARE DELIGHTED THAT YOU PLAYED 'I AM SMARTICUS!', THANK YOU FOR USING OUR SERVICES?");
                System.exit(0);
                System.exit(0);
            }
            else{
                 System.out.println("Do you want to improve?, if yes then type 'y'or if you don't want to then type 'n'");
                 improve=in.next().charAt(0);
            }
            if(improve=='y'&&chance>0){ 
                chance--;
                System.out.println("You can now answer the questions again \n (note:- you have only "+chance +"chance left");
                ob3.points=0;
                
            }
            else{
                System.out.println("WE ARE DELIGHTED THAT YOU PLAYED 'I AM SMARTICUS!', THANK YOU FOR USING OUR SERVICES?");
                System.exit(0);
            }
            
            
        }
        break;
        default:
            System.out.println("Seems like you have chosen invalid category!!!😯😯😯"); //When you choose an invalid catagory.
    }
    System.out.println("Do you want play quiz again");
    again=in.next().charAt(0);
    if(again=='n'){
        System.out.println("WE ARE DELIGHTED THAT YOU PLAYED 'I AM SMARTICUS!', THANK YOU FOR USING OUR SERVICES?");
        
    
    }
} 
}
}