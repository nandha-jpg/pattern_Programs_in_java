package com.nandha;

public class Pattern2 {
    public static void main(String[] args) {
        for(int row=5; row>=1;row--){
            for(int column=5; column>=row;column--){
                System.out.print(row);
                //System.out.print(column);
                //output:
                //5
                //54
                //543
                //5432
                //54321
            }

            System.out.println();
        }
    }
}
