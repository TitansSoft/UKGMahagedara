package bussinessLogicL.graph;

public class graph {

    public static void main(String[] args) {
        double x[] = {1, 2, 4, 5};
        double y[] = {1, 2, 4, 5};
        System.out.println("Answer = " + getInterpolatedPoint(x, y, 3.0));
    }

    static double getInterpolatedPoint(double x[], double y[], double x0) {
        double answer = 0;
        double L[] = new double[x.length];

        for (int i = 0; i < x.length; i++) {
            L[i] = 1;
        }

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i != j) {
                    L[i] *= ((x0 - x[j]) / (x[i] - x[j]));
                }
            }
        }

        for (int i = 0; i < x.length; i++) {
            System.out.println(L[i] + " " + y[i]);
            answer += (L[i] * y[i]);
        }
        return answer;
    }
}
