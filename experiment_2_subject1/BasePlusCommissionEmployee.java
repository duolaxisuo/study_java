package experiment_2_subject1;

import java.util.Calendar;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private int BasePlusCommissionMoney;

    public BasePlusCommissionEmployee() {
    }

    public BasePlusCommissionEmployee(String name,int birthday,int workNum,int BasePlusCommissionMoney){
        super.setName(name);
        super.setBirthday(birthday);
        super.setWorkNum(workNum);
        this.BasePlusCommissionMoney = BasePlusCommissionMoney;
    }

    public int getBasePlusCommissionMoney() {
        return BasePlusCommissionMoney;
    }

    public void setBasePlusCommissionMoney(int basePlusCommissionMoney) {
        BasePlusCommissionMoney = basePlusCommissionMoney;
    }

    @Override
    public int getMoney() {
        int temp = this.BasePlusCommissionMoney;
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH) + 1;
        if(super.getBirthday()%100==month){
            //当前月份和生日月份相同
            temp +=100;
        }
        return temp;
    }
}
