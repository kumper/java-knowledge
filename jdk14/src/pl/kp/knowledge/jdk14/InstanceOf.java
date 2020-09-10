package pl.kp.knowledge.jdk14;

public class InstanceOf {
    public static void main(String[] args) {
        Master aAsMaster = new A();
        Master bAsMaster = new B();

        if (aAsMaster instanceof A a) {
            a.printMessage();
        } else if (bAsMaster instanceof B b){
            b.printError();
        }
    }
}
