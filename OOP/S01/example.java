public class Student {
    // Instance variables (state/properties of the Student)
    private String name;
    private int id;
    private double gpa;
    private int[] grades;
    
    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.gpa = 0.0;
        this.grades = new int[5]; // Space for 5 grades
    }
    
    // Accessor methods (getters)
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public int[] getGrades() {
        return grades;
    }
    
    // Mutator methods (setters)
    public void setName(String name) {
        this.name = name;
    }
    
    // Grade management methods
    public void addGrade(int index, int grade) {
        if (index >= 0 && index < grades.length) {
            grades[index] = grade;
            calculateGpa();
        }
    }
    
    // Utility/helper methods
    private void calculateGpa() {
        int sum = 0;
        int count = 0;
        
        for (int grade : grades) {
            if (grade > 0) {
                sum += grade;
                count++;
            }
        }
        
        if (count > 0) {
            this.gpa = (double) sum / count;
        }
    }
    
    // Display method
    public void displayStudentInfo() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("GPA: " + gpa);
        System.out.println("Grades: ");
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > 0) {
                System.out.println("  Course " + (i+1) + ": " + grades[i]);
            }
        }
    }
}