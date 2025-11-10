package controller;

import jframework.annotation.Controller;
import jframework.annotation.Url;
import jframework.qutils.ModelView;

@Controller
public class Personne {
    @Url("/oui")
    public void afficherInfos() {
        
    }

    @Url("/akory")
    public ModelView akory(){
        ModelView modelView = new ModelView();
        modelView.setView("yes.jsp");
        return modelView ;
    }

}
