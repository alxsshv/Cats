package ru.alxsshv.SkillBoxCats;

public class Loader {
    public static void main (String [] args){

        Cat vaska;
    	Cat vasia = new Cat();
        Cat murka = new Cat();
        Cat liska = new Cat();

        murka.setWeight(10000);
        murka.setName("Мурка");
       
        vaska = murka.catCoping();
        vaska.setName("Васька");
        
        vasia.setWeight(5000);

        System.out.println("Имя " + murka.getName() + " вес " + murka.getWeight());
        
        System.out.println("Имя " + vaska.getName() + " вес " + vaska.getWeight());

        System.out.println("Всего создано кошек " + Cat.getCount());

    }
}
