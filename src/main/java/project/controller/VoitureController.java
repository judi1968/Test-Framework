package controller;

import jframework.annotation.Controller;
import jframework.annotation.Url;
import jframework.qutils.ModelView;

@Controller
public class VoitureController {
    @Url("/demarre")
    public String demarrer(){
        return "VrrouUUMM";
    }

    @Url("/salama")
    public ModelView akory(){
        ModelView modelView = new ModelView();
        modelView.setView("pages/voiture.jsp");
        return modelView ;
    }

    @Url("/voiture")
    public ModelView baba(){
        ModelView modelView = new ModelView();
        modelView.setView("pages/voiture.jsp");
        return modelView ;
    }
}
