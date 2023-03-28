package lecture2.patterns.structural_patterns.proxy;

public class Proxy implements Image{

    String file;
    MyImage myImage;

    public Proxy(String file) {
        this.file = file;
    }

    public void copy(){
        System.out.println("copy " + file);
    }


    @Override
    public void display() {
        if(myImage == null) myImage = new MyImage(file);
        copy();
    }


}
