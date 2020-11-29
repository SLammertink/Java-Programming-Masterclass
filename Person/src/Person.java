public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            age = 0;
        } else {
            this.age = age;

        }
    }
    public boolean isTeen() {
        return this.age > 12 && this.age < 20;
        }

    public String getFullName(){
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return firstName;
        }else if (firstName.isEmpty()){
            return firstName;
        }
        return firstName + " " + lastName;
    }
}