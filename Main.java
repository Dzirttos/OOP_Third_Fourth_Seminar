/**
*Создать класс щита, разработать разные типы щитов, добавить в семейство классов Warriors обобщения в виде щитов. 
*Реструктуризировать код в конечных классах семейства Warriors.
*Добавить метод определения минимального щита члена команды в команде.
*Продумать, как можно сделать воина без щита.
*/

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[J");

        Team<Archer> archersTeam = new Team<>();
        archersTeam.add(new Archer("George", new Bow(), 30))
                    .add(new Archer("Bob", new Bow(), 25));
        
        Team<Assassin> assasinTeam = new Team<>();
        assasinTeam.add(new Assassin("Ezio",new Knife(), 20))
                    .add(new Assassin("Altair", new Knife(), 35));

        System.out.println(archersTeam);
        System.out.println(assasinTeam);
        
        Battle placeOfBattle = new Battle(new Archer("Henry", new Bow(), 30), 
                               new Assassin("Jonny", new Knife(), 34));
        Warrior winner = placeOfBattle.fight();

        System.out.println(winner);
    }
    
}