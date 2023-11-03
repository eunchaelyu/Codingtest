import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println(n + " is even"); //System 할 때 맨처음 대문자 S 해야함
        }else {
            System.out.println(n + " is odd");
        }
        
    }
}
