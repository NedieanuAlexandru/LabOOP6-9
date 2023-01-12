import one.Car;
import one.CommonVehicle;
import one.Tractor;
import three.Car2;
import three.Driver;
import two.Group;
import two.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 7.1
        /*CommonVehicle toyota = new CommonVehicle("Toyota");
        System.out.println(toyota.displayTires(toyota.getBrand()));
        toyota.remove1Tire();
        System.out.println(toyota.displayTires(toyota.getBrand()));
        toyota.change1Tire("Toyota", "Winter");

        System.out.println("------------------------------------------");

        Tractor johnDeere = new Tractor("John Deere");
        System.out.println(johnDeere.displayTires(toyota.getBrand()));
        johnDeere.remove1Tire();
        System.out.println(johnDeere.displayTires(toyota.getBrand()));
        johnDeere.change1Tire("John Deere", "Summer");*/

        // 7.2
/*
        Student ionut = new Student("Ionut", 20);
        Student gabriel = new Student("Gabriel", 21);
        Student francesca = new Student("Francesca", 20);

        Group lecturaUniversala = new Group("Lectura Universala");
        lecturaUniversala.addStudent(ionut);
        lecturaUniversala.addStudent(francesca);
        lecturaUniversala.displayAllStudents();

        System.out.println("----------------------------------");

        Group sport = new Group("Sport");
        sport.addStudent(gabriel);
        sport.addStudent(ionut);
        sport.displayAllStudents();

        System.out.println("----------------------------------");

        // 2 requirement => To display all groups with all students
        List<Group> groups = new ArrayList<>();
        groups.add(lecturaUniversala);
        groups.add(sport);
        for(Group group: groups) {
            System.out.println(group.getLecture());
            group.displayAllStudents();
        }
*/

        // 7.3
        Driver marcel = new Driver("Marcel", 10);
        Driver dorel = new Driver("Dorel", 2);

        Car2 mustang = new Car2("Mustang", 5000, marcel);
        marcel.setCar(mustang);
        marcel.hasCar();

        System.out.println("----------------------------------");

        marcel.sellCar();
        marcel.hasCar();

        System.out.println("----------------------------------");
        Car2 logan = new Car2("Dacia Logan", 12050, dorel);
        dorel.setCar(logan);
        dorel.hasCar();
        dorel.getNewCar(mustang);



    }
}
