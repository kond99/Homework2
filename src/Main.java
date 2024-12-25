public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println();
        System.out.println("Задача 1");
        var dogs = 8.0;
        var cats = 3.6;
        var paper = 763789;

        System.out.println("dogs = " + dogs);
        System.out.println("cats = " + cats);
        System.out.println("paper = " + paper);

        // Задача 2
        System.out.println();
        System.out.println("Задача 2");
        dogs = dogs + 4;
        cats = cats + 4;
        paper = paper + 4;

        System.out.println("dogs = " + dogs);
        System.out.println("cats = " + cats);
        System.out.println("paper = " + paper);

        // Задача 3
        System.out.println();
        System.out.println("Задача 3");
        dogs = dogs - 3.5;
        cats = cats - 1.6;
        paper = paper - 7639;

        System.out.println("dogs = " + dogs);
        System.out.println("cats = " + cats);
        System.out.println("papers = " + paper);

        // Задача 4
        System.out.println();
        System.out.println("Задача 4");
        var friends = 19;
        System.out.println("friends = " + friends);
        friends = friends + 2;
        System.out.println("friends = " + friends);
        friends = friends / 7;
        System.out.println("friends = " + friends);

        // Задача 5
        System.out.println();
        System.out.println("Задача 5");
        var frogs = 3.5;
        System.out.println("frog = " + frog);
        frog = frogs * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);

        // Задача 6
        System.out.println();
        System.out.println("Задача 6");
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var commonWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общая масса двух бойцов = " + commonWeight + "кг");
        var diffWeight = boxer2Weight - boxer1Weight;
        System.out.println("Разница между массами бойцов = " + diffWeight + "кг");

        // Задача 7
        System.out.println();
        System.out.println("Задача 7");
        var overWeight = boxer2Weight % boxer1Weight;
        System.out.println("Остаток от деления между двумя весами = " + overWeight + "кг");

        // Задача 8
        System.out.println();
        System.out.println("Задача 8");
        var workingHours = 640;
        var workingHoursPerWorker = 8;
        var workersNumber = workingHours / workingHoursPerWorker;
        System.out.println("Всего работников в компании - " + workersNumber + " человек");
        var workersNumber1 = workersNumber + 94;
        var workingHours1 = workersNumber1 * workingHoursPerWorker;
        System.out.println("Если в компании работает " + workersNumber1 + " человек, то всего " + workingHours1 +
                " часов работы может быть поделено между сотрудниками.");
            }
}
