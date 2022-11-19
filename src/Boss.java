public class Boss extends GameEntity {
    Weapon weapon = new Weapon();


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon() {
        this.weapon = weapon;
    }
    public String printInfo(){
        return"Health of Boss: "+getHealth()+" Damage of Boss: "+getDamage()+" Boss's weapon: "+weapon.getHUNTIMG_WEAPON();

    }
}
