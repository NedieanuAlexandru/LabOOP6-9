package three;

import java.util.Arrays;
import java.util.List;

public class Ex3 {

    static class Person {
        private int age;
        public Person(int age) {
            this.age = age;
        }
        public int getAge() {
            return age;
        }
    }

    static class Car {
        private int age;
        public Car(int age) {
            this.age = age;
        }
        public int getAge() {
            return age;
        }
    }

    static class AverageAgeCalculator<T> {
        private List<T> list;
        public AverageAgeCalculator(List<T> list) {
            this.list = list;
        }
        public double getAverageAge() {
            int totalAge = 0;
            for (T item : list) {
                if (item instanceof Person) {
                    totalAge += ((Person) item).getAge();
                } else if (item instanceof Car) {
                    totalAge += ((Car) item).getAge();
                }
            }
            return (double) totalAge / list.size();
        }
    }

    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person(25), new Person(30), new Person(35));
        AverageAgeCalculator<Person> personAverage = new AverageAgeCalculator<Person>(personList);
        double averageAgeOfPersons = personAverage.getAverageAge();
        System.out.println(averageAgeOfPersons);

        List<Car> carList = Arrays.asList(new Car(5), new Car(10), new Car(15));
        AverageAgeCalculator<Car> carAverage = new AverageAgeCalculator<Car>(carList);
        double averageAgeOfCars = carAverage.getAverageAge();
        System.out.println(averageAgeOfCars);
    }
}
