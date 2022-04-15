import java.util.*;

public class Customer extends ArrayPractical{
    int id;
    String name, surname, isLicensed, gender;
    int seats [][];
    int [] valueArray = {2,5,6};

        @Override
        public void arraySum() {
            int i=0,sum = 0;
            for(i=0;i<valueArray.length;i++){

                if (valueArray[i]+2==0){
                    sum = sum + valueArray[i];
                }
            }
            // calculate sum here.
            // access the length of array :  valueArray.length
            // access an element of array : valueArray[i]
            System.out.println(sum);   // this will print the value of sum to screen.

        }

    public void main1(){
        String a = "Andrew";
        String b = "Andrew";

        if(a.equals(b)){   //checking the equality of objects using equals() methods
            System.out.println("a & b are equal variables, and their respective " +
                    "hashvalues are:" + " "+ a.hashCode() + " & " + b.hashCode());
        }
        String c = "Maria";
        String d= "Julie";

        if(!c.equals(d)){    //checking  the equality of objects using equals() method
            System.out.println("\nc & d are Un-equal variables, and their " +
                    "respective hashvalues are:" + " "+ c.hashCode() + " & " + d.hashCode());
        }
    }

    public void main() {
        Map map = new HashMap();
        //Adding elements to map
        map.put(1, "Amit");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");
        //Traversing Map
        Set set = map.entrySet();//Converting to Set so that we can traverse
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
        public void mainVoid() {
            // creating LinkedHashSet using the Set
            Set<String> data = new LinkedHashSet<String>();

            data.add("JavaTpoint");
            data.add("Set");
            data.add("Example");
            data.add("Set");

            System.out.println(data);
        }
}

