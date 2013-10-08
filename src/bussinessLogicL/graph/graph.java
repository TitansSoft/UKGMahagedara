package bussinessLogicL.graph;

public class graph {

    public static void main(String[] args) {
        double x[] = {1, 3, 8, 9};
        double y[] = {1, 2, 4, 5};
        double [] equation = getMandC(x, y);
        double m = equation [ 0 ];
        double c = equation[1];
        
        for(int xi = 0 ; xi < 10 ;xi++){
            double yi = m * xi + c;
            System.out.println("Y at x = " + xi + " is " + yi);
        }
    }

    static double [] getMandC(double x[], double y[]) {
        double answer = 0;
        double xBar;
        double yBar ;
        double temp = 0;
        double bOne;
        double bNote;
        double [] mAndC ;
                
        for (int i = 0 ; i < x.length ; i++ ){
            answer += x[i];
        }

        xBar = answer / x.length;
        answer = 0;
        
        for (int i = 0 ; i < y.length ; i++ ){
            answer += y[i];
        }
        
        yBar = answer / y.length;
        answer = 0;
        
        for(int i = 0; i < x.length;i++){
            answer += (x[i] - xBar )*(y[i] - yBar);
        }
        
        for(int i = 0; i < x.length;i++){
            temp += (x[i] - xBar )*(x[i] - xBar );
        }
        
        bOne = answer / temp;
        bNote = yBar - ( bOne * xBar );
        mAndC = new double[2];
        mAndC[0] = bOne;
        mAndC[1] = bNote;
        return mAndC;
    }
}
