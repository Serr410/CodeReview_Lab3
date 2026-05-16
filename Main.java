import Lab2.*;

void main() {
    Human person1 = new Human("Клеопатра", "", "", 152);
    Human person2 = new Human("Александр", "Пушкин", "Сергеевич", 167);
    Human person3 = new Human("Владимир", "Маяковский", "", 189);
    Human person10 = new Human("Христофор", "Банифатьевич", "", 100);

    System.out.println("Current human beings:");
    System.out.println(person1.toString());
    System.out.println(person2.toString());
    System.out.println(person3.toString());
    System.out.println(person10.toString() + " (height used for the sake of simplicity)" + "\n");

    Human person4 = new Human("Иван", "Чудов", "", 160);
    Human person5 = new Human("Петр", 156, person4);
    Human person6 = new Human("Борис", 186, person5);
    System.out.println("Like father like son:");
    System.out.println(person4.toString());
    System.out.println(person5.toString());
    System.out.println(person6.toString() + "\n");

    Human person7 = new Human("Лев", 170);
    Human person8 = new Human("Сергей", "Пушкин", 168, person7);
    Human person9 = new Human("Александр", 167, person8);
    System.out.println("Russian roulette of generation:");
    System.out.println(person7.toString() + "    Name and height");
    System.out.println(person8.toString() + "    Name, Surname, height and father");
    System.out.println(person9.toString() + "    Name, height and father" + "\n");

    Cat Kitty = new Cat("Барсик");
    System.out.println(Kitty.toString());
    Kitty.Meow();
    Kitty.Meow(3);
    System.out.println("\n");

    City A = new City("A");
    City B = new City("B");
    City C = new City("C");
    City D = new City("D");
    City E = new City("E");
    City F = new City("F");

    A.addRoute(F, 1);
    A.addRoute(B, 5);
    A.addRoute(D, 6);
    B.addRoute(A, 5);
    B.addRoute(C, 3);
    C.addRoute(B, 3);
    C.addRoute(D, 4);
    D.addRoute(C, 4);
    D.addRoute(E, 2);
    D.addRoute(A, 6);
    E.addRoute(F, 2);
    F.addRoute(E, 2);
    F.addRoute(B, 1);

    System.out.println(A.toString());
    System.out.println(B.toString());
    System.out.println(C.toString());
    System.out.println(D.toString());
    System.out.println(E.toString());
    System.out.println(F.toString());
}
