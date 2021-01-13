<<<<<<< HEAD
package week5;

public class MainApplication {
    public static void main(String[] args){
        NerfGun gun1=new NerfGun();
        gun1.fire();
        gun1.reload(15);
        gun1.fire();
        gun1.fire();
        gun1.displayNumOfAmmunition();
        gun1.reload(2);
        gun1.displayNumOfAmmunition();
        gun1.displayGunID();

        NerfGun gun2=new NerfGun(15);
        gun2.displayGunID();
        gun2.fire();
        gun2.displayNumOfAmmunition();
        gun2.reload(2);
        gun2.displayNumOfAmmunition();
    }

=======
package week5;

public class MainApplication {
    public static void main(String[] args){
        NerfGun gun1=new NerfGun();
        gun1.fire();
        gun1.reload(15);
        gun1.fire();
        gun1.fire();
        gun1.displayNumOfAmmunition();
        gun1.reload(2);
        gun1.displayNumOfAmmunition();
        gun1.displayGunID();

        NerfGun gun2=new NerfGun(15);
        gun2.displayGunID();
        gun2.fire();
        gun2.displayNumOfAmmunition();
        gun2.reload(2);
        gun2.displayNumOfAmmunition();
    }

>>>>>>> 7e14495dd3af715cbcd539a4dbfe30943cd6c072
}