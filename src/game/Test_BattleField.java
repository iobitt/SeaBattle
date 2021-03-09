package game;


public class Test_BattleField
{
    public static void testGroup1() throws Exception
    {
        System.out.println("testGroup1 start!");

        BattleField battleField = new BattleField();

        Ship ship1 = new Ship(5, 1, 4, true);
        if (battleField.isShipFitsOnField(ship1))
        {
            System.out.println("unit1 ... ok!");
        }
        else
        {
            System.out.println("unit1 ... bad!");
        }

        Ship ship2 = new Ship(6, 1, 4, true);
        if (battleField.isShipFitsOnField(ship2))
        {
            System.out.println("unit2 ... ok!");
        }
        else
        {
            System.out.println("unit2 ... bad!");
        }

        Ship ship3 = new Ship(7, 1, 4, true);
        if (!battleField.isShipFitsOnField(ship3))
        {
            System.out.println("unit3 ... ok!");
        }
        else
        {
            System.out.println("unit3 ... bad!");
        }

        Ship ship4 = new Ship(0, 0, 1, true);
        if (battleField.isShipFitsOnField(ship4))
        {
            System.out.println("unit4 ... ok!");
        }
        else
        {
            System.out.println("unit4 ... bad!");
        }

        Ship ship5 = new Ship(9, 8, 2, false);
        if (battleField.isShipFitsOnField(ship5))
        {
            System.out.println("unit6 ... ok!");
        }
        else
        {
            System.out.println("unit6 ... bad!");
        }

        Ship ship6 = new Ship(4, 8, 3, false);
        eqvBool(battleField.isShipFitsOnField(ship6), false, 7);

        System.out.println("testGroup1 end!");
    }

    public static void testGroup2() throws Exception
    {
        System.out.println("testGroup2 start!");

        BattleField battleField = new BattleField();

        Ship ship1 = new Ship(5, 1, 4, true);
        eqvBool(battleField.isShipFitsOnField(ship1), true, 1);
        eqvBool(battleField.isPlatformFree(ship1), true, 2);

        battleField.addShip(ship1);

        Ship ship2 = new Ship(5, 0, 3, true);
        eqvBool(battleField.isShipFitsOnField(ship2), true, 3);
        eqvBool(battleField.isPlatformFree(ship2), false, 4);

        try
        {
            battleField.addShip(ship2);
            System.out.println("unit5 ... bad!");
        }
        catch (Exception ex)
        {
            if (ex.getMessage().equals("Расположению корабля мешают другие корабли!"))
            System.out.println("unit5 ... ok!");
            else System.out.println("unit5 ... bad!");
        }

        Ship ship3 = new Ship(3, 0, 3, false);
        eqvBool(battleField.isShipFitsOnField(ship3), true, 6);
        eqvBool(battleField.isPlatformFree(ship3), true, 7);

        try
        {
            battleField.addShip(ship3);
            System.out.println("unit8 ... ok!");
        }
        catch (Exception ex)
        {
            System.out.println("unit8 ... bad!");
        }

        Ship ship4 = new Ship(0, 0, 4, false);
        try
        {
            battleField.addShip(ship4);
            System.out.println("unit9 ... bad!");
        }
        catch (Exception ex)
        {
            if (ex.getMessage().equals("Превышен лимит кораблей данного типа!"))
                System.out.println("unit9 ... ok!");
            else System.out.println("unit9 ... bad!");
        }


        System.out.println("testGroup2 end!");
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
//        testGroup1();
        testGroup2();
    }
}
