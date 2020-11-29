package experiment_2_subject1;

public abstract class Employee {
    private  String name;
    private int birthday; //采用类如200010的方式记录
    private int workNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public int getWorkNum() {
        return workNum;
    }

    public void setWorkNum(int workNum) {
        this.workNum = workNum;
    }

    public abstract int getMoney();
}
