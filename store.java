public class store
{
    void getSoap(int money)
    {
        System.out.println(money +" rupees soap purchased");
    }
    void getChocolate(int money)
    {
        System.out.println(money +" rupees chocolate purchased");
    }
    void getIcecream(int money)
    {
        System.out.println(money +" rupees icecream purchased");
    }

    public static void main(String args[])
    {
        store shop1 = new store();
        shop1.getSoap(300);
        shop1.getChocolate(650);
        shop1.getIcecream(250);
    }
}

