package parser.action;

public class ShiftAction extends Action {
    public ShiftAction(int number) {
        super(number);
    }

    @Override
    public String toString() {
        return "s" + getNumber();
    }

    @Override
    public String getActionType() {
        return "shift";
    }


}
