import java.util.Scanner;

public class index
{
    public static void main(String[] args)
    {
        try(Scanner GETVARIABLEFOROPTION = new Scanner(System.in))
        {
        System.out.println("Select the options of the game: \n- Insert '1' for the game: \n- Insert '3' for the options:\n- Insert '7' for game with computer: \nOption: ");
        int optionOfGame = GETVARIABLEFOROPTION.nextInt();
        switch (optionOfGame)
        {
            case 1:
                game();
            break;
            case 3:
                options();
            break;
            case 7:
                gameWithComputer();
            default:
                System.out.println("Invalid option");
        }
    }
    }

    public static int playervalueX(String player)
    {
        Scanner Getv = new Scanner(System.in);
        System.out.println("insert the value of the position (0 to 8)");
        int x = Getv.nextInt();
        if(x <= 8)
        {
            return x;
        }
        else
        {
            System.out.println("Invalid value!");
        }
        return x;
    }


    public static void game()
    {
        String position[];
        position = new String[9];
        for (int i = 0 ; i <= 8 ; i++)
        {
            position[i] = "";
        }
        String playerX = "X";
        String playerO = "O";
        String atualplayer = playerX;

        while(true)
        {
            //logic
            if ((position[0] == atualplayer && position[3] == atualplayer && position[6] == atualplayer)||
            (position[1] == atualplayer && position[4] == atualplayer && position[7] == atualplayer)||
            (position[2] == atualplayer && position[5] == atualplayer && position[8] == atualplayer)||
            (position[0] == atualplayer && position[1] == atualplayer && position[2] == atualplayer)||
            (position[3] == atualplayer && position[4] == atualplayer && position[5] == atualplayer)||
            (position[6] == atualplayer && position[7] == atualplayer && position[8] == atualplayer)
            )
                {
                System.out.println("the player '"+atualplayer+"' won the game");
                } 

        System.out.println(" "+position[0]+" "+position[1]+" "+position[2]+" ");
        System.out.println(" "+position[3]+" "+position[4]+" "+position[5]+" ");
        System.out.println(" "+position[6]+" "+position[7]+" "+position[8]+" ");

          for (int j = 0 ; j <= 8 ; j++)//verifications
            { //if position is not null
            if(position[j] == playerX)
            {

            }
            if(position[j] == playerO)
            {

            }
            }
            //computer not computer
             //player
        int positionValue = playervalueX(atualplayer);
        position[positionValue] = atualplayer;

        if(atualplayer.equals(playerX))
        {
            atualplayer = playerO;
        }
        else
        {
            atualplayer = playerX;
        }
        }
    }

    public static void gameWithComputer()
    {
        String position[];
        position = new String[9];
        for (int i = 0 ; i <= 8 ; i++)
        {
            position[i] = "";
        }
        String playerX = "X";
        String playerO = "O";
        String atualplayer = playerX;

        while(true)
        {
            //logic
            if ((position[0] == atualplayer && position[3] == atualplayer && position[6] == atualplayer)||
            (position[1] == atualplayer && position[4] == atualplayer && position[7] == atualplayer)||
            (position[2] == atualplayer && position[5] == atualplayer && position[8] == atualplayer)||
            (position[0] == atualplayer && position[1] == atualplayer && position[2] == atualplayer)||
            (position[3] == atualplayer && position[4] == atualplayer && position[5] == atualplayer)||
            (position[6] == atualplayer && position[7] == atualplayer && position[8] == atualplayer)
            )
                {
                System.out.println("the player '"+atualplayer+"' won the game");
                } 

        System.out.println("|"+position[0]+"|"+position[1]+"|"+position[2]+"|");
        System.out.println("------");
        System.out.println("|"+position[3]+"|"+position[4]+"|"+position[5]+"|");
        System.out.println("------");
        System.out.println("|"+position[6]+"|"+position[7]+"|"+position[8]+"|");

          for (int j = 0 ; j <= 8 ; j++)//verifications
            { //if position is not null
            if(position[j] == playerX)
            {

            }
            if(position[j] == playerO)
            {

            }
            }
            //computer

                if(position[0] == atualplayer||position[4] == atualplayer || position[2] == atualplayer)
                {
                    position[1] = atualplayer;
                }
                else if(position[1] == atualplayer||position[7] == atualplayer)
                {
                    position[4] = atualplayer;
                }
                else if(position[6] == atualplayer||position[2] == atualplayer)
                {
                    position[4] = atualplayer;
                }
                else if(position[0] == atualplayer||position[8] == atualplayer)
                {
                    position[4] = atualplayer;
                }
                else if(position[2] == atualplayer || position[8] == atualplayer)
                {
                    position[5] = atualplayer;
                }

             //player
        int positionValue = playervalueX(atualplayer);
        position[positionValue] = atualplayer;

        if(atualplayer.equals(playerX))
        {
            atualplayer = playerO;
        }
        else
        {
            atualplayer = playerX;
        }
        }
    }

    public static void options()
    {

    }
}
