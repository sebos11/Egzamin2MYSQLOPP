package pl.coderslab;

public class VIPUser extends User {
    private Integer vipCardNumber;

    public VIPUser(String name, String lastName, String email,Integer vipCardNumber) {
        super(name, lastName, email);
        int temp = vipCardNumber;
        if (checkCardNumber(temp)) {
            this.vipCardNumber = vipCardNumber;
        } else this.vipCardNumber = null;

    }

    public Integer getVipCardNumber() {
        return vipCardNumber;
    }

    public void setVipCardNumber(Integer vipCardNumber) {
       int temp = vipCardNumber;

       if (checkCardNumber(temp)) {
           this.vipCardNumber = vipCardNumber;
       }

    }

    private boolean checkCardNumber(int newNummber){
        boolean temp = false;
        if (newNummber > 9999 && newNummber % 2 == 0) {
            temp = true;
            return temp;
        }
        return temp;
    }

    @Override
    public String toString() {
        return super.toString() + ", vipCardNumber =" + this.vipCardNumber +" }";
    }
}
