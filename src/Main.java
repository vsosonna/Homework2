public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }


    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        System.out.println(dog + 4);
        var cat = 3.6;
        System.out.println(cat + 4);
        var paper = 763789;
        System.out.println(paper + 4);
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        System.out.println(dog - 3.5);
        var cat = 3.6;
        System.out.println(cat - 1.6);
        var paper = 763789;
        System.out.println(paper - 7639);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog - 4;
        System.out.println(frog);

    }

    public static void task6() {
        System.out.println("Задача 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var weight = firstBoxer + secondBoxer;
        System.out.println("Общий вес бойцов " + weight);
        var differ = secondBoxer - firstBoxer;
        System.out.println("Разницв в весе " + differ + " кг.");

    }

    public static void task7() {
        System.out.println("Задача 7");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var weight = firstBoxer + secondBoxer;
        System.out.println("Общий вес бойцов " + weight);
        var differ = secondBoxer - firstBoxer;
        System.out.println("Разницв в весе " + differ + " кг.");
        var over = (secondBoxer + firstBoxer) % firstBoxer;
        System.out.println("Перевес второго бойца " + over);
    }

    public static void task8() {
        System.out.println("Задача 8");
        var time = 640;
        var workers = time / 8;
        System.out.println("Всего работников в компании -   " + workers + "человек");
        workers = workers + 94;
        time = time /workers;
        System.out.println("Если в компании работает " + workers + " человек, то всего "+time+ " часов работы может быть поделено между сотрудниками");




    }
}
