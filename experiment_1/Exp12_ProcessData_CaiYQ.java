package experiment_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Exp12_ProcessData_CaiYQ {
    public static void main(String[] args) {
        int[] data = new int[20];
        int length = 20;
        for(int i = 0;i<data.length;i++){
            data[i]=i+1;
        }
        System.out.println("未乱序处理:");
        System.out.println(Arrays.toString(data));

        /*对数组进行乱序处理*/
        int[] result =new int[20];//存放乱序后的数组
        for(int i=0;i<result.length;i++){
            //一个随机数，每次从0到length - 1;
            int index = (int)(Math.random() * length);
            //拿一个在区间内下标为index的值
            result[i] = data[index];
            //防止结果出现乱序
            data[index]  = data[length-1];
            length--;
        }
        System.out.println("乱序处理后:");
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(data));
    }
}
