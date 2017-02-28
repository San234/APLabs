public class Student extends Person
{
   public int grade;
   public Student(int g)
   {
       grade = g;
       System.out.println("Student Constructor");
   }
   public int getGrade()
   {
       return grade;
   }
   public void showData()
   {
       System.out.println("Student's Grade is " + grade);
       System.out.println("Student's Age is " + age);
   }
}