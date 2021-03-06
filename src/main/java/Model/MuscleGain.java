package Model;

/**
 * Created by Markus on 19/11/15.
 */
public class MuscleGain {

    private int weight;

    private int height;

    private int age;



    /*A method to take the weight in and check if its valid*/
    public void setWeight(int w)
    {

        if(w <= 0) {
            throw new IllegalArgumentException();
        }

        this.weight = w;
    }
    public void setHeight(int h){

        if(h <= 0){
            throw new IllegalArgumentException();
        }

        this.height = h;
    }
    public void setAge(int a)
    {
        if(a <= 0 || a>= 150) {

            throw new IllegalArgumentException();
        }
        this.age = a;
    }

    public double countKcal(int weight, int height, int age){
        double kcal = 10 * weight + 6.25 * height - 5 * age + 605;

        return kcal;
    }

    public double countProtein(double kcal){
        double protein = (kcal * 0.40)/4;

        return protein;
    }
    public double countCarb(double kcal) {

        double carbs = (kcal * .5) / 4;
        return carbs;
    }

    public double countFat(double kcal){

        double fats = (kcal * 0.1)/9;
        return fats;
    }

}
