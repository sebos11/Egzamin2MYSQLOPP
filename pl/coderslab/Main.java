package pl.coderslab;

public class Main {

    public static void main(String[] args) {
        CorporateCoder k1 = new CorporateCoder("janek Wiśniewski",18,"Du");
        FreeLanceCoder k2 = new FreeLanceCoder("Zbolałek Janusz",18,true);

        VIPUser user1 = new VIPUser("Jacek","Kowalski","zupa@blada.pl",10004);


        System.out.println(user1.getVipCardNumber());
        user1.setVipCardNumber(100);
        System.out.println(user1.getVipCardNumber());
        System.out.println(user1.toString());
        System.out.println(k1.toString());
        System.out.println(k2.toString());

    }
}
