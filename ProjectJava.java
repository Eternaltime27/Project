import java.util.Scanner;
import java.lang.Math;                                                           
import java.util.Random; //Scanner for random
public class ProjectJava
//This project is a cumulative lesson on IS147 so hence it is enomous and big.
//This Solves the world problem in numerous ways, more ways then one.
//This project also works and doesn't have any issues :)
{
   public static void main(String [] args)
   {
   System.out.println( "Hello My Name Is Andy Lo." );
   System.out.println( "My Major is Information Systems.");
   System.out.println( "My Email is andylo1@umbc.edu.");
   }
}
//----------------------------------------------------------------------------------------
class ProjectJavaA
{
   public static void main(String[] args)
   {
   //+ operator (addition)
   int numOpera = 20; //Variable One
   int numKey = 80; // Variable Two
   int numOperey = numOpera + numKey;
   System.out.println("+ =" + numOperey);
   
   //- operator (subtraction)
   int numAol = numKey - numOpera;
   System.out.println("- =" + numAol);
   
   //* operator (multiplication)
   int numBol = numKey * numOpera;
   System.out.println("* =" + numBol);
   
   // / operator (division)
   int numCol = numKey / numOpera;
   System.out.println("/ =" + numCol);
   
   // % operator (Find remainder)
   int numDol = numKey % numOpera;
   System.out.println("% =" + numDol);
   
   // ++ operator (add 1)
   int numEol = 40;
   ++numEol;
   System.out.println("++ =" + numEol);
   
   // -- operator (subtract 1)
   int numFol = 40;
   --numFol;
   System.out.println("-- =" + numFol);
   
   // == operator
   boolean equaA = ("Center" == "center");
   System.out.println("== =" + equaA);
   
   // != operator
   int g = 20;
   int m = 50;
   int f = 100;
   System.out.println (g!=f); //true they aren't equal
   
   // > operator
   System.out.println (g>f); //false
   
   // < operator
   System.out.println (g<f); //true
   
   // <= operator
   System.out.println (g<=f); //true
   
   // >= operator
   System.out.println (g>=f); //false
   }
}
//----------------------------------------------------------------------------------------
class ProjectJavaB
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in); //Step 1: Scanner
      {
      System.out.println("Pick a Month 1-12");
      int month = input.nextInt(); //int format
      
      if (month == 1){
          System.out.println ("January");
          }
      else if (month == 2){
          System.out.println ("February");
          }
      else if (month == 3){
          System.out.println ("March");
          }
      else if (month == 4){
          System.out.println ("April");
          }
      else if (month == 5){
          System.out.println ("May");
          }
      else if (month == 6){
          System.out.println ("June");
          }
      else if (month == 7){
          System.out.println ("July");
          }
      else if (month == 8){
          System.out.println ("August");
          }
      else if (month == 9){
          System.out.println ("September");
          }
      else if (month == 10){
          System.out.println ("October");
          }
      else if (month == 11){
          System.out.println ("November");
          }
      else if (month == 12){
          System.out.println ("December");
          }
      else 
          System.out.println ("Sorry that isn't a month");
          }
   }
}
//----------------------------------------------------------------------------------------
class ProjectJavaC
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in); //Step 1: Scanner
      {
      
      System.out.print("Pick a Month 1-12");
      String month = input.nextLine();
      switch (month) 
         {
         case "1":
             System.out.println("January");
             break;
         case "2":
             System.out.println("February");
             break;
         case "3":
             System.out.println("March");
             break;
         case "4":
             System.out.println("April");
             break;
         case "5":
             System.out.println("May");
             break;
         case "6":
             System.out.println("June");
             break;
         case "7":
             System.out.println("July");
             break;
         case "8":
             System.out.println("August");
             break;
         case "9":
             System.out.println("September");
             break;
         case "10":
             System.out.println("October");
             break;
         case "11":
             System.out.println("November");
             break;
         case "12":
             System.out.println("December");
             break;
         default:
             System.out.println("Sorry that isn't a month");
         }
      }
   }
}
//----------------------------------------------------------------------------------------
class ProjectJavaD
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in); //Step 1: Scanner
      {
      //Prompt First Name 
      System.out.println("Enter your First Name."); //Prompt First Name
      String firstName = input.next().toUpperCase(); //String Format + Capitalize the User's Name
      
      //Prompt Last Name (Send a email about what if last name is 1-2 letter ON THURSDAY never got a replied back, so assuming all name are 3+)
      System.out.println("Enter your Last Name."); //Prompt Last Name
      String lastName = input.next().toLowerCase(); //String Format + Lowercase the User's Last Name
      
      //Random Math Number
      Random rand = new Random (); //Random Number
      int randomNum = rand.nextInt(90)+10; // Random Number 10-99

      System.out.println("Your Password: " + firstName.charAt(firstName.length() - 1) + randomNum + lastName.charAt(0) + lastName.charAt(1) + lastName.charAt(2)); 
      }
   }
}
//----------------------------------------------------------------------------------------
class ProjectJavaE
{
   public static void main(String[] args)
   {
    //Input Operation
      System.out.println("__________________________________");
      System.out.println("Welcome To MiniCalculator Program.");
      System.out.println("                                  ");
      System.out.println("Enter First Value: "); //If I want Interger I name this "Enter First Int Value, then change Doubles clauses to Int clauses througout.
                                                                  //This however will cause answers like 5/2 to be 2 instead of 2.5.
      Scanner input = new Scanner(System.in);
      double firstNum = input.nextDouble(); //Input First Number
      
      //Input Operation using 0,1,2,3,4
      System.out.println("__________________________________");
      System.out.println(" Press 0 to Quit.");
      System.out.println(" Press 1 to Add.");
      System.out.println(" Press 2 to Subtract.");
      System.out.println(" Press 3 to Multiply.");
      System.out.println(" Press 4 to Divide.");
      System.out.println(" Press 5 to Exponent.(Note: First Num = Base | Second Num = Exponent).");
      String operation = input.next(); //Input Operation { 0 = Quit | 1 = Add | 2 = Subtract | 3 = Multiply | 4 = Divide }

      //Input Second Number
      System.out.println("__________________________________");
      System.out.println("Enter Second Value: ");
      double secondNum = input.nextDouble(); //Input Second Number
      
      while(operation != "0") // If anything is 0 will result in Quit term { "You Entered (0 = Quit), So I Guess We Are Done." }.
      {
          if (operation.equals("1")) //1 is basically +
          {
                System.out.println("Your Sum Is: " + (firstNum + secondNum)); //Without () firstNum will just be placed in front of secondNum like 400 + 500 = 400500
            }
            else if(operation.equals("2")) //2 is basically -
            {
                System.out.println("Your Difference Is: " + (firstNum - secondNum)); //Without () firstNum will just be placed in front of secondNum like 400 - 500 = error
                }

            else if(operation.equals("3")) //3 is basically *
            {
                System.out.println("Your Product Is: " + (firstNum * secondNum));
                }   

            else if(operation.equals("4")) //4 is basically /
            {
                System.out.println("Your Quotient Is: " + (firstNum / secondNum)); //If we want reminders we can use %
                }
            else if(operation.equals("0")) //0 is terminate or quit
            {
                System.out.println("You Entered (0 = Quit), So I Guess We Are Done.");
                break;
                }
            else if(operation.equals("5")) //5 is Exponent, 'extra bonus task'
            {
               System.out.println("Your Exponential Result Is: " + (Math.pow(firstNum,secondNum))); //Basically firstNum^secondNum = Result
               }
            else //If a number not 0-5 is entered then program prompt invalid Operation and transition to starting over.
            {
                System.out.println("Operation is invalid.");
                }
               
                
            //Repeat Loop with Post-Tense Comment
            System.out.println("__________________________________");
            System.out.println("Let's Go Again: Enter New First Operation: "); //After first time prompt 'Let's Go Again:'
            firstNum = input.nextDouble(); //Double to for decimal answers (example 5/2 = 2.5)
            
            System.out.println("__________________________________");
            System.out.println(" Reminder: Press 0 to Quit"); //After first time prompts reminder
            System.out.println(" Press 1 to Add.");
            System.out.println(" Press 2 to Subtract.");
            System.out.println(" Press 3 to Multiply.");
            System.out.println(" Press 4 to Divide.");
            System.out.println(" Press 5 to Exponent.(Note: First Num = Base | Second Num = Exponent).");
            operation= input.next(); //operation is String '?'
            
            System.out.println("__________________________________");
            System.out.println("Enter New Second Operation: ");
            secondNum = input.nextDouble();  //Double to for decimal answers (example 5/2 = 2.5)
        }
        System.out.println("Come Back Again Next Time."); //If 0 is input for firstNum, secondNum, Calculation Quits as asked.
   }
}
//----------------------------------------------------------------------------------------
class ProjectJavaF
{
   public static void main(String[] args)
   {
   int n = 10; //Initial = 10 *
    int row; //Assign interger row variable
    int loop;  //Assign interger loop variable
    for (row = 0; row<n; row++) //Initial = 10 | When Row is less then 10 | Then add 1 row until 10
      {                                                                                          //Embed loop in row loop.
      for (loop = 9; loop >= row; loop--) //Initial 10 | When row isn't 0 | Then reduce 1 until 0
          {
          System.out.print("*"); //Prints * when looped
                                                            //Print * inside loop loop>=row
          }
          System.out.println(); //Moves to next row
       }
   }
}
//----------------------------------------------------------------------------------------
class ProjectJavaG
{
   public static void main(String[] args)
   {
   int numOne = 6;
    int numTwo = 3;
    int resultOne = addition(numOne, numTwo); //Addition Result
    int resultTwo = subtraction(numOne, numTwo); //Subtraction Result
    int resultThree = multiplication(numOne, numTwo); //Multiplication Result
    int resultFour = division(numOne, numTwo); //Division Result
    
    System.out.println("The Addition Result Is: " + resultOne + "."); //Print +
    System.out.println("The Subtraction Result Is: " + resultTwo + "."); //Print -
    System.out.println("The Multiplication Result Is: " + resultThree + "."); //Print *
    System.out.println("The Division Result Is: " + resultFour + "."); //Print /
    }
    
