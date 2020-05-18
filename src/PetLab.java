public class PetLab {

    public static void main(String[] args) {
        // examples with Pet class
        Pet pet1 = new Pet();
        pet1.setName("Roscoe Jenkins");
        pet1.setAge(5);
        pet1.setType("Lizard");
        // print to check if getter works for age set above
        System.out.println(pet1.getName());

        // instantiate new Pet constructor with parameters
        Pet pet2 = new Pet("Captain", "dog", 1);
        // print to check that location is set to String defined in Pet class ("Zoo")
        System.out.println(pet2.getLocation());
        System.out.println(pet2.getAge());

        // examples with Circle class
        // instantiating Circle class using no args constructor
        Circle circle1 = new Circle();
        System.out.printf("The circle has radius of %f and area of %f\n", circle1.getRadius(), circle1.getArea());

        // instantiating Circle class using constructors with one or more parameters
        Circle circle2 = new Circle(2.0);
        System.out.printf("The circle has radius of %f and area of %f\n", circle2.getRadius(), circle2.getArea());

        Circle circle3 = new Circle(3.0, "blue");
        System.out.printf("The circle is %s has radius of %f and area of %f\n", circle3.getColor(),
                circle3.getRadius(), circle3.getArea());

        Circle circle4 = new Circle();
        // demonstrate how getters and setters are utilized together
        circle4.setRadius(5.5);
        circle4.setColor("green");

        // call toString() method that was created in circle
        System.out.println(circle4.toString());

    }
}
