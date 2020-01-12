/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karimandco.json;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author c.nadal
 */
public class ImportExportJSON extends Export {

    public ImportExportJSON(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    @Override
    public void exportFichier() {
        FileWriter objFile = null;
        try {
            //ouverture du fichier en écriture
            objFile = new FileWriter(this.nomFichier);
            objFile.write("client {\r\n");
            objFile.write("\"Nom\" : \"Prenom\";\r\n");
            objFile.write("\"Potter\" : \"Harry\";\r\n");
            objFile.write("\"Lecouz\" : \"yooo\";\r\n");

            objFile.write("}");

            objFile.close();

        } catch (IOException ex) {
            Logger.getLogger(ImportExportJSON.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ImportExportJSON.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImportExportJSON.class.getName()).log(Level.SEVERE, null, ex);
        }

        return resultat;
    }

}
