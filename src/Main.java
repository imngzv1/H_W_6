public class Main {
    public static void main(String[] args) {

        Boss boss=new Boss();
        boss.setHealth(100);
        boss.setDamage(10);


        System.out.println("Health of Boss: "+boss.getHealth()+" Damage of Boss: "+boss.getDamage()+" Boss's weapon: "+boss.weapon.getCOLD_WEAPON());

        // Вызов через метод:
        boss.setHealth(100);
        boss.setDamage(500);

        System.out.println(boss.printInfo());

//Экземпляр первого скелета:
        Sceleton sceleton=new Sceleton();
        sceleton.setHealth(50);
        sceleton.setDamage(5);
        sceleton.setArrowsNumbers(20);

        System.out.println(sceleton.printInfo());
//Экземпляр второго скелета:
        sceleton.setHealth(60);
        sceleton.setDamage(6);
        sceleton.setArrowsNumbers(17);
        System.out.println(sceleton.printInfo());


    }

}