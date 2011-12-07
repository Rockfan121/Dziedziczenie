public class Figura
{
	public abstract void rysuj (); //nie ma definicji, interfejs
	
	
	public static void main(String[] args) 
	{
		Figura a = new Kolo(new Punkt(1d, 1d), 1d);
		a.rysuj();
		a = new Prostokat(new Punkt(-1d, -1d), new Punkt(1d, 1d));
		a.rysuj();
		//a = new Kwadrat (new Punkt(-1d, -1d), new Punkt(1d, 1d));
		//a.rysuj();
	}
	
}