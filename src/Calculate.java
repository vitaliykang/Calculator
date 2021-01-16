public class Calculate {

    int n1, n2;
    String op;

    public Calculate(int n1, String op, int n2){
        this.n1 = n1;
        this.op = op;
        this.n2 = n2;
    }

    public int compute(){//Performs calculation based on the operator and returns the result as int
        int result = 0;
        switch(op){
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;
        }
        return result;
    }

}
