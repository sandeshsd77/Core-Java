package AccessSpecifier;

public class Customer {
    private int customerId;
    private String customerName;

    private void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    private void setCustomerName(String setCustomerName) {
        this.customerName = setCustomerName;
    }

    void m1(int customerId) {
        System.out.println(customerId);
    }

    void m2(String customerName) {
        System.out.println(customerName);
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

}
