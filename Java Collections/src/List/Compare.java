package List;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

class Name implements Comparable<Name>{
    private String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Name o) {//class name
        if(name.length()==o.name.length())
            return 0;
        else if(name.length()>o.name.length())
            return 1;
        else
            return -1;
    }
    @Override
    public String toString(){
        return name;
    }
}
public class Compare {
    public static void main(String[] args) {
        int result;
        List<String> l1=new LinkedList<>();
        l1.add("a");
        result=l1.get(0).compareTo("a");
        //        1                  2
        /*
        1==2 0  1>2  1     1<2  -1
         */
        System.out.println(result);
        System.out.println("---------------------------");
        String a="abc";
        String b="xyz";
        System.out.println(a.compareTo(b));

        List names = new LinkedList();
        names.add(new Name("mike"));
        names.add(new Name("Will"));
        names.add(new Name("Jane"));

        System.out.println(names);
        names.sort(null);
        System.out.println(names);

    }
}
