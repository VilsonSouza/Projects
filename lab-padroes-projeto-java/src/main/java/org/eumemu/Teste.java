package org.eumemu;

import org.eumemu.facade.Facade;
import org.eumemu.singleton.SingletonEager;
import org.eumemu.singleton.SingletonLazy;
import org.eumemu.singleton.SingletonLazyHolder;
import org.eumemu.strategy.*;

public class Teste {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        SingletonEager eager = SingletonEager.getInstancia();
        SingletonLazyHolder lazyholder = SingletonLazyHolder.getInstancia();

        System.out.println(lazy);
        System.out.println(lazy);
        System.out.println("\n");
        System.out.println(eager);
        System.out.println(eager);
        System.out.println("\n");
        System.out.println(lazyholder);
        System.out.println(lazyholder);

        //Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();


        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        //Facede
        Facade facade = new Facade();
        facade.migrarCliente("Venilton","12198270");

    }
}
