package codegenerator;

import codegenerator.address.Address;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mohammad hosein on 6/27/2015.
 */
public class Memory {
    private List<ThreeAddressCode> codeBlock;
    private int lastTempIndex;
    private int lastDataAddress;
    private final static int startTempMemoryAddress = 500;
    private final static int startDataMemoryAddress = 200;
    private final static int dataSize = 4;
    private final static int tempSize = 4;

    public Memory() {
        codeBlock = new ArrayList<>();
        lastTempIndex = Memory.startTempMemoryAddress;
        lastDataAddress = Memory.startDataMemoryAddress;
    }

    public List<ThreeAddressCode> getCodeBlock() {
        return this.codeBlock;
    }

    public int getLastTempIndex() {
        return this.lastTempIndex;
    }

    public void setLastTempIndex(int lastTempIndex) {
        this.lastTempIndex = lastTempIndex;
    }

    public int getLastDataAddress() {
        return this.lastDataAddress;
    }

    public void setLastDataAddress(int lastDataAddress) {
        this.lastDataAddress = lastDataAddress;
    }

    public int getTemp() {
        setLastTempIndex(getLastTempIndex() + Memory.tempSize);
        return getLastTempIndex() - Memory.tempSize;
    }

    public int getDateAddress() {
        setLastDataAddress(getLastDataAddress() + Memory.dataSize);
        return getLastDataAddress() - Memory.dataSize;
    }

    public int saveMemory() {
        getCodeBlock().add(new ThreeAddressCode());
        return getCodeBlock().size() - 1;
    }

    public void add3AddressCode(Operation op, Address opr1, Address opr2, Address opr3) {
        getCodeBlock().add(new ThreeAddressCode(op, opr1, opr2, opr3));
    }

    public void add3AddressCode(int i, Operation op, Address opr1, Address opr2, Address opr3) {
        getCodeBlock().remove(i);
        getCodeBlock().add(i, new ThreeAddressCode(op, opr1, opr2, opr3));
    }


    public int getCurrentCodeBlockAddress() {
        return getCodeBlock().size();
    }

    public void pintCodeBlock() {
        System.out.println("Code Block");
        for (int i = 0; i < getCodeBlock().size(); i++) {
            System.out.println(i + " : " + getCodeBlock().get(i).toString());
        }
    }
}

class ThreeAddressCode {
    public Operation operation;
    public Address Operand1;
    public Address Operand2;
    public Address Operand3;

    public ThreeAddressCode() {}

    public ThreeAddressCode(Operation op, Address opr1, Address opr2, Address opr3) {
        operation = op;
        Operand1 = opr1;
        Operand2 = opr2;
        Operand3 = opr3;
    }

    public Operation getOperation() {
        return operation;
    }

    public Address getOperand1() {
        return Operand1;
    }

    public Address getOperand2() {
        return Operand2;
    }

    public Address getOperand3() {
        return Operand3;
    }

    public String toString() {
        if (getOperation() == null) {
            return "";
        }
        StringBuilder res = new StringBuilder("(");
        res.append(getOperation().toString()).append(",");

        if (getOperand1() != null) {
            res.append(getOperand1().toString());
        }
        res.append(",");

        if (getOperand2() != null) {
            res.append(getOperand2().toString());
        }
        res.append(",");

        if (getOperand3() != null) {
            res.append(getOperand3().toString());
        }
        res.append(")");

        return res.toString();
    }
}
