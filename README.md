QueensProblem Java Program

Overview

The QueensProblem Java program is a solution to the classic problem of placing eight queens on a chessboard in such a way that no two queens threaten each other. The solution is implemented using a recursive backtracking algorithm.

Prerequisites

Java Development Kit (JDK) installed on your system.
Basic understanding of Java programming language.

Usage

Clone or download the repository to your local machine.
Compile the QueensProblem.java file using the following command:
Copy code
javac QueensProblem.java
Run the compiled program using the following command:
Copy code


java QueensProblem
Program Explanation

The program defines a QueensProblem class which implements the solution logic.
The search method checks if placing a queen at a given position is safe or not.
The problemSolver method recursively attempts to place queens on the chessboard.
The printBoard method is used to print the final configuration of the chessboard with queens placed.
The main method initializes the chessboard and calls the problemSolver method to find a solution.
