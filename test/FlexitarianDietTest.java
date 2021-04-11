import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

public class FlexitarianDietTest {
    ArrayList<Food> allowedInFlexitarian = new ArrayList<>();


    @Before
    public void setUp() throws Exception {
    Food flexitarianFood1 = new Food("Tomahawk", 160, false, FoodType.Protein);
    Food flexitarianFood2 = new Food("Tofu", 76, true, FoodType.Protein);
    Food flexitarianFood3 = new Food("Green peas", 81, true, FoodType.Protein);
    Food flexitarianFood4 = new Food("Trout", 140, false, FoodType.Protein);
    Food flexitarianFood5 = new Food("Butter", 716, false, FoodType.Fat);
    Food flexitarianFood6 = new Food("Rice", 130, true, FoodType.Carb);

    allowedInFlexitarian.add(flexitarianFood1);
    allowedInFlexitarian.add(flexitarianFood2);
    allowedInFlexitarian.add(flexitarianFood3);
    allowedInFlexitarian.add(flexitarianFood4);
    allowedInFlexitarian.add(flexitarianFood5);
    allowedInFlexitarian.add(flexitarianFood6);
    }

    // TODO The preferred meat in a FlexitarianDiet MUST be non-vegan food of protein type.
    @Test
    public void requirement1_d () {
        Food tomahawk = new Food("Tomahawk", 160, false, FoodType.Protein);
        FlexitarianDiet flexitarianDiet1 = new FlexitarianDiet("Jonas", 23, "Non-vegan protein food", allowedInFlexitarian, false, 8000, tomahawk);

        if(flexitarianDiet1.getPreferredMeat().isVegan()){
            throw new IllegalArgumentException("The preffered meat in FlexitarianDiet is VEGAN! DO NOT EAT");
        } else if (tomahawk.getType() != FoodType.Protein) {
            throw new IllegalArgumentException("The preffered meat in FlexitarianDiet is NOT of FoodType Protein, DO NOT EAT");
        } else {
            System.out.println("The preffered meat in FlexitarianDiet is not vegan, EAT! :D");
        }
    }
}