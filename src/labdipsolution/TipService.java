/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labdipsolution;

import labdipsolution.TipCalc;

/**
 *
 * @author Kallie
 */
public class TipService {
    private TipCalc tipCalculator;
    
    public TipService(){
    }
    
    public TipService(TipCalc tipCalculator){
        this.tipCalculator = tipCalculator;
    }

    public TipCalc getTipCalculator() {
        return tipCalculator;
    }

    public void setTipCalculator(TipCalc tipCalculator) {
        this.tipCalculator = tipCalculator;
    }
    
    public double getTip(){
       return tipCalculator.getTip();
    }
}
