package lee.skill.collection;

public class EqualsObject {
    public boolean valEquals(Object o1, Object o2) {
        return (o1 == null ? o2 == null : o1.equals(o2));
    }
}
