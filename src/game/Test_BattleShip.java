package game;

import java.io.*;


public class Test_BattleShip
{
    public static void testGroup1() throws Exception
    {
        System.out.println("testGroup1 start!");

        BattleShip battleShip = new BattleShip();
        Gamer player1 = new Gamer("Sasha", "super121", "123456");
        Gamer player2 = new Gamer("Masha", "puper222", "123456");
        battleShip.startNewGame(player1, player2);

//        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat")))
//        {
//            oos.writeObject(battleShip);
//        }
//        catch(Exception ex)
//        {
//            System.out.println("u1: " + ex.getMessage());
//        }
//
//        BattleShip battleShipLoad;
//        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat")))
//        {
//            battleShipLoad = (BattleShip) ois.readObject();
//            battleShipLoad.addUser("Misha", "fer45", "123456");
//        }
//        catch(Exception ex){
//
//            System.out.println("u2: " + ex.getMessage());
//        }


//        battleShip.addUser("Masha", "puper222", "123456");

//        eqvBool(battleField.isShipFitsOnField(ship3), true, 6);

//        try
//        {
//            battleField.addShip(ship4);
//            System.out.println("unit9 ... bad!");
//        }
//        catch (Exception ex)
//        {
//            if (ex.getMessage().equals("Превышен лимит кораблей данного типа!"))
//                System.out.println("unit9 ... ok!");
//            else System.out.println("unit9 ... bad!");
//        }


        System.out.println("testGroup1 end!");
    }

    public static void eqvBool(boolean first, boolean second, int n)
    {
        if (first == second)
        {
            System.out.println("unit" + n + " ... ok!");
        }
        else
        {
            System.out.println("unit" + n + " ... bad!");
        }
    }

    public static void main(String[] args) throws Exception
    {
        testGroup1();
    }
}
