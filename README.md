# Password Strength Analyzer 
A Java-based cybersecurity project that analyzes password strength and identifies common password weakness.

## Features
- Checks password length
- Checks for uppercase and lowercase letters
- Checks for numbers and special characters
- Detects commonly used passwords
- Detects sequential numbers such as 123
- Detects repeated characters such as aaa or 111
- Checks if the password contains the username
- Calculates a password score out of 5
- Classifies passwords as Weak, Medium, or Strong
- Provides recommendations to improve password security

## Technologies Used
- Java
- Java Scanner
- Object-oriented programming concepts
- Conditional statements
- Loops
- Methods
- String handling

## How It Works
The program asks the user to enter a username and password. It then checks the password against several security criteria.

The program checks:
1. Password length
2. Uppercase letters
3. Lowercase letters
4. Numbers
5. Special characters
6. Commonly used passwords
7. Sequential numbers
8. Repeated characters
9. Similarity between the username and password

Each basic security requirement adds to the password score, while some weaknesses reduce the score. The final score is used to classify the password as Weak, Medium, or Strong.

The program also provides recommendations to help the user improve a weak password.

## Password Scoring
The password starts with a score of 0.

### Points Added
- +1 for having at least 8 characters
- +1 for having an uppercase letter
- +1 for having a lowercase letter
- +1 for having a number
- +1 for having a special character

### Points Deducted
- -1 for containing sequential numbers such as 123
- -1 for containing repeated characters such as aaa or 111
- -1 for being similar to the username

The final score is between 0 and 5.

### Password Strength
- 0-2 : Weak
- 3-4 : Medium
- 5 : Strong

A commonly used password is always classified as "Weak" , even if it meets other requirements.

## Example Output / Testing
The program was tested with different types of passwords.

### Strong Password
Username: mahi  
Password: Hello@9xTq

Result:
- Score: 5/5
- Strength: STRONG
- No security weaknesses detected

### Medium Password
Username: mahi  
Password: Hello123!

Result:
- Score: 4/5
- Strength: MEDIUM
- Sequential number pattern detected

### Weak Password
Username: mahi  
Password: password

Result:
- Score: 2/5
- Strength: WEAK
- Common password detected
- Missing uppercase letter, number, and special character

### Username Similarity Test
Username: mahi  
Password: Mahi123!

Result:
- Score: 3/5
- Username similarity detected
- Sequential number pattern detected

## How To Run

### 1. Clone the repository 
Clone this repository to your computer using Git.

### 2. Open the project
Open the project folder in VS Code or another Java-supported IDE.

### 3. Compile the program
Open the terminal in the project folder and run:
javac PasswordStrengthAnalyzer.java

### 4. Run the program
Run:
java PasswordStrengthAnalyzer

### 5. Enter your username and password 
After running the program, enter your username and password when prompted in the terminal.
Example:

Enter your username:
mahi

Enter your password:
Hello@9xTq

## Project Structure
```text
PasswordStrengthAnalyzer/ -> PasswordStrengthAnalyzer.java
```

## What I Learned

Through this project, I learned how to:

- Use Java methods to organize code
- Use loops and conditional statements
- Work with strings and characters
- Use arrays to store and compare data
- Take user input using the Scanner class
- Build a simple password scoring system
- Identify common password security weaknesses
- Test a program using different inputs
- Improve code by breaking larger tasks into separate methods

## Future Improvements
Possible improvements for future versions include:
- Add a large database of commonly used password
- Detect more password patterns and weak combinations
- Add a graphical user interface (GUI)
- Improve the password similarity detection
- Add more detailed password security recommendations
