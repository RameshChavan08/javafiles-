abstract class Student {
    protected String name;
    protected String registrationNumber;

    public Student(String name, String registrationNumber) {
        this.name = name;
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public abstract double marks();
}

class CA extends Student {
    private double practicalMarks;
    private double theoryMarks;

    public CA(String name, String registrationNumber, double practicalMarks, double theoryMarks) {
        super(name, registrationNumber);
        this.practicalMarks = practicalMarks;
        this.theoryMarks = theoryMarks;
    }

    public double marks() {
        return practicalMarks + theoryMarks;
    }
}

class Semester extends Student {
    private double[] subjectMarks;

    public Semester(String name, String registrationNumber, double[] subjectMarks) {
        super(name, registrationNumber);
        this.subjectMarks = subjectMarks;
    }

    public double marks() {
        double totalMarks = 0;
        for (double mark : subjectMarks) {
            totalMarks += mark;
        }
        return totalMarks;
    }

public class Main {
    public static void main(String[] args) {
        Student s1 = new CA("John Doe", "1234", 80.0, 90.0);
        Student s2 = new Semester("Jane Smith", "5678", new double[]{85.0, 75.0, 90.0});

        System.out.println(s1.getName() + "'s marks: " + s1.marks());
        System.out.println(s2.getName() + "'s marks: " + s2.marks());
    }
}
}
