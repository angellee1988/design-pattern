package org.lee.designpatern.prototype;

import java.util.Date;

/***
 * 测试原型模式(浅复制)
 *
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date(123123123123L);
        Sheep s1 = new Sheep("aa", date);
        Sheep s2 = (Sheep)s1.clone();
        
        System.out.println(s1.getBirthday());
        
        date.setTime(234234234L);
        
        System.out.println(s1.getBirthday());
        System.out.println(s2.getBirthday());
    }
}