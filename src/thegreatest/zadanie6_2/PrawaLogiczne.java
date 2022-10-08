public class PrawaLogiczne {
    public static void main(String args[]) {
        boolean[] bool = {false, true};

        System.out.println("Law of turned off center - p || !p");
        System.out.println("  p\t  !p\tp || !p");
        for(boolean p: bool)
            System.out.println(p+"\t"+!p+"\t"+(p || !p));
        System.out.println();

        System.out.println("Law untrue - !(p && !p)");
        System.out.println("  p\t  !p\tp && !p\t!(p && !p)");
        for(boolean p: bool)
            System.out.println(p+"\t"+!p+"\t"+(p && !p)+"\t"+!(p && !p));
        System.out.println();

        System.out.println("Law of doubled negation - !(!p) == p)");
        System.out.println("  p\t  !p\t!(!p)\t!(!p) == p)");
        for(boolean p: bool)
            System.out.println(p+"\t"+!p+"\t"+!(!p)+"\t"+(!(!p) == p));
        System.out.println();
    }
}