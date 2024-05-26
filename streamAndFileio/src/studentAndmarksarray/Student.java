package studentAndmarksarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Student {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter Roll Number:");
            int rollNumber = Integer.parseInt(reader.readLine());

            System.out.println("Enter Name:");
            String name = reader.readLine();

            System.out.println("Enter Marks for 3 Subjects:");
            double[] marks = new double[3];
            for (int i = 0; i < marks.length; i++) {
                System.out.println("Enter marks for Subject " + (i + 1) + ":");
                marks[i] = Double.parseDouble(reader.readLine());
            }

            assin3_Student student = new assin3_Student(rollNumber, name, marks);
            student.displayInfo();
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid input format. Please enter numeric values for roll number and marks.");
        }
    }
}

