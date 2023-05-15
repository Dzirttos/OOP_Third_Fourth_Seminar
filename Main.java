/**
 * Создать класс щита, разработать разные типы щитов, добавить в семейство
 * классов Warriors обобщения в виде щитов.
 * Реструктуризировать код в конечных классах семейства Warriors.
 * Добавить метод определения минимального щита члена команды в команде.
 * Продумать, как можно сделать воина без щита.
 */

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");

        Team<Archer> archersTeam = new Team<>();
        archersTeam.add(new Archer("George", new Bow(), 30, new Offhand()))
                   .add(new Archer("Bob", new Bow(), 25, new Offhand()));

        Team<Assassin> assassinTeam = new Team<>();
        assassinTeam.add(new Assassin("Ezio", new Knife(), 20, new Offhand()))
                   .add(new Assassin("Altair", new Knife(), 35, new Offhand()));

        Team<Viking> vikingTeam = new Team<>();
        vikingTeam.add(new Viking("Eivor", new Axe(), 25, new ShortShield()))
                  .add(new Viking("Thor", new Axe(), 30, new ShortShield()));

        Team<Trooper> trooperTeam = new Team<>();
        trooperTeam.add(new Trooper("Avrelius", new Spear(), 18, new GreatShield()))
                .add(new Trooper("Marcus", new Spear(), 23, new GreatShield()));

        System.out.println(archersTeam);
        System.out.println();
        System.out.println(assassinTeam);
        System.out.println();
        System.out.println(vikingTeam);
        System.out.println();
        System.out.println(trooperTeam);
        System.out.println();
        
        // Battle placeOfBattle = new Battle(new Archer("Henry", new Bow(), 30, new Offhand()),
        //         new Assassin("Jonny", new Knife(), 34, new Offhand()));
        // Warrior winner = placeOfBattle.fight();

        // System.out.println(winner);
    }

}