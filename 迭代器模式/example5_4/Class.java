package example5_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by RYH on 2016/12/12.
 * 
 */
public class Class {
    private ArrayList<Student> students=new ArrayList<Student>();

    public void addStudent(Student student){
        students.add(student);
    }

    public void displayStudents(){
        Comparator<Object> comp =new MyComparator();
        Collections.sort(students,comp);
        Iterator<Student> i=students.iterator();
        
        while(i.hasNext()){
            Student student=(Student)i.next();
            System.out.println("ĞÕÃû:"+student.getSname()+",ÄêÁä£º"+student.getSage());
        }

    }
}
