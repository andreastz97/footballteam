/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author andre
 */
public class Fan {
    private int uuid;
    private String name;    
    private int age;
    private String favouriteTeam;

    public Fan() {
    }
    

    public Fan(int uuid, String name, int age, String favouriteTeam) {
        this.uuid = uuid;
        this.name = name;
        this.age = age;
        this.favouriteTeam = favouriteTeam;
    }

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

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

    public String getFavouriteTeam() {
        return favouriteTeam;
    }

    public void setFavouriteTeam(String favouriteTeam) {
        this.favouriteTeam = favouriteTeam;
    }
    
}
