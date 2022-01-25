package net.dobl;

public abstract class UmrechnenDecorator implements IUmrechnen{
    public IUmrechnen decoratedUmrechner;

    public UmrechnenDecorator(IUmrechnen decoratedUmrechner){
        this.decoratedUmrechner = decoratedUmrechner;
    }

    public double umrechnen(String variante, double betrag){
        return decoratedUmrechner.umrechnen(variante, betrag);
    }
}
