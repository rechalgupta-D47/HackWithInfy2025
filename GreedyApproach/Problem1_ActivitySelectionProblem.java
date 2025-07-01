import java.util.*;
public class Problem1_ActivitySelectionProblem{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = read.nextInt();
            arr[i][1] = read.nextInt();
        }
        Arrays.sort(arr, (a,b)->a[1]-b[1]);
        int start = arr[0][0];
        int end = arr[0][1];
        int count = 1;
        for(int i=1;i<n;i++){
            if(end<=arr[i][0]){
                count++;
                start = arr[i][0];
                end = arr[i][1];
            }else{
                continue;
            }
        }
        System.out.println(count);
    }
}