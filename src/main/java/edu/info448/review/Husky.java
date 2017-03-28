package edu.info448.review;

public class Husky extends Dog implements Huggable {

    public Husky() {
        this("Fido");
    }

    public Husky(String name) {
        super(name, "Husky");
    }

    public void pullSled() {
        System.out.println(this + " pulls the sled");
    }

    public void bark() {
        System.out.println(this + " says: Woof!");
    }

    public void hug() {
        System.out.println(this + "is hugged");
    }
}