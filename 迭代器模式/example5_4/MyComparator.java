package example5_4;

import java.util.Comparator;

/**
 * Created by RYH on 2016/12/12.
 */
public class MyComparator implements Comparator<Object> {
    public int compare(Object obj1,Object obj2){
        Student s1=(Student) obj1;
        Student s2=(Student) obj2;

        if(s1.getSage()<s2.getSage()){
            return 1;
        }
        else{
            return 0;
        }
    }
}
