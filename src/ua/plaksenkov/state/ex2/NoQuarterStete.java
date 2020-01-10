package ua.plaksenkov.state.ex2;

public class NoQuarterStete implements State {
    GumballMachine gumballMachine;

    public NoQuarterStete(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQurter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCranck() {
        System.out.println("You turned? but there is no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public void refill(int count) {
        gumballMachine.setCount(gumballMachine.getCount()+count);
    }
}
