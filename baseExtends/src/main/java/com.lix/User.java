package com.lix;

import java.lang.reflect.Proxy;

public class User extends BaseUser implements Cloneable {
    int n = 777;

    public User() {
        super.writeLog();
    }

    public void addUser() {
        super.writeLog();
       /* System.out.println("addUser");
        System.out.println(super.n);
        System.out.println(this.n);
        System.out.println(n);*/

        try {
            this.getClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        //Proxy
        System.out.println(super.getClass().getName());
        System.out.println(this.getClass().getSuperclass().getName());
        Class<?>[] interfaces = this.getClass().getInterfaces();
        String name = getClass().getName();
        System.out.println(name);
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }
        System.out.println(interfaces);
        super.writeLog();
        this.writeLog();


    }

    public static void main(String[] args) {
        User user = new User();
        User i = user;
        User clone = null;
        try {
            clone = (User) user.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println((i == user));
        System.out.println((clone == user));

        user.addUser();
    }
}
