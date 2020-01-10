package ua.plaksenkov.state.ex2;

public interface State {

    public void insertQurter();
    public void ejectQuarter();
    public void turnCranck();
    public void dispense();
    public void refill(int count);


}
