//public class star_pattern {
//    public static void main(String[] args) {
//        for(int i=5;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//    }
//}

//
//public class star_pattern{
//    public static void main(String[] args) {
//        int nsp=3;
//        int nst=1;
//        for(int i=1;i<=7;i++) {
//            for (int j = 1; j <= nsp; j++) {
//                System.out.print("\t");
//
//            }
//            for(int j=1;j<=nst;j++){
//                System.out.print("*\t");
//            }
//            for(int j=1;j<=nsp;j++){
//                System.out.print("\t");
//            }
//            if(i<=3){
//                nsp--;
//                nst=nst+2;
//
//            }
//            else {
//                nsp++;
//                nst=nst-2;
//
//            }
//            System.out.println();
//        }
//
//    }
//}



//arrayindexoutofbounderror;

// public class star_pattern{
//    public static void main(String[] args) {
//        int k = 0;
//        int arr1[][] = new int[4][5];
//        arr1[0] = new int[1];
//        arr1[1] = new int[2];
//        arr1[2] = new int[3];
//        arr1[3] = new int[4];
//        for (int i = 0; i < 4; i++){
//            for (int j = 0; j <= i+1; j++) {
//                arr1[i][j] = k;
//                k++;
//            }
//            for (i = 0; i < 4; i++) {
//                for (int j = 0; j <= i+1; j++) {
//                        System.out.print(arr1[i][j] + " ");
//                    }
//                    System.out.println();
//
//
//                }
//            }
//        }}
//

//public class star_pattern{
//    public static void main(String[] args) {
//        for(int i=1;i<=5;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//  public class star_pattern{
//    public static void main(String[] args) {
//        for(int i=1;i<=4;i++){
//            for(int j=1;j<=4;j++){
//                System.out.print(" * ");
//            }
//
//            System.out.println();
//        }
//    }
//}

//    public class star_pattern{
//        public static void main(String[] args) {
//            for(int i=1;i<=4;i++){
//                for(int j=4;j>=i;j--){
//                    System.out.print(" * ");
//                }
//                System.out.println();
//            }
//        }
//
//}

//    public class star_pattern{
//        public static void main(String[] args) {
//            for(int i=1;i<=4;i++){
//                for(int j=1;j<=i;j++){
//                    System.out.print(" * ");
//                }
//                System.out.println();
//            }
//
//            for(int i=1;i<=3;i++){
//                for(int j=3;j>=i;j--){
//                    System.out.print(" * ");
//                }
//                System.out.println();
//            }

//            for(int i=1;i<=4;i++){
//                for(int j=1;j>=i;j--){
//                    System.out.print(" * ");
//                }
//                System.out.println();
//            }
//        }
//    }


//    public class star_pattern{
//        public static void main(String[] args) {
//            int i;
//            for (i = 1; i <= 4; i++) {
//                for (int j = 3; j >= i; j--) {
//                    System.out.print(" ");
//                }
//                for(int k=1;k<=i;k++){
//                    System.out.print(" * ");
//                }
//                System.out.println();
//            }
//
//            for (i = 1; i <= 4; i++) {
//                for (int j = 3; j >= i; j--) {
//                    System.out.print(" * ");
//                }
//                 for(int k=1;k<=i;k++){
//                    System.out.print(" ");
//                }
//                System.out.println();
//            }
//        }}
//
//    public class star_pattern {
//        public static void main(String[] args) {
//            for(int i=1;i<=4;i++){
//                for(int j=4;j>=i;j--){
//                    System.out.print(" ");
//                }
//                for(int k=1;k<=i;k++){
//                    System.out.print("*");
//                }
//              System.out.println();
//         }}}
//
//    public class star_pattern{
//        public static void main(String[] args) {
//            for(int i=1;i<=4;i++){
//                for(int j=1;j<=i;j++){
//                    System.out.print(" ");
//                }
//                for(int k=4;k>=i;k--){
//                    System.out.print("*");
//                }
//                System.out.println();
//
//            }
//        }
//    }



//pattern7


/*public class star_pattern{
        public static void main(String[] args) {
            for (int i=1;i<=2;i++){
                for (int j=2;j>=i;j--){
                    System.out.print(" ");
                }
                for(int k=0;k<(i*2);k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i=1;i<=2;i++){
                for (int j=2;j>=i;j--){
                    System.out.print(" ");
                }
                for(int k=0;k<(i*2);k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i=1;i<=1;i++){
                for(int j=2;j>=i;j--){
                    System.out.print(" ");
                }
                for(int k=1;k<=(i*2);k++){
                    System.out.print("*");
                }

                System.out.println();

            }

        }

    }*/
/*
import java.util.Scanner;
public class star_pattern{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<4;j++){
                if(i%2==0){
                    if(j==0 || j==3){
                        System.out.print("\t");
                    }
                    else{
                        System.out.print("*\t");
                    }
                }
                else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
*/



