package ua.plaksenkov.state.ex2;

public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQurter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the cranck");
    }

    @Override
    public void turnCranck() {
        System.out.println("Turnig twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if(gumballMachine.getCount()>0){
            gumballMachine.setState(gumballMachine.getNoQuarterStete());
        }else{
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void refill(int count) {
        gumballMachine.setCount(gumballMachine.getCount()+count);
    }

}
