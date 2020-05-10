package codegenerator.address;

import codegenerator.VarType;
import codegenerator.address.Address;

public class IndirectAddress extends Address {
    public IndirectAddress(int num, VarType varType) {
        super(num, varType);
    }

    public String toString() {
        return "@" + num;
    }
}
