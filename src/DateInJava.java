import java.text.SimpleDateFormat;
import java.util.Date;

public class DateInJava {

void date(){
    Date d1 = new Date();
    long l =d1.getTime();
    System.out.println(l);
    try {
        Thread.sleep(1000);
    }catch (InterruptedException e){
        e.printStackTrace();
    }
    Date d2 = new Date();
    long l1 =d2.getTime();
    System.out.println(l1);
    System.out.println(d2.getTime());

    long diff = l1-l;
    System.out.println("diff between l1 and l is "+diff);
    System.out.println("diff between l1 and l in second is "+diff/1000);

    int compare = d2.compareTo(d1);
    int compare2 = d1.compareTo(d2);
    int compare3 = d1.compareTo(d1);
    boolean isD2BeforeD1 = d2.before(d1);
    boolean isD2afterD1 = d2.after(d1);

    System.out.println(compare);
    System.out.println(compare2);
    System.out.println(compare3);
    System.out.println(isD2BeforeD1);
    System.out.println(isD2afterD1);

    //date formating

    Date d3= new Date();
    System.out.println(d3);
    System.out.println(d3.getTime());
    SimpleDateFormat sdf = new SimpleDateFormat();

}
}
