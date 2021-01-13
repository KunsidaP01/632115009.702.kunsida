<<<<<<< HEAD
package week5;
public class NerfGun{
    /* 632115009 Kunsida Phitakham*/
    private int gunID;
    private int ammunition;
    private int reload;
    private int maxAmmunition;
   
    public NerfGun(){
        gunID=1;
        ammunition=0;
    }
    public NerfGun(int userReload){
        gunID=2;
        reload=0;
        maxAmmunition=0;
        ammunition+=userReload;
    }
    
    public void reload(int userReload){
        ammunition+=userReload;
        if(ammunition>15){
            reload=userReload;
            maxAmmunition=ammunition-reload;
        }
    } 
    public void fire(){
        if(ammunition<=0){
            System.out.println("There is no ammunition");
        }
        else if(ammunition>0){
            System.out.println("BANG !!!");
            ammunition -= 1;    
        }
    }
    public void displayNumOfAmmunition(){
        if(ammunition<=0){
            System.out.println("There is no ammunition");
        }
        else if(ammunition>0 && ammunition<=15){
            System.out.println(ammunition+" bullet left");
        }
        else if(ammunition>15){
            System.out.println("Error!! the ammunition is overload");
            System.out.println(maxAmmunition+" bullet left");
        }
    }
      public void displayGunID(){
        System.out.println("The ID of this gun is "+gunID);

    }
=======
package week5;
public class NerfGun{
    /* 632115009 Kunsida Phitakham*/
    private int gunID;
    private int ammunition;
    private int reload;
    private int maxAmmunition;
   
    public NerfGun(){
        gunID=1;
        ammunition=0;
    }
    public NerfGun(int userReload){
        gunID=2;
        reload=0;
        maxAmmunition=0;
        ammunition+=userReload;
    }
    
    public void reload(int userReload){
        ammunition+=userReload;
        if(ammunition>15){
            reload=userReload;
            maxAmmunition=ammunition-reload;
        }
    } 
    public void fire(){
        if(ammunition<=0){
            System.out.println("There is no ammunition");
        }
        else if(ammunition>0){
            System.out.println("BANG !!!");
            ammunition -= 1;    
        }
    }
    public void displayNumOfAmmunition(){
        if(ammunition<=0){
            System.out.println("There is no ammunition");
        }
        else if(ammunition>0 && ammunition<=15){
            System.out.println(ammunition+" bullet left");
        }
        else if(ammunition>15){
            System.out.println("Error!! the ammunition is overload");
            System.out.println(maxAmmunition+" bullet left");
        }
    }
      public void displayGunID(){
        System.out.println("The ID of this gun is "+gunID);

    }
>>>>>>> 7e14495dd3af715cbcd539a4dbfe30943cd6c072
}