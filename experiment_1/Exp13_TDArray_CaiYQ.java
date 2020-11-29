package experiment_1;

public class Exp13_TDArray_CaiYQ {
    public static void main(String[] args) {
        int[][] TheArrays = new int[5][5];
        int[] temp = new int[25],positions = new int[2];
        int nums = 0, length = 25, max=0;
        for (int i=0; i<temp.length; i++) {
            temp[i] = i + 1;
            //System.out.println(temp[i]);
        }
        for(int i = 0; i < 5; i++){
            for(int j = 0; j<5;j++){
                int index = (int)(Math.random() * length);
               // System.out.println(index);
                TheArrays[i][j] = temp[index];
                temp[index] = temp [length-1];
                length--;
            }
        }
        for (int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i==0||j==0||i==4||j==4){
                    nums += TheArrays[i][j];
                }
                if(i==j&&TheArrays[i][j]>max){
                    max = TheArrays[i][j];
                    positions[0] = i;
                    positions[1] = j;
                }
                System.out.print(TheArrays[i][j]);
                System.out.print("  ");
            }
            System.out.println("");
        }
        System.out.println("max:"+max);
        System.out.println("x:"+positions[0]+"  y:"+positions[1]);
        System.out.println("最外围一圈的和:"+nums);
    }
}
