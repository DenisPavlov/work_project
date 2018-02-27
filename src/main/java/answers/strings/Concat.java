package answers.strings;

public class Concat {
    public static void main(String[] args) {

        String fs = "123456789";
        String sub = fs.subSequence(3,6).toString();
        String sub2 = fs.substring(3,6);
        System.out.println(sub); //456
        System.out.println(sub2); //456

//        String sb = "AABAA";
//        String s = "ABCDEF".replace("C", "**");
//
//        String sb2 = sb.replace(sb, "##");
//        System.out.println(s + " " + sb2); //AB**DEF and ##
//
//        String fs = "123456789";
//        char[] charSequence = fs.toCharArray();
//        charSequence[3] = '$';
//        String nStr = String.valueOf(charSequence);
//        System.out.println(nStr); //123$56789
//
//        StringBuilder str = new StringBuilder("AMIT"); //0-A, 1-M, 2-I, 3-T
//        str.setCharAt(3, 'L');
//        //AMIL

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
//
//        String x = "523.5";
//        Double xd = Double.valueOf(x);
//
//        //Integer xy = Integer.valueOf(x); //java.lang.NumberFormatException: For input string: "523.5"
//
//        System.out.println(xd); //523.5
//
//        String s1 = new String("ABC");
//        String s2 = new String("ABC");
//        String s3 = "ABC";
//        String s4 = "ABC";
//        System.out.println(s1==s2); //false
//        System.out.println(s3==s4); //true. Т.к. один набор литералов будет указывать на одну область памяти
//        System.out.println(s1.equals(s2));//true
//
//        s1=s2;
//        System.out.println(s1==s2); //true
//        if("someString" == "someString") { //true
//            System.out.println("true");
//        }
//        System.out.println(s1.compareTo(s2)); //0
//        System.out.println("C".compareTo("A")); //2
//        System.out.println("A".compareTo("C")); //-2
//
//        String s = "ABCDEFG";
//        StringBuilder stringBuilder = new StringBuilder(s);
//        stringBuilder.reverse();
//        System.out.println(stringBuilder.toString()); //GFEDCBA
//
//        String s = "     a    ";
//        System.out.println("b" + s.trim() + "b");//ab
//        System.out.println("b" + s + "b");//a    b
    }
}
