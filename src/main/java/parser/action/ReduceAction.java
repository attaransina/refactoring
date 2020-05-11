package parser.action;

public class ReduceAction extends Action {
    public ReduceAction(int number) {
        super(number);
    }

    @Override
    public String toString() {
        return "r" + getNumber();
    }

    @Override
    public String getActionType() {
        return "reduce";
    }
}
