package Lessions;

public class Lession1 {
    public static void main(String[] args){
        int wight=11;
        int i;
        int j;
        int z;
        for(i=1;i<=wight;i++){
            //System.out.print("номер строки"+i+" ");
            z=0;
            for(j=-12; j<wight; j++){
                System.out.print("+");
                z=z+1;
            }
            System.out.println("Количество сиволов в строке"+z);
        }
    }
}
