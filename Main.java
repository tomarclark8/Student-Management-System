import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Entry
    int choice = 0;
    Scanner scan = new Scanner(System.in);

      System.out.println("==== Student Grade Management System ====");
      //Student class
      System.out.println("1. Add Student [type 1]");
      //Student class (DONE!)
      System.out.println("2. Enter/Update Grades [type 2]");
      //Student class 
      System.out.println("3. View Student Details [type 3]");
      //Report class
      System.out.println("4. Generate Class Report [type 4]");
      //Student class
      System.out.println("6. Search Student [type 6]");
      //Grade Manager class (DONE!)
      System.out.println("7. Generate Sample Report [type 7]");
      //type 8 to exit 
      System.out.println("8. Exit [type 8]");

      System.out.println("Enter your choice: ");
      choice = scan.nextInt();

    //exit
    if(choice == 8){
        System.out.println("System Exited Successfully");
      scan.close();
    }
    
    while(choice != 8){
      GradeManager classList = new GradeManager();
      
      //add student 
      if(choice == 1){
        String firstName = "";
        String lastName = "";

        while(firstName.equals("")){
          System.out.println("Enter First Name: ");
          firstName = scan.nextLine();
        }

        while(lastName.equals("")){
          System.out.println("Enter Last Name: ");
          lastName = scan.nextLine();
        }

      Student student = new Student(firstName, lastName);
        System.out.println("Student Created Successfully");
        classList.addStudent(student);
        
        System.out.println("\n"+ student.toString());
          
        choice = scan.nextInt();
        
        //Enter/Update Grades
        if(choice == 2){
          
          System.out.println("Would you like to enter a new grade [new] or update an existing one [update]?");
          String answer = scan.nextLine();

          if(answer.equalsIgnoreCase("new")){
            //list students in class
            System.out.println(classList.toString()+"\n");
            
            System.out.println("Enter Student ID: ");
            int studentId = scan.nextInt();
            Student specStudent = classList.findStudent(studentId);
            
            System.out.println("Enter Grade: ");
            double testScore = scan.nextDouble();
              specStudent.addTestScore(testScore);
          }

          if(answer.equalsIgnoreCase("update")){
            
            System.out.println("Enter Student ID: ");
            int studentId = scan.nextInt();
            Student specStudent = classList.findStudent(studentId);
            
            System.out.println("Enter Test Score to Update: ");
            double testScore = scan.nextDouble();
              specStudent.removeTestScore(testScore);
            System.out.println("Enter New Test Score: ");
            double newTestScore = scan.nextDouble();
              specStudent.addTestScore(newTestScore);
          }
          }

        //view student details
        if(choice == 3){
        
        
      }
        /////////////////////////////////////////////

   

      }
      
      if(choice == 4){

      }
      
      if(choice == 5){

      }
      
      if(choice == 6){
        //search student
        System.out.println("Enter Student ID: ");
        int studentId = scan.nextInt();
        Student specStudent = classList.findStudent(studentId);
        System.out.println(specStudent.toString());
      }
      
      if(choice == 7){

      }
        
      else if(choice > 8){
      System.out.println("Invalid Choice");
      choice = 0;
      }
      }
      
  }

}
