package main.trainings.OOPS;

public class Student {
    public static void main(String[] args) {
        StudentTest st = new StudentTest();
        st.m1=10;
        st.m2=10;
        st.m3=100;
        st.rollno=1126162;
        st.name= "Abdul";
        st.course="EEE";
        System.out.println("Total Marks is : "+ st.totalMarks());
        System.out.println("Average is : "+ st.averageOfMarks());
        System.out.println("Grade of student is : " + st.grade());
    }
}
class StudentTest{
    int m1,m2,m3;
    int rollno;
    String name;
    String course;

    public int totalMarks(){
        return m1+m2+m3;
    }
    public int averageOfMarks(){
        return totalMarks()/3;
    }
    public String grade(){
        if(averageOfMarks()>60){
            return "Grade A";
        }
        else{
            return "Grade B";
        }
    }
}
