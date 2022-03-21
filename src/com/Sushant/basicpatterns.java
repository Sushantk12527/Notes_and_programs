package com.Sushant;

import java.util.Scanner;

public class basicpatterns {

    public static void main(String[] args) {

//    Swastik();
//    BinaryTriangle();

    }

    /*
      1
      0 1
      1 0 1
      0 1 0 1
      1 0 1 0 1
    * */
    public static void BinaryTriangle(){
        int n = 5, k = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print('1' + " ");
                } else {
                    System.out.print('0' + " ");
                }
            }

            System.out.println();
        }
    }

    //Swastik

    public static void Swastik(){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

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
    /*
     * * * * *
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
