package Lessions;
import java.util.Random;
public class Lession5 {
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
        System.out.println();
        int[][] newmass =new int[5][10];
        for(int i = 0; i < 5;i++){
            for (int j =0; j < 10; j++){
                newmass[i][j]=mass[j][i];
                System.out.print(newmass[i][j]+" ");
            }
            System.out.println();
        }

    }
}
