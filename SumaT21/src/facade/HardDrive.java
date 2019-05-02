package facade;

public class HardDrive {
	public byte[] read(long lba, int size) {
		System.out.println("\nLOADING DATA");
		System.out.println("\nSIZE OF DATA: " + size + " bytes");
		byte[] data = new byte[size];
		
		for(int i = 0 ; i < size ; i++ ) {
			data[i] = (byte) lba ;
		}
		
		System.out.println("\nDATA LOADED");
		return data;
		
	}

}
