package studentAndmarksarray;

class assin3_Student {
    private int rollNumber;
    private String name;
    private double[] marks;

    public assin3_Student(int rollNumber, String name, double[] marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    public String calculateGrade() {
        double average = calculateAverage();
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public void displayInfo() {
        System.out.println("Student Roll Number: " + rollNumber);
        System.out.println("Student Name: " + name);
        System.out.println("Marks Obtained:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " +(i+1)+ ": " + marks[i]);
        }
        System.out.println("Average Marks: " + calculateAverage());
        System.out.println("Grade: " + calculateGrade());
    }
}
