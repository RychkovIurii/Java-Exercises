package ex00;
public class Auto
{
	public int pyorat =4;
	public String rekisteri = "OCD-001";
	public int ovi = 2;
	public boolean lukossa = false;

	private int hinta = 77;
	
	public void Torvi()
	{
		System.out.println("Toot " + lukossa);
	}
	public void KerroHinta()
	{
		System.out.println("Hinta on: " + hinta);
	}
}
