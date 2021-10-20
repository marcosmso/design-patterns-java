public class Light {

    String id;

    public Light (String id) {
        this.id = id;
    }

    public void on(){
        System.out.println("Turn "+ id + " Light ON");
    }

    public void off(){
        System.out.println("Turn " + id + " Light OFF");
    }
}