      //Addition Method
      public static int addition(int numOne, int numTwo) //addition(Method Name)
      {
      int additionSum;
      additionSum = numOne + numTwo;
      return additionSum; //return additionSum above
      }    
      
      //Subtraction Method
      public static int subtraction(int numOne, int numTwo) //Parameter = numOne and numTwo
      {
      int subtractionSum;
      subtractionSum = numOne - numTwo;
      return subtractionSum; //return subtractionSum above
      }
      
      //Multiplication Method
      public static int multiplication(int numOne, int numTwo)
      {
      int multiplicationSum;
      multiplicationSum = numOne * numTwo;
      return multiplicationSum;//return multiplicationSum above
      }
      
      //Division Method
      public static int division(int numOne, int numTwo)
      {
      int divisionSum;
      divisionSum = numOne / numTwo;
      return divisionSum;//return divisionSum above
      }
}
//----------------------------------------------------------------------------------------
class ProjectJavaH
{
   public static void main(String[] args)
   {
   //String type in multi dimensional array
      String [] [] courseRog = {
               {"IS147: ","IS247: ","IS410: ","IS420: "}, //this is i
               {"Programming in Java I","Programming Java II","Database Programming I","Database Programming II"}, //this is i+1
               {" Room 100"," Room 200"," Room 300"," Room 400"}}; //this is i+2
      //above is  /\            /\          /\            /\
      //           |             |           |             |
      //          j=0           j=1          j=2           j=3    courseRog[i].length cap it at j=3
      
            System.out.println("CourseNumber | Course name | Room"); //formater
            System.out.println("-----------------------------------"); //formater
            
            int i = 0; //i is 0, this is accomodated for in println
            for (int j = 0; j < courseRog[i].length; j++) {  //Print Until 4 entity are printed, each time +1 to J
            System.out.println(courseRog[i][j] + courseRog[i+1][j] + courseRog[i+2][j]); //"i" is a IS course | "i+1 is a class name | i+2 is a room
            System.out.println("-----------------------------------"); //formater
            }
   }
}
//----------------------------------------------------------------------------------------
class ProjectJavaI
{
   //----------------------------------------------------------  
    public static void printMyArray(Integer[] inputArray){   
     //Named printMyArray, but only matter in this //--- or {} range
          for (Integer element : inputArray)  //Prints Integers
               System.out.printf("%s ", element);
               System.out.println();}           
//----------------------------------------------------------  
    public static void printMyArray(Double[] inputArray){  
     //Named printMyArray, but only matter in this //--- or {} range
          for (Double element : inputArray)   //Prints Doubles
               System.out.printf("%s ", element);
               System.out.println();} 
//----------------------------------------------------------  
    public static void printMyArray(Character[] inputArray) {   
     //Named printMyArray, but only matter in this //--- or {} range
          for (Character element : inputArray)  //Prints String/Characters
               System.out.printf("%s ", element);
               System.out.println();}
//----------------------------------------------------------  
//----------------------------------------------------------  
    public static void main(String[] args) //The Main
    {
          Integer[] integerArray = {1, 2 , 3 , 4 , 5 , 6}; //Given variables
          Double[] doubleArray = {1.1 , 2.2 , 3.3 , 4.4 , 5.5 , 6.6 , 7.7}; //Given variables
          Character[] characterArray = {'H','E','L','L','O'}; //Given variables
//----------------------------------------------------------  
           System.out.println("Array integerArray contains:");
             printMyArray(integerArray); //Prints integerArray
//----------------------------------------------------------     
           System.out.println("\nArray doubleArray contains:");
             printMyArray(doubleArray);  //Prints doubleArray
//----------------------------------------------------------      
           System.out.println("\nArray characterArray contains:");
             printMyArray(characterArray); //Prints characterArray
    }
}
//----------------------------------------------------------------------------------------
class ProjectJavaJ
{
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
    
