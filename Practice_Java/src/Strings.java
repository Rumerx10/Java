public class Strings {
    public static void main(String[] args) {
        String name = "Rume";
        String[] names = {"rume","Hasan","Bhuiyan"};
        System.out.println(name.length());
        System.out.println(names.length);

        String fname = "Rume";
        String lname = "Rume";

        if(fname.compareTo(lname)==0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        if (fname.equals(lname)){
            System.out.println("Equal");
        }


        StringBuilder sb = new StringBuilder("Hello Rume");

        System.out.println(sb.charAt(0));
        System.out.println(sb.insert(6,"Mr."));
        // setCharAt
        sb.setCharAt(0,'M');
        System.out.println(sb);
        // insert
        sb.insert(13,"e");
        System.out.println(sb);
        sb.delete(12,13);
        System.out.println(sb);
        sb.append(" nice to meet you.");
        System.out.println(sb);

        String str =  "World";
        String rev = "";
        for(int i=str.length()-1; i>=0;i--){
            rev = rev+str.charAt(i);
        }
        System.out.println(rev);

        System.out.println("Reverse using StringBuilder____________");
        StringBuilder ss = new StringBuilder("String");
        for(int i=0; i<ss.length()/2; i++){
            int front = i;
            int back = ss.length()-1-i;

            char frontChar = ss.charAt(front);
            char backChar = ss.charAt(back);

            ss.setCharAt(front,backChar);
            ss.setCharAt(back,frontChar);

        }
        System.out.println(ss);

    }
}
