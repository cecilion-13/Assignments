package co.harsh.Assignment1;

public class Q8 {
    /**
     * this method sort the array using bubble sort in ascending order
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {5, 12, 140, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        int len = arr.length;
        int i1=0;
        int temp=0;
        while(i1<len) {
            for (int i = 0; i < len - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            i1++;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
        //}
    }
}
