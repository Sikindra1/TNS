package day3;

import java.util.Scanner;

public class CustomerDriveClass {
    public static void main(String[] args) {
//        CustomerBaseClass obj=new CustomerBaseClass("sikindra kumar yadav","Bangalore",15);
//        System.out.println(obj);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the customer name,address and id ");
        String name=sc.next();
        String add=sc.next();
        int id=sc.nextInt();
        CustomerBaseClass obj1=new CustomerBaseClass(name,add,id);
        System.out.println(obj1);



    }
}
