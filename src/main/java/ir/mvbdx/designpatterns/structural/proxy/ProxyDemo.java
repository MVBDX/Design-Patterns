package ir.mvbdx.designpatterns.structural.proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Image proxyImage = new ProxyImage("mvbdx_logo.png");

        proxyImage.display();
        System.out.println("====================");
        proxyImage.display();
    }
}
