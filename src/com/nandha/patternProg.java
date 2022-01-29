package com.nandha;

public class patternProg {
    public static void main(String[] args) {
        //patternProg patt=new patternProg();
        //int column=3;
        for(int row=1; row<=3;row++ ){
            for (int column=1; column <= row; column++){
                System.out.print(row+" "); //output as below:
                                        //1
                                        //22
                                        //333
                //System.out.println(column); //output as below
                //1
                //12
                //123
            }
            System.out.println();

        }
    }
}

//output as below:
//1
//12
//123