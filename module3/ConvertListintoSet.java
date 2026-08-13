package module3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListintoSet {
public static void main(String[] args) {
	List<String> s1=        new ArrayList<String>();
    s1.add("Salin");
    s1.add("Salin");
    s1.add("Ravati");
    s1.add("Krishna");
    s1.add("Gowtham");
    s1.add("Manish");
    System.out.println(s1);
    
    Set<String> list=new HashSet<String>(s1);
    list.add("Bhagyesh");
    list.add("Bhagyesh");

    System.out.println(list);
    
}
}
