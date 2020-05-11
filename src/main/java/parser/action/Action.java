package parser.action;

public abstract class Action {
    public int number;

    public Action(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public abstract String toString();
    public abstract String getActionType();
}
