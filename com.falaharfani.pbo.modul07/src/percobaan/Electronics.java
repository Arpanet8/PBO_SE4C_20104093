package percobaan;

public class Electronics {
    private String name;
    private boolean isActivated = false;

    public Electronics(){
        this.name = "A Device";
        System.out.println(this.getName() + " has been spawned!");
    }

    public Electronics(String name){
        this.name = name;
        System.out.println(this.getName() + " has been spawned!");
    }
    public String getName(){
        return name;
    }


    public void activate(){
        this.isActivated = true;
        System.out.println(this.getName() + "has been actvated!");
        this.oneActivate();
    }

    public void deactivate(){
        this.isActivated = false;
        System.out.println(this.getName() + " has been deactivated!");
        this.oneDeactivate();
    }
    public void oneActivate(){}
    public void oneDeactivate(){}
}
