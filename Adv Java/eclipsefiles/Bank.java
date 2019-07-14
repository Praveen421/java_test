class Account{
    String Accname;
    long Accnum;
    String Address;
    double Balance;
    int m1(){
        System.out.println("m1");
        return 10;
    }
}
class Bank{
    public static void main(String...args){
        System.out.println("creating 2 accounts Holders Objects");
        Account A1=new Account();
        A1.Accname="hari krishna"; 
        A1.Accnum=987312;
        A1.Address="Hyderabad";
        A1.Balance=1000000.47;

        Account A2=new Account();
        A2.Accname="praveen kumar"; 
        A2.Accnum=987313;
        A2.Address="Bellandur";
        A2.Balance=10000000.47;
        
        System.out.println("1st acc. holder");
        System.out.println("Name:"+A1.Accname);
        System.out.println("acc.no:"+A1.Accnum);
        System.out.println("address:"+A1.Address);
        System.out.println("balance:"+A1.Balance);
        System.out.println();
        System.out.println("2nd acc. holder");
        System.out.println("Name:"+A2.Accname);
        System.out.println("acc.no:"+A2.Accnum);
        System.out.println("address:"+A2.Address);
        System.out.println("balance:"+A2.Balance);
        Account a1=new Account();
        a1.m1();
    }
}