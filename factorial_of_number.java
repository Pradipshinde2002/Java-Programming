import java.util.Scanner;
public class factorial_of_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= sc.nextInt();
        int result=1;
        while(n>0){
            result=result*n;
            n--;
        }
        System.out.println("the factorial number is :"+result);
    }

}
