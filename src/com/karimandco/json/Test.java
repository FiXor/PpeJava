/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karimandco.json;

/**
 *
 * @author c.nadal
 */
public class Test {

    public static void main(String[] args) {
        ImportExportJSON objEXML = new ImportExportJSON("export11json.json");
        objEXML.exportFichier();
        System.out.println(objEXML.importFichier());
    }
}
