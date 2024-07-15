package datas;

public class Data {
    int dia;
    int mes;
    int ano;

    int[] meses31 = new int[](1, 3, 5, 7, 8, 10, 12);

    Data(int dia, int mes, int ano) {
        if(dia < 1 || dia > 31) {
            throw new IllegalArgumentException("Dia deve estar entre 1 e 31");
        }
        if (mes < 1 || mes > 12) {
            throw new IllegalArgumentException("O mes deve estar entre 1 e 12");
        }
        validaAno(ano);
        if (dia == 31 && !testaMes31(mes)) {
            throw new IllegalArgumentException(
                String.format("O mes %d nao pode ter 31 dias", mes)
            );
        }
        //TODO: validar fevereiro
    }

    void validaAno(int ano) {
        if(ano < 0 || ano > 2999) {
            throw new IllegalArgumentException("Ano deve estar entre 0 e 2999");
        }
    }

    boolean testaMes31(int mes) {
        for (int m : meses31) {
            if (m == mes) {
                return true;
            }
        }
        return false;
    }

    boolean bissexto(int ano) {
        if (ano % 4 != 0) {
            return false;
        }
        if (ano % 100 != 0) {
            return true;
        }

        return ano % 400 == 0;
    }
}
