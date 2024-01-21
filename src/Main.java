import java.net.SocketTimeoutException;
import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
    var dog = 8.0;
    var cat = 3.6;
    var paper = 763789;
        System.out.println("Задача 1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

    var dog2 = dog + 4;
    var cat2 = cat + 4;
    var paper2 = paper + 4;
        System.out.println("Задача 2");
        System.out.println(dog2);
        System.out.println(cat2);
        System.out.println(paper2);

        var dog3 = dog - 3.5;
        var cat3 = cat - 1.6;
        var paper3 = paper - 7639;
        System.out.println("Задача 3");
        System.out.println(dog3);
        System.out.println(cat3);
        System.out.println(paper3);

        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        var friend1 = friend+2;
        System.out.println(friend1);
        var friend3 = friend1/7;
        System.out.println(friend3);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        var frog1 = frog*10;
        System.out.println(frog1);
        var frog2 = frog1/3.5;
        System.out.println(frog2);
        var frog3 = frog2+4;
        System.out.println(frog3);

        System.out.println("Задача 6");
        var firstFighter = 78.2;
        var secondFighter = 82.7;
        var overallWeight = firstFighter + secondFighter;
        System.out.println("Общий вес двух боксеров " +overallWeight);

        System.out.println("Задача 7");
        var weightDifference = secondFighter - firstFighter;
        System.out.println("Разница в весе (способ номер 1) " + weightDifference  + " кг");
        var weightDifference1 = secondFighter%firstFighter;
        System.out.println("Разница в весе (способ номер 2) " + weightDifference1 + " кг");

        System.out.println("Задача 8");
        System.out.println("Часть 1");
        var overallHours = 640;
        var oneWorker = 8;
        var overallWorkers = overallHours/oneWorker;
        System.out.println("Всего работников в компании - " + overallWorkers + " человек");
        System.out.println("Часть 2");
        var excessWorkers = 94;
        var excess = overallWorkers+excessWorkers;
        var newOverallWorkers = overallHours/excess;
        System.out.println("Если в компании работает " + excess + " человека(человека), то всего " + newOverallWorkers + " часа(часов) работы может быть поделено между сотрудниками.");
    }
}
