package amazon;

public class StringBuilderClass {

    public static void main(String[] args) {

        String str = "ROKT";
        String str1 = "RO*T";

        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        sb.append(str1);
        sb1.append(str);


        String name = "chandra";

        StringBuilder namesb = new StringBuilder();
        namesb.append(name);
        //System.out.println(String.valueOf(sb.deleteCharAt(2)).equalsIgnoreCase(String.valueOf(sb1.deleteCharAt(2))));
        namesb.delete(1, 4);
        System.out.println(namesb.substring(1, 4));
        // System.out.println(namesb.indexOf("na"));
        System.out.println(namesb.insert(0, "Poorna "));
        System.out.println(namesb.replace(0, 4, "POOR"));
        System.out.println(namesb.reverse());
        System.out.println(namesb.charAt(0));
        System.out.println(namesb.length());


    }
}
