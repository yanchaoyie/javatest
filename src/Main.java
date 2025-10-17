import java.util.Properties;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public  class Main {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Properties properties = new Properties();
        //增
        properties.put("1","ycy");
        properties.put("2","sora");
        properties.put("3","jack");
        properties.put("3","tom");
        properties.put("5","lucy");
        //删
        properties.remove("5");
        //改，利用put方法key值相同会替代
        properties.put("3","lucy");
        //查，通过key值得到 value
        System.out.println(properties.get("3"));
        System.out.println(properties.getProperty("5"));
    }
}



