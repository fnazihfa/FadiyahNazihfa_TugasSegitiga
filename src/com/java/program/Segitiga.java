package com.java.program;

public class Segitiga {
    public static void main(String[] args) {
        System.out.println("====Segitiga 1====");
        for (int i=0;i<10;i++){
            for (int j=0;j<5;j++) {
                System.out.print("*");
                if (i==j) {
                    break;
                }
                if ((i+j)==9) {
                    break;
                }
            }
            System.out.println("");
        }

        System.out.println("====Segitiga 2====");

        for (int i=0;i<=11;i++){
            for (int j=0;j<5;j++) {
                System.out.print("*");
                if (i==j) {
                    break;
                }
                if (i==5) {
                    i += 1;
                    System.out.print("*");
                }
                if ((i+j)==11) {
                    break;
                }
            }
            System.out.println("");
        }
    }
}
