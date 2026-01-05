package com.guild.roles.Role;

public class Role {

    private String name;
    private Integer age;
    private String race;
    private Double mana;

    public Role() {
        this.name = "Unknown";
        this.age = null;
        this.race = "Unknown";
        this.mana = 0.0;
    }

    public Role(String name, Integer age, String race, Double mana) {
        this.name = name;
        this.age = age;
        this.race = race;
        this.mana = mana;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public Double getMana() {
        return mana;
    }

    public void setMana(Double mana) {
        this.mana = mana;
    }

    public void performAction() {
        System.out.println(name + " is performing a magical action.");
    }
}
