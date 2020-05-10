package codegenerator.address;

import codegenerator.VarType;
import codegenerator.address.Address;

public class DirectAddress extends Address {
    public DirectAddress(int num, VarType varType) {
        super(num, varType);
    }

    public String toString() {
        return num + "";
    }
}
