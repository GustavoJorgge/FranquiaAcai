public class Acai {

    private Double tamanho;
    private Double valor;
    private boolean acrescimo = false;

    Acai(){
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public boolean isAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(boolean acrescimo) {
        this.acrescimo = acrescimo;
    }

    public Double CalculaValor(Double total){
        if(tamanho==300){
            valor = 8.0;
        }else if(tamanho==500){
            valor = 10.0;
        }else if(tamanho == 700){
            valor = 12.0;
        }else{
            System.out.printf("Tamanho incorreto");
        }

        if(acrescimo){
            this.valor += 2.0;
            return this.valor;
        }else
            return this.valor;
    }



}
