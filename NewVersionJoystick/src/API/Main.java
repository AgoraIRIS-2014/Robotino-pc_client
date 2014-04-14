package API;

public class Main {
	public static void main(String[] args) {
		IHM monCadre = new IHM();
		monCadre.setTitle("Robotino");
		monCadre.pack();
		monCadre.setVisible(true);
		monCadre.setSize(850, 650);
	}
}
