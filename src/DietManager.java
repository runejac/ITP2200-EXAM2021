public class DietManager {

    public boolean areCompatible(Person p, Diet d) {
        // TODO Given a Person and a Diet, return true if they are compatible, false otherwise.
        if (p.getFavouriteFood().isVegan() && d.isVegan()) {
            return true;
        }
        return false;
    }

    public Diet randomDiet(Person p, Food f[]) {

        return null;
    }
}
