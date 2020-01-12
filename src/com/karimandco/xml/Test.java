/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karimandco.xml;

/**
 *
 * @author c.nadal
 */
public class Test {

    public static void main(String[] args) {
        ImportExportXML objEXML = new ImportExportXML("export6nov.xml");
        objEXML.exportFichier();
        System.out.println(objEXML.importFichier());
    }
}
