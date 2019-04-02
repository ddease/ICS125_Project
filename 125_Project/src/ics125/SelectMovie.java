/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics125;

import java.io.IOException;

/**
 *
 * @author C0438956
 */
public class SelectMovie {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        MovieView theView = new MovieView();
        MovieModel theModel = new MovieModel();
        MovieController theController = new MovieController(theView,theModel);
        theView.setVisible(true);
    }
}
