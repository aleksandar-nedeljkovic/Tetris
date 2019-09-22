package domaci08292019tetris;

public class Test {

	public static void main(String[] args) {
		Linija l = new Linija();
		l.okreniLevo();
		System.out.print(l);
		System.out.println();

		LeviL ll1 = new LeviL();
		ll1.okreniDesno();
		ll1.okreniDesno();
		ll1.okreniLevo();
		System.out.print(ll1);
		System.out.println();

		DesniL dl1 = new DesniL();
		dl1.okreniDesno();
		dl1.okreniDesno();
		dl1.okreniLevo();
		System.out.println(dl1);
		System.out.println();

		Kvadrat k = new Kvadrat();
		System.out.println(k);
		System.out.println();

		LeviZ lz1 = new LeviZ();
		lz1.okreniDesno();
		System.out.println(lz1);
		System.out.println();

		DesniZ dz1 = new DesniZ();
		dz1.okreniDesno();
		dz1.okreniLevo();
		dz1.okreniDesno();
		System.out.println(dz1);
		System.out.println();

		ObrnutoT t = new ObrnutoT();
		t.okreniLevo();
		System.out.println(t);
		System.out.println();

	}

}
