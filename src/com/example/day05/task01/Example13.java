package com.example.day05.task01;

/*
多态不仅解决了方法同名的问题。而且是的程序变得更加灵活，从而有效的提高了程序的可扩展性和可维护性。
 */
public class Example13 {
    public static void main(String[] args){
        Animal cat = new Cat();
        Animal dog = new Dog();
        aniamlShout(cat);
        aniamlShout(dog);
    }

    public static void aniamlShout(Animal an){
        an.shout();
    }
}
