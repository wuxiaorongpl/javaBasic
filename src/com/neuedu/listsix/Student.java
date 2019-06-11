package com.neuedu.listsix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private int score;
    private String classNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    Student(String name, int age, int score, String classNum) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.classNum = classNum;
    }

    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(new Student("Tom", 18, 100, "class05"));
        list1.add(new Student("Jerry", 22, 70, "class04"));
        list1.add(new Student("Owen", 25, 90, "class05"));
        list1.add(new Student("Jim", 30, 80, "class05"));
        list1.add(new Student("Steve", 28, 66, "class06"));
        list1.add(new Student("Kevin", 24, 100, "class04"));

        int ageAver = AgeAver(list1);
        System.out.println("年龄平均数" + ageAver);

        int scoreAver = ScoreAver(list1);
        System.out.println("分数平均数"+scoreAver);
    }

    private static int AgeAver(List list1) {
        int ageSum = 0;
        int ageAver;
        for (Object o : list1
        ) {
            Student s = (Student) o;
            ageSum += s.getAge();//年龄的总和
        }
        ageAver = ageSum / list1.size();
        return ageAver;
    }

    private static int ScoreAver(List list1) {
        int scoreSum = 0;
        int scoreAver;
        for (Object o:list1
             ) {
            Student s = (Student) o;
            scoreSum += s.getScore();//分数的总和
        }
        scoreAver = scoreSum / list1.size();
        return scoreAver;
    }






}
