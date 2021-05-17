import java.util.Scanner;
  

class Employee

{
  
        String name , desig ;
        int age , sal ;

        Scanner sc = Scanner(System.in);


        void read()
      
        {
         
            System.out.println(" \nEnter Name:");
            name = sc.next();
            System.out.println("Enter Age:");
            age = sc.nextInt();
            System.out.println("Enter Salary:");
            salary = sc.nextDouble();
            System.out.println("Enter Designation:");
            desig = sc.next();


       }


       void disp()
      
       {

           System.out.println(" Name:" +name);
           System.out.println(" Age:"+age);
           System.out.println(" Salary:"+salary);
           System.out.println(" Designation:"+desig);
      }


      void raise

     {
       sal = sal+1000;
       System.out.println("Salary Raised............");
     }

 }


public class EmpDetails


{


public static void main(String args[])

{

       Scanner sc = Scanner(System.in);
       int c;
       boolean r = false;
       do
         {
           System.out.println("\n1.Create");
           System.out.println("2.Display");
           System.out.println("3.RaiseSalary");
           System.out.println("4.Exit");
           c.sc.nextInt();
           switch(c)
                {
                  case 1:  e.read();
                           break;
                           r=true;
                
                  case 2: if(r)

                                   e.disp();
                           else
                                
                                 System.out.println("\n No Records........!");
                           break;
               
                  case 3: if(r)            
  
                                 e.raise();
                           else
                                 System.out.println("\n No Records........!");
                           break;
                 case 4:  System.out.println("\nExiting.......");
                          break;

                default : System.out.println("\nInvalid Choice.......!!");
               }

           } while(c<4);

 }

}

     


  
      






 
 