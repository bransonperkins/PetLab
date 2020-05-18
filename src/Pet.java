public class Pet {
    private String name, type;
    // All animals will live at the zoo
    private String location = "Zoo";
    private int age;

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // no-arg constructor
    public Pet() {
        this.name = "Charlie";
        this.type = "cat";
        this.age = 6;
    }

    public Pet(String name, String type, int age){
        this.name = name;
        this.type = type;
        this.age = age;
    }

}
