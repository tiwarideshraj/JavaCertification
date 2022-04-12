public class ArrayPractical {
     int [] valueArray = {2,3,4,5,6};

    public void arraySum() {
        int i=0,sum = 0;
        for(i=0;i<valueArray.length;i++){

        if (valueArray[i]%2==0){
            sum = sum + valueArray[i];
        }
        }
        // calculate sum here.
        // access the length of array :  valueArray.length
        // access an element of array : valueArray[i]


        System.out.println(sum);   // this will print the value of sum to screen.

    }
}
