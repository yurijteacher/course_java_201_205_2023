package lecture2.patterns.structural_patterns.proxy;

public class MyImage implements Image{


    String file;

    public MyImage(String file) {
        this.file = file;
        load();
    }

    public void load(){
        System.out.println("load " + file);
    }

    @Override
    public void display() {
        System.out.println("view " + file);
    }
}
