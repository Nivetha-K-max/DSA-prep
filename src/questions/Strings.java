
public class Main {
    static void main() {
        String s="hello";
        String revesred= new StringBuilder(s).reverse().toString();
        System.out.println("using stringbuffer : "+revesred);

        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+= s.charAt(i);
        }
        System.out.println("using for loop :"+rev);

        char[] arr=s.toCharArray();
        int l=0,r=arr.length-1;
        while(l<r){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;r--;
        }
        System.out.println("using swapping method: "+Arrays.toString(arr));
        System.out.println(new String(arr));
    }
}



public class Main {
    static void main() {
        String s="hello";
        int cv=0,cc=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                cv++;
            }
            else{
                cc++;
            }
        }
        System.out.println("Vowels count : "+cv);
        System.out.println("Constant count : "+cc);


        String str="Hello World";
        int count = 0;
        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
}

public class Main {
    static void main() {
        String s="ababa";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("Palindrome:"+s);
        }
        else{
            System.out.println("Not a Palindrome");
        }
        String s2="hi i  nivi";
        System.out.println("using replace :"+s2.replace(" ",""));

        String str = "Hello\tWorld \nJava";
        String result = str.replaceAll("\\s+", "");

        System.out.println(result);


        String str1 = "Hello World Java";
        StringBuilder res = new StringBuilder();

        for (char ch : str1.toCharArray()) {
            if (ch != ' ') {
                res.append(ch);
            }
        }

        System.out.println(res);

    }
}


public class Main {
    static void main() {
        String s="ababa";
        HashMap <String,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            String key = String.valueOf(ch);
            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }
            else{
                map.put(key, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }
}
