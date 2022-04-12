import com.sun.org.apache.xpath.internal.objects.XString;

import java.time.Clock;
import java.util.List;
import java.util.stream.Collectors;

public class TypeCasting {
    public static void main(String args[]){
        //exc 1
        int distance;
        distance=4750;
        int km , m;
        km=distance/1000;
        m=distance%1000;
        System.out.println("Distance  " +km);
        System.out.println("km  " +m);

        //exc 2
        long time;
        int second;
        time = 4000000000l;
        second =(int)(time/1000000000l);
        System.out.println(second);

        //exc 3
        //float f=10.45/9.5;
        float fl=10.45f/9.5f;
        System.out.println(fl);

        //exc 4
        int s =3*5%7;
        int t =4%5*7;
        int u =3*5%7;
        int v =(3+5)%7;
        int w=6 * 5 + 11 % 20;
        int x= ( 6 * ( 5 + 11 ) ) % 20;
        System.out.println(s);
        System.out.println(t);
        System.out.println(u);
        System.out.println(v);
        System.out.println(w);
        System.out.println(x);

        //exc 5
        boolean isBlond = true;
        boolean isFemale = true;
        boolean isGraduate = true;
        boolean result = (isBlond && isFemale && isGraduate) || (isBlond && !isFemale && isGraduate);
        System.out.println(result);

        //exc 6
        double d = 11.5;

        double f = 11.4;

        System.out.println(d -f == 0.1);
        System.out.println(11.5 -11.4 );

        char c = 104;
        System.out.println(c);

        //Section 3
        int a=65;
        if (a>=0 && a<30){
            System.out.println("your grade is D "+
                    "may re-attend the exam");
        }
        else if (a>=30 && a<50){
            System.out.println("your grade is C " +
                    "may re-attend the exam");
        }
        else if (a>=50 && a<80){
            System.out.println("your grade is B ");
            if (a<60){
                System.out.println("may re-attend the exam");
            }else {
                System.out.println("Thanks for attending the exam.");
            }
        }
        else if (a>=80 && a<100){
            System.out.println("your grade is A "+
                    "Thanks for attending the exam.");
        }
         ShapeByLoop shape = new ShapeByLoop();
        shape.rightTrangle(8);
        shape.oppRightTrangle(8);
        shape.rectangle(8);
        ArrayPractical sum = new ArrayPractical();
        sum.arraySum();
        StringPractice.countWord("hi how are you i am fine","you");
        StringPractice.deleteAll("hi how are you i am fine","you");

    }
}
