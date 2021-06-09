package enums;

public enum DiaDaSemana {

    Segunda (true),
    Terca (true),
    Quarta (true),
    Quinta (true),
    Sexta (true),
    Sabado (false),
    Domingo(false);

    private boolean diaUtil;

    //por padrao construtores e booleanos no enum já vem como privados
    private DiaDaSemana (boolean diaUtil){
        this.diaUtil = diaUtil;
    }

    public boolean isDiaUtil(){
        return diaUtil;
    }
}
