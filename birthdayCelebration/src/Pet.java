public class Pet {
    private String name;
    private String birthAge;

    public String getName() {
        return name;
    }

    public String getBirthAge() {
        return birthAge;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthAge(String birthAge) {
        this.birthAge = birthAge;
    }

    public Pet(String name, String birthAge) {
        this.name = name;
        this.birthAge = birthAge;
    }
}
