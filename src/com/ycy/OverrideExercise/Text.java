package com.ycy.OverrideExercise;

public class Text {
    public static void main(String[] args) {
       People[] people = new People[3];
       for (int i = 0; i < people.length; i++) {
           people[i] = new People("javl",10 + i,"worker");
       }
       for (int i = 0; i < people.length - 1; i++) {
           for (int j = 0; j < people.length - 1 - i; j++) {
               int temp =  0;
                if(people[j].getAge() > people[j + 1].getAge()){
                    temp =  people[j].getAge();
                    people[j].setAge(people[j + 1].getAge());
                    people[j + 1].setAge(temp);

                }

           }
       }
    }
    }




