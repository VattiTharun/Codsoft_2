import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Welcome to The Student Grade Calculator");
        System.out.println("Enter The Student Marks :");
        for (int i = 0; i <5; i++) {
            a[i] = sc.nextInt();
        }
        int sum =0;
        for (int i = 0; i <5; i++) {
            sum += a[i];
        }
        float avg = (float) sum / 5;
        String grade = "";
        if(avg>90 && avg<=100)
        {
            grade = "O";
        }
        else if (avg>80 && avg<=90)
        {
            grade ="A+";
        }
        else if (avg>70 && avg<=80)
        {
           grade = "A";
        }
        else if(avg>60 && avg<=70)
        {
            grade ="B+";
        }
        else if(avg>50 && avg<=60)
        {
            grade = "B";
        }
        else if(avg>40 && avg<=50)
        {
            grade = "C";
        }
        else
        {
            grade = "F";
        }
        System.out.println(sum+" "+avg+" "+grade);
    }
}
