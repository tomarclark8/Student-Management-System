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
    return "Student ID: " + studentId + "\nFirst Name: " + firstName + "\nLast Name: " + lastName;
  }

  // add test score to array
  public void addTestScore(double score) {
    grades.add(score);
    System.out.println("Test Score Added Successfully");
  }

  // remove test score from array
  public void removeTestScore(double score) {
    grades.remove(score);
    System.out.println("Test Score Removed Successfully");
  }

  // get average of all test scores
  public double getAverageTestScore() {
    double sum = 0;
    for (int i = 0; i < numberOfTests; i++) {
      sum += grades.get(i);
    }
    return (sum / numberOfTests);
  }

  // return the highest test score
  public double getHighestTestScore() {
    double highest = 0;
    for (int i = 0; i < numberOfTests; i++) {
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