// public class AsmTwo {
    
// }

import java.util.Scanner;


public class GradeStudent {
    public static void main(String[] args){

        // text gioi thieu chuong trinh
        String introString ="This program reads exam/homework scores" +
                "\nand reports your overall course grade.";
        System.out.println(introString);
        System.out.println();


        // thi giua ky ( Midterm )
        System.out.println("Midterm:");

        // user import weight
        System.out.print("Weight (0-100)? ");
        Scanner scannerWeight = new Scanner(System.in);
        int inputWeight = scannerWeight.nextInt();

        // user import Score earned
        System.out.print("Score earned? ");
        Scanner scannerScore = new Scanner(System.in);
        int inputScore = scannerScore.nextInt();

        // user have scores shift ?
        System.out.print("Were socres shifted (1=yes, 2=no) ? ");
        Scanner scannerScoresShift = new Scanner(System.in);
        int inputScoresShifted = scannerScoresShift.nextInt();

        if(inputScoresShifted == 1){
            // user import Score earned SHIFT
            System.out.print("Score earned? ");
            Scanner scannerScoreShift = new Scanner(System.in);
            int inputScoreShift = scannerScoreShift.nextInt();
            System.out.println("Total points = " + inputScoreShift +"/100");

            // weighted score
            float weightScore = (inputScoreShift * inputWeight)/100F ;
            System.out.println("Weighted score = " + weightScore + "/" + inputWeight);

        } else if(inputScoresShifted == 2){
            System.out.println("Total points = " + inputScore +"/100");

            // weighted score
            float weightScore = (inputScore * inputWeight)/100F ;
            System.out.println("Weighted score = " + weightScore + "/" + inputWeight);


        } else {
            exitProgramTOFinal();
        }

        System.out.println();





        // cuoi ky ( Final )
        System.out.println("Final:");

        // user import weight final
        System.out.print("Weight (0-100)? ");
        Scanner scannerWeightFinal = new Scanner(System.in);
        int inputWeightFinal = scannerWeightFinal.nextInt();

        // user import Score earned final
        System.out.print("Score earned? ");
        Scanner scannerScoreFinal = new Scanner(System.in);
        int inputScoreFinal = scannerScoreFinal.nextInt();

        // user have scores shift ?
        System.out.print("Were socres shifted (1=yes, 2=no) ? ");
        Scanner scannerScoresShiftFinal = new Scanner(System.in);
        int inputScoresShiftedFinal = scannerScoresShiftFinal.nextInt();

        if(inputScoresShiftedFinal == 1){
            // user import Score earned SHIFT
            System.out.print("Shift amount? ");
            Scanner scannerShiftAmountFinal = new Scanner(System.in);
            int inputShiftAmountFinal = scannerShiftAmountFinal.nextInt();

            int numberTotalPoint = inputShiftAmountFinal +inputScoreFinal;
            if (numberTotalPoint <=100){
                System.out.println("Total points = " + numberTotalPoint +"/100");

                // weighted score
                float weightScoreFinal = (numberTotalPoint * inputWeightFinal)/100F ;
                System.out.println("Weighted score = " + weightScoreFinal + "/" + inputWeightFinal);


            } else {
                System.out.println("Total points = 100/100");
                // weighted score
                float weightScoreFinal = (100 * inputWeightFinal)/100F ;
                System.out.println("Weighted score = " + weightScoreFinal + "/" + inputWeightFinal);

            }


        } else if(inputScoresShiftedFinal == 2){
            System.out.println("Total points = " + inputScoreFinal +"/100");

            // weighted score
            float weightScoreFinal = (inputScoreFinal * inputWeightFinal)/100F ;
            System.out.println("Weighted score = " + weightScoreFinal + "/" + inputWeightFinal);


        }

        System.out.println();


        // 4. Homework ~ bài tập về nhà
        System.out.println("Homework:");
        System.out.print("Weight (0-100)? ");

        // 4.1 Weight(0-100) ~ trọng số điểm bài tập về nhà
        Scanner scannerWeightHomework = new Scanner(System.in);
        int inputWeightHomework = scannerWeightHomework.nextInt();
        if(inputWeightHomework>=0 && inputWeightHomework<=100){
            System.out.println("ban da nhap trong khoang 0-100");

        } else {
            System.out.println("yeu cau nhap tronng khoang (0-100)");
        }

        // 4.2 Number of assignment ~ Tổng số bài tập về nhà
        System.out.print("Number of assingments? ");
        Scanner scannerNumberAssignments = new Scanner(System.in);
        int inputNumberAssignments = scannerNumberAssignments.nextInt();

        int n=1;
        int assignmentScoreN = 0;
        int assignmentScoreMaxN = 0;
        while(n <= inputNumberAssignments){
            System.out.print("Assignments " + n + " score and max? ");

            Scanner scannerAssignment = new Scanner(System.in);
            int assignmentScore =  scannerAssignment.nextInt();
            // Tông điểm phần bài tập của sv
            assignmentScoreN = assignmentScoreN+ assignmentScore;
//            System.out.println(assignmentScoreN);

            int assignmentScoreMax = scannerAssignment.nextInt();
            // Tổng điểm tối đa phần bài tập của sv
            assignmentScoreMaxN =assignmentScoreMaxN + assignmentScoreMax;
//            System.out.println(assignmentScoreMaxN);

            // update condition while
            n++;

        }



        //4.3 How many sections did you attend: số buổi sv đã học & được điểm danh
        System.out.print("How many sections did you attend? ");
        Scanner scannerStudentAttend = new Scanner(System.in);
        int inputStudentAttend =  scannerStudentAttend.nextInt();

        //4.4 Section points: Tổng điểm chuyên cần (attend) 01 attend= 5điểm, max =30
        int sumAttend = inputStudentAttend * 5;
        if(sumAttend<30){
            System.out.println("Section points = " + sumAttend +" / 30" );

        } else {
            System.out.println("Section points = 30 / 30" );

        }


        //4.4 Total points ~ Tổng điểm số của sv
        System.out.println("Total points = " + assignmentScoreN +"/" + assignmentScoreMaxN );

        //4.5 Weighted score
        int weightedScore = (assignmentScoreN/assignmentScoreMaxN)*inputWeightHomework;
        System.out.println("Weighted Score = "+ weightedScore + " / 45");


    }
    public static void exitProgramTOFinal(){
        System.out.println();
        System.out.println("chuyen toi Final:");
    }
}
