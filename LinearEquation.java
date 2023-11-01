import java.util.Scanner;

public class LinearEquation {
    private int x1; private int x2; private int y1;;  private int y2; private double yIntercept; private double slope;
    

    public LinearEquation() {
      boolean begin = false;
      while (begin == false){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter coordinate 1: ");
      String coordinate1 = scan.nextLine();
      
      coordinate1 = parseOut(coordinate1);
        int check = coordinate1.indexOf(",");
        String z = coordinate1.substring(0,check);
        String l = coordinate1.substring(check+1,coordinate1.length()); 
  
        int x1 = Integer.parseInt(z);
        int y1 = Integer.parseInt(l);
      
        System.out.println("Enter coordinate 2: ");
        String coordinate2 = scan.nextLine();
  
        coordinate2 = parseOut(coordinate2);
          int check2 = coordinate2.indexOf(",");
          String z1 = coordinate2.substring(0,check2);
          String l1 = coordinate2.substring(check2+1,coordinate2.length()); 
  
          int x2 = Integer.parseInt(z1);
          int y2 = Integer.parseInt(l1);
      
      if ((x1 == x2) && (y1 != y2)){
        System.out.println("The slope of this line is undefined.");
        begin = false;
      } else {
        this.x1 = x1;  this.x2 = x2;  this.y1 = y1; this.y2 = y2;
        begin = true;
      }
    }
      
      
  

    
      
    }

   
   

    public String coordinateForX(double x) {
      Scanner scan = new Scanner(System.in);
     
      return "(" + x + "," + (((x*slope) + yIntercept ))+ ")";
    
      }
  
    public double slope(int topVal,int botVal) {
      double slope = 1.0*topVal/botVal;
      this.slope = slope;
      return slope;
    }

   public double roundFun(double x) {
     double y = Math.round(x * 100.0) / 100.0;
    return y;

  }
    
    public double yIntercept(int num1, int num2, int topVal, int botVal) {
     double y = num2 - (((1.0)*topVal/botVal)*num1) ; 
      y = roundFun(y);
      this.yIntercept = y;
      return y;
    }

  public double distance() {
    double distance = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
    distance = roundFun(distance);
    return distance;
  }


