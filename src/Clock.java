public sealed abstract class Clock permits RelogioBR, RelogioUSA{

protected int hora;

protected int minuto;

protected int segundo;

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if(segundo >= 60) {
            this.segundo = 60;
            return;
        }
        this.segundo = segundo;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if(minuto >= 60) {
            this.minuto = 60;
            return;
        }
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if(hora >= 24){
            this.hora = 24;
            return;
        }
        this.hora = hora;
    }
    private String format(int value){
        return value < 9 ? "0" + value : String.valueOf(value);
    }

    public String getTempo(){
        return  format(hora) + ":" + format(minuto) + ":" + format(segundo);
    }

    abstract Clock convert (Clock clock);

}
