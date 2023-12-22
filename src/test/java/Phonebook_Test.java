
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Phonebook_Test {

    @Test
    public void testAddContact() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("John Doe", "123-456-7890");

        phonebook.addContact(person);

        assertTrue(phonebook.getAllContacts().contains(person));
    }
    @Test
    public void testGetPhoneNumber() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Jane Smith", "09121256454");

        phonebook.addContact(person);

        assertEquals("09121256454", phonebook.getPhoneNumber("Jane Smith"));
        assertEquals("Contact Not Found", phonebook.getPhoneNumber("Nonexistent Person"));
    }
}
