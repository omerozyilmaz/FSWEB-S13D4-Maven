package org.example;

public enum Weapon {
    SWORD(50,1.2),
    KNIFE(20,1.9),
    BOW(30,4),
    STAFF(80,1);
        private int damage;
        private double attackSpeed;

    Weapon (int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed= attackSpeed;
    }
    public int getDamage(){
        return damage;
    }
    public  double getAttackSpeed(){
        return  attackSpeed;
    }
}
