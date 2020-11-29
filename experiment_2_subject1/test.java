package experiment_2_subject1;

public class test {
    public static void main(String[] args) {
        Employee Employee[] = new Employee[4];
        SalariedEmployee firstMan = new SalariedEmployee("jack",200010,001,10000);
        HourlyEmployee secondMan = new HourlyEmployee("pitter",200009,002,15000);
        CommissionEmployee thirdMan = new CommissionEmployee("park",200011,003,20000);
        BasePlusCommissionEmployee fourthMan = new BasePlusCommissionEmployee("james",200012,004,25000);
        Employee[0]= firstMan;
        Employee[1]= secondMan;
        Employee[2]= thirdMan;
        Employee[3]= fourthMan;
        for (int i=0;i<Employee.length;i++){
            System.out.println("姓名:"+Employee[i].getName()+",生日:"+Employee[i].getBirthday()+",工号:"+Employee[i].getWorkNum()+"工资:"+Employee[i].getMoney());

        }

    }
}
