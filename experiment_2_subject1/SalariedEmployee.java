package experiment_2_subject1;

import java.util.Calendar;

//固定月薪的员工
public  class SalariedEmployee extends Employee{
    private int SalariedMoney;

    public SalariedEmployee() {

    }

    public SalariedEmployee(String name,int birthday,int workNum,int SalariedMoney){
        super.setName(name);
        super.setBirthday(birthday);
        super.setWorkNum(workNum);
        this.SalariedMoney = SalariedMoney;
    }

    public int getSalariedMoney() {
        return SalariedMoney;
    }

    public void setSalariedMoney(int salariedMoney) {
        SalariedMoney = salariedMoney;
    }

    @Override
    public  int getMoney(){
        int temp = this.SalariedMoney;
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) + 1;
        if(super.getBirthday()%100==month){
            //当前月份和生日月份相同
           temp +=100;
        }
        return temp;
    }
}
