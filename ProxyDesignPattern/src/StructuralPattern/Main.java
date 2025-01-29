package StructuralPattern;

import StructuralPattern.Image.Image;
import StructuralPattern.Image.ProxyImage;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image is loaded only when display() is called
        image1.display();  // Loads from disk, then displays
        System.out.println("---");
        image1.display();  // Displays without loading again
        System.out.println("---");
        image2.display();  // Loads from disk, then displays
    }
}
