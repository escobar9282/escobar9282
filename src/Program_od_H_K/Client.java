package Program_od_H_K;

public class Client {
    private String carID;
    private Car newCar;
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private int availableMoney;
    private int phoneNumber;
    private String city;
    private String country;

    private Client(Builder builder) {
        this.carID = builder.carID;
        this.newCar = builder.newCar;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gender = builder.gender;
        this.age = builder.age;
        this.availableMoney = builder.availableMoney;
        this.phoneNumber = builder.phoneNumber;
        this.city = builder.city;
        this.country = builder.country;

    }

    public String getCarID() {
        return carID;

    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public Car getNewCar() {
        return newCar;
    }

    public void setNewCar(Car newCar) {
        this.newCar = newCar;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(int availableMoney) {
        this.availableMoney = availableMoney;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static class Builder {
        private String carID;
        private Car newCar;
        private String firstName;
        private String lastName;
        private int availableMoney;

        private int age;
        private String gender;
        private int phoneNumber;
        private String city;
        private String country;

        public Builder(String carID, Car newCar, String firstName, String lastName, int availableMoney) {
            this.newCar = newCar;
            this.firstName = firstName;
            this.lastName = lastName;
            this.availableMoney = availableMoney;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Client build() {
            return new Client(this);
        }

    }
}
