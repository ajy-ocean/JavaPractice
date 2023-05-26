public class WrapperPractice{

    public static void main(String[] args){

        System.out.println("======-Autoboxing-======");
        //Primitive to Wrapper
        int number = 69;
        System.out.println("Primitive:"+number);
        Integer value = Integer.valueOf(number);
        System.out.println("Object:"+value);
        System.out.println("------------------------");
        
        System.out.println("======-Unboxing-======");
        //Wrapper to Primitive
        Integer objValue = 23;
        System.out.println("Object:"+objValue);
        int integralValue = objValue.intValue();
        System.out.println("Primitive:"+integralValue);
        
    }
}