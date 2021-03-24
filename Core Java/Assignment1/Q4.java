package co.harsh.Assignment1;

public class Q4 {
    /**
     * This method decalre the result of the students
     * based on various conditions
     * @param s1 marks achieved by a student in subject1
     * @param s2 marks achieved by a student in subject2
     * @param s3 marks achieved by a student in subject3
     */
    public static void resultDeclartion(int s1,int s2,int s3) {
        if (s1 > 60 && s2 > 60 && s3 > 60) {
            System.out.println("Passed");
        }
        else if((s1>60 && s2>60)||(s2>60 && s3>60)||(s1>60 && s3>60)){
            System.out.println("Promoted");
        }
        else if(s1>60 || s2>60 || s3>60){
            System.out.println("failed");
        }
        else{
            System.out.println("failed");
        }
    }

    public static void main(String[] args) {
        resultDeclartion(61,61,61);
        resultDeclartion(61,60,61);
        resultDeclartion(60,60,60);
        resultDeclartion(50,50,50);
    }
}
