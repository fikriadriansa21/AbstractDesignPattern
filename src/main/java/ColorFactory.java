public class ColorFactory implements AbstractFactory<Color>{
    @Override
    public Color create(String type) {
        if ("Red".equalsIgnoreCase(type)){
            return new Red();
        }else if("Blue".equalsIgnoreCase(type)){
            return new Blue();
        }else if("Green".equalsIgnoreCase(type)){
            return new Green();
        }
        return null;
    }
}
