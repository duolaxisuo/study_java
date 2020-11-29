package experiment_2_subject1;

import java.util.Calendar;

public class HourlyEmployee extends Employee{
    private int HourlyMoney;

    public int getHourlyMoney() {
        return HourlyMoney;
    }

    public void setHourlyMoney(int hourlyMoney) {
        HourlyMoney = hourlyMoney;
    }

    public HourlyEmployee() {

    }

    public HourlyEmployee(String name, int birthday, int workNum, int HourlyMoney){
        super.setName(name);
        super.setBirthday(birthday);
        super.setWorkNum(workNum);
        this.HourlyMoney = HourlyMoney;
    }


    @Override
    public int getMoney() {
        int temp = this.HourlyMoney;
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) + 1;
        if(super.getBirthday()%100==month){
            //当前月份和生日月份相同
            temp +=100;
        }
        return temp;
    }
}
