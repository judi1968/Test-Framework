package controller;

import jframework.annotation.Controller;
import jframework.annotation.Url;
import jframework.qutils.ModelView;

@Controller
public class VoitureController {
    @Url("/")
    public String demarrer(){
        return "VrrouUUMM";
    }

    @Url("/salama")
    public ModelView akory(){
        ModelView modelView = new ModelView();
        modelView.setView("pages/voiture.jsp");
        return modelView ;
    }

    @Url("/voiture/{id}/{type}")
    public ModelView baba(){
        ModelView modelView = new ModelView();
        modelView.addData("message", "Bonjour tout le monde");
        modelView.addData("subtitle", "yes");
        modelView.setView("pages/voiture.jsp");
        return modelView ;
    }
}
