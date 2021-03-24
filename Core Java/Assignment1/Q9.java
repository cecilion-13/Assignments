package co.harsh.Assignment1;

import java.util.Scanner;

public class Q9 {

    public static void perStudent(int[][] studentMarks){
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<3;j++){
                sum = sum+studentMarks[i][j];
            }
            System.out.println("Total Marks of Student "+(i+1)+ " "+sum);
            System.out.println("Average Marks of Student "+(i+1)+ " "+sum/3);
        }
    }
    public static void perSubject(int[][] studentMarks){
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<3;j++){
                sum = sum+studentMarks[j][i];
            }
            System.out.println("Total Marks of Subject"+(i+1)+" "+sum);
            System.out.println("Average Marks of Subject"+(i+1)+" "+sum/3);
        }
    }
    public static void main(String[] args) {
        int[][] studentMarks = new int[3][3];
        int totalA,totalB,totalC,avgA,avgB,avgC;
        int totalS1,totalS2,totalS3,avgS1,avgS2,avgS3;
        System.out.println(studentMarks.length);

        Scanner sc = new Scanner(System.in);
        for(int i = 1;i<=3;i++){
            System.out.println("Enter Marks of Student " + i +" for Subject A,B and C respectively");
            for(int j=0;j<3;j++){
                studentMarks[i-1][j]=sc.nextInt();
            }
        }
        perStudent(studentMarks);
        perSubject(studentMarks);
    }
}
