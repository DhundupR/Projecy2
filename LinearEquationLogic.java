import java.util.Scanner;
public class LinearEquationLogic {
 public void start() {
          LinearEquation calc1 = new LinearEquation();
        calc1.lineInfo();
      boolean end = false;
      
           
   
        while(end == false){
          Scanner scan = new Scanner(System.in);
          System.out.println("Enter x value: ");
          double findY = scan.nextDouble();
          System.out.println(calc1.coordinateForX(findY));

          
          System.out.println("Would you like to try again? ");
           
          String end1 = scan.next();;

          if (end1.equals("no")){
          end = true; 
          System.out.println("THANK YOU AND GOOD BYE!");
            
          } else {
            calc1 = new LinearEquation();
            calc1.lineInfo();

            
          }


      }
   }
    
}