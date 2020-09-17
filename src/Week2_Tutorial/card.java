package Week2_Tutorial;

public class card {
    private String suite;
    private int value;
    private boolean drawn;

    public card(String s, int v)
    {
        suite = s;
        value = v;
        drawn = false;
    }

    public void displayCard()
    {
        System.out.print("Card drawn was "+value+" of "+ suite);
        if (drawn==false)
            System.out.println(" and has not been picked");
        else
            System.out.println(" and has been picked");
    }

    public boolean returnCard()
    {
        return(drawn);
    }

    public void setCard(boolean z)
    {
        drawn = z;
    }

    public static void main(String[] args)
    {
        card deck[] = new card[52];
        String[] suites = { "Hearts", "Diamonds", "Spades", "Clubs" };
        int value = 0;
        int i=1;

        for (int x=0;x<4;x++){
            for (int j=1;j<14;j++)
                if (i < 53) {
                    deck[i] = new card(suites[x], j);
                    i++;
                }
            }
        //display all cards
        for (int x=1;x<52;x++)
            deck[x].displayCard();

            value = (int) (Math.random() * 52) + 1;
            System.out.println("First random number generated was " + value);
            deck[value].setCard(true);

        for (int x=1;x<52;x++)
            deck[x].displayCard();


        value = (int)(Math.random()*52) + 1;
        System.out.println("First random number generated was "+value);
    }
}
