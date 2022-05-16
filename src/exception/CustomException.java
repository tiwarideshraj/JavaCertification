package exception;

public class CustomException {
    public static void main(String[] args) {
// TODO Auto-generated method stub



        MyGreatTime pc = new MyGreatTime();
        try {

            pc.setMinutes(1000);

        } catch (ValueException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(pc.getMinutes());
        }


    }


}
