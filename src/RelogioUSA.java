public non-sealed class RelogioUSA  extends Clock{

    private String periodo;

    public String getPeriodo() {
        return periodo;
    }
    public void setDepoisMeioDia(){
        this.periodo = "PM";
    }
    public void setAntesMeioDia(){
        this.periodo = "AM";
    }

    public void setHora(int hora) {
        setAntesMeioDia();
        if((hora > 12) && (hora <=23)){
            setDepoisMeioDia();
            this.hora = hora - 12;
        } else if (hora >= 24) {
            this.hora = 0;
        }else{
            this.hora = hora;
        }
    }
    @Override
    Clock convert(Clock clock) {
        this.segundo = clock.getSegundo();
        this.minuto  = clock.getMinuto();
        switch (clock) {
            case RelogioUSA relogioUsa -> {
                this.hora = relogioUsa.getHora();
                this.periodo = relogioUsa.getPeriodo();
            }
            case RelogioBR relogioBr -> this.setHora(relogioBr.getHora());
        }
        return this;
    }

    @Override
    public String getTempo(){
        return super.getTempo() + " " + this.periodo;
    }
}
