package lesson5;

public class StringOperations {

    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer();
        sbf.append("Milos");
        sbf.append(" Boskovic");
        System.out.println(sbf.toString());
        System.out.println("----------------------");

        StringBuilder sbld = new StringBuilder();
        sbld.append("anamana");
        System.out.println(sbld.toString());

        sbld.reverse();
        System.out.println(sbld.toString());

        if(sbld.toString().equals(sbld.reverse().toString())){
            System.out.println("sbld is palindrome");
        }else{
            System.out.println("sbld is not palindrome");
        }


    }

}
