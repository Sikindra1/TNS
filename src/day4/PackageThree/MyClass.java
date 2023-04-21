package day4.PackageThree;


public class MyClass {
    private int id;

    private static MyClass obj = new MyClass();

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }



    private MyClass() {
        System.out.println("private con");
    }

    //factory Method

    public static MyClass getObject()
    {
        return obj;
    }

    @Override
    public String toString() {
        return "MyClass [id=" + id + "]";
    }
}
