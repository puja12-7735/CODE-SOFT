import java.util.Scanner;

  class StudentGrade
{
    Scanner sc = new Scanner(System.in);
        int res, avg, avg1, per, total=600;
        void inputmark()
        {
            System.out.println("          ******STUDENT MARKSHEET******        ");
            System.out.println("");
            System.out.println("NAME OF SUBJECTS        FULL MARK       OBTAINED MARK");

            System.out.println("");

            System.out.print("   Literature               100                 ");
            int lit = sc.nextInt();

            System.out.println("");

            System.out.print("   Mathmetics               100                 ");
            int mat = sc.nextInt();

            System.out.println("");

            System.out.print("   Physics                  100                 ");
            int phy = sc.nextInt();

            System.out.println("");

            System.out.print("   Chemistry                100                 ");
            int che = sc.nextInt();

            System.out.println("");

            System.out.print("   IT                       100                 ");
            int it = sc.nextInt();

            System.out.println("");

            System.out.print("   Biology                  100                 ");
            int bio = sc.nextInt();

            System.out.println("");

            System.out.println("____________________________________________________");

            System.out.println("");

            res =( lit + mat + phy + che + it + bio);

            System.out.println("     Total                  600                 "+res);
             System.out.println("");
        }
        void calculatemark()
        {
            System.out.println("Total Obtained Mark is     :"+ res);
            System.out.println("");
            avg = total/6;
            System.out.println("Average Percentage is      :"+ avg +"%");
            System.out.println("");
            avg1 = (res*100)/total;
            System.out.println("Student obtained Average Percentage is  :"+ avg1 +"%");
            System.out.println("");
        }
        void gradeInfo()
        {
            System.out.println("PERCENTAGE         GRADE");
            System.out.println("_________          ______");
            System.out.println("90-100               'O'");
            System.out.println("80-89                'A'");
            System.out.println("70-79                'B'");
            System.out.println("60-69                'C'");
            System.out.println("50-59                'D'");
            System.out.println("35-49                'E'");
            System.out.println("Less than 35         'Fail'");
            System.out.println("");
        }   
        void gradeObtained()
        {
            if(avg1 >= 90 && avg1 <= 100)
            {
                System.out.println("Student has got Grade 'O'");
            }
            else if(avg1 >= 80 && avg1 < 90 )
            {
                System.out.println("Student has got Grade 'A'");
            }
            else if(avg1 >=70 && avg1 < 80)
            {
                System.out.println("Student has got Grade 'B'");
            }
            else if(avg1 >= 60 && avg1 < 70)
            {
                System.out.println("Student has got Grade 'C'");
            }
            else if(avg1 >=50 && avg1 < 60)
            { 
                System.out.println("Student has got Grade 'D'");
            }
            else if(avg1 >=35 && avg1 < 40)
            {
                System.out.println("Student has got Grade 'E'");
            }
            else 
            {
                System.out.println("Student has failed in the exam");
            }
        }
}  


    class StudentGradecalculater
{
    public static void main(String args[])
    {
        StudentGrade ob = new StudentGrade();

        ob.inputmark();
        ob.calculatemark();
        ob.gradeInfo();
        ob.gradeObtained();
    }
}