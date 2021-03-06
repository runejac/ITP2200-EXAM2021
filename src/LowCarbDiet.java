import java.util.ArrayList;

public class LowCarbDiet extends Diet{
    private float minWeightKg;

    public LowCarbDiet(String name, int daysDuration, String purpose,
                       ArrayList<Food> allowedFood,
                       boolean isVegan, float minWeightKg) {
        super(name, daysDuration, purpose, allowedFood, isVegan);
        this.minWeightKg = minWeightKg;
    }

    public float getMinWeightKg() {
        return minWeightKg;
    }

    public boolean lessThanTwoCarbsOrNot() throws IllegalArgumentException {
        int i = 0;
        for (Food f : getAllowedFood()) {
            if (f.getType().equals(FoodType.CARB)) {
                i = i + 1;
                if (i >= 3) {
                    System.out.println("You can not have more than two types of carb in a low carb diet");
                    throw new IllegalArgumentException();
                }
            }
        }
        return true;
    }
}
