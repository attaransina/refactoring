package codegenerator.address;

import codegenerator.VarType;
import codegenerator.address.Address;

public class ImidiateAddress extends Address {
    public ImidiateAddress(int num, VarType varType) {
        super(num, varType);
    }

    public String toString() {
        return "#" + num;
    }
}
