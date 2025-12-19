package controller;

import java.sql.Date;
import java.util.Map;

import jframework.annotation.API;
import jframework.annotation.Controller;
import jframework.annotation.FormatApi;
import jframework.annotation.GetUrl;
import jframework.annotation.PostUrl;
import jframework.annotation.Url;
import jframework.tools.ModelView;
import model.Chauffeur;
import model.Voiture;
import model.Maison;
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
    public ModelView resultatVoiture(Voiture fiara, Chauffeur sofera, Map<String, byte[] > attachement){
        ModelView modelView = new ModelView();
        
        if (fiara != null && sofera != null) {
            modelView.addData("message","mety ka : voiture nom est "+fiara.nom+ " ; nom an le sofera : "+ fiara.chauffeur.nom + " adresse le trano : " + fiara.chauffeur.maison.adresse + " pneu (8 bis) " + (fiara.pneus[2][7].nom) + " : " + fiara.pneus[2][7].soferization[4][5][6].nom);
            String zanakaSofera = "Reto avy ny zanany : ";
            for (String zanakaString : sofera.zanaka) {
                zanakaSofera += zanakaString+", ";
            }

            zanakaSofera += "<br> laharana : ";
            for ( int laharana : fiara.chauffeur.laharana) {
                zanakaSofera += laharana +", ";
            }

            zanakaSofera += "<br> Daty : ";
            for (Date daty : fiara.chauffeur.daty) {
                zanakaSofera += daty.toString() +", ";
            }
            modelView.addData("subtitle", zanakaSofera);
        }else {
            modelView.addData("message","tsa mety");
        }
        modelView.setView("pages/voiture.jsp");
        return modelView ;
    }

    @PostUrl("/voiture-api")
    @API
    public ModelView testAPI(Voiture fiara, Chauffeur sofera){
        ModelView modelView = new ModelView();
        
        if (fiara != null && sofera != null) {
            modelView.addData("message","mety ka : voiture nom est "+fiara.nom+ " ; nom an le sofera : "+ fiara.chauffeur.nom + " adresse le trano : " + fiara.chauffeur.maison.adresse);
            String zanakaSofera = "Reto avy ny zanany : ";
            for (String zanakaString : sofera.zanaka) {
                zanakaSofera += zanakaString+", ";
            }

            zanakaSofera += "<br> laharana : ";
            for ( int laharana : fiara.chauffeur.laharana) {
                zanakaSofera += laharana +", ";
            }

            zanakaSofera += "<br> Daty : ";
            for (Date daty : fiara.chauffeur.daty) {
                zanakaSofera += daty.toString() +", ";
            }
            modelView.addData("subtitle", zanakaSofera);
        }else {
            modelView.addData("message","tsa mety");
        }
        modelView.setView("pages/voiture.jsp");
        return modelView ;
    }

    @GetUrl("/voiture-api")
    @API
    public Voiture testAPIObjet(){
        Voiture v = new Voiture();
        v.nom = "volvo";
        v.numero = 4683;
        return v ;
    }

    @GetUrl("/voiture-api-rest")
    @API(format = FormatApi.REST)
    public Voiture testAPIObjetRobuste(){
        Voiture v = new Voiture();
        v.nom = "volvo";
        v.numero = 4683;
        return v ;
    }

    @GetUrl("/voiture-api-robuste")
    @API(format = FormatApi.ROBUSTE)
    public Voiture testAPIObjetRest(){
        Voiture v = new Voiture();
        v.nom = "volvo";
        v.numero = 4683;
        return v ;
    }

    @GetUrl("/voiture-api-not")
    @API(format = FormatApi.ROBUSTE)
    public ModelView testAPITsyMety(Voiture fiara, Chauffeur sofera) throws Exception{
        throw new Exception("Tsy mety");
    }

    @PostUrl("/import-file")
    public String importFichier(Voiture fiara) throws Exception{
        fiara.sary.transferTo("D:\\"+fiara.sary.getOriginalFilename());
        return "Okay"; 
    }
}
