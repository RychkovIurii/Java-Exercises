package ex00;
public class ObjektiEsim
{
	public static void main(String[] args)
	{
		Auto mersu = new Auto();
		Auto lada = new Auto();
		Auto jeeppi = new Auto();
		Auto pakettiAuto = lada;

		mersu.rekisteri = "JEE-351";
		jeeppi.rekisteri = "MOI-000";
		lada.rekisteri = "TEE-001";

		jeeppi.lukossa = true;
		System.out.println(lada.rekisteri);
		System.out.println(jeeppi.rekisteri);
		System.out.println(mersu.rekisteri);
		System.out.println(pakettiAuto.rekisteri);

		mersu.Torvi();
		lada.Torvi();
		jeeppi.Torvi();

		pakettiAuto.KerroHinta();
	}
}
