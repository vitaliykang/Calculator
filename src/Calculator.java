import java.io.*;

public class Calculator {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String st = reader.readLine();
        String[] pr = st.split("\\s");//splits the problem string into tokens and saves them as array

        Identifier id = new Identifier(pr[0], pr[1], pr[2]);

        if (!id.isOperator()){//if the operator is not +, -, *, or /, print an error message.
            throw new IOException("False operator.");
        }

        if(id.isArabic()) {//the problem uses Arabic numerals

            Integer n1 = new Integer(id.getN1());
            Integer n2 = new Integer(id.getN2());

            Calculate cA = new Calculate(n1, id.getOp(), n2);

            System.out.println(cA.compute());

        }

        else if (id.isRoman()){//the problem uses Roman numerals

            Converter cN1 = new Converter(id.getN1()); //taking first and the second number as String values...
            Converter cN2 = new Converter(id.getN2());

            Calculate cR = new Calculate(cN1.toArabic(), id.getOp(), cN2.toArabic());
            Converter result = new Converter(cR.compute()); //...and converting them to int values and performing calculation based on the operator.

            if (cR.compute() <= 10){ //if the answer is equal or less than 10 perform simple conversion of the answer from Arabic numerals to Roman and print the result.
                if (cR.compute() < 0){
                    System.out.println("-" + result.toRoman()); //Since the operands cannot exceed the value of 10 there is no need to consider adding identical condition for the second scenario where the answer exceeds 10.
                }
                else {
                    System.out.println(result.toRoman());
                }
            }
            else if (cR.compute() > 10){ //if the answer is greater than 10, split the answer in tens and ones, convert to Roman numerals separately and print the result.
                Converter ones = new Converter(cR.compute() % 10);
                System.out.println(result.tensToRoman() + ones.toRoman());
            }

        }
        else throw new IOException("Wrong input format.");
    }
}
