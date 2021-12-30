package test;

import main.PhoneBook;
import main.PhoneNumber;
import main.PhoneNumberDetails;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    PhoneBook phoneBook;

    @BeforeEach
    void setUp() {
        phoneBook = new PhoneBook();
    }

    @Test
    void testThatAllPhoneBookMethodsWorks() {
        PhoneNumberDetails phoneNumberDetails = new PhoneNumberDetails();
        phoneNumberDetails.setEmail("test@gmail.com");
        phoneNumberDetails.setCreatedDate(LocalDate.now());
        phoneNumberDetails.setName("Ifeoluwa Oluwafemi");

        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.setPhoneNumber("07042441564");
        phoneNumber.setPhoneNumberDetails(phoneNumberDetails);

        PhoneNumber phoneNumber2 = new PhoneNumber();
        phoneNumber2.setPhoneNumber("07042441564");
        phoneNumber2.setPhoneNumberDetails(phoneNumberDetails);

        phoneBook.addAUniquePhoneNumber(phoneNumber);
        phoneBook.addAUniquePhoneNumber(phoneNumber2);
        PhoneNumber newPhoneNumber = phoneBook.getAUniquePhoneNumber("07042441564");
        System.out.println(newPhoneNumber);
        System.out.println(phoneBook.getAllPhoneNumbers());
    }

}