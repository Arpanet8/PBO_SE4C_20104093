package percobaan;

public class AC extends Electronics{
    public AC(){

    }
    public AC(String name){
        super(name);
    }

    public void oneActivate(){
        System.out.println(this.getName() + " start cooling the room!");
    }
    public void oneDeactivate(){
        System.out.println(this.getName() + " stop cooling the room!");
    }
}
