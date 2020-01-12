/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karimandco.csv;

import com.karimandco.bdd.DaoSIO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author c.nadal
 */
public class ImportExportCSV extends Export {

    public ImportExportCSV(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    @Override
    public void exportFichier() {
        FileWriter objFile = null;
        try {
            //ouverture du fichier en écriture
            String[][] requettes = requeteSelectAllAdmin("SELECT id, statut, identifiant, mot_de_passe, nom, prenom, num_telephone, courriel, date_de_naissance FROM utilisateurs");

            objFile = new FileWriter(this.nomFichier);
            Integer nbTab1 = requettes.length;

            System.out.println(nbTab1);
            for (int i = 0; i < nbTab1; i++) {
                //Integer nbTab2 = requettes[i].length;
                //  for (int j = 0; j < nbTab2; j++) {
                objFile.write(Arrays.toString(requettes[i]) + "\r\n");
                                //objFile.write(requettes[i]+ "\r\n");
// retirer premier et dernier caractere 
                
                
                
                // }
            }
            objFile.write("salut\r\n");
            objFile.write("salut\r\n");

            objFile.close();

        } catch (IOException ex) {
            Logger.getLogger(ImportExportCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String importFichier() {
        String resultat = "";

        try {
            FileReader objFile = null;

            //ouverture du fichier en lecture
            objFile = new FileReader(this.nomFichier);
            int c;
            while ((c = objFile.read()) != -1) {
                resultat += (char) c;
            }
            objFile.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImportExportCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImportExportCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultat;
    }

    private String[][] requeteSelectAllAdmin(String sql) {
        String[][] resultat = null;

        try {
            int nbr_ligne = 0;
            ResultSet res = DaoSIO.getInstance().requeteSelection("SELECT COUNT(*) FROM utilisateurs");
            while (res.next()) {
                nbr_ligne = res.getInt(1);
            }

            ResultSet lesTuples = DaoSIO.getInstance().requeteSelection(sql);
            int nbr_colonne = lesTuples.getMetaData().getColumnCount() + 1;
            int compteur_ligne = 0;

            resultat = new String[nbr_ligne][nbr_colonne];

            while (lesTuples.next()) {
                for (int i = 1; i < nbr_colonne; i++) {
                    String col_name = lesTuples.getMetaData().getColumnName(i);

                    resultat[compteur_ligne][i] = lesTuples.getString(col_name);
                }
                compteur_ligne++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoSIO.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return resultat;
    }

}
