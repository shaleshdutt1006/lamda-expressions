


/**
 * InvalidUserException extends Parent class Exception which is predefined And we are making Custom exception
 * using this.
 * An enum is a special "class" that represents a group of constants in this InvalidUserException class it is
 * showing the type of exception
 */

public class InvalidUserException extends Exception {
    enum exceptionType {
        Invalid_First_Name, Invalid_last_Name, Invalid_Email, Invalid_Password, Invalid_Mobile_Number;
    }

    /*
       Variable to define type
    */
    exceptionType type;

    public InvalidUserException(exceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
