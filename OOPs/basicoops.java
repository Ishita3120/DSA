public class basicoops {
    public static class Student {
        String name;
        int rollno;
        double cgpa;
    }

    public static void main(String args[]) {
        // creating the object of the student class
        Student s1 = new Student();
        s1.name = "Ishita";
        s1.rollno = 76;
        s1.cgpa = 9.3;
        Student s2 = new Student();
        s2.name = "Ipshita";
        s2.rollno = 75;
        s2.cgpa = 9.6;
        System.out.println(s1.name + " " + s1.rollno + " " + s1.cgpa);
        System.out.println(s2.name + " " + s2.rollno + " " + s2.cgpa);
    }

}
