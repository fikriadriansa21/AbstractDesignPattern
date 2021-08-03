public class ClothesFactory implements AbstractFactory<Clothes>{

    @Override
    public Clothes create(String type) {
        if ("Tshirt".equalsIgnoreCase(type)){
            return new Tshirt();
        }else if ("Shirt".equalsIgnoreCase(type)){
            return new Shirt();
        }
        return null;
    }
}
