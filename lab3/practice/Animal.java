package ru.mirea.lab3;

public abstract class Animal {
    public String sex;
    public abstract void live();

    public Animal(String sex) {
        this.sex = sex;
    }

}
