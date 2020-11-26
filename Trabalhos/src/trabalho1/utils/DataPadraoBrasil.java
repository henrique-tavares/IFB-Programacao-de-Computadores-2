package trabalho1.utils;

public class DataPadraoBrasil {
    private String dia, mes, ano;

    public DataPadraoBrasil(String dia, String mes, String ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return String.join("/", dia, mes, ano);
    }

}