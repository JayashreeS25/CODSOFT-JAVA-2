
import java.util.Scanner;

/**
 *                          TASK 2: STUDENT GRADE CALCULATOR USING JAVA
 * PROBLEM STATEMENT:
 * INPUT :TAKE MARKS  OBTAINED OUT OF 100 IN EACH SUBJECTS
 * CALACULATE TOTAL MARKS:SUM UP THE MARKS OBTAINED IN ALL SUNJECTS
 * CALCULATE AVERAGE :DIVIDE THE TOTAL MARKS WITH TOTAL NUMBER OF SUBJECT TO GET AVERAGE PERCENTAGE
 * GRADE CALCULATION : ASSIGN GRADE BASED ON THE PERCENTAGE
 * DISPLAY RESULT : STUDENTS GRADE AND AVERAGE PERCENTAGE AND TOTAL MARKS
 */
public class StudentGradeC{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Name of the Student :");
        String name = scan.nextLine();
        System.out.println("Enter the total number of subjects:");
        int totalsub=scan.nextInt();
       // String[] subname=new String[totalsub];
        int[] marks= new int[totalsub];
        for(int i=0;i<totalsub;i++){
           //** System.out.println("Enter the name of the Subjects"+(i+1)+":");
          //  subname[i]=scan.nextLine().trim();
            // TRIM IS USED TO REMOVE OR READ THE DATA WITHOUT ANY WHITESPACE//

            System.out.println("Enter the marks in each subjects:");
            marks[i]=scan.nextInt();
            if(marks[i]>100){
                System.out.println("Invaild Data !!!please enter the correct data");
            }
        }
        int totalmark=calculatetotalmark(marks);
        double Percentage=calculatepercentage(totalmark,totalsub);
        char grade=calculateGrade(Percentage);
        // Student details will be dispalyed as:
        System.out.println("Student Name:"+name);
        System.out.println("Total marks:"+totalmark);   
        System.out.println("Percentage:"+Percentage+"%");
        System.out.println("Grade:"+grade);
        
    }
    public static int calculatetotalmark(int[] marks)
    {
        int total=0;
        for(int j:marks){
            total+= j;
        }
        return total;
    }
    public static double calculatepercentage(int totalmark,int totalsub)
    {   int percent=totalmark/totalsub;
        return percent;
    }
    public static char calculateGrade(double Percentage){
        if(Percentage>=90){
            System.out.println("Flawless!!!");
            return 'A';
        }
        else if(Percentage>=80){
            System.out.println("Excellent!!!!");
            return 'B';
        }
        else if(Percentage>=70){
            System.out.println("Good!");
            return 'C';
        }
        else if(Percentage>=60){
            System.out.println("Well done!!");
            return 'D';
        }
        else if(Percentage>=50)
           { System.out.println("Can Do Better!!!");
            return 'E';
        }
        else{
            System.out.println("Need Improvement");
            return 'F';
        }
    }
}






