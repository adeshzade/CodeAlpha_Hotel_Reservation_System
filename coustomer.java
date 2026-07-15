public class Customer {

    // Static variable for auto-generating Customer IDs
    private static int idCounter = 1001;

    // Instance variables
    private int customerId;
    private String name;
    private String mobile;
    private String email;

    // Constructor
    public Customer(String name, String mobile, String email) {
        this.customerId = idCounter++;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
    }

    // Getters
    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Display Customer Details
    @Override
    public String toString() {

        return "\n========== CUSTOMER DETAILS =========="
                + "\nCustomer ID : " + customerId
                + "\nName        : " + name
                + "\nMobile      : " + mobile
                + "\nEmail       : " + email
                + "\n======================================";
    }
}
