package _05_19;

public class Test {
	public static void main(String[] args) {
		
		Artikel.setMwst(19);
		
		Artikel  a = new Artikel(2025, "Ladekabel-XYZ", 1.99);
		
		System.out.println(a.getBezeichnung());
		System.out.println(a.getPreis());
		
//		System.out.println(Artikel.mwst);
//		System.out.println(a.mwst);
		
		Artikel a2 = new Artikel(2021, "Thinkpad - Laptop", 899.99);
		
//		System.out.println(a.getBezeichnung() + ", " + a.getPreis() + ", MWST = " + Artikel.getMwst());
//		System.out.println(a2.getBezeichnung() + ", " + a2.getPreis()  + ", MWST = " + Artikel.getMwst());
		System.out.println("a = " + a);
		System.out.println("a2 = " + a2);
		
//		a.mwst = 12;
//		a2.mwst = 12;
		
		Artikel.setMwst(12);;
		
//		System.out.println(a.getBezeichnung() + ", " + a.getPreis() + ", MWST = " + Artikel.getMwst());
//		System.out.println(a2.getBezeichnung() + ", " + a2.getPreis()  + ", MWST = " + Artikel.getMwst());
		System.out.println("a = " + a);
		System.out.println("a2 = " + a2);
		
		Artikel a3 = new Artikel(2020, "abc", 450);
		System.out.println(a3);
		
		
	}

}
