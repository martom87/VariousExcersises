package hacker_rank_excercises.complementary_dna;

public class ComplementaryDNA {



        public static void main( String[] args ) {
            // DEFINE "dna"!!!
            String dna = "AAA";
            // DEFINE "dna"!!!

            System.out.println(reverseComplement(dna));
        }

        public static String reverseComplement( String dna ) {
            String out = "";
            for(int i = dna.length() - 1; i >= 0; --i) {
                char curr = dna.charAt(i);
                if(curr == 'A')
                    out += 'T';
                else if(curr == 'T')
                    out += 'A';
                else if(curr == 'C')
                    out += 'G';
                else if(curr == 'G')
                    out += 'C';
                else {
                    System.out.println("ERROR: Input is not a DNA Sequence.");
                    System.exit(-1);
                }
            }
            return out;
        }

}
