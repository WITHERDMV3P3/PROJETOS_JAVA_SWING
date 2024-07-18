package lab_padrao_java_singleton;

/**
*@author cristian
*/
public class Sigleton_2 {
	
private static Sigleton_2 instancia = new Sigleton_2();

private Sigleton_2() {
	super();
}

public static Sigleton_2 getinstancia() {
	return instancia;
}
}

