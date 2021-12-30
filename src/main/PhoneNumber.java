package main;

public class PhoneNumber {

   private String phoneNumber;
    private PhoneNumberDetails phoneNumberDetails;

    public PhoneNumber() {
    }

    public PhoneNumber(String phoneNumber, PhoneNumberDetails phoneNumberDetails) {
        this.phoneNumber = phoneNumber;
        this.phoneNumberDetails = phoneNumberDetails;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumberDetails getPhoneNumberDetails() {
        return phoneNumberDetails;
    }

    public void setPhoneNumberDetails(PhoneNumberDetails phoneNumberDetails) {
        this.phoneNumberDetails = phoneNumberDetails;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", phoneNumberDetails=" + phoneNumberDetails +
                '}';
    }
}
