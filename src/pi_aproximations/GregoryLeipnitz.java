package pi_aproximations;

class GregoryLeipnitz {
    double sequenceFormula;

    public double computePi(int n) {
        for (int counter = 1; counter < n; counter += 2) {
            sequenceFormula = sequenceFormula + ((1.0 / (2.0 * counter - 1)) - (1.0 / (2.0 * counter + 1)));
        }
        double pi = 4 * sequenceFormula;
        return pi;
    }

    public double getSequenceFormula() {
        return sequenceFormula;
    }
}

class Viete {


    public double computePi(int numberTerms) {

        double value = 0;
        double numerator = 0;
        if (numberTerms <= 0) return value;
        double product = 1;
        for (int i = 0; i < numberTerms; ++i) {
            numerator = Math.sqrt(2 + numerator);
            product *= numerator / 2;
        }
        return value = 1 / (product / 2);
    }
}

class Demo {
    public static void main(String[] args) {
        GregoryLeipnitz gregoryLeipnitz = new GregoryLeipnitz();
        System.out.println(gregoryLeipnitz.computePi(1000));

        Viete viete = new Viete();
        System.out.println(viete.computePi(1000));
    }
}
