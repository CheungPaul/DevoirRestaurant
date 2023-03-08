package Tools;

import Entities.Carte;
import Entities.Menu;
import Entities.Plat;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel
{
    private String[] columns;
    private Object[][] rows;

    @Override
    public int getRowCount() {
        return rows.length;
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }


    // A compléter ici

    public void LoadDatasCartes(ArrayList<Carte> desCartes){

        columns = new String[]{"Numéro","Nom"};
        rows = new Object[desCartes.size()][2];

        int i = 0;
        for (Carte cards: desCartes){
            rows[i][0] = cards.getIdCarte();
            rows[i][1] = cards.getNomCarte();
            i++;
        }
        fireTableChanged(null);
    }
    public void LoadDatasMenus(ArrayList<Menu> desMenus) {

        columns = new String[]{"Numéro", "Nom"};
        rows = new Object[desMenus.size()][2];

        int j = 0;
        for (Menu M : desMenus) {
            rows[j][0] = M.getIdMenu();
            rows[j][1] = M.getNomMenu();
            j++;
        }
        fireTableChanged(null);
    }

    public void LoadDatasPlats(ArrayList<Plat> desPlats){
        columns = new String[]{"Numéro","Nom","Note"};
        rows = new Object[desPlats.size()][3];

        int k = 0;
        for (Plat plt: desPlats) {
            rows[k][0] = plt.getIdPlat();
            rows[k][1] = plt.getNomPlat();
            rows[k][2] = plt.getNotePlat();
            k++;
        }
        fireTableChanged(null);

    }

}
