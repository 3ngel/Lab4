package Lessions;
import java.util.Arrays;
public class Lession3 {
    public static void main(String[] args){
        int[][] mass = new int[10][5];
        for(int i = 0; i < 10;i++){
            for (int j =0; j < 5; j++){
                mass[i][j]=2;
                System.out.print(mass[i][j]);
            }
            System.out.println();
        }
    }
}
