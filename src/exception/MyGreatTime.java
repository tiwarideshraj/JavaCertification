package exception;

public class MyGreatTime {
    private int minutes = 0;



    public int getMinutes() {
        return minutes;
    }



    public void setMinutes(int minutes) throws ValueException{

        if(80 < minutes)
        {
            throw new ValueException("try to time set 80 mintues");
        }

        this.minutes = minutes;
    }


}
