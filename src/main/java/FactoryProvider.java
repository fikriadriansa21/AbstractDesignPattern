public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){
        if ("Clothes".equalsIgnoreCase(choice)){
            return new ClothesFactory();
        }else if("Color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return null;
    }
}
