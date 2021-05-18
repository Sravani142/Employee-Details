# Employee-Details
Java Program for Employee Details

Below is the implementation of the Employee details

Data of the Employee's:

  -> Name
  
  -> Age
  
  -> Salary
  
  -> Designation
  
  // Varaibles Declaration or Taking Requirements
  
  ![Untitled1](https://user-images.githubusercontent.com/84003407/118429638-c0062800-b6ef-11eb-80bf-e25c64009a0f.png)

The Scanner class is used to get user input, and it is found in the   java.util    package. To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation.

![Untitled2](https://user-images.githubusercontent.com/84003407/118430242-4ec77480-b6f1-11eb-8866-1aa208493b8b.png)

read  method is now defined as follows :
                          
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

//Display method is used to print the details of the employee...

        void disp()
      
       {

           System.out.println(" Name:" +name);
           System.out.println(" Age:"+age);
           System.out.println(" Salary:"+salary);
           System.out.println(" Designation:"+desig);
      }
      
//The Raise salary method is designed in business logic in order to raise the employee's salary by 1000, it also displays that the salary raised by 1000.

->The syntax for this method is as follows :

     void raise

     {
       sal = sal+1000;
       System.out.println("Salary Raised............");
     }
      
      

