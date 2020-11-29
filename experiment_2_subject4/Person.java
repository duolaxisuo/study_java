package experiment_2_subject4;

public class Person {
    private String name;
    private int age;
    private boolean gender; //false表示女，true表示男
    private boolean partner; //false表示没有配偶，true表示有配偶

    public Person() {

    }

    public Person(String name, int age, boolean gender, boolean partner) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.partner = partner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean isPartner() {
        return partner;
    }

    public void setPartner(boolean partner) {
        this.partner = partner;
    }

    //marry方法
    public boolean marry(Person p){
       if (this.gender==p.isGender()||this.partner||p.isGender()){
           return false;
       }
       if((this.gender==true&&this.age<=23)||(this.gender==false&&this.age<=21)){
           return false;
       }
       return true;
    }
}
