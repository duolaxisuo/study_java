package experiment_2_subject4;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.print("输入true进入婚配系统，输入false退出");
        Scanner sc = new Scanner((System.in));
        boolean judge = sc.nextBoolean();
        Person first,second;
        while(judge == true){
            System.out.println("请输入第一个人的个人信息");
            first = createPerson();
            System.out.println("请输入第二个人的个人信息");
            second = createPerson();
            if(first.marry(second)){
                System.out.println(first.getName()+"可以和"+second.getName()+"结婚");
                first.setName(second.getName());
                second.setName(first.getName());
            }else{
                System.out.println(first.getName()+"不可以和"+second.getName()+"结婚");
            }
            System.out.println("按true继续，按false退出");
            judge = sc.nextBoolean();
            System.out.println("-----------------------------");
        }

    }

    public static Person createPerson(){
        Scanner sc = new Scanner((System.in));
        System.out.print("姓名:");
        String name = sc.nextLine(); //获取字符型名字
//        System.out.println();

        System.out.print("年龄:");
        int age = sc.nextInt();
//        System.out.println();

        System.out.print("性别:");
        boolean gender = sc.nextBoolean();
//        System.out.println();

        System.out.print("是否有配偶:");
        boolean partner = sc.nextBoolean();
//        System.out.println();

        Person temp = new Person(name,age,gender,partner);
        System.out.println();
        return temp;
    }
}
