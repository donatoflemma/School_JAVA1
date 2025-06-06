/**
*
*Datetype (Data Type):<
*						- !! Class sind Daten Typen !!!
*						- Eine Menge von Werte (Objekte) und
*						- Eine Menge von operationen (Operatoren,Methoden) , die auf die Werte bzw Objekte angewendet werden können
*
*Arten:					
*		-  Primitive (Fundamental, Elementar , intrinsic = buitin,..) DatenType
*						-> Java hat 8 primitiv Datentype
*						-> Zahlen:
*								-> ganze Zahlen : byte (8) , short (16) , int (32) , long (64)
*								-> Flißkomma Zahlen : float (32), double (64)
*						-> Zeichen
*						-> Wahrheitwerte 
*/
public class DataType {
	public static void main (String[] args) {
		System.out.println(Byte.MIN_VALUE + "...." + Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE + "...." + Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE + "...." + Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE + "...." + Long.MAX_VALUE);
	}
}
