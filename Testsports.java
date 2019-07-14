class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
}
class Testsports{
    public static void main(String...args){
        Sports s1=new Sports();
        Sports s2=new Soccer();
        String a=s1.getName();
        String b=s2.getName();
        System.out.println(a);
        s1.getNumberOfTeamMembers();
        System.out.println(b);        
        s2.getName();
    }
}