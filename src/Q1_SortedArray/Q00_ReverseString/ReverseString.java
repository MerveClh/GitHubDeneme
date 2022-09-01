package Q1_SortedArray.Q00_ReverseString;

public class ReverseString {
    public static void main(String[] args) {

        String name = "Java Dunyasi cok guzel";  // 0(n) --> 0(n/2)
        System.out.println(reverse(name));

    }

    public static String reverse(String name) {
        String str2 = "";

        // daha yavas
        /* String[] str = name.split("");  // array'e atadik
        for (int i = str.length - 1; i >= 0; i--) {
          str2 = str2 + str[i];  // str2=str2.toString();
         }
        return str2;
             */

        // daha hizli
        String[] str = name.split("");
        String tmp = "";
        for (int i = 0; i < str.length; i++) {
            String start = str[i];
            String end = str[str.length - (i + 1)];  // dinamik olur
           // if (start == end) break;
            tmp = start;
            start = end;
            //end = tmp;
            str2 = str2 + start;
               // kod hizli calismasi icin StringBuilder'a cevirmedik ama cevirebiliriz
        }
        return str2;    // lezug koc isaynuD avaJ
    }
}
