/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojaradio;

/**
 *
 * @author marcosb11
 */
public class Pioneer implements Radio{
    private boolean estado;
    private int amfm;
    private boolean ud;
    private double estacion[] = new double [2];
    private double botones[][] = new double[12][2];
    
    
    
    public void setEstado(boolean estado) {
        this.estado=estado;
        estacion[0]=530;
        estacion[1]=87.9;
        amfm=1;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public int getAMFM() {
        return this.amfm;
    }

    public void setAMFM(int amfm) {
        this.amfm=amfm;
    }

    public void sintonizar(boolean ud) { //ud
        this.ud = ud;
        
        if(ud){
            if(this.amfm==0){
                this.estacion[amfm] = this.estacion[amfm]+10;
            }else{
                this.estacion[amfm] = this.estacion[amfm]+0.20;
            }
        }else{
            if(this.amfm==0){
                this.estacion[amfm] = this.estacion[amfm]-10;
            }else{
                this.estacion[amfm] = this.estacion[amfm]-0.2;
            }
        }
        
        this.estacion[amfm] = Math.round( this.estacion[amfm] * 100.0 ) / 100.0;
    }

    public void guardar(int pos) {
        this.botones[pos][amfm]=estacion[amfm]; 
    }

    public void memoria(int pos) {
        if(botones[pos][0]>=530 && botones[pos][0]<=1610){
                estacion[amfm]=this.botones[pos][amfm];
        }
        if(botones[pos][1]>=87.9 && botones[pos][1]<=107.9){
                estacion[amfm]=this.botones[pos][amfm];
        }
    }

    public double getEmisora() {
        return estacion[amfm];
    }
    
}
