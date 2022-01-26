package net.dobl;

public class UmrechnenDecoratorDyn extends UmrechnenDecorator {
    public UmrechnenDecoratorDyn(IUmrechnen decoratedUmrechner){
        super(decoratedUmrechner);
    }

    public double umrechnen(String variante, double betrag){
        return decoratedUmrechner.umrechnen(variante, betrag * 1.005);
    }
}