package com.lix.domain;

import lombok.Data;

import java.util.Objects;


public class User {
    String name;
    int k;
    String sd ;

    public User(String name, int k, String sd) {
        this.name = name;
        this.k = k;
        this.sd = sd;
    }

    public User() {
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public String getSd() {
        return sd;
    }

    public void setSd(String sd) {
        this.sd = sd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", k=" + k +
                ", sd='" + sd + '\'' +
                '}';
    }

    /* @Override
          public boolean equals(Object o) {
              if (this == o) return true;
              if (o == null || getClass() != o.getClass()) return false;
              User user = (User) o;
              return k == user.k &&
                      name.equals(user.name) &&
                      sd.equals(user.sd);
          }
      */
   /* @Override
    public int hashCode() {
        return Objects.hash(name, k, sd);
    }*/
    public static void init(String k) {
        System.out.println("GG");
    }

    static {
        init("777");
    }
}



