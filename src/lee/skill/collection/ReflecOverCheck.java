package lee.skill.collection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflecOverCheck {
    public void method () throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Class clazz = arrayList.getClass();
        Method addMethod = clazz.getDeclaredMethod("add", Object.class);
        addMethod.invoke(arrayList, "one");
        addMethod.invoke(arrayList, "two");
        addMethod.invoke(arrayList, 3);
        System.out.println(arrayList);
    }
}
