/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ics125;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author C0438956
 */
class MovieController {
    private final MovieModel theModel;
    private final MovieView theView;
    
    MovieController(MovieView view, MovieModel theModel){
        this.theView = view;
        this.theModel= theModel;
        this.theView.addPrevListener(new PrevButtonListener());
        this.theView.addNextListener(new NextButtonListener());

        setUpDisplay();
    }

    private void setUpDisplay() {
        try{
           
            if(theModel.foundMovies()){
                Movie m;
                m = theModel.getTheMovie();
                theView.setMovieName(m.getMovieName());
                theView.setDescription(m.getDescription());
                theView.setActor(m.getActor());
                theView.setshowtime(m.getShowTime());
                
                
            }else{
            theView.setMovieName("???");
            theView.setDescription("???");
            theView.setActor("???");
            theView.setshowtime("???");
            }
            if(theModel.getcurrentMovieNum() == 0){
              theView.disablePrev();
               }else{
                theView.enablePrev();
            }
            if((theModel.getMovieCount()-1) == theModel.getcurrentMovieNum()){
                theView.disableNext();
            }else{
                theView.EnableNext();
            }
        }catch(Error ex){
            System.out.println(ex);
            theView.displayErrorMessage("Error: There was a problem setting the contract.\n"
            +"               Contract number ");
        }
    }
    

    private static class PrevButtonListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class NextButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
}
