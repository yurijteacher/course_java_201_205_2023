package lecture2.patterns.creational_patterns.factory;

public class ShareFactory {
    Share share;
    public Share getShare(String name){

        switch(name){
            case ("квадрат"):
                share = new Square();
                break;
            case ("коло"):
                share = new Circle();
                break;
            case ("точка"):
                share = new Point();
                break;
        }

        return share;

        /* поліморфізм!!!
        Share share1 = new Point();
        Share share2 = new Circle();
        Share share3 = new Square();
         */
    }



}
