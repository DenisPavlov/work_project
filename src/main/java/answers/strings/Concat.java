package answers.strings;

public class Concat {
    public static void main(String[] args) {
//        StringBuffer stringBuffer = new StringBuffer();
//        StringBuilder stringBuilder = new StringBuilder();
//
//        String str = "ABC";
//        str += "DEF";
//
//        String str2 = "one".concat("two").concat("three");
//
//        stringBuffer.append("DDD").append("EEE");
//        stringBuilder.append("FFF").append("GGG");
//        System.out.println(str + " " +str2 + " " + stringBuffer.toString() + " " + stringBuilder.toString());//ABCDEF onetwothree DDDEEE FFFGGG

        String x = "523.5";
        Double xd = Double.valueOf(x);

        //Integer xy = Integer.valueOf(x); //java.lang.NumberFormatException: For input string: "523.5"

        System.out.println(xd); //523.5
    }
}
