package day4.PackageTwo;

import day4.PackageOne.BaseClass;

public class Executor {
    public static void main(String[] args) {
        BaseClass b = new BaseClass();


//        b.methodDefault();// can not access the default method from another package
        b.callMethod();
        b.methodPublic();
//        b.methodPrivate();// can not access the private method from another package

//        b.varDefault = 11;
//        b.varProtected=22;//can not access the protected method from another package
        b.varPublic = 33;

//        b.methodDefault();//can not access the default method from another package
        b.callMethod();
        b.methodPublic();

    }
}
