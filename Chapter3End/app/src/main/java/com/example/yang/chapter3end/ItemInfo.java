package com.example.yang.chapter3end;

import java.io.Serializable;

/**
 * Created by yang on 2018/6/11.
 */

public class ItemInfo implements Serializable {
    private String name;
    private int acctack;
    private int life;
    private int speed;
    public ItemInfo(String name, int acctack, int life, int speed){
        this.name = name;
        this.acctack = acctack;
        this.life = life;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcctack() {
        return acctack;
    }

    public void setAcctack(int acctack) {
        this.acctack = acctack;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
