package homework555;

import java.util.List;
    public class Main {
        public static void main(String[] args) {
            PhoneBook phoneBook = new PhoneBook();

            addContact(phoneBook);
            phoneBook.showAllGroups();

            String name = String.valueOf(phoneBook.searchContact("Анна Крутова"));
            System.out.println(name);

        }

        public static void addContact(PhoneBook phoneBook) {
            phoneBook.addContactToGroup(new ContactList("Иван Иванов", "8918-011-80-94"), "Семья");
            phoneBook.addContactToGroup(new ContactList("Светлана Петрова", "8918-252-77-96"), "Семья");
            phoneBook.addContactToGroup(new ContactList("Кристина Белова", "8918-404-62-82"), "Друзья");
            phoneBook.addContactToGroup(new ContactList("Анна Мусина", "8918-271-74-23"), "Работа");
            phoneBook.addContactToGroup(new ContactList("Анна Крутова", "8918-453-45-83"), "Работа");
            phoneBook.addContactToGroup(new ContactList("Анна Крутова", "8918-354-15-15"), "Друзья");
            phoneBook.addContactToGroup(new ContactList("Иван Юрин", "8918-296-47-85"), "Друзья");
            phoneBook.addContactToGroup(new ContactList("Петр Лыков", "8918-678-10-26"), "Семья");
            phoneBook.addContactToGroup(new ContactList("Павел Чернов", "8918-709-28-20"), "Работа");
            phoneBook.addContactToGroup(new ContactList("Петр Чернышов", "9918-753-27-92"), "Работа");
            phoneBook.addContactToGroup(new ContactList("Мария Федорова", "8918-024-07-09"), "Друзья");
            phoneBook.addContactToGroup(new ContactList("Марина Светлова", "8918-831-41-27"), "Работа");
            phoneBook.addContactToGroup(new ContactList("Мария Савина", "8918-155-41-47"), "Работа");
            phoneBook.addContactToGroup(new ContactList("Мария Рыкова", "8918-307-08-58"), "Работа");
            phoneBook.addContactToGroup(new ContactList("Марина Лугова", "8918-839-63-84"), "Работа");
            phoneBook.addContactToGroup(new ContactList("Анна Владимирова", "8918-156-27-31"), "Работа");
            phoneBook.addContactToGroup(new ContactList("Иван Мечников", "8918-156-27-31"), "Работа");
            phoneBook.addContactToGroup(new ContactList("Петр Петин", "8918-873-01-82"), "Друзья");
            phoneBook.addContactToGroup(new ContactList("Иван Ежов", "8918-995-75-46"), "Семья");

        }

        public static void searchByGroup(PhoneBook phoneBook, String group) {
            List<ContactList> list = phoneBook.searchGroup(group);
            int i = 1;
            try {
                for (ContactList contact : list) {
                    System.out.println(i + "." + contact);
                    i++;
                }
            } catch (NullPointerException e) {
                System.out.println("Данной группы нет в списке");
            }
        }

    }


