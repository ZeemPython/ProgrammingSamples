//#######your code starts here.


class Critter {

    String sound;
    public void sound() {

    }
}

class Insect extends Animal {

    public void sound() {
        System.out.println("some sound");
    }
}

class Animal extends Mammal {

    public void sound() {
        System.out.println("some sound");

    }
}

class Cricket extends Insect {
    public void sound() {
        System.out.println("when you wish upon a star");
    }
}

class Mammal extends Critter {

    public void sound() {
        System.out.println("some sound");
    }
}

class Dog extends Critter {
    public void sound() {

        System.out.println("bark!");
    }
}

class Cat extends Critter {

    public void sound() {

        System.out.println("some sound");
    }

}

class Person extends Animal {
    public void sound() {
        System.out.println("hello world!");
    }
}

class DomesticCat extends Cat {
    public void sound() {
        System.out.println("meaow");
    }
}

class Lion extends Critter {
    public void sound() {

        System.out.println("roar!");
    }
}
//you can change anything in this area.  If you change
//anything outside of this area the Test will fail
//for some problems you may need to create other files in addition to this one

//#######your code ends here

//don't change anything here!! not even a space
public class Polymorph{
    public static void main(String[] aaa){
        Person mary = new Person();
        Cricket jiminy = new Cricket();
        Dog lassie = new Dog();
        Cat figaro = new DomesticCat();
        Lion nala = new Lion();
        Critter [] arrayOfCritters = {mary, jiminy, lassie, figaro,nala};
        System.out.println("mary instanceof Person: " + (mary instanceof Person));
        System.out.println("mary instanceof Mammal: " + (mary instanceof Mammal));
        System.out.println("mary instanceof Animal: " + (mary instanceof Animal));
        System.out.println("mary instanceof Critter: " + (mary instanceof Critter));
        System.out.println("jiminy instanceof Cricket: " + (jiminy instanceof Cricket));
        System.out.println("jiminy instanceof Insect: " + (jiminy instanceof Insect));
        System.out.println("jiminy instanceof Animal: " + (jiminy instanceof Animal));
        System.out.println("jiminy instanceof Critter: " + (jiminy instanceof Critter));
        for(Critter cc : arrayOfCritters){
            cc.sound();
        }
    }
}
