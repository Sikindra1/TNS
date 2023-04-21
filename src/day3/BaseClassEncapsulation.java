package day3;


public class BaseClassEncapsulation {
    // memeber variable
    private String name;
    private int serialNo;
    private int age;

    // methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "BaseClassEncapsulation{" +
                "name='" + name + '\'' +
                ", serialNo=" + serialNo +
                ", age=" + age +
                '}';
    }
}
