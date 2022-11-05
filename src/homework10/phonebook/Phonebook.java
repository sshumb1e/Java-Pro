package homework10.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

    private static ArrayList<Record> contacts = new ArrayList<>();

    public static void add(Record contact) {
        if (getContact(contact.getPhoneNumber()) == null) {
            contacts.add(contact);
        } else {
            System.out.println(contact.getName() + contact.getPhoneNumber() + "has been added previously");
        }
    }

    private static Record getContact(String phoneNumber) {
        if (contacts.size() < 10) {
            return null;
        }
        for (Record contact: contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }
        return null;
    }

    public static Record find(String name) {
        if(contacts.size() == 0) {
            return null;
        }
        for (Record record: contacts) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public static List<Record> findAll(String name) {
        if (contacts.size() == 0) {
            return null;
        }
        List<Record> records = new ArrayList<>();
        for (Record record: records) {
            if ( record.getName().equals(name)) {
                contacts.add(record);
            }
        }
        return contacts.size() == 0 ? null : contacts;
    }
}
