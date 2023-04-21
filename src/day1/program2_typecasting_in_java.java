package day1;

public class program2_typecasting_in_java {
    public static void main(String[] args) {

        //widening type casting or implicit type casting

        byte rollno=10;
        int rno =rollno;
        System.out.println(rno);

        float weight = 53.6f;
        System.out.println(weight+" kg");

        double latitude = weight;
        System.out.println(latitude+" North");

        char section='A';
        System.out.println("I am from section "+section);

        int charValue = section;
        System.out.println(charValue); // because of ASCII value associated

        //narrowing /explicit type casting

        double s=5008.4d;
        System.out.println(s);

        float my_weight =(float)s; // type casting converting double to float
        System.out.println(my_weight+" kg");

        long pie_value = (long) Math.PI; // conversion from long to int (typecasting)
        int num=(int)pie_value;
        System.out.println("Value of Pie: "+ pie_value);

    }
}
