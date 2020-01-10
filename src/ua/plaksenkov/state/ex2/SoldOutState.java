package ua.plaksenkov.state.ex2;

public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQurter() {
        System.out.println("Sorry, there is no gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("There is no quarter inside");
    }

    @Override
    public void turnCranck() {
        System.out.println("Sorry, there is no gumball");
    }

    @Override
    public void dispense() {
        System.out.println("Sorry, there is no gumball");
    }

    @Override
    public void refill(int count) {
        gumballMachine.setCount(count);
        gumballMachine.setState(gumballMachine.getNoQuarterStete());
    }
}
