package pl.coderslab;

public class FreeLanceCoder extends Coder {
    private boolean remote;
    public FreeLanceCoder(String name, int age, boolean remote) {
        super(name,age);
        if (checkAge()) { this.remote = true;}
        else { this.remote = false;}

    }

    public void setRemote(boolean remote) {
        if (checkAge()) {
            this.remote = true;
        } else {this.remote = false;}
    }

    public boolean getRemote(){
        return this.remote;
    }
    private boolean checkAge() {
        if (getAge() >= 18) { return true;}
        return false;
    }

    @Override
    public String toString() {
        return "FreeLanceCoder{Name = " + getName() + ", Age = "+ getAge() + ", Dorosły ? =" + remote + '}';
    }
}
