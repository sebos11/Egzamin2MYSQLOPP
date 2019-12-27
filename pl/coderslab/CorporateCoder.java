package pl.coderslab;

public class CorporateCoder extends Coder {
    private String company = " ";
    public CorporateCoder(String name, int age, String company){
        super(name, age);
        if (!checCompany()) {
            this.company = completeCompany(company);}
         else {this.company = company;}
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getCompany(){
        return this.company;
    }
    private boolean checCompany(){
        if (this.company.length() >= 5) { return true;}
        return false;
    }
    private String completeCompany(String company) {
        String temp ="";
        int size = company.length();
        for (int i = 1; i<= 5 - size; i++)
        {
            temp = temp + "X";
        }
        return String.join("",company,temp);
        }

    @Override
    public String toString() {
        return "CorporateCoder{name = " + getName() + ", age = "+ getAge() + ", company = " + this.company +'}';
    }
}
