package ru.alxsshv.SkillBoxCats;

public class Cat {
    public static int count=0;
    private double weight;

    public Cat() {

        weight = 1500 + 3000 * Math.random();
        count++;
    }

    public static int getCount(){
        return count;
    }
    public void setWeight(double catWeight) {
        weight = catWeight;
    }
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
