package ua.plaksenkov.state.ex2;

public class GumballMachine {
    private State soldOutState;
    private State noQuarterStete;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state = soldOutState;
    private int count = 0;



    public GumballMachine(int numberGumballs){
        soldOutState = new SoldOutState(this);
        noQuarterStete = new NoQuarterStete(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        count = numberGumballs;

        if(count>0){
            state = noQuarterStete;
        }else {
            state = soldOutState;
        }
    }

    public void setState(State state){
        this.state = state;
    }

    public void insertQurter(){
        state.insertQurter();
    }
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    public void turnCranck(){
        state.turnCranck();
        state.dispense();
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void refill(int count){
        state.refill(count);
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if(count != 0){
            count = count - 1;
        }
    }

    @Override
    public String toString() {
        return "\n Mighty Gumball, Inc\nJava-enabled Standing Gumball Model #2004\nInventory: "+count+" gumballs\nMachine is waiting for quarter\n";
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterStete() {
        return noQuarterStete;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }
}