    int array[] = new int[7]; //Set array size to 1x7
    
    for (int i = 0; i < array.length; i++){  //Everytime +1 to i if array.length(aka 7) isn't true
    System.out.println("Enter sales for Day " + (i+1) + ":");
    array[i] = input.nextInt(); //requires input
    }
    
    int totalSum = array[0] + array[1] + array[2] + array[3] + array[4] + array[5] + array[6]; //Sum all 7 number in array
    
    System.out.println(" Sales for 7 days "); //Prints array message including its inputs
    System.out.println("--------------------");
    System.out.println("Day 1 Sales " + array[0]);
    System.out.println("Day 2 Sales " + array[1]);
    System.out.println("Day 3 Sales " + array[2]);
    System.out.println("Day 4 Sales " + array[3]);
    System.out.println("Day 5 Sales " + array[4]);
    System.out.println("Day 6 Sales " + array[5]);
    System.out.println("Day 7 Sales " + array[6]);
    System.out.println("");
    System.out.println("Total sales: " + totalSum);
   }
}
//----------------------------------------------------------------------------------------
interface A { //Interface for BMW
        void start();
        void stop(); 
    }
   
    interface B { //Interface for Lexus
        void star();
        void station();
        void speed();
    }
  
  class CarsInheritance implements A, B {
  
        public void stop() { //variable stop = below comment
            System.out.println (" BMW Car Stopped");
        }
        
        public void start() { //variable start = below comment
            System.out.println (" BMW Car Started");
        }
        
        public void station(){ //variable station = below comment
           System.out.println (" Lexus Car Stopped");
        }
        
        public void star(){ //variable star = below comment
           System.out.println (" Lexus Car Stopped");
        }
        
        public void speed(){ //variable speed = below comment
           System.out.println (" Lexus Car Speed 250mph");
        }
        
//------------------------------------------------------    

   public static void main(String[] args) {
          CarsInheritance c = new CarsInheritance();
          c.start();
          c.stop();
          System.out.println ("----------------------------");
          CarsInheritance l = new CarsInheritance();
          l.star();
          l.station();
          System.out.println ("----------------------------");
          CarsInheritance lex= new CarsInheritance();
          lex.station();
          lex.star();
          lex.speed();
          //Prints accordingly
    }
}