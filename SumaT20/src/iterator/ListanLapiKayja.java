package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListanLapiKayja {
	
	private List<Integer> list;
	private Iterator<Integer> itr;
	private Iterator<Integer> itr2;
	private int laskuri;
	
	public ListanLapiKayja(ArrayList<Integer> list) {
		this.list = list;
		this.itr = list.iterator();
		this.itr2 = itr;
		this.laskuri = 0;
	}
	
	public void lisaaListaan(int arvo) {
		list.add(arvo);
	}
	
	public void aloita() {
		new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(600);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				kayLapi();
				//kayLapi2();
			}
		}).start();
	}
	
	public void aloita2() {
		new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				kayLapi();
			}
		}).start();
	}
	
	public void aloita3() {
		new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				kayLapi2();
			}
		}).start();
	}
	
	private void kayLapi() {
		/*if(laskuri == 11) {
			list.add(22);
		}
		*/
		if(itr.hasNext()) {
			System.out.println("Arvo 1: " + itr.next());
			//laskuri++;
		}
	}
	
	private void kayLapi2() {
		/*if(laskuri == 11) {
			list.add(22);
		}
		*/
		if(itr2.hasNext()) {
			System.out.println("Arvo 2: " + itr2.next());
			//laskuri++;
		}
	}
	

}
