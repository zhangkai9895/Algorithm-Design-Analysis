package DynamicProgramming;


import javafx.scene.shape.SVGPath;

import java.util.Scanner;
import java.util.Stack;

public class LCS {


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String x= in.next();
        String y= in.next();
        getLCS(x,y);
    }


    public static void getLCS(String x,String y){
        char[] s1 =x.toCharArray();
        char[] s2 =y.toCharArray();
        int[][] array = new int[x.length()+1][y.length()+1];

        for(int j=0;j<array[0].length;j++){
            array[0][j]=0;
        }

        for(int i=0;i<array.length;i++){
            array[i][0]=1;
        }

        for(int m=1;m<array.length;m++){
            for(int n=1;n<array[m].length;n++){
                if (s1[m-1]==s2[n-1]){
                    array[m][n]=array[m-1][n-1]+1;
                }else {
                    array[m][n]=Math.max(array[m-1][n],array[m][n-1]);
                }
            }
        }

        Stack stack =new Stack();
        int i =x.length()-1;
        int j = y.length()-1;

        while ((i>=0)&&(j>=0)){
            if(s1[i]==s2[j]){
                stack.push(s1[i]);
                i--;
                j--;
            }else {
                if (array[i+1][j]>array[i][j+1]){
                    j--;
                }else {
                    i--;
                }
            }
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }

    }
}
