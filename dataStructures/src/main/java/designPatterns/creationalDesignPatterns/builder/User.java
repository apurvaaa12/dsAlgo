package designPatterns.creationalDesignPatterns.builder;

public class User {
    private String name;
    private int age;

    public User(UserBuilder userBuilder) {
        this.name = name;
        this.age = age;
    }

    public static class UserBuilder {
        private String name;
        private int age;

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

