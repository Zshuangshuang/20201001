package java10_01;

import java.util.Arrays;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-01
 * Time:10:10
 **/

class Person{
    String name;
    int age;
    public void eat(){
        System.out.println("eat()!");
    }
    public void sleep(){
        System.out.println("sleep()!");
    }
}
public class TestDemo {

    public static void main(String[] args) {
        Person person = new Person();
        person.eat();
    }

    public static void main1(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
       /* for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j]+"   ");
            }
            System.out.println();
        }*/
        /*System.out.println(Arrays.deepToString(array));*/
        for (int[] array1: array) {
            for (int x:array1) {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
