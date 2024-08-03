package academy.devdojo.devdojoacademy.javacore.ZZHpadroesdeprojetos.dominio;

public class Person {
    private String firstname;
    private String lastName;
    private String username;
    private String email;

    private Person(String firstname, String lastName, String username, String email) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class PersonBuilder {
        private String firstname;
        private String lastName;
        private String username;
        private String email;

        private PersonBuilder(){
        }



        public static PersonBuilder builder(){
            return new PersonBuilder();
        }

        public PersonBuilder firstName(String firstname){
            this.firstname = firstname;
            return this;
        }

        public PersonBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder username(String username){
            this.username = username;
            return this;
        }

        public PersonBuilder email(String email){
            this.email = email;
            return this;
        }

        public Person build(){
            return new Person(firstname, lastName, username, email);
        }


    }
    public String getFirstname() {
        return firstname;
    }



}
