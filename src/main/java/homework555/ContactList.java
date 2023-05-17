package homework555;
import java.util.Objects;

    public class ContactList {
        private String name;
        private String number;

        public ContactList(String name, String number) {
            this.name = name;
            this.number = number;
        }

        public String getNumber() {
            return number;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            ContactList contact = (ContactList) o;
            return number == contact.number && Objects.equals(name, contact.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, number);
        }

        @Override
        public String toString() {
            return "Имя:" + name + ",номер телефона: " + number;
        }
    }


