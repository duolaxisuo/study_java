package experiment_2_subject2;

import java.util.Scanner;

public class ComputeTime {
    public static void main(String[] args) {
        int a=3,b=2,c=1;
        double temp=0;
        String type = null;
        String unable1 = "java",unable2 = "ComputeTime";
        Scanner sc = new Scanner(System.in);
        unable1 = sc.next();
        unable2 = sc.next();
        //System.out.println("输入交通工具的类型:");
        try {
            type = sc.next();
        }catch (Exception e){
            System.out.println("输入类型错误");
        }
        //System.out.print("输入a:");
        try{
            a=sc.nextInt();
        }catch (Exception e){
            System.out.println("输入类型错误");
        }

        //System.out.print("输入b:");
        try{
            b=sc.nextInt();
        }catch (Exception e){
            System.out.println("输入类型错误");
        }

        //System.out.print("输入c:");
        try{
            c=sc.nextInt();
        }catch (Exception e){
            System.out.println("输入类型错误");
        }

        if (type.equals("Plane")){
            Plane plane =new Plane();
            System.out.println("Plane速度为:"+plane.speed(a,b,c));
        }
        if (type.equals("Car007")){
            Car007 car007 = new Car007();
            System.out.println("Car007速度为:"+car007.speed(a,b,c));
        }
        if (type.equals("Ship")){
            Ship ship = new Ship();
            System.out.println("Ship速度为:"+ship.speed(a,b,c));
        }

    }
}
