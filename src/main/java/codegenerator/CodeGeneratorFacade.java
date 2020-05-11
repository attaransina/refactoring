package codegenerator;

import scanner.token.Token;

public class CodeGeneratorFacade {
    private Memory memory;
    private CodeGenerator codeGenerator;

    public CodeGeneratorFacade() {
        memory = new Memory();
        codeGenerator = new CodeGenerator();
    }

    public Memory getMemory() {
        return memory;
    }

    public CodeGenerator getCodeGenerator() {
        return codeGenerator;
    }

    public void printMemory() {
        getCodeGenerator().printMemory();
    }

    public void semanticFunction(int func, Token next) {
        getCodeGenerator().semanticFunction(func, next);
    }

}
