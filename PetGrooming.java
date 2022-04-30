
import java.util.Date;

public abstract class PetGrooming implements Iterator {

    private Date date;

    private String Time;

    private int numOfPet;

    private Iterator iterate;

    private float price;

    private Pet pet;

    public void showGrooming() {
    }

    public float showPrice() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public float calculatePrice(float price) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
