class WrapperPrimitiveDemo1 { 
    public static void main(String[] args)     { 
        Integer a = new Integer(12); 
        System.out.println("Old value = "+a); 
        xyz(a); 
        System.out.println("New Value = "+a); 
    } 
    private static void xyz(Integer a)     { 
        a = a + 10; 
    } 
}