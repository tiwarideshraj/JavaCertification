public class MyTime {
    private int amount;
    private TimeUnit unit;



    public MyTime(int amount, TimeUnit unit) {
        this.amount = amount;
        this.unit = unit;
    }



    public boolean equals(Object o)
    {

        if(o == null)
            if(this.amount == ((MyTime)o).amount) {
                return true;
            }


        return false;

    }


    @Override
    public String toString() {
        return "MyTime [amount=" + amount + ", unit=" + unit + "]";
    }





    public static void main(String[] args) {

        MyTime time1 = new MyTime(14, TimeUnit.DAY);
        MyTime time2 = new MyTime(2, TimeUnit.WEEK);
        MyTime time3 = new MyTime(8, TimeUnit.WEEK);
        MyTime time4 = new MyTime(2, TimeUnit.MONTH);

        System.out.println(time1.equals(time2)); // should be false
        System.out.println(time3.equals(time4)); // should be false
        System.out.println(time1.equals(time4)); // should be false


    }
}
