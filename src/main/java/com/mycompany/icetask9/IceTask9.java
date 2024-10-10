/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask9;
import javax.swing.JOptionPane;
/**
 *
 * @author disha
 */
public class IceTask9 {

    public static void main(String[] args) {
        // Get two numbers from the user
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number:"));

        int option = -1; // Initializing option to enter the loop

        while (option != 0) {
            // Display menu and get user option
            String menu = "Choose an operation:\n"
                        + "1. Addition\n"
                        + "2. Subtraction\n"
                        + "3. Division\n"
                        + "4. Multiplication\n"
                        + "0. Exit";
            option = Integer.parseInt(JOptionPane.showInputDialog(menu));

            // Perform the operation based on user option
            switch (option) {
                case 1 -> {
                    double sum = num1 + num2;
                    JOptionPane.showMessageDialog(null, "The result of addition is: " + sum);
                }
                case 2 -> {
                    double difference = num1 - num2;
                    JOptionPane.showMessageDialog(null, "The result of subtraction is: " + difference);
                }
                case 3 -> {
                    if (num2 != 0) {
                        double division = num1 / num2;
                        JOptionPane.showMessageDialog(null, "The result of division is: " + division);
                    } else {
                        JOptionPane.showMessageDialog(null, "Division by zero is not allowed!");
                    }
                }
                case 4 -> {
                    double multiplication = num1 * num2;
                    JOptionPane.showMessageDialog(null, "The result of multiplication is: " + multiplication);
                }
                case 0 -> JOptionPane.showMessageDialog(null, "Exiting the calculator.");
                default -> JOptionPane.showMessageDialog(null, "Calculation not recognized");
            }
        }
    }
}

    
    
    

