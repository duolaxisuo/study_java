package experiment_2_subject1;

import java.util.Calendar;

public class CommissionEmployee extends Employee{
    private int CommissionMoney;

    public CommissionEmployee() {
    }

    public CommissionEmployee(String name,int birthday,int workNum,int CommissionMoney){
        super.setName(name);
        super.setBirthday(birthday);
        super.setWorkNum(workNum);
        this.CommissionMoney = CommissionMoney;
    }

    public int getCommissionMoney() {
        return CommissionMoney;
    }

    public void setCommissionMoney(int commissionMoney) {
        CommissionMoney = commissionMoney;
    }

    @Override
    public int getMoney() {
        int temp = this.CommissionMoney;
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) + 1;
        if(super.getBirthday()%100==month){
            //当前月份和生日月份相同
            temp +=100;
        }
        return temp;
    }
}
