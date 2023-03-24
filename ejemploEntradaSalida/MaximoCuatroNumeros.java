import java.io.Console;

public class MaximoCuatroNumeros {

    //@ ensures \result == a | \result == b | \result == c | \result == d;
    //@ ensures \result >= a & \result >= b & \result >= c & \result >= d;
    public static int max(int a, int b, int c, int d) {
	if (a > b) {
	    if (c > d) {
		if (a > c)
		    return a;
		else
		    return c;
	    } else {
		if (a > d)
		    return a;
		else
		    return d;
	    }
	} else {
	    if (c > d) {
		if (b > c)
		    return b;
		else
		    return c;
        } else {
		if (b > d)
		    return b;
		else
		    return d;
	    }
	}
    }

    public static void main(String[] args) {
	// obtener entero
	Console consola = System.console();
	//@ assert consola != null;
	String nombre = consola.readLine("Indique su nombre: ");
	System.out.println("Hola "+nombre);
	System.out.println("A continuacion, indique los cuatro valores a comparar");
	int a = Integer.parseInt(consola.readLine("a: "));
	int b = Integer.parseInt(consola.readLine("b: "));
	int c = Integer.parseInt(consola.readLine("c: "));
	int d = Integer.parseInt(consola.readLine("d: "));
	System.out.println("El valor mayor es: "+max(a,b,c,d));
    }
}
