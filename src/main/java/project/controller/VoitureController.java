package controller;

import java.util.Map;

import jframework.annotation.Controller;
import jframework.annotation.GetUrl;
import jframework.annotation.PostUrl;
import jframework.annotation.Url;
import jframework.qutils.ModelView;
import model.Chauffeur;
import model.Voiture;
import jframework.annotation.RequestParam;

@Controller
public class VoitureController {
    @GetUrl("/") 
    public String demarrer(){
        return "VrrouUUMM";
    }

    

    @GetUrl("/salama")
    public ModelView akory(int id, String type){
        ModelView modelView = new ModelView();
        modelView.addData("message", ""+id);
        modelView.addData("subtitle"," type : "+ type); 
        modelView.setView("pages/voiture.jsp");
        return modelView ;
    }

    @PostUrl("/salama")
    public ModelView akoryPost(int id, String type){
        ModelView modelView = new ModelView();
        modelView.addData("message", ""+id);
        modelView.addData("subtitle"," type : "+ type); 
        modelView.setView("pages/voiture.jsp");
        return modelView ;
    }

    @PostUrl("/akory")
    public ModelView akoryaby(int id, @RequestParam("baba") String type){
        ModelView modelView = new ModelView(); 
        modelView.addData("message", ""+id);
        modelView.addData("subtitle"," type : "+ type); 
        modelView.setView("pages/voiture.jsp");
        return modelView ;
    }

    @PostUrl("/voiture/{id}/{type}")
    public ModelView baba(int id, String type){
        ModelView modelView = new ModelView();
        modelView.addData("message", "Bonjour tout le monde");
        modelView.addData("subtitle", "yes "+ id + " type : "+ type); 
        modelView.setView("pages/voiture.jsp");
        return modelView ;
    }

    @PostUrl("/bm")
    public ModelView bebe(int id, String type, Map<String, Object> huhu){
        ModelView modelView = new ModelView();
        String nom = (String)huhu.get("nom");
        String prenom = (String)huhu.get("prenom");
        String aidihy = (String) huhu.get("id");
        Object val = huhu.get("baba");
        String[] baba ;
        if (val instanceof String[]) {
            baba = (String[]) val;
        } else if (val instanceof String) {
            baba = new String[]{ (String) val };
        } else {
            baba = new String[0]; 
        }
        String baba2 = "";
        for (String string : baba) {
            baba2 += " "+string;
        } 
        modelView.addData("message", "Bonjour "+ nom +" " + prenom+ " aidihy "+ aidihy);
        modelView.addData("subtitle", "id : "+ id + " type : "+ type+ " checkbox : "+baba2); 
        modelView.setView("pages/voiture.jsp");
        return modelView ;
    }

    @GetUrl("/formulaire")
    public ModelView formulaire(){
        ModelView modelView = new ModelView();
        
        modelView.setView("pages/voiture.jsp");
        return modelView ;
    }

    @PostUrl("/voiture")
    public ModelView resultatVoiture(Voiture fiara, Chauffeur sofera){
        ModelView modelView = new ModelView();
        
        if (fiara != null && sofera != null) {
            modelView.addData("message","mety ka : voiture nom est "+fiara.nom+ " nom an le sofera : "+ fiara.chauffeur.nom);
        }else {
            modelView.addData("message","tsa mety");
        }
        modelView.setView("pages/voiture.jsp");
        return modelView ;
    }
}
