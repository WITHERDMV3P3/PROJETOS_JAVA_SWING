package lab_padrao_java_singleton;

/**
*@author cristian
*/
public class Singleton {
	
private static Singleton instancia;

private Singleton() {
	super();
}

public static Singleton getinstancia() {
	if(instancia == null) {
		instancia = new Singleton();
	}
	return instancia;
}


}
