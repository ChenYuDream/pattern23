package com.chenyu;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 测试
 *
 * @author yu_chen
 * @create 2018-01-22 11:03
 **/
public class Client {

    public static void main(String[] args) throws Exception {
        TestSingleton2 s1 = TestSingleton2.getInstance();
        TestSingleton2 s2 = TestSingleton2.getInstance();
        System.out.println(s1);
        System.out.println(s2);

        //反射初始化对象
        /*Class<?> singletonClass = Class.forName("com.chenyu.TestSingleton1");
        Constructor<?>[] declaredConstructors = singletonClass.getDeclaredConstructors();
        Constructor<?> declaredConstructor = declaredConstructors[0];
        declaredConstructor.setAccessible(true);
        TestSingleton1 o = (TestSingleton1) declaredConstructor.newInstance(null);
        System.out.println(o);*/

        /*FileOutputStream fos = new FileOutputStream("D:/a.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s1);*/


    }
}
