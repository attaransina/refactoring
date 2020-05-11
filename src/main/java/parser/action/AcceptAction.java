package parser.action;

public class AcceptAction extends Action {

    public AcceptAction(int number) {
        super(number);
    }

    @Override
    public String toString() {
        return "acc";
    }

    @Override
    public String getActionType() {
        return "accept";
    }
}
