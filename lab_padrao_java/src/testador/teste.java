package testador;
import lab_padrao_java_facede.Facede;
import lab_padrao_java_singleton.Sigleton_2;
import lab_padrao_java_singleton.Singleton;
import lab_padrao_java_singleton.Singleton_3;
import lab_padrao_java_strategy.Comportamento;
import lab_padrao_java_strategy.ComportamentoAgressivo;
import lab_padrao_java_strategy.ComportamentoDefensivo;
import lab_padrao_java_strategy.ComportamentoNormal;
import lab_padrao_java_strategy.Robo;

public class teste {

	public static void main(String[] args) {
		
		//singleton
		Singleton lazy = Singleton.getinstancia();
		System.out.println(lazy);
		
		lazy = Singleton.getinstancia();
		System.out.println(lazy);
		
		Sigleton_2 lazy2 = Sigleton_2.getinstancia();
		System.out.println(lazy2);
		
		lazy2 = Sigleton_2.getinstancia();
		System.out.println(lazy2);
		
		Singleton_3 lazy3 = Singleton_3.getinstancia();
		System.out.println(lazy3);
		
		lazy3 = Singleton_3.getinstancia();
		System.out.println(lazy3);
		
		//strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		
		robo.setComportamento(defensivo);
		robo.mover();
		
		robo.setComportamento(agressivo);
		robo.mover();
		
		//facede
		
		Facede facede = new Facede();
		facede.migrarCliente("teste", "123456789");
	}

}
