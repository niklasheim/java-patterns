package net.dobl;


public abstract class WR implements IUmrechnen{

    public WR nextWR;
    public String variante;
    public double betrag;

    public static class WRBuilder {
        private String variante;
        private double betrag;
        private WR nextWR;
        private WR type;

        public WRBuilder withVariante(String variante){
            this.variante = variante;
            return this;
        }

        public WRBuilder withBetrag(double betrag){
            this.betrag = betrag;
            return this;
        }

        public WRBuilder withNext(WR nextWR){
            this.nextWR = nextWR;
            return this;
        }

        public WRBuilder withType(WR type){
            this.type = type;
            return this;
        }

        public WR build(){
            WR wr = type;
            wr.nextWR = this.nextWR;
            wr.betrag = this.betrag;
            wr.variante = this.variante;
            return wr;
        }
    }

    public double umrechnen(){
        if(this.compareVariant(variante)){
            return calculate(betrag);
        } else {
            
            return nextWR.umrechnen();
        }
    }
    
    public void setNextWR(WR nextWR){
        this.nextWR = nextWR;
    }

    public abstract boolean compareVariant(String variant);
    public abstract double calculate(double betrag); 

}