//arrow pattern
//    public class star_pattern{
//        public static void main(String[] args) {
//            for(int i=1;i<=7;i++){
//                for (int j=7;j>=i;j--){
//                    System.out.print(" ");
//                }
//                for (int k=1;k<=(i*2);k++){
//                    System.out.print("*");
//                }
//                System.out.println();
//
//
//
//            }
//            }
//        }

//    public class star_pattern{
//        public static void main(String[] args) {
//            for(int i=1;i<=5;i++){
//                for (int j=1;j<=i;j++){
//                    System.out.print(" ");
//                }
//                for(int k=4;k>=i;k--){
//                    System.out.print("*");
//                }
//                for (int l=2;l>=i;l--){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        }
//    }

//cross line program

//    public class star_pattern {
//        public static void main(String[] args) {
//            for (int i=1;i<=5;i++){
//                for (int j=1;j<=i;j++){
//                    if (i>=2 && j<=i-1){
//                        System.out.print(" ");
//                    }
//                    else {
//                        System.out.print("*");
//                    }
//
//                }System.out.println();
//            }
//        }
//}


// 'X' pattern
//    public class star_pattern {
//        public static void main(String[] args) {
//            for (int i=0;i<5;i++){
//                for (int j=0;j<5;j++){
//                    if (i==j || i+j==5-1){
//                        System.out.print("*");
//                    }
//                    else{
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println();
//            }
//        }
//}


 //8 printing
//    import java.util.Scanner;
//    public class star_pattern {
//        public static void main(String[] args) {
//            Scanner sc=new Scanner(System.in);
//            System.out.println("Enter no pf rows:\t");
//            int n=sc.nextInt();
////            System.out.println("enter no col:\t");
////            int m=sc.nextInt();
//            for (int i=1;i<=n;i++){
//                for (int j=1;j<=n;j++){
//                    if(i==1 || i==n/2+1 || i==n){
//                        System.out.print("*\t");
//                    }else if (j==1 || j==n){
//                        System.out.print("*\t");
//                    }else {
//                        System.out.print("\t");
//                    }
//                }
//                System.out.println();
//
//                }
//            }
//
//        }


//    public class star_pattern {
//        public static void main(String[] args) {
//            for (int i=1;i<=5;i++){
//                for (int j=1;j<=5;j++){
//                    if(i==5 || j==3){
//                        System.out.print("*");
//                    }
//                    else {
//                        System.out.print(" ");
//                    }
//                    System.out.println();
//                }
//            }
//        }
//}

