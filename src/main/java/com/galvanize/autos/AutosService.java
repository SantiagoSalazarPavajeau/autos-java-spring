package com.galvanize.autos;

import org.springframework.stereotype.Service;

@Service
public class AutosService {


//    public AutosService(AutosRepository autosRepository) {
//        this.autosRepository = autosRepository;
//    }

//    AutosRepository autosRepository;

//    List<Auto> autoList = new ArrayList<>();

    public AutosList getAutos(){
        // Query: select * from autos;
        // Put that in a list
        // Return a new AutosList with the list
//
        return null;
    }

    public AutosList getAutos(String color, String make){
        return null;
    }

    public Automobile addAuto(Automobile auto) {
        return null;
    }

    public Automobile getAuto(String vin) {
        return null;
    }

    public Automobile updateAuto(String vin, String color, String owner) {
        return null;
    }

    public void deleteAuto(String vin) {

    }
}


//
//    public List<Auto> getAllByMake(String make){
//        List<Auto> resultsByMake = new ArrayList<>();
//        for(Auto auto : autoList){
//            if (auto.getMake() == make){
//                resultsByMake.add(auto);
//            }
//        }
//        return resultsByMake;
//    }
//
//    public List<Auto> getAllByMakeAndColor(String color, String make) {
//        List<Auto> resultsByMakeAndColor = new ArrayList<>();
//        for(Auto auto : autoList){
//            if (auto.getColor() == color && auto.getMake() == make ){
//                resultsByMakeAndColor.add(auto);
//            }
//        }
//        return resultsByMakeAndColor;
//    }