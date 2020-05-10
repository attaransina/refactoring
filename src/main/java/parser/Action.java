package parser;

public class Action {
    public Act action;
    public int number;

    public Action(Act action, int number) {
        this.action = action;
        this.number = number;
    }

    public String toString() {
        switch (action) {
            case accept:
                return "acc";
            case shift:
                return "s" + number;
            case reduce:
                return "r" + number;
        }
        return action.toString() + number;
    }
}

enum Act {
    shift,
    reduce,
    accept
}
