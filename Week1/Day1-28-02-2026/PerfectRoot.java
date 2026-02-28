import java.util.Scanner;
public class PerfectRoot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            int a = sc.nextInt();
            for(int i=1; i<=a; i++){
                System.out.print(i + " ");
            }
            n--;
        }
    }
}
