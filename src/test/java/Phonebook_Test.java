
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


    @Test
    public void testGetContact() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Alice Johnson", "09142566752");

        phonebook.addContact(person);

        assertEquals(1, phonebook.getContact("Alice Johnson"));
        assertEquals(0, phonebook.getContact("Nonexistent Person"));
    }

    @Test
    public void testUpdateContactName() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Bob Brown", "09132589647");

        phonebook.addContact(person);

        assertEquals(1, phonebook.updateContactName("Bob Brown", "Robert Brown"));
        assertEquals("Robert Brown", phonebook.getAllContacts().get(0).getName());
        assertEquals(0, phonebook.updateContactName("Nonexistent Person", "New Name"));
    }
    @Test
    public void testUpdateContactPhoneNumber() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Charlie Chen", "09111234567");

        phonebook.addContact(person);

        assertEquals(1, phonebook.updateContactPhoneNumber("Charlie Chen", "09111234567"));
        assertEquals("09111234567", phonebook.getAllContacts().get(0).getPhone());
        assertEquals(0, phonebook.updateContactPhoneNumber("Nonexistent Person", "09111472586"));
    }
    @Test
    public void testDeleteContact() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("David Davis", "09126547812");

        phonebook.addContact(person);

        assertEquals(1, phonebook.deleteContact("David Davis"));
        assertEquals(0, phonebook.getAllContacts().size());
        assertEquals(0, phonebook.deleteContact("Nonexistent Person"));
    }

    @Test
    public void testSetAllContactsHidden() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("Eva Evans", "09111236598");

        phonebook.addContact(person);
        phonebook.setAllContactsHidden();

        assertTrue(phonebook.getAllContacts().get(0).isHidden());
    }

}
