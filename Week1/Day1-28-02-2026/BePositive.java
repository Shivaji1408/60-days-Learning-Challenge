import java.util.Scanner;
public class BePositive {
    public static int countStep(int[] arr){
        int neg = 0;
        int ans = 0;
        int zero = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == -1){
                neg++;
            }else if(arr[i] == 0){
                zero++;
            }
        }
        if(neg%2!=0){
            ans = 2;
        }
        ans += zero;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(countStep(arr));
        }
    }    
}