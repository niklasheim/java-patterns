package net.dobl;

public class UmrechnenDecoratorStat extends UmrechnenDecorator {
    public UmrechnenDecoratorStat(IUmrechnen decoratedUmrechner){
        super(decoratedUmrechner);
    }

    public double umrechnen(String variante, double betrag){
        return decoratedUmrechner.umrechnen(variante, betrag + 5);
    }
}
