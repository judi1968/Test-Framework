package controller;

import jframework.annotation.Controller;
import jframework.annotation.Url;

@Controller
public class Personne {
    @Url("/oui")
    public void afficherInfos() {
        
    }

    public Personne(){}
}
