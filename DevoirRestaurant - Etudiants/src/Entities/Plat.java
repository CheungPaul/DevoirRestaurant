package Entities;

public class Plat
{
    private int idPlat;
    private String nomPlat;
    private int notePlat;
    private String imagePlat;

    public Plat(int unId, String unNom, int uneNote,String uneImage)
    {
        idPlat = unId;
        nomPlat = unNom;
        notePlat = uneNote;
        imagePlat = uneImage;
    }

    public int getIdPlat() {
        return idPlat;
    }

    public String getNomPlat() {
        return nomPlat;
    }

    public int getNotePlat() {
        return notePlat;
    }

    public String getImagePlat() {
        return imagePlat;
    }

    // Cette méthode permet d'additionner la note passée en paramètre
    // à la note du plat. Il s'agit de faire un cumul.
    public void CalculerNotePlat(int uneNote) {
        // A compléter ici
        notePlat = notePlat + uneNote;
    }
}
