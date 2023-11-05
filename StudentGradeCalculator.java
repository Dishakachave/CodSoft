import java.util.Scanner;
public class StudentGradeCalculator {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter Number of Subjects");
        int nS = sc.nextInt();
        int total = 0;
        for(int i=0; i<nS; i++)
        {
            System.out.println("Enter marks obtained in "+(i+1)+" : ");
            int marks = sc.nextInt();
            total+= marks;
        }
        double averPer = (double)total/nS;
        char Grade;
        if(averPer >=90)
        {
            Grade = '0';
        }
        else if(averPer >=80)
        {
            Grade = 'A';
        }
        else if(averPer >=70)
        {
            Grade = 'B';
        }
        else if(averPer >=60)
        {
            Grade = 'C';
        }
        else if(averPer >=50)
        {
            Grade = 'D';
        }
        else if(averPer >=40)
        {
            Grade = 'E';
        }
        else
        {
            Grade = 'F';
        }
        System.out.println("Total Marks Scored is : "+total);
        System.out.println("Average Percentage Gained is : "+averPer+"%");
        System.out.println("Grade : "+Grade);
    }
}
