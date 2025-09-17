import java.lang.Math;
import java.util.ArrayList;
import java.util.*;

public class Student {
  // instance variables
  private int studentId;
  private String firstName;
  private String lastName;
  private ArrayList<Double> grades;
  private int numberOfTests = 0;

  // Constructor
  public Student(int tempId) {
    this.studentId = tempId;
    this.firstName = "";
    this.lastName = "";
    this.grades = new ArrayList<Double>();
    this.numberOfTests = grades.size();
  }
  public Student(String firstName, String lastName) {
    this.studentId = Math.abs(new Random().nextInt());
    this.firstName = firstName;
    this.lastName = lastName;
    this.grades = new ArrayList<Double>();
    this.numberOfTests = grades.size();
  }
  

  // getters
  public int getStudentId() {
    return studentId;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }
  public String toString(){
    return "Student ID: " + studentId + "\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nNumber of Tests: " + numberOfTests + "\nGrades: " + grades;
  }

  // add test score to array
  public void addTestScore(double score) {
    grades.add(score);
    numberOfTests = grades.size();
    System.out.println("Test Score Added Successfully");
  }

  // remove test score from array
  public void removeTestScore(double score) {
    grades.remove(score);
    numberOfTests = grades.size();
    System.out.println("Test Score Removed Successfully");
  }

  // get average of all test scores
  public double getAverageTestScore() {
    if (grades.isEmpty()) {
      return 0.0;
    }
    double sum = 0;
    for (int i = 0; i < grades.size(); i++) {
      sum += grades.get(i);
    }
    return (sum / grades.size());
  }

  // return the highest test score
  public double getHighestTestScore() {
    if (grades.isEmpty()) {
      return 0.0;
    }
    double highest = grades.get(0);
    for (int i = 1; i < grades.size(); i++) {
      if (grades.get(i) > highest) {
        highest = grades.get(i);
      }
    }
    return highest;
  }

  // GPA Calculations
  public double getGPA() {
    // Calculate GPA based on average test score
    // Assuming 90-100 = 4.0, 80-89 = 3.0, 70-79 = 2.0, 60-69 = 1.0, below 60 = 0.0
    double average = getAverageTestScore();
    if (average >= 90)
      return 4.0;
    else if (average >= 80)
      return 3.0;
    else if (average >= 70)
      return 2.0;
    else if (average >= 60)
      return 1.0;
    else
      return 0.0;
  }
}
