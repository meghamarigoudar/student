import java.util.Scanner;
public class course{
    public static void main(String args[]){
        System.out.println("Enter the semister");
        Scanner s=new Scanner(System.in);
        int sem=s.nextInt();
        if(sem==1){
            System.out.println("Course\tMarks");
            System.out.println("c\t86");
            System.out.println("Maths\t73");
        }
        else if(sem==2){
            System.out.println("Course\tMarks");
            System.out.println("c++\t97");
            System.out.println("Os\t83");
        }
        else if(sem==3){
            System.out.println("Course\t\tMarks");
            System.out.println("Java\t\t89");
            System.out.println("database\t92");
        }
    }
}