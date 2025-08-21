package contact;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {

    @Test
    void testAddAndRetrieveContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("Sam", "Smith", "1112223333", "789 Pine St");
        service.addContact(contact);
        assertEquals(contact, service.getContact(contact.getContactId()));
    }

    @Test
    void testDeleteContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("Lisa", "Ray", "9998887777", "234 Elm Rd");
        service.addContact(contact);
        service.deleteContact(contact.getContactId());
        assertThrows(IllegalArgumentException.class, () -> service.getContact(contact.getContactId()));
    }

    @Test
    void testUpdateContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("Amy", "Lee", "7776665555", "987 Cedar Blvd");
        service.addContact(contact);
        service.updateFirstName(contact.getContactId(), "Anna");
        assertEquals("Anna", service.getContact(contact.getContactId()).getFirstName());
    }
}
