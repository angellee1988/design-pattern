package org.lee.designpatern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Client2 {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Date date = new Date(123123123123L);
        Sheep s1 = new Sheep("aa", date);
        System.out.println(s1);
        System.out.println(s1.getSname());
        System.out.println(s1.getBirthday());
//        Sheep s2 = (Sheep)s1.clone();
        //使用序列化和反序列化实现深复制
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(s1);
        byte[] bytes = bos.toByteArray();
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);
        Sheep s2 = (Sheep)ois.readObject();  //克隆好的对象
        
        date.setTime(234234234L);  
        
        System.out.println(s1.getBirthday());
        System.out.println(s2.getBirthday());
    }
}