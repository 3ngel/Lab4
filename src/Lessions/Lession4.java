package Lessions;

public class Lession4 {
    public static void main(String[] args){
        int[][] mass = new int[10][10];
        int z = 1;
        for(int i = 0; i < 10;i++){
            for (int j =0; j < z; j++){
                mass[i][j]=2;
                System.out.print(mass[i][j]);
            }
            z++;
            System.out.println();
        }
    }
}
