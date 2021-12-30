package main;

import java.time.LocalDate;

public class PhoneNumberDetails{

    private String name;
    private String email;
    private LocalDate createdDate;


    public PhoneNumberDetails() {
    }

    public PhoneNumberDetails(String name, String email, LocalDate createdDate) {
        this.name = name;
        this.email = email;
        this.createdDate = createdDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "PhoneNumberDetails{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
