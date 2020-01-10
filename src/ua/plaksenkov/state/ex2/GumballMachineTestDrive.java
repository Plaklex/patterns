package ua.plaksenkov.state.ex2;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);
        System.out.println(gumballMachine);

        gumballMachine.insertQurter();
        gumballMachine.turnCranck();

        System.out.println(gumballMachine);

        gumballMachine.insertQurter();
        gumballMachine.turnCranck();
        gumballMachine.insertQurter();
        gumballMachine.turnCranck();

        System.out.println(gumballMachine);
    }
}