//printing " 1 "
//import java.util.Scanner;
//
//public class star_pattern{
//    public static void main(String[] args) {
//        Scanner scn=new Scanner(System.in);
//        System.out.println("enter no of rows");
//        int n= scn.nextInt();
//
//        System.out.println("enter no columns:");
//        int m=scn.nextInt();
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++){
//                if(i==n){
//                    System.out.print("*\t");
//                }
//                else if(j==m/2+1){
//                    System.out.print("*\t");
//                }
//                else{
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//        }
//
//    }
//}

// printing "8"
//import java.util.Scanner;
//public class star_pattern{
//    public static void main(String[] args) {
//        Scanner scn=new Scanner(System.in);
//        int n= scn.nextInt();
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i==1 || i==n/2+1 || i==n){
//                    System.out.print("*\t");
//                }
//                else if(j==1 || j==n){
//                    System.out.print("*\t");
//                }
//                else{
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//        }
//
//    }
//}


//printing "2"
//    import java.util.Scanner;
//    public class star_pattern {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter no of rows:\t");
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if (i==1 || i==n/2+1 || i==n){
//                    System.out.print("*\t");
//                } else if (j==n || j==1) {
//                    System.out.print("*\t");
//
//                } else {
//                    System.out.print("\t");
//                }
//            }            System.out.println();
//
//        }
//        }
//    }
//


// pattern 1   run
//    import java.util.Scanner;
//    public class star_pattern {
//        public static void main(String[] args) {
//            Scanner sc=new Scanner(System.in);
//            System.out.println("Enter no of rows:\t");
//            int n=sc.nextInt();
//
//            for (int row=1;row<=n;row++){
//                for(int col=1;col<=row;col++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        }
//}


//pattern 2 run
//    import java.util.Scanner;
//    public class star_pattern {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter no of rows:\t");
//        int n=sc.nextInt();
//
//        for (int row=1;row<=n;row++){
//            for(int col=1;col<=n;col++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//    }
//}

//pattern 4 run
//import java.util.Scanner;
//public class star_pattern {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter no of rows:\t");
//        int n=sc.nextInt();
//
//        for (int row=1;row<=n;row++){
//            for(int col=1;col<=n-row+1;col++){
//                System.out.print("*\t");
//            }
//            System.out.println();
//        }
//    }
//}


//pattern 5
//import java.util.Scanner;
//public class star_pattern {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter no of rows:\t");
//        int n=sc.nextInt();
//
//        for (int row=1;row<=n;row++){
//            for(int col=1;col<=row;col++){
//                System.out.print(col+"\t");
//            }
//            System.out.println();
//        }
//    }
//}



//import java.util.Scanner;
//
//public class star_pattern{
//    public static void main(String[] args) {
//        Scanner scn=new Scanner(System.in);
//        int n= scn.nextInt();
//
//        int nst=1;
//        int nsp=n/2;
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=nst;j++){
//                System.out.print("*\t");
//            }
//            for(int j=1;j<=nsp;j++){
//                System.out.print("\t");
//            }
//
//            if(i<=n/2){
//                nst++;
//                nsp--;
//            }
//            else{
//                nst--;
//                nsp++;
//            }
//            System.out.println();
//        }
//
//    }
//}

//printing 2
//import java.util.Scanner;
//public class star_pattern{
//    public static void main(String[] args) {
//            Scanner scn = new Scanner(System.in);
//            int n = scn.nextInt();
//
//            for(int i=1;i<=n;i++){
//                for(int j=1;j<=n;j++){
//                    if(i==1 || i==n/2+1 || i==n){
//                        System.out.print("*\t");
//                    }
//                    else if(i<=n/2 && (j==n || j==1)){
//                        System.out.print("*\t");
//                    }
//                    else if(i>n/2+1 && i!=n && j==n){
//                        System.out.print("*\t");
//                    }
//                    else{
//                        System.out.print("\t");
//                    }
//                }
//                System.out.println();
//            }
//
//        }
//    }



//print "2" run
//import java.util.Scanner;
//public class star_pattern {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(i==1 || i==n/2+1 || i==n){
//                    System.out.print("*\t");
//                } else if (i<n/2+1 && j==n) {
//                    System.out.print("*\t");
//                } else if (i>n/2+1 && j==1) {
//                    System.out.print("*\t");
//
//                }else {
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//        }
//
//    }
//}


// printing 4 run
//import java.util.Scanner;
//public class star_pattern {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter no of rows:\t");
//        int n=sc.nextInt();
//
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if(i==n/2+1){
//                    System.out.print("*\t");
//                } else if (i<=n/2+1 && j==1 || j==n) {
//                    System.out.print("*\t");
//
//                } else if (i>=n/2+1 && j==n) {
//                    System.out.print("*");
//                }else {
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//print 3 run
//    import java.util.Scanner;
//    public class star_pattern {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if(i==1 || i==n/2+1 ||i==n){
//                    System.out.print("*");
//                } else if (j!=n) {
//                    System.out.print(" ");
//
//                }
//                else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//
//printing
//    import java.util.Scanner;
//    public class star_pattern {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if(i==1 || i==n/2+1 ||i==n){
//                    System.out.print("*");
//                } else if (j!=n) {
//                    System.out.print(" ");
//
//                }
//                else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//    }
//}


//print 6 run
//import java.util.Scanner;
//public class star_pattern {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if(i==1 || i==n/2+1 ||i==n){
//                    System.out.print("*\t");
//                } else if (j==1) {
//                    System.out.print("*\t");
//                }
//                else if (i>n/2 && i<n && j==n){
//                    System.out.print("*\t");
//                }
//                else {
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

// printing 7 run
//import java.util.Scanner;
//public class star_pattern {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//
//        for(int i=1;i<=6;i++){
//            for (int j=1;j<=n;j++){
//                if(i==1){
//                    System.out.print("*\t");
//                } else if (j==n) {
//                    System.out.print("*\t");
//
//                }
//                else {
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//
//        }
//    }
//}

//print 9 run
//import java.util.Scanner;
//public class star_pattern {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//
//        for(int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if(i==1 || i==n/2+1 || i==n){
//                    System.out.print("*\t");
//                } else if (i<n/2+1 && i!=1 && j==1 || j==n) {
//                    System.out.print("*\t");
//
//                }
//                else if (i>=n/2+1 && j==n && i!=n){
//                    System.out.print("*\t");
//                }
//                else {
//                    System.out.print("\t");
//                }
//            }
//            System.out.println();
//
//        }
//    }
//}


//import java.util.Scanner;
//public class star_pattern {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter no of rows: ");
//        int n=sc.nextInt();
//
//        for(int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if(j==1||j==n){
//                    System.out.print("*\t");
//                  } else if (i==j&&j==n-i+1&&i>=n/2+1) {
//                    System.out.print("*\t");
//                } else if (i<=n/2+1 && i==j) {
//                    System.out.print("*\t");
//
//                } else {
//                    System.out.print("\t");
//                }
//
//            }
//            System.out.println();
//
//        }
//
//    }
//}
