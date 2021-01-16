public class Converter {

    String str;
    int i;

    public Converter(String str){
        this.str = str;
    }

    public Converter(int i){
        this.i = i;
    }

    public int toArabic(){//converts Roman numeral to Arabic int
        int a = 0;
        switch(str){
            case "I":
                a = 1;
                break;
            case "II":
                a = 2;
                break;
            case "III":
                a = 3;
                break;
            case "IV":
                a = 4;
                break;
            case "V":
                a = 5;
                break;
            case "VI":
                a = 6;
                break;
            case "VII":
                a = 7;
                break;
            case "VIII":
                a = 8;
                break;
            case "IX":
                a = 9;
                break;
            case "X":
                a = 10;
                break;
        }
        return a;
    }

    //Since the task states that first and the second numbers in the problem cannot be greater than 10,
    //the final answer cannot exceed 100. Hence, it is easier to use switch/case structure for the conversion algorithm.
        public String toRoman(){//'Simple' conversion of 1-10 numerals
        String rom = "";
        i = Math.abs(i);
        switch(i){
            case 1:
                rom = "I";
                break;
            case 2:
                rom = "II";
                break;
            case 3:
                rom = "III";
                break;
            case 4:
                rom = "IV";
                break;
            case 5:
                rom = "V";
                break;
            case 6:
                rom = "VI";
                break;
            case 7:
                rom = "VII";
                break;
            case 8:
                rom = "VIII";
                break;
            case 9:
                rom = "IX";
                break;
            case 10:
                rom = "X";
                break;
        }
        return rom;
    }

    public String tensToRoman(){ //Conversion of tens to Roman numerals
        String rom = "";
        int tens = i - (i % 10);

        switch (tens/10){
            case 1:
                rom = "X";
                break;
            case 2:
                rom = "XX";
                break;
            case 3:
                rom = "XXX";
                break;
            case 4:
                rom = "XL";
                break;
            case 5:
                rom = "L";
                break;
            case 6:
                rom = "LX";
                break;
            case 7:
                rom = "LXX";
                break;
            case 8:
                rom = "LXXX";
                break;
            case 9:
                rom = "XC";
                break;
            case 10:
                rom = "C";
                break;
            default:
                rom = "";
        }
        return rom;
    }

}
