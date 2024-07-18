package lab_padrao_java_singleton;


/**
*@author cristian
*/
public class Singleton_3 {
	
private static class Holder{
public static Singleton_3 instancia = new Singleton_3();
}
private Singleton_3() {
	super();
}

public static Singleton_3 getinstancia() {
	return Holder.instancia;
}
}

