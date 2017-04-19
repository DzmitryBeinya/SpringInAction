package chapter2;

/**
 * Created by dzbe1116 on 4/11/2017.
 */
public class SpELRegex {
    private boolean isValid;

    public SpELRegex(boolean isValid) {
        this.isValid = isValid;
    }

    private String address = "asdfjkasdf";

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
