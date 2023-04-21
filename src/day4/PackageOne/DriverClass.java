package day4.PackageOne;

public class DriverClass {
    public static void main(String[] args) {
        BaseClass b=new BaseClass();

//        b.methodDefault();
//        b.methodProtected();
//        b.methodPublic();
//       // b.methodPrivate();

        b.varDefault=11;
		b.varProtected=22;
		b.varPublic=33;

//        b.methodDefault();
//        b.methodProtected();
//        b.methodPublic();

//        b.callMethod();

        System.out.println(b instanceof BaseClass); //T or F

    }
}
