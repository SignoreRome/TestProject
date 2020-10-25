package com.company;

public class Dog {
    private int ageDog;
    private String nameDog;

    public Dog(int ageDog, String nameDog) {
        this.ageDog = ageDog;
        this.nameDog = nameDog;
    }

    public int getAgeDog() {
        return ageDog;
    }

    public void setAgeDog(int ageDog) {
        this.ageDog = ageDog;
    }

    public String getNameDog() {
        return nameDog;
    }

    public void setNameDog(String nameDog) {
        this.nameDog = nameDog;
    }

    public void printDog(){
        System.out.println("Псу по кличке "+getNameDog()+" исполнилось "+getAgeDog());
    }

}
