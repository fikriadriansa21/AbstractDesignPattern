public class AbstractClient extends FactoryProvider {
    public static void main(String[] args) {
        AbstractFactory clothesFactory = FactoryProvider.getFactory("Clothes");
        Clothes clothes = (Clothes) (clothesFactory != null ? clothesFactory.create("Shirt") : null);
        System.out.println(clothes != null ? clothes.getClothes() : null);
        System.out.println(clothes != null ? clothes.getType() : null);

        AbstractFactory colorFactory = FactoryProvider.getFactory("Color");
        Color color = (Color) (colorFactory != null ? colorFactory.create("Blue") : null);
        System.out.println(color != null ? color.getName() : null);
    }
}
