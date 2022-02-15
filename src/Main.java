/*
Создать 3 разных класса пришельцев (RoundAlien, FourLegsAlien, SquareAlien).
Каждый класс должен иметь свое имя, наименование планеты с которой он прилетел, вес и высоту
Реализовать для каждого из них метод moveStep который вычисляет длину шага связанную с особенностями данного пришельца
Реализовать метод для каждого из них, который вычисляет необходимое количество еды, необходимое на обед. Если пришелец
прибыл с планеты Nibury, то у него повышенный обмен веществ и ему необходимо 2 раза больше еды.
Так же должна быть возможность перевести пришельца на еду мяса, чтобы кормить его в 3 раза меньшим обьемом.
Реализовать метод printInfo, который выведет основную информацию о пришельце.
Каждый пришелец должен уметь здороваться по-своему.
Создайте базовый класс пришельца, от которого будут унаследованы описанные выше классы и постарайтесь по возможности вынести
реализацию в базовый класс
Вывести справочную информацию о каждом монстре в консоль
github
 */

public class Main {
    public static void main(String[] args) {
        RoundAlien roundAlien = new RoundAlien("Nibury", "Vanya", 100, 2.4);
        RoundAlien roundAlien2 = new RoundAlien("Venera", "Vasya", 100, 2.4);
        FourLegsAlien fourLegsAlien = new FourLegsAlien("Mars", "Gosha", 30, 1.2);
        SquareAlien squareAlien = new SquareAlien("Mercury", "Tanya", 120, 1.6);

        roundAlien.printInfo();
        roundAlien2.printInfo();
        fourLegsAlien.printInfo();
        squareAlien.printInfo();

        roundAlien.printHello();
        roundAlien2.printHello();
        fourLegsAlien.printHello();
        squareAlien.printHello();

        System.out.println(roundAlien.getName() + " move step is " + roundAlien.moveStep());
        System.out.println(roundAlien2.getName() + " move step is " + roundAlien2.moveStep());
        System.out.println(fourLegsAlien.getName() + " move step is " + fourLegsAlien.moveStep());
        System.out.println(squareAlien.getName() + " move step is " + squareAlien.moveStep());

        System.out.println("Aliens is vegaterian");
        System.out.println(roundAlien.getName() + "  dinner weight value is " + roundAlien.dinnerEatValue());
        System.out.println(roundAlien2.getName() + " dinner weight value is " + roundAlien2.dinnerEatValue());
        System.out.println(fourLegsAlien.getName() + " dinner weightvalue is " + fourLegsAlien.dinnerEatValue());
        System.out.println(squareAlien.getName() + " dinner weightvalue is " + squareAlien.dinnerEatValue());

        roundAlien.setVegaterian(false);
        roundAlien2.setVegaterian(false);
        fourLegsAlien.setVegaterian(false);
        squareAlien.setVegaterian(false);

        System.out.println("Aliens not vegaterian");
        System.out.println(roundAlien.getName() + "  dinner weight value is " + roundAlien.dinnerEatValue());
        System.out.println(roundAlien2.getName() + " dinner weight value is " + roundAlien2.dinnerEatValue());
        System.out.println(fourLegsAlien.getName() + " dinner weightvalue is " + fourLegsAlien.dinnerEatValue());
        System.out.println(squareAlien.getName() + " dinner weightvalue is " + squareAlien.dinnerEatValue());
    }
}
