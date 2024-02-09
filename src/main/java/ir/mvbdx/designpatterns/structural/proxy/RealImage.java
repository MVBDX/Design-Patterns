package ir.mvbdx.designpatterns.structural.proxy;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.printf("Loading %s from disk ...%n", fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

}
