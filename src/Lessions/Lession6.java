package Lessions;

import java.util.Random;

public class Lession6 {
    public static void main(String[] args){
        Random r = new Random();
        int[][] mass = new int[10][5];
        for(int i = 0; i < 10;i++){
            for (int j =0; j < 5; j++){
                mass[i][j]=r.nextInt(20);
                System.out.print(mass[i][j]+" ");
            }
            System.out.println();
        }
        int s = r.nextInt(9);
        int k = r.nextInt(4);
        System.out.println("Удаляем строку "+s+" и столбец"+k);
        int[][] newmass =new int[9][4];
        for(int i = 0; i < 9;i++){
            if(i<s) {
                for (int j = 0; j <4; j++) {
                    if (j<k) {
                        newmass[i][j] = mass[i][j];
                        System.out.print(newmass[i][j] + " ");
                    }
                    if (j>=k){
                        newmass[i][j] = mass[i][j+1];
                        System.out.print(newmass[i][j] + " ");
                    }
                }
                System.out.println();
            }
            if(i>=s){
                for (int j = 0; j <4; j++) {
                    if (j<k) {
                        newmass[i][j] = mass[i][j+1];
                        System.out.print(newmass[i][j] + " ");
                    }
                    if (j>=k){
                        newmass[i][j] = mass[i+1][j+1];
                        System.out.print(newmass[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
