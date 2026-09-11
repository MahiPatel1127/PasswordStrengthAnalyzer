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
