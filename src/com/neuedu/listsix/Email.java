package com.neuedu.listsix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Email {
    private String name;
    private String street;//街道
    private String city;
    private String province;//省
    private String country;//国家

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return name+" "+street+" "+city+" "+province+" "+country;
    }

    public Email(String name, String street, String city, String province, String country){
        this.name=name;
        this.street=street;
        this.city=city;
        this.province=province;
        this.country=country;
    }

    public static void main(String[] args) {
        List<Email> lists = new ArrayList();
        lists.add(new Email("yezi","xijiedao","tianjin","tianjin","Chinese"));

        Iterator<Email> i = lists.iterator();
        while (i.hasNext()){
            Email e = i.next();
            System.out.println(e.toString());
        }
    }
}
