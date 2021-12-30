package main;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PhoneBook {

    private final Set<PhoneNumber> phoneNumbers = new HashSet<>();


    public void addAUniquePhoneNumber(PhoneNumber phoneNumber){
        phoneNumbers.add(phoneNumber);
    }

    public PhoneNumber getAUniquePhoneNumber(String phoneNumber){
        PhoneNumber existingPhoneNumber = new PhoneNumber();
        for (PhoneNumber phoneNumber1 : phoneNumbers){
            if (phoneNumber1.getPhoneNumber().equals(phoneNumber)){
                existingPhoneNumber = phoneNumber1;
            }
        }
        return existingPhoneNumber;
    }

    public Set<PhoneNumber> getAllPhoneNumbers(){
        return this.phoneNumbers;
    }
}

