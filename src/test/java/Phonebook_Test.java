
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
}
