Student Grade Management System
A comprehensive Java console application for managing student records and grades with robust input validation and exception handling.

📋 Table of Contents
Features
Getting Started
Usage
Project Structure
Exception Handling
System Requirements
Contributing
✨ Features
Core Functionality
Student Management: Add new students with first and last names
Grade Management: Enter, update, and track student test scores
Student Search: Find students by their unique student ID
Grade Analysis: View detailed student information including GPA calculations
Class Reports: Generate comprehensive class statistics and reports
Advanced Input Validation
Menu Choice Validation: Prevents letter input and numbers outside valid range (1-8)
Name Validation: Ensures student names contain only letters (no numbers)
Grade Input Validation: Validates numeric grade entries and prevents letter input
Student ID Validation: Ensures student IDs are numeric values only
Range Validation: Comprehensive bounds checking for all user inputs
User Experience
Error Recovery: Smart retry loops allow users to correct mistakes immediately
Clear Error Messages: Detailed feedback helps users understand and fix input errors
Persistent Data: Student records persist throughout the session
Intuitive Menu System: Easy-to-navigate console interface
🚀 Getting Started
Prerequisites
Java Development Kit (JDK) 8 or higher
Any text editor or IDE
Compilation
# Navigate to the source directory
cd src/main/java
# Compile all Java files
javac *.java
Running the Application
# From the src/main/java directory
java Main
📖 Usage
Main Menu Options
When you start the application, you'll see the main menu:

==== Student Grade Management System ====
1. Add Student [type 1]
2. Enter/Update Grades [type 2]
3. View Student Details [type 3]
4. Generate Class Report [type 4]
6. Search Student [type 6]
7. Generate Sample Report [type 7]
8. Exit [type 8]
Enter your choice:
1. Adding a Student
Select option 1
Enter the student's first name (letters only)
Enter the student's last name (letters only)
System automatically generates a unique student ID
2. Enter/Update Grades
Select option 2
Choose new to add a new grade or update to modify an existing grade
Enter the student ID (numbers only)
Enter the grade value (numbers only)
3. View Student Details
Select option 3
Enter the student ID to view complete student information
Displays: ID, name, grades, and calculated GPA
6. Search Student
Select option 6
Enter the student ID to search for a specific student
Displays full student information if found
8. Exit
Select option 8 to safely exit the application
📁 Project Structure
src/main/java/
├── Main.java              # Main application and menu system
├── Student.java           # Student class with grade management
├── GradeManager.java      # Manages collection of students
├── CustomException.java   # Custom exception classes
├── MenuSystem.java        # Menu system utilities
└── Statistical.java       # Statistical calculations
Key Classes
Main.java
Application entry point
Handles user interaction and menu navigation
Implements input validation and exception handling
Manages the main application loop
Student.java
Represents individual students
Manages student data (ID, name, grades)
Calculates GPA and grade statistics
Handles grade addition and removal
GradeManager.java
Manages the collection of all students
Provides search functionality
Calculates class-wide statistics
Handles student addition and retrieval
CustomException.java
Defines custom exception classes for input validation
Includes specific exceptions for different validation scenarios
Provides meaningful error messages
🛡️ Exception Handling
The system includes comprehensive input validation with custom exceptions:

Exception Types
Exception	Trigger	Example
InvalidChoiceException	Typing letters for menu choice	Entering "abc" instead of "1"
ChoiceOutOfRangeException	Menu choice outside 1-8 range	Entering "15" for menu choice
InvalidNameException	Numbers in student names	Entering "John123" as a name
InvalidGradeException	Letters in grade input	Entering "abc" instead of "85.5"
InvalidStudentIdException	Letters in student ID input	Entering "abc" instead of "12345"
Error Recovery
Immediate Retry: Users can correct mistakes without returning to main menu
Clear Messages: Specific error descriptions help users understand the issue
Input Clearing: System automatically clears invalid input from the buffer
Session Persistence: Valid data is preserved even when errors occur
