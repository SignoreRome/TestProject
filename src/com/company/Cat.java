package com.company;

public class Cat {
    private int ageCat;
    private String nameCat;

    public Cat(int ageCat, String nameCat) {
        this.ageCat = ageCat;
        this.nameCat = nameCat;
    }

    public int getAgeCat() {
        return ageCat;
    }

    public void setAgeCat(int ageCat) {
        this.ageCat = ageCat;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }
    public void printCat(){
        System.out.println("Коту по имени "+getNameCat()+" исполнилось "+getAgeCat());
    }
}
