package experiment_2_subject3;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int rankNum = (int)(Math.random() * 100); //生成0~99的整数
      //  System.out.println(rankNum);
        int score = 0, judge = 1,times = 3;
        Scanner sc = new Scanner(System.in);
        while (judge == 1){
            System.out.print("请输入你猜的数：");
            times = 3;
            while (times!=0){
                int temp = 0;
                try{
                   temp =  sc.nextInt();
                   //catch块中使用 sc.next(); 就可以解决。sc.next()是得到字符串所以可以把该段内存中的值取出。
                }catch (Exception e){
                    sc.next();
                    System.out.println("重新输入数字！！");
                }
                if (temp==rankNum) {
                    score += times;
                    System.out.println("你猜对了");
                    rankNum = (int)(Math.random() * 100); //猜对重新生成一个随机数
                    break;
                }else {
                    if (temp > rankNum) {
                        System.out.println("猜大了");
                    } else {
                        System.out.println("猜小了");
                    }
                    times--;
                    System.out.println("还剩" + times + "次机会");
                }
                if(times!=0)
                System.out.println("现在得分:"+score);
            }
            if(times==0){
                score-=2;
            }
            System.out.println("现在得分:"+score);
            System.out.println("1.再来一次;2.退出");
            judge = sc.nextInt();
        }
      System.out.println("最终得分:"+score);
    }

}
