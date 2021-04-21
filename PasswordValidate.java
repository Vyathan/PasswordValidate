import java.util.*;
public class ValidatePassword {
    public static void main(String[] args) {
        //Initialize Scanner
        Scanner input = new Scanner(System.in);
        //Password String
        String password = "";
        //Declare Variables
        int numUpperCase, numLowerCase, numDigits;
        //Open Loop
        while(true){
            System.out.print("Please Enter Your Password: ");
            password = input.nextLine();
            numUpperCase = 0;
            numLowerCase = 0;
            numDigits = 0;
            for(int x = 0; x < password.length(); x++){
                if(Character.isUpperCase(password.charAt(x))){
                    numUpperCase++;
                } else if(Character.isLowerCase(password.charAt(x))){
                    numLowerCase++;
                } else if(Character.isDigit(password.charAt(x))){
                    numDigits++;
                }
            }
            //Check for password Validity
            if (numUpperCase < 2 || numLowerCase < 3 || numDigits < 1){
                System.out.println("The password did not have enough of the following: ");
                if (numUpperCase < 2){
                    System.out.println("uppercase letters");
                }
                if (numLowerCase < 3){
                    System.out.println("lowercase letters");
                }
                if (numDigits < 1){
                    System.out.println("digits");
                }
            }
            else{
                System.out.println("Valid password");
                break;
            }
        }
    }
}
