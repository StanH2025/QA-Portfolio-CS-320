package contact;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    void testValidContactCreation() {
        Contact contact = new Contact("John", "Doe", "1234567890", "123 Main St");
        assertNotNull(contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main St", contact.getAddress());
    }

    @Test
    void testInvalidPhoneThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("John", "Doe", "123", "123 Main St");
        });
    }

    @Test
    void testSettersEnforceValidation() {
        Contact contact = new Contact("Jane", "Doe", "1234567890", "456 Oak Ave");
        assertThrows(IllegalArgumentException.class, () -> contact.setPhone("12"));
        assertThrows(IllegalArgumentException.class, () -> contact.setAddress(null));
    }
}
