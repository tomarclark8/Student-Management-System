public class CustomException extends java.lang.Exception{
    public CustomException(String message){
        super(message);
    }
    
    public CustomException(){
        super();
    }
    
    public CustomException(String message, Throwable cause){
        super(message, cause);
    }
    
    public CustomException(Throwable cause){
        super(cause);
    }
}

// Specific exception classes for different validation scenarios
class InvalidChoiceException extends CustomException {
    public InvalidChoiceException(String message) {
        super(message);
    }
}

class InvalidNameException extends CustomException {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidGradeException extends CustomException {
    public InvalidGradeException(String message) {
        super(message);
    }
}

class InvalidStudentIdException extends CustomException {
    public InvalidStudentIdException(String message) {
        super(message);
    }
}

class ChoiceOutOfRangeException extends CustomException {
    public ChoiceOutOfRangeException(String message) {
        super(message);
    }
}
