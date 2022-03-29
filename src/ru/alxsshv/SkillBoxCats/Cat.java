package ru.alxsshv.SkillBoxCats;

public class Cat {
    public static int count=0;
    private double weight;
    private String name;

    // конструктор
    public Cat() {

        weight = 1500 + 3000 * Math.random();
        count++;
    }

    // бизнес методы	
    
    public static int getCount(){
        return count;
    }
    
    //методы изменения веса кошки
    public void setWeight(double catWeight) {
    
    	weight = catWeight;
    
    }
    
    public double getWeight () {
    
    	return weight;
    
    }
    
    // методы изменения имени кошки
    public String getName () {
    
    return	name; 
    	
    }
    
    public void setName (String catName) {
    	name = catName;
    }
    
    //метод копирования кошки
    public Cat catCoping () {
    	Cat e = new Cat();
    	e.name = this.name;
    	e.weight = this.weight;
    	return e;
    }
    
    // состояние кошки
    public String getStatus(){
        if (weight < 1000) {
           count--;
            return "Dead";

        } else
            if (weight > 9000) {
                count --;
                return "Exploded";

            } else
                return "playing";
    }


}
