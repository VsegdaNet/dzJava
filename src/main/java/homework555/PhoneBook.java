package homework555;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

    public class PhoneBook {
        private final Map<String, List<ContactList>> phoneBookMap = new HashMap<>();

        public void addNewGroup(String nameGroup) {
            if (!phoneBookMap.containsKey(nameGroup))
                phoneBookMap.put(nameGroup, new ArrayList<>());
        }

        public void addContactToGroup(ContactList contact, String group) {
            String[] strGroup = group.split(",");
            for (String s : strGroup) {
                addNewGroup(s);
                if (!phoneBookMap.get(s).contains(contact))
                    phoneBookMap.get(s).add(contact);
            }
        }

        public ContactList searchContact(String name) {
            System.out.println("\nПоиcк по Имени: " + name);
            StringBuilder sb = new StringBuilder();
            for (List<ContactList> contactList : phoneBookMap.values()) {
                for (ContactList contact : contactList) {
                    if (contact.getName().equals(name)) {
                        sb.append(contact);
                        return contact;
                    }
                }
            }
            System.out.println("Контакта нет в справочнике!");
            return null;
        }

        public List<ContactList> searchGroup(String group) {
            System.out.println("\nВсе контакты группы: " + group);
            return new ArrayList<>(phoneBookMap.get(group));
        }

        public void showAllGroups() {
            System.out.println("ТЕЛЕФОННЫЙ СПРАВОЧНИК по группам");
            for (Map.Entry<String, List<ContactList>> entryMap : phoneBookMap.entrySet()) {
                System.out.println("Группа: " + entryMap.getKey());
                showContacts(entryMap.getValue());
            }
        }

        public void showContacts(List<ContactList> contactList) {
            int i = 1;
            for (ContactList contact : contactList) {
                System.out.println(i + "." + contact);
                i++;
            }
            System.out.println();
        }


    }



