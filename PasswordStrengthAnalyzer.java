import java.util.Scanner;

public class PasswordStrengthAnalyzer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] commonPasswords = {"password", "12345678", "123456", "qwerty", "password123", "admin123", "admin", "letmein"};

        System.out.println("Enter your username: ");
        String username = scanner.nextLine();

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        boolean isSimilarToUsername = isSimilarToUsername(username, password);

        if(isSimilarToUsername){
            System.out.println("Warning: Password is too similar to the username.");
        }
        else{
             System.out.println("Password is not similar to the username.");
        }

        System.out.println();

        boolean isCommonPassword = isCommonPassword(password, commonPasswords);

        if (isCommonPassword){
            System.out.println("Warning: This is a commonly used password.");
        }
        else {
            System.out.println("Password is not in common password list.");
        }

        System.out.println();

        boolean hasSequentialNumbers = hasSequentialNumbers(password);

        if(hasSequentialNumbers){
            System.out.println("Warning: Password contains sequential numbers.");
        }
        else{ 
            System.out.println("No sequential number pattern detected.");
        }

        boolean hasRepeatedCharacters = hasRepeatedCharacters(password);

        if(hasRepeatedCharacters){
            System.out.println("Warning: Password contains repeated characters.");
        }
        else{ 
            System.out.println("No repeated character pattern detected.");
        }

        boolean hasMinimumLength = hasMinimumLength(password);

        if(hasMinimumLength){
            System.out.println("Password has at least 8 characters.");
        }
        else{
             System.out.println("Password does not have at least 8 characters.");
        }

        boolean hasUppercase = hasUppercase(password);

        if (hasUppercase) {
            System.out.println("Password has an uppercase letter.");
        }
        else{
            System.out.println("Password does not contain an uppercase letter.");
        }

        boolean hasLowercase = hasLowercase(password);

        if(hasLowercase){
            System.out.println("Password has a lowercase letter.");
        }
        else{
            System.out.println("Password does not contain a lowercase letter.");
        }

        boolean hasNumber = hasNumber(password);

        if (hasNumber){
            System.out.println("Password contains a number.");
        }
        else{
            System.out.println("Password does not contain a number.");
        }

        boolean hasSpecialCharacter = hasSpecialCharacter(password);

        if (hasSpecialCharacter) {
            System.out.println("Password contains a special character.");
        }
        else{
            System.out.println("Password does not contain a special character.");
        }

        int score = 0;

        if(hasMinimumLength){
            score++;
        }

        if(hasUppercase){
            score++;
        }

        if(hasLowercase){
            score++;
        }

        if(hasNumber){
            score++;
        }

        if(hasSpecialCharacter){
            score++;
        }

        if(hasSequentialNumbers){
            score--;
        }

        if(hasRepeatedCharacters){
            score--;
        }

        if(isSimilarToUsername){
            score--;
        }

        if(score < 0){
            score = 0;
        }

        System.out.println();
        System.out.println("Password Score: " + score + "/5");

        String strength;
        if(isCommonPassword){
            strength = "WEAK";
        }
        else if(score <= 2){
            strength = "WEAK";
        }
        else if(score <= 4){
            strength = "MEDIUM";
        }
        else{
            strength = "STRONG";
        }

        System.out.println("Password Strength: " + strength);
        System.out.println();
        System.out.println("Recommendations:");

        if(!hasMinimumLength){
            System.out.println("- Use at least 8 characters.");
        }

        if(!hasUppercase){
            System.out.println("- Add an Uppercase letter.");
        }

        if(!hasLowercase){
            System.out.println("- Add a Lowercase letter.");
        }

        if(!hasNumber){
            System.out.println("- Add a number.");
        }

        if(!hasSpecialCharacter){
            System.out.println("- Add a special character.");
        }

        if(isCommonPassword){
            System.out.println("- Avoid commonly used passwords.");
        }

        if(hasSequentialNumbers){
            System.out.println("- Avoid sequential numbers such as 123.");
        }

        if(hasRepeatedCharacters){
            System.out.println("- Avoid repeated characters such as aaa or 111.");
        }

        if(isSimilarToUsername){
            System.out.println("- Avoid using your username in your password.");
        }

        scanner.close();
    }

    public static boolean hasMinimumLength(String password){
        return password.length() >= 8;
    }

    public static boolean hasUppercase(String password){
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasLowercase(String password){
        for(int i = 0; i < password.length(); i++){
            if (Character.isLowerCase(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasNumber(String password){
        for ( int i = 0; i < password.length(); i++){
            if(Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasSpecialCharacter(String password){
        for (int i = 0; i < password.length(); i++){
            if(!Character.isLetterOrDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCommonPassword(String password, String[] commonPasswords){
        for (int i = 0; i < commonPasswords.length; i++){
            if(password.equalsIgnoreCase(commonPasswords[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasSequentialNumbers(String password){
        for (int i = 0; i < password.length() - 2; i++){
            char first = password.charAt(i);
            char second = password.charAt(i+1);
            char third = password.charAt(i+2);

            if(Character.isDigit(first) && Character.isDigit(second) && Character.isDigit(third)){
                if(second == first + 1 && third == second + 1){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasRepeatedCharacters(String password){
        for (int i = 0; i < password.length() - 2; i++){
            char first = password.charAt(i);
            char second = password.charAt(i+1);
            char third = password.charAt(i+2);

            if(second == first && third == second){
                return true;
            }
        }
        return false;
    }
    
    public static boolean isSimilarToUsername(String username, String password) {
        return password.toLowerCase().contains(username.toLowerCase());

    }
}