public class StringConcatenation {
    public static void main(String[] args) {
        String a = "java";
        int b = 10;
        int c = 20;
        int d = 30;
        System.out.println(a+b+c+d);//java102030
        System.out.println(b+c+d+a);//60java
        System.out.println(b+c+a+d);//30java30
        System.out.println(b+a+c+d);//10java2030
    }
}
