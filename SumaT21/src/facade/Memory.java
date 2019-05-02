package facade;

public class Memory {

	public void load(long position, byte[] data) {
		System.out.println("\nRETRIEVING DATA");
		System.out.println("\nDATA: " + data[(byte)position]);
		System.out.println("\nDATA RETRIEVED");
	}
}
