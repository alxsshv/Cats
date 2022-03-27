package ru.alxsshv.SkillBoxCats;

public class Loader {
    public static void main (String [] args){

        Cat vasia = new Cat();
        Cat murka = new Cat();
        Cat liska = new Cat();

        murka.setWeight(10000);

        vasia.setWeight(5000);

        System.out.println(murka.getStatus());

        System.out.println("Всего создано кошек " + Cat.getCount());

    }
}
