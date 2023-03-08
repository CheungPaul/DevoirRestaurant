package Entities;

import java.util.ArrayList;

public class Carte
{
    private int idCarte;
    private String nomCarte;
    private ArrayList<Menu> lesMenus;

    public Carte(int unId,String unNom)
    {
        idCarte = unId;
        nomCarte = unNom;
        lesMenus = new ArrayList<>();
    }

    public int getIdCarte() {
        return idCarte;
    }

    public String getNomCarte() {
        return nomCarte;
    }

    public ArrayList<Menu> getLesMenus() {
        return lesMenus;
    }

    public void AjouterMenu(Menu nouveauMenu)
    {
        lesMenus.add(nouveauMenu);
    }
}
