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
      
 Now we create a user logic with name Main..

In the main(String[] args) of user logic, we create an object of business logic as follows :

       Emp e = new Emp();
We design a continuous iterations using do-while loop , until the user choose the exit option.

Here we take the help of nextInt() method of Scanner class and receive the user choice be it like 1,2,3,...

Using switch-case, we perform actions accordingly with the user's choice.. The code for this is as follows :

      boolean r = false;
      do{
      Scanner sc=new Scanner(System.in);
      System.out.println("1.Create \n 2.Display \n 3.Raise Salary \n 4. Exit");
      int i=sc.nextInt();
	
	switch(i){
		case 1 :     e.create();
				r=true;
              			 break;
		case 2 :if(r)
			e.display();
			else System.out.println("No Recors..!!");
			break;
		case 3:  if(r) 
			e.raiseSalary();
			else System.out.println("No Records...!!");
			break;
		case 4: System.out.println("Exiting...!!");
			break;
		default : System.out.println("No Action provided ...!!");
  	}
}while(i!=4)
Here, we applied a condition in case 2 and case 3 , this is just to let the user know that he have to create the employee first, and then he will have the access to display and raise salary. If not created any, it will display as " No Records..!!" And the do-while loop breaks only if the choice opted by the user is 4 i.e., exit!!    

