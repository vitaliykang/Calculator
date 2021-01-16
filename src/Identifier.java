public class Identifier {

    String n1, op, n2;
    String[] rom = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    String[] arb = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public Identifier(String n1, String op, String n2){
        this.n1 = n1;
        this.op = op;
        this.n2 = n2;
    }

    public String getN1(){
        return n1;
    }

    public String getN2(){
        return n2;
    }

    public String getOp(){
        return op;
    }

    public Boolean isOperator(){//checks if given operator is valid

        if (op.equals("+") | op.equals("-") | op.equals("*") | op.equals("/")){
            return true;
        }

        else return false;
    }

    public Boolean isRoman(){//checks if the number is Roman and is within the range

        boolean checkA, checkB, check;
        checkA = checkB = check = false;

        for (int i = 0; i < 10; i++){
            if (n1.equals(rom[i])){
                checkA = true;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (n2.equals(rom[i])) {
                checkB = true;
            }
        }

        if (checkA == true && checkB == true){//returns true if both numbers are Roman
            check = true;
        }
        return check;
    }

    public Boolean isArabic(){//checks if the number is Arabic and is within the range

        boolean checkA, checkB, check;
        checkA = checkB = check = false;

        for (int i = 0; i < arb.length; i++){
            if (n1.equals(arb[i])){
                checkA = true;
            }
        }

        for (int i = 0; i < arb.length; i++){
            if (n2.equals(arb[i])){
                checkB = true;
            }
        }

        if (checkA == true && checkB == true){
            check = true;
        }

        return check;
    }

}
