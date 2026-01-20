public class wrraperClass {
    public static void main(String[] args){
        int b=20;
        Integer obj = Integer.valueOf(b);
        System.out.println("b="+b);
        System.out.println("obj="+obj);

        // Autoboxing (Primitive to Object)
        System.out.println("****Following is Output of our Autoboxing****");
        Integer obj1=b;
        System.out.println("b="+b);
        System.out.println("obj="+obj1);

        // Next Example
        System.out.println("****Thise is Our Next Example****");
        Integer i=30;
        int j=i.valueOf(i);
        System.out.println("i="+b);
        System.out.println("j="+obj1);

        // Unboxing (Primitive to Object)
        System.out.println("*****Following is our Unboxing*****");
        Integer i1=40;
        int j1=i1;
        System.out.println("i1="+b);
        System.out.println("j1="+obj1);
    }
}

