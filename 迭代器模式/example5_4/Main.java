package example5_4;

/**
 * Created by RYH on 2016/12/12.
 * 迭代器模式  
 */
public class Main{
    public static void main(String [] args){
        Class obj=new Class();

        Student student1,student2,student3,student4;

        student1=new Student("张三",22,"男");
        student2=new Student("李四",21,"男");
        student3=new Student("王五",20,"男");
        student4=new Student("李静",28,"女");

        obj.addStudent(student1);
        obj.addStudent(student2);
        obj.addStudent(student3);
        obj.addStudent(student4);

        obj.displayStudents();

    }
}

