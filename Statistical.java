public class Statistical{
private GradeManager classGPA;
private GradeManager classAverage;
private GradeManager classHighest;
private GradeManager classLowest;

   //return the average GPA of the class
   public double getClassGPA(){
    return classGPA.getAverageGPA();
   }
   //return the average test score of the class
   public double getClassAverage(){
    return classAverage.getAverageTestScore();
   }
   //return the highest test score of the class
   public double getClassHighest(){
    return classHighest.getHighestTestScore();
   }
   //return the lowest test score of the class
   public double getClassLowest(){
      return classLowest.getLowestTestScore();
   }


public String toString(){
    return "Class GPA: " + classGPA + "\nClass Average: " + classAverage + "\nClass Highest: " + classHighest + "\nClass Lowest: " + classLowest;
}
}