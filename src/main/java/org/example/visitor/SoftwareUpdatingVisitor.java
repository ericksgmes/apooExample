package org.example.visitor;

import java.time.Year;

public class SoftwareUpdatingVisitor implements Visitor {

    @Override
    public void visit(Ipad ipad) {
        String yearStr = ipad.getYear();
        try {
            int anoFabricacao = Integer.parseInt(yearStr);
            int anoAtual = Year.now().getValue();
            if (anoAtual - anoFabricacao > 5) {
                System.out.println("iPad de “" + yearStr + "” é mais antigo que 5 anos: não recebe update.");
                // ou lógica para negar update
            } else {
                System.out.println("iPad de “" + yearStr + "” tem até 5 anos: recebe update.");
                // lógica para aplicar update
            }
        } catch (NumberFormatException e) {
            System.err.println("Formato de ano inválido: “" + yearStr + "”. Não é possível determinar elegibilidade ao update.");
            // tratar conforme sua necessidade (lançar exceção, pular, log etc.)
        }
    }

    @Override
    public void visit(SamsungTab samsungTab) {
        String yearStr = samsungTab.getYear();
        try {
            int anoFabricacao = Integer.parseInt(yearStr);
            int anoAtual = Year.now().getValue();
            if (anoAtual - anoFabricacao > 5) {
                System.out.println("SamsungTab de “" + yearStr + "” é mais antigo que 5 anos: não recebe update.");
            } else {
                System.out.println("SamsungTab de “" + yearStr + "” tem até 5 anos: recebe update.");
            }
        } catch (NumberFormatException e) {
            System.err.println("Formato de ano inválido: “" + yearStr + "”.");
        }
    }
}
