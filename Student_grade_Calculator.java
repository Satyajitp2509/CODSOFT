/*Input: Take marks obtained (out of 100) in each subject.
Calculate Total Marks: Sum up the marks obtained in all subjects.
Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
average percentage.
Grade Calculation: Assign grades based on the average percentage achieved.
Display Results: Show the total marks, average percentage, and the corresponding grade to the user */
import java.util.*;

public class Student_grade_Calculator
{

    public static void main(String[] args)
    {
        float maths,english,social_science,science,hindi,total_marks,avg_percentage;
        String grade;
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Enter the marks obtained in English: ");
        english=sc.nextFloat();
    
        System.out.println("Enter the marks obtained in Maths: ");
        maths=sc.nextFloat();
    
        System.out.println("Enter the marks obtained in Hindi: ");
        hindi=sc.nextFloat();
    
        System.out.println("Enter the marks obtained in Social Science: ");
        social_science=sc.nextFloat();
    
        System.out.println("Enter the marks obtained in Science: ");
        science=sc.nextFloat();
    
        total_marks=english+maths+hindi+science+social_science;
        avg_percentage=(total_marks/500)*100;
        
        if(avg_percentage>=91)
        {
            grade="A+";
        }
        else if(avg_percentage>=81 && avg_percentage<=90)
        {
            grade="A";
        }
        else if(avg_percentage>=71 && avg_percentage<=80)
        {
            grade="B+";
        }
        else if(avg_percentage>=61 && avg_percentage<=70)
        {
            grade="B";
        }
        else if(avg_percentage>=51 && avg_percentage<=60)
        {
            grade="C+";
        }
        else if(avg_percentage>=41 && avg_percentage<=50)
        {
            grade="C";
        }
        else if(avg_percentage>=35 && avg_percentage<=40)
        {
            grade="D";
        }
        else
        {
            grade="Fail";
        }
        
        System.out.println("****************************************RESULT*****************************************************************");
        System.out.println("Total Marks Obtained are : "+total_marks+"/500");
        System.out.println("Average Percentage : "+avg_percentage);
        System.out.println("Grade : "+grade);
        System.out.println("*****************************************************************************************************************");
            
    }
   
}