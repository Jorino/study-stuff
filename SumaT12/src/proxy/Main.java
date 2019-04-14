package proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean continueB = true;
		String controlInput = "";
		int currentImage = 0;
		int albumSize = 20;
		Image onScreen;

		List<Image> images = new ArrayList<>();

		for (int i = 1; i <= albumSize; i++) {
			images.add(new ProxyImage("IMG_" + i));
		}

		System.out.println("Image data:\n");

		for (Image i : images) {
			i.showData();
		}

		System.out.println("\n-Menu-\nWrite \"P\" to see previous\n" + "Write \"N\" to see next\n" + "Write \"Q\" to quit browsing.\n");

		while (continueB) {
			onScreen = images.get(currentImage);
			onScreen.displayImage();
			System.out.println("\nInput:");
			controlInput = sc.nextLine();
			
			switch (controlInput) {
			
			case "P":
			case "p":
				if (currentImage == 0) {
					currentImage = albumSize - 1;
				} else {
					currentImage--;
				}
				break;
				
			case "N":
			case "n":
				if (currentImage == albumSize - 1) {
					currentImage = 0;
				} else {
					currentImage++;
				}
				break;
				
			case "Q":
			case "q":
				continueB = false;
				System.out.println("\nGood bye!!");
				break;
				
			default:
				System.out.println("\nInvalid input, maybe try something else?");
				break;
			}
		}

	}

}
