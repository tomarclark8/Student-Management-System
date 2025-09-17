import java.lang.Math;
import java.util.ArrayList;
import java.util.*;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    // Entry
    int choice = 0;
    Scanner scan = new Scanner(System.in);
    GradeManager classList = new GradeManager();

    while (choice != 8) {
      System.out.println("==== Student Grade Management System ====");
      //Student class
      System.out.println("1. Add Student [type 1]");
      //Student class (DONE!)
      System.out.println("2. Enter/Update Grades [type 2]");
      //Student class 
      System.out.println("3. View Student Details [type 3]");
      //Report class
      System.out.println("4. Generate Class Report [type 4]");
      System.out.println("5. Calculate Statistics [type 5]");
      //Student class
      System.out.println("6. Search Student [type 6]");
      //Grade Manager class (DONE!)
      System.out.println("7. Generate Sample Report [type 7]");
      //type 8 to exit 
      System.out.println("8. Exit [type 8]");

      System.out.print("Enter your choice: ");
      try {
        choice = validateChoice(scan);
      } catch (InvalidChoiceException e) {
        System.out.println("Error: " + e.getMessage());
        System.out.println("Please try again.");
        continue; // Restart the menu
      } catch (ChoiceOutOfRangeException e) {
        System.out.println("Error: " + e.getMessage());
        System.out.println("Please try again.");
        continue; // Restart the menu
      }

      if(choice == 8){
        System.out.println("System Exited Successfully");
        scan.close();
        break;
      }
      Student student = null;

      //done
      if(choice == 1){
        String firstName = null;
        String lastName = null;
        
        // Retry loop for first name
        while (firstName == null) {
          try {
            System.out.print("Enter First Name: ");
            firstName = validateName(scan, "First Name");
          } catch (InvalidNameException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please try again.");
          }
        }
        
        // Retry loop for last name
        while (lastName == null) {
          try {
            System.out.print("Enter Last Name: ");
            lastName = validateName(scan, "Last Name");
          } catch (InvalidNameException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please try again.");
          }
        }
        
        student = new Student(firstName, lastName);
        System.out.println("\nStudent Created Successfully");
        classList.addStudent(student);
        System.out.println("\n"+ student.toString()+"\n");
      }
      //done
      if(choice == 2){
        System.out.println("New grade [new] or Update grade [update]?");
        String answer = scan.nextLine();

        //new
        if(answer.equalsIgnoreCase("new")){
          System.out.println("\n"+classList.classListToString()+"\n");
          
          int studentId = -1;
          Student specStudent = null;
          
          // Retry loop for student ID
          while (specStudent == null) {
            try {
              System.out.println("Enter Student ID: ");
              studentId = validateStudentId(scan);
              specStudent = classList.findStudent(studentId);
            } catch (InvalidStudentIdException e) {
              System.out.println("Error: " + e.getMessage());
              System.out.println("Please try again.");
            }
          }
          
          // Retry loop for grade
          double testScore = -1;
          while (testScore == -1) {
            try {
              System.out.println("Enter Grade: ");
              testScore = validateGrade(scan);
              specStudent.addTestScore(testScore);
            } catch (InvalidGradeException e) {
              System.out.println("Error: " + e.getMessage());
              System.out.println("Please try again.");
              testScore = -1; // Reset for retry
            }
          }
        }
        
        //update
        if(answer.equalsIgnoreCase("update")){
          int studentId = -1;
          Student specStudent = null;
          
          // Retry loop for student ID
          while (specStudent == null) {
            try {
              System.out.println("Enter Student ID: ");
              studentId = validateStudentId(scan);
              specStudent = classList.findStudent(studentId);
            } catch (InvalidStudentIdException e) {
              System.out.println("Error: " + e.getMessage());
              System.out.println("Please try again.");
            }
          }
          
          // Retry loop for old test score
          double testScore = -1;
          while (testScore == -1) {
            try {
              System.out.println("Enter Test Score to Update: ");
              testScore = validateGrade(scan);
              specStudent.removeTestScore(testScore);
            } catch (InvalidGradeException e) {
              System.out.println("Error: " + e.getMessage());
              System.out.println("Please try again.");
              testScore = -1; // Reset for retry
            }
          }
          
          // Retry loop for new test score
          double newTestScore = -1;
          while (newTestScore == -1) {
            try {
              System.out.println("Enter New Test Score: ");
              newTestScore = validateGrade(scan);
              specStudent.addTestScore(newTestScore);
            } catch (InvalidGradeException e) {
              System.out.println("Error: " + e.getMessage());
              System.out.println("Please try again.");
              newTestScore = -1; // Reset for retry
            }
          }
        }
      }
      //done
      if(choice == 3){
        int studentId = -1;
        Student specStudent = null;
        
        // Retry loop for student ID
        while (specStudent == null) {
          try {
            //view student details
            System.out.println("Enter Student ID: ");
            studentId = validateStudentId(scan);
            specStudent = classList.findStudent(studentId);
            if(specStudent != null) {
              System.out.println(specStudent.toString());
            }
          } catch (InvalidStudentIdException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please try again.");
          }
        }
      }
      
      if(choice == 4){

      }
      
      if(choice == 5){

      }
      
      if(choice == 6){
        int studentId = -1;
        Student specStudent = null;
        
        // Retry loop for student ID
        while (specStudent == null) {
          try {
            //search student
            System.out.println("Enter Student ID: ");
            studentId = validateStudentId(scan);
            specStudent = classList.findStudent(studentId);
            if(specStudent != null) {
              System.out.println(specStudent.toString());
            }
          } catch (InvalidStudentIdException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please try again.");
          }
        }
      }
      
      if(choice == 7){

      }
        //done
      // Choice validation is now handled at the beginning of the loop
    }
      
  }

  // Input validation methods
  public static int validateChoice(Scanner scan) throws InvalidChoiceException, ChoiceOutOfRangeException {
    try {
      int choice = scan.nextInt();
      scan.nextLine(); // Consume leftover newline
      if (choice < 1 || choice > 8) {
        throw new ChoiceOutOfRangeException("Choice must be between 1 and 8. You entered: " + choice);
      }
      return choice;
    } catch (InputMismatchException e) {
      scan.nextLine(); // Clear the invalid input
      throw new InvalidChoiceException("Invalid input! Please enter a number between 1 and 8.");
    }
  }

  public static String validateName(Scanner scan, String fieldName) throws InvalidNameException {
    String input = scan.nextLine();
    if (input.matches(".*\\d.*")) {
      throw new InvalidNameException(fieldName + " cannot contain numbers. Please enter a valid " + fieldName.toLowerCase() + ".");
    }
    return input;
  }

  public static double validateGrade(Scanner scan) throws InvalidGradeException {
    try {
      double grade = scan.nextDouble();
      scan.nextLine(); // Consume leftover newline
      return grade;
    } catch (InputMismatchException e) {
      scan.nextLine(); // Clear the invalid input
      throw new InvalidGradeException("Invalid grade input! Please enter a numeric value.");
    }
  }

  public static int validateStudentId(Scanner scan) throws InvalidStudentIdException {
    try {
      int studentId = scan.nextInt();
      scan.nextLine(); // Consume leftover newline
      return studentId;
    } catch (InputMismatchException e) {
      scan.nextLine(); // Clear the invalid input
      throw new InvalidStudentIdException("Invalid student ID! Please enter a numeric student ID.");
    }
  }

}