  public String equation(int topVal, int botVal, double yIntercept) {
    double checker = ((1.0) * topVal ) / botVal ; 
    if ((checker == 0) && (yIntercept < 0) ){
      return "y = x +" + yIntercept;
      
    } else if ((checker == 0) && (yIntercept < 0) ){
      double x = Math.abs(yIntercept); 
      return "y = x -" + x;

      } else if ((checker > 0) && (yIntercept < 0) ){
      double x = Math.abs(yIntercept); 
      return ("y = " + topVal + "/" + botVal + "x - " + x);

    }
    
    
    else if((topVal % botVal == 0) && yIntercept != 0.0 && yIntercept>0){
      int x = topVal/botVal;
      
      if (x<0){
        x = Math.abs(x); 
        String equation = "y =" + x + "x + " + yIntercept;
        return equation;
      } else {
       topVal = Math.abs(topVal); botVal = Math.abs(botVal); 
        String equation = "y = "+x+"x + " + yIntercept;
        return equation;}}

    else if((topVal % botVal == 0) && yIntercept != 0.0 && yIntercept<0){
      int x = topVal%botVal; yIntercept= Math.abs(yIntercept);
      if (x>0){
        x = Math.abs(x); 
        String equation = "y =" + x + "x -" + yIntercept;
        return equation;
      } else {
       topVal = Math.abs(topVal); botVal = Math.abs(botVal); 
        String equation = "y = "+x+"x + -" + yIntercept;
        return equation;}}

    else if((topVal % botVal == 0) && yIntercept == 0.0){
      int x = topVal%botVal; yIntercept= Math.abs(yIntercept);
      if (x>0){
        x = Math.abs(x); 
        String equation = "y =" + x + "x";
        return equation;
      } else {
       topVal = Math.abs(topVal); botVal = Math.abs(botVal); 
        String equation = "y = "+x+"x";
        return equation;}}
    
    
    else if(topVal<0 && botVal<0 && yIntercept != 0.0 && yIntercept>0){
      topVal = Math.abs(topVal); botVal = Math.abs(botVal);
      String equation = "y = " + topVal + "/" + botVal + "x + " + yIntercept;
      return equation;}
      
    else if(topVal>0 && botVal<0 && yIntercept != 0.0 && yIntercept>0){
        botVal = Math.abs(botVal);
        String equation = "y = -" + topVal + "/" + botVal + "x + " + yIntercept;
        return equation;
      }
    
    else if(topVal<0 && botVal>0 && yIntercept != 0.0 && yIntercept>0){
        topVal = Math.abs(topVal);
        String equation = "y = -" + topVal + "/" + botVal + "x + " + yIntercept;
        return equation;
      }

    else if(topVal<0 && botVal<0 && yIntercept == 0.0 ){
      topVal = Math.abs(topVal); botVal = Math.abs(botVal);
      String equation = "y = " + topVal + "/" + botVal + "x ";
      return equation;}

    else if(topVal>0 && botVal<0 && yIntercept == 0.0 ){
        botVal = Math.abs(botVal);
        String equation = "y = -" + topVal + "/" + botVal + "x  ";
        return equation;
      }

    else if(topVal<0 && botVal>0 && yIntercept == 0.0) {
        topVal = Math.abs(topVal);
        String equation = "y = -" + topVal + "/" + botVal + "x ";
        return equation;
      }

    else if(topVal<0 && botVal<0 && yIntercept != 0.0 && yIntercept<0){
      topVal = Math.abs(topVal); botVal = Math.abs(botVal); yIntercept= Math.abs(yIntercept);
      String equation = "y = " + topVal + "/" + botVal + "x + -" + yIntercept;
      return equation;}

    else if(topVal>0 && botVal<0 && yIntercept != 0.0 && yIntercept<0){
        botVal = Math.abs(botVal); yIntercept= Math.abs(yIntercept);
        String equation = "y = -" + topVal + "/" + botVal + "x + -" + yIntercept;
        return equation;
      }

    else if(topVal<0 && botVal>0 && yIntercept != 0.0 && yIntercept<0){
        topVal = Math.abs(topVal); yIntercept= Math.abs(yIntercept);
        String equation = "y = -" + topVal + "/" + botVal + "x + -" + yIntercept;
        return equation;
      }

    else if(topVal==0 && botVal<0 && yIntercept != 0.0 && yIntercept<0){
      topVal = Math.abs(topVal); botVal = Math.abs(botVal); yIntercept= Math.abs(yIntercept);
      String equation = "y = x + -" + yIntercept;
      return equation;}

    else if(topVal==0 && botVal<0 && yIntercept != 0.0 && yIntercept<0){
        botVal = Math.abs(botVal); yIntercept= Math.abs(yIntercept);
        String equation = "y = x + -" + yIntercept;
        return equation;
      }

    else if(topVal==0 && botVal>0 && yIntercept != 0.0 && yIntercept<0){
        topVal = Math.abs(topVal); yIntercept= Math.abs(yIntercept);
        String equation = "y = x + -" + yIntercept;
        return equation;
      }

    else if(topVal==0 && botVal<0 && yIntercept != 0.0 && yIntercept>0){
      topVal = Math.abs(topVal); botVal = Math.abs(botVal); 
      String equation = "y = x + " + yIntercept;
      return equation;}

    else if(topVal==0 && botVal<0 && yIntercept != 0.0 && yIntercept>0){
        botVal = Math.abs(botVal); 
        String equation = "y = x + " + yIntercept;
        return equation;
      }

    else if(topVal==0 && botVal>0 && yIntercept != 0.0 && yIntercept>0){
        topVal = Math.abs(topVal); 
        String equation = "y = x + " + yIntercept;
        return equation;
      }


      
    
      return "y = " + topVal + "/" + botVal + "x" + yIntercept;
  
    
        
  
    
    
  }

 public String parseOut(String x) {
   x = x.replace("(","").replace(")","");
   x = x.replace(" ","");
   return x;
 }

  public String lineInfo(){
    Scanner scan = new Scanner(System.in);
    int num1 = x1; int num2 = y1; int num3 = x2;  int num4 = y2;

    int topVal = num4 - num2; int botVal = num3 - num1;
    double yIntercept = yIntercept(num1, num2, topVal, botVal);
    double slope =  roundFun(slope(topVal,botVal));


    double distance = distance();
    if(topVal == 0){
      System.out.println("The equation of the line betweeen these points is: y = "  + yIntercept);
    }else{
    System.out.println("The equation of the line betweeen these points is: " + equation(topVal, botVal, yIntercept));}

    System.out.println("The slope of this line is: " + slope);

    System.out.println("The y intercept of this line is: " + yIntercept);

    System.out.println("The distance between these two points is: " + distance);

    System.out.println("");
    System.out.println("");
   
        return "The equation of the line betweeen these points is: y = "  + yIntercept + "\nThe slope of this line is: " + slope + "\nThe y intercept of this line is: " + yIntercept + "\nThe distance between these two points is: " + distance;


    
  }
}
