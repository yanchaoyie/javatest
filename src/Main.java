import java.util.*;

public class Main {
    public static void main(String[] args) {
        DAO<User> userDAO = new DAO<>();
        userDAO.save("1", new User(1, "Tom", 12));
        userDAO.save("2", new User(2, "Mike", 13));
        userDAO.save("3", new User(3, "Lucy", 14));
        System.out.println(userDAO.get("1"));
        userDAO.upDate("1", new User(1, "Sora", 15));
        System.out.println(userDAO.get("1"));
        System.out.println(userDAO.list());
        userDAO.delete("3");
        System.out.println(userDAO.list());
    }
}

class User{
    private int id;
    private String name;
    private int age;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class DAO<T>{
    Map<String,T> map = new HashMap<>();

    public void save(String id,T entity){
        map.put(id,entity);
    }

    public T get(String id){
        return map.get(id);
    }

    public void upDate(String id, T entity){
        map.put(id,entity);
    }

    public List<T> list(){
        List<T> list = new ArrayList<>();
        for (String key : map.keySet()) {
            list.add(map.get(key));
        }
        return list;
    }

    public void delete(String id){
        map.remove(id);
    }
}
