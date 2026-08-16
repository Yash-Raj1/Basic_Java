class Student{
    int rollno;
    String name;
    int marks;
}

public class Object_Array{
    public static void main(String[] args){
        //int nums[] = new int[4];
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name="Yash Raj";
        s1.marks=90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name="Mayank Raj";
        s2.marks=89;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name="Rishu Raj";
        s3.marks=86;

        Student st[]= new Student[]{s1,s2,s3};

        for (Student i: st){
            System.out.println(i.name + "  " + i.marks);
        }
    }
}