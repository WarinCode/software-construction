package Lab03;

public class Test {
    public static void main(String []args){
        String name = "Smith";

        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("t"));
        System.out.println(name.substring(1, 3));

        StringBuffer sb = new StringBuffer("John");
        System.out.println(sb);

        sb.append(" Hunter");
        System.out.println(sb);

        sb.insert(4, "y");
        System.out.println(sb);

        sb.delete(2, 4);
        System.out.println(sb);
    }
}
