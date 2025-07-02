public non-sealed class RelogioBR extends Clock {

    @Override
    public Clock convert(Clock clock) {
        this.segundo = clock.getSegundo();
        this.minuto  = clock.getMinuto();
        switch (clock){
            case RelogioUSA relogioUsa -> this.hora = (relogioUsa.getPeriodo().equals("PM")) ?
                    relogioUsa.getHora() + 12 :
                    relogioUsa.getHora();
            case RelogioBR relogioBr -> this.hora = relogioBr.getHora();
        }
        return this;
    }
}
