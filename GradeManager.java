import java.lang.Math;
import java.util.ArrayList;
import java.util.*;

public class GradeManager{
  //instance variables
  private ArrayList<Student> classList;

  //Constructor
  public GradeManager(){
    this.classList = new ArrayList<Student>();
  }
  //displays students in class list
  public String classListToString(){
    String classListString = "";
    for(int i = 0; i < classList.size(); i++){
      classListString += "Student ID: "+classList.get(i).getStudentId() + "\n";
    }
    return classListString;
  }
  //add student to array
  public void addStudent(Student student){
      classList.add(student);
      System.out.println("Student Added Successfully");
      
  }
  //find student by id

  //cant make void (<--- fix this))
  public Student findStudent(int studentId){
    //find student by id
    if(classList.isEmpty()){
      System.out.println("Class List is Empty");
      return null;
    }
    for(int i = 0; i < classList.size(); i++){
      if(classList.get(i).getStudentId() == studentId){
        return classList.get(i);
      }
    }
    // Student not found after checking all students
    System.out.println("Student Not Found");
    System.out.println("The only students in the class are: \n" + classListToString());
    return null;
  }
  //get average of all test scores
  public double getAverageTestScore(){
    double sum = 0;
    for(int i = 0; i < classList.size(); i++){
      sum += classList.get(i).getAverageTestScore();
    }
    return (sum / classList.size());
  }
  //get average of all GPA
  public double getAverageGPA(){
    double sum = 0;
    for(int i = 0; i < classList.size(); i++){
      sum += classList.get(i).getGPA();
    }
    return (sum / classList.size());
  }
  //return the highest test score
  public double getHighestTestScore(){
    double highest = 0;
    for(int i = 0; i < classList.size(); i++){
      if(classList.get(i).getAverageTestScore() > highest){
        highest = classList.get(i).getAverageTestScore();
      }
    }
    return highest;
  }
  //return the lowest test score
  public double getLowestTestScore(){
    double lowest = 0;
    for(int i = 0; i < classList.size(); i++){
      if(classList.get(i).getAverageTestScore() < lowest){
        lowest = classList.get(i).getAverageTestScore();
      }
    }
    return lowest;
  }

}
