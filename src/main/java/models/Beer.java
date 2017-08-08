package models;

import java.util.ArrayList;

/**
 * Created by Guest on 8/8/17.
 */
public class Beer {

    private String beerName;

    private static ArrayList<Beer> instances= new ArrayList<Beer>();

    public Beer(String beerName) {
        this.beerName = beerName;
        instances.add(this);
    }

    public String getBeerName() {
        return beerName;
    }
    public static ArrayList<Beer> getAll() {
        return instances;
    }
        public static void clearAllPosts(){
        instances.clear();
    }
}
//    private boolean onTap;
//    private boolean beerLiked;
//    private String beerStyle;
//    private int ABV;
//    private String flavorNote;
//    private int price;
//    private boolean local;


//    public boolean getOnTap() {
//        return onTap;
//    }
//
//    public boolean isLocal() {
//        return local;
//    }
//
//    public int getPrice() {
//
//        return price;
//    }
//
//    public String getFlavorNote() {
//
//        return flavorNote;
//    }
//
//    public int getABV() {
//
//        return ABV;
//    }

//
//    public String getBeerStyle() {
//
//        return beerStyle;
//    }
//
//    public boolean isBeerLiked() {
//
//        return beerLiked;
//    }




