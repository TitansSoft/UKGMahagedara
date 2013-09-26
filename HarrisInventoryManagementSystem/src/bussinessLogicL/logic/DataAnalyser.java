package bussinessLogicL.logic;

import java.util.List;

public class DataAnalyser {
    private List<Double> values;
    private double[] setA = new double[12];
    private double[] setB = new double[10];
    
    /**
     *
     */
    public void calcTrend(int timeRange){      
        for(int i = 0; i < 11 ; i++){
            setA[i] = (this.setA[i] + this.setA[i+1])/2;
        }   
        
        for(int i = 0; i < 10; i++){
            setB[i] = (this.setB[i] + this.setB[i+1])/2;
        }
    }
    
    private void getValues(int numberOfInputs){
        /*get values from */
    }
    
    private void perday(){
        /*import data of last 12 days  */
    }
    
    private void perMonth(){
        
    }
    
    private void perYear(){
        
    }
    
}
