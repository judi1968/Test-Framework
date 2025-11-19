package controller;

import jframework.annotation.Controller;
import jframework.annotation.Url;
import jframework.qutils.ModelView;
import jframework.annotation.RequestParam;

@Controller
public class VoitureController {
    @Url("/")
    public String demarrer(){
        return "VrrouUUMM";
    }

    @Url("/salama")
    public ModelView akory(int id, String type){
        ModelView modelView = new ModelView();
        modelView.addData("message", ""+id);
        modelView.addData("subtitle"," type : "+ type); 
        modelView.setView("pages/voiture.jsp");
        return modelView ;
    }

    @Url("/akory")
    public ModelView akoryaby(int id, @RequestParam("baba") String type){
        ModelView modelView = new ModelView(); 
        modelView.addData("message", ""+id);
        modelView.addData("subtitle"," type : "+ type); 
        modelView.setView("pages/voiture.jsp");
        return modelView ;
    }

    @Url("/voiture/{id}/{type}")
    public ModelView baba(int id, String type){
        ModelView modelView = new ModelView();
        modelView.addData("message", "Bonjour tout le monde");
        modelView.addData("subtitle", "yes "+ id + " type : "+ type); 
        modelView.setView("pages/voiture.jsp");
        return modelView ;
    }
}
