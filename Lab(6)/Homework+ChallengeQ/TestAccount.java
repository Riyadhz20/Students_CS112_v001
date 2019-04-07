package testaccount;

public class TestAccount {

    public static void main(String[] args) {
        Account A1 = new Account("George", 1122, 20000);
        A1.setALR(1.5);
        
        A1.Deponsit(30);
        A1.Deponsit(40);
        A1.Deponsit(50);
        
        A1.WithDraw(5);
        A1.WithDraw(4);
        A1.WithDraw(2);
        
        System.out.println(">>>>>>>>>>> Summary <<<<<<<<<<<\n"+A1.toString());
        
        for(int i = 0 ; i<A1.getTransaction().size();i++){
            System.out.println((A1.getTransaction()).get(i).toString());
        }
    }
}
