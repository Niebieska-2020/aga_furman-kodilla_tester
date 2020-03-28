public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        User agnieszka = new User("Agnieszka", 35);
        User tomasz = new User("Tomasz", 42);
        User marian = new User("Marian", 37);
        User anna = new User("Anna", 30);
        User ewa = new User("Ewa", 34);

        User[] users = new User[]{agnieszka, tomasz, marian, anna, ewa};

        int totalAge;
        int averageOfAge = 0;
        totalAge = 0;
        averageOfAge = 0;
        for (int i = 0; i < users.length; i++) {
            totalAge = totalAge + users[i].age;
         }
        averageOfAge = totalAge / users.length;

        for (int a = 0; a < users.length; a++) {
            if (users[a].age <averageOfAge) {
                System.out.println(users[a].name);
            }
        }
    }
}