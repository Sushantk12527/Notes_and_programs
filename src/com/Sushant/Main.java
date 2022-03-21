package com.Sushant;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
    Scanner sc=new Scanner(System.in);
    int N= sc.nextInt();


 Swastik(N);
   }


   //Swastik

    public static void Swastik(int n){

    for(int row = 1; row<=2*n-1; row++){
        for(int col = 1; col <=2*n-1; col++){
           if(row==n || col==n){
               System.out.print("*");
           }
           else System.out.print(" ");

            if(col==1 && row< n){
               System.out.print("*");
            }
            else System.out.print(" ");

            if(row==1 && col> n){
                System.out.print("*");
            }
            else System.out.print(" ");

            if(row==2*n-1 && col< n){
                System.out.print("*");
            }
            else System.out.print(" ");

            if(col==2*n-1 && row> n){
                System.out.print("*");
            }
            else System.out.print(" ");
        }
        System.out.println();
    }
    }





   //Hollow Square
   /*       * * * * *
            *       *
            *       *
            *       *
            * * * * *
   */
    public static void HollowSquare(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){

                    System.out.print("* ");
                }
                else System.out.print("  ");
            }


            System.out.println();
        }
    }
}
