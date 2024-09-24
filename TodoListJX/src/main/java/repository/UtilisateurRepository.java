package repository;

public class UtilisateurRepository{

public String inscription(String nom, String prenom, String email, String password){
    if (nom.isEmpty() || prenom.isEmpty() || email.isEmpty() || password.isEmpty()){
        return "Erreur";
    }
    if (nom.equals(prenom) && email.equals(email) && password.equals(password)){
        return "Ok";
    }
    return "Wrong";
}
public String login(String nom, String prenom, String email, String password){
    if (nom.isEmpty() || prenom.isEmpty() || email.isEmpty() || password.isEmpty()){
        return "Erreur";
    }
    if (nom.equals(prenom) && email.equals(email) && password.equals(password)){
        return "Ok";
    }
    return "Wrong";
}

    }


