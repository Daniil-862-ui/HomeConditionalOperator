//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Задача 1
        System.out.println("Задача 1:");
        int agePeople = 7;
            if (agePeople >= 18) {
                System.out.println("Если возраст человека равен " + agePeople
                                    + " , то он совершеннолетний!");
            }
            else {
                System.out.println("Если возраст человека равен " + agePeople
                               + " он не достиг совершеннолетия, нужно немного подождать!");
            }

    //Задача 2
        System.out.println("---------");
        System.out.println("Задача 2:");
        int temperature = 2;
            if (temperature < 5) {
                System.out.println("На улице " + temperature +
                        " градуса нужно надеть шапку!");
            } else  {
                System.out.println("На улице " + temperature +
                        " градусов можно идти без шапки!");
            }

    //Задача 3
        System.out.println("---------");
        System.out.println("Задача 3:");
        int autoSpeed = 0;
            if (autoSpeed >= 60) {
                System.out.println("Если скорость " + autoSpeed +
                                    ", то придется заплатить штраф");
                }
            else if (autoSpeed > 0 && autoSpeed < 60) {
                System.out.println("Если скорость " + autoSpeed +
                                    ", то вожно сьездить спокойно");
            } else {
                System.out.println("Вы стоите на месте!");
            }

    //Задача 4
        System.out.println("---------");
        System.out.println("Задача 4:");
        int age = 6;
            if (age >= 2 && age <= 6) {
                System.out.println("Если возраст человека равен " + age
                        + ", то ему нужно ходить детский сад.");
                }
            else if (age >= 7 && age <= 17) {
                System.out.println("Если возраст человека равен " + age
                        + ", то ему нужно ходить в школу.");
                }
            else if (age >= 18 && age <= 24) {
                System.out.println("Если возраст человека равен " + age
                    + ", то ему нужно в университет.");
                }
            else if (age > 24) {
                System.out.println("Если возраст человека равен " + age
                        + ", то ему нужно ходить на работу");
            }

    //Задача 5
        System.out.println("---------");
        System.out.println("Задача 5:");
        int ageBebe = 10;
        int ageAdult = 18;
            if (ageBebe < 5) {
                System.out.println("Если возраст ребенка равен " + ageBebe
                                   + " он не может кататься на аттракционе.");
                }
            if (ageBebe >= 5 && ageBebe < 14 && ageAdult >= 18) {
                System.out.println("Если возраст ребенка равен " + ageBebe
                        + ", то он может кататься только в сопровождении взрослого.");
                }
            else if (ageBebe >= 5 && ageBebe < 14 && ageAdult < 18) {
                System.out.println("Если возраст ребенка равен " + ageBebe
                        + ", то он не может кататься без сопровождении взрослого.");
                }
            if (ageBebe >= 14) {
                System.out.println("Если возраст ребенка равен " + ageBebe
                        + ", то он может кататься без сопровождения взрослого.");
                }

    //Задача 6
        System.out.println("---------");
        System.out.println("Задача 6:");
            final int totalCapacity = 102;
            final int seatingAreas = 60;
            final int standingPlaces = totalCapacity - seatingAreas;
            int passengersSitting = 60;
            int passengersPlaces = 10;
                if (passengersSitting > seatingAreas) {
                    System.out.println("Превышение сидячих мест! Срочно решить проблему!");
                    }
                else if (passengersSitting < seatingAreas) {
                        System.out.println("В вагоне есть " + (seatingAreas-passengersSitting)
                                + " свободных сидячих мест!");
                    } else {
                        System.out.println("В вагоне нет сидячих свободных мест!");
                    }

                if (passengersPlaces > standingPlaces) {
                    System.out.println("Превышение стоячих мест! Срочно решить проблему!");
                } else if (passengersPlaces < standingPlaces) {
                        System.out.println("В вагоне есть " + (standingPlaces - passengersPlaces)
                                + " свободных стоячих мест!");
                    } else {
                        System.out.println("В вагоне нет стоячих свободных мест!");
                    }

    //Задача 7
        System.out.println("---------");
        System.out.println("Задача 7:");
            int one = 1;
            int two = 22;
            int three = 3;
                if (one > two && one > three) {
                    System.out.println(one + "самое большое значение!");
                } else if (two > one && two > three) {
                        System.out.println(two + " самое большое значение!");
                    } else {
                        System.out.println(three + " самое большое значение!");
                    }


    }
}