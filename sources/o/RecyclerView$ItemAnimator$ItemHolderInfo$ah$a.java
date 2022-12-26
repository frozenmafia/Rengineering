package o;

import android.util.Log;
import com.google.firebase.database.DatabaseException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o.RecyclerView;
/* loaded from: classes5.dex */
public class RecyclerView$ItemAnimator$ItemHolderInfo$ah$a<T> {
    private final boolean HaptikSDK$b;
    private final Class<T> ah$a;
    private final boolean invoke;
    private final Constructor<T> values;
    private final Map<String, String> valueOf = new HashMap();
    private final Map<String, Method> HaptikSDK$a = new HashMap();
    private final Map<String, Method> toString = new HashMap();
    private final Map<String, Field> ag$a = new HashMap();

    public static /* synthetic */ Class ah$a(RecyclerView$ItemAnimator$ItemHolderInfo$ah$a recyclerView$ItemAnimator$ItemHolderInfo$ah$a) {
        return recyclerView$ItemAnimator$ItemHolderInfo$ah$a.ah$a;
    }

    public RecyclerView$ItemAnimator$ItemHolderInfo$ah$a(Class<T> cls) {
        Constructor<T> constructor;
        Method[] methods;
        Field[] fields;
        Method[] declaredMethods;
        Field[] declaredFields;
        this.ah$a = cls;
        this.invoke = cls.isAnnotationPresent(removeItemDecorationAt.class);
        this.HaptikSDK$b = !cls.isAnnotationPresent(processDataSetCompletelyChanged.class);
        try {
            constructor = cls.getDeclaredConstructor(new Class[0]);
            constructor.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            constructor = null;
        }
        this.values = constructor;
        for (Method method : cls.getMethods()) {
            if (toString(method)) {
                String values = values(method);
                toString(values);
                method.setAccessible(true);
                if (this.toString.containsKey(values)) {
                    throw new DatabaseException("Found conflicting getters for name: " + method.getName());
                }
                this.toString.put(values, method);
            }
        }
        for (Field field : cls.getFields()) {
            if (valueOf(field)) {
                toString(ah$a(field));
            }
        }
        Class<T> cls2 = cls;
        do {
            for (Method method2 : cls2.getDeclaredMethods()) {
                if (ah$a(method2)) {
                    String values2 = values(method2);
                    String str = this.valueOf.get(values2.toLowerCase(Locale.US));
                    if (str == null) {
                        continue;
                    } else if (!str.equals(values2)) {
                        throw new DatabaseException("Found setter with invalid case-sensitive name: " + method2.getName());
                    } else {
                        Method method3 = this.HaptikSDK$a.get(values2);
                        if (method3 == null) {
                            method2.setAccessible(true);
                            this.HaptikSDK$a.put(values2, method2);
                        } else if (!values(method2, method3)) {
                            throw new DatabaseException("Found a conflicting setters with name: " + method2.getName() + " (conflicts with " + method3.getName() + " defined on " + method3.getDeclaringClass().getName() + ")");
                        }
                    }
                }
            }
            for (Field field2 : cls2.getDeclaredFields()) {
                String ah$a = ah$a(field2);
                if (this.valueOf.containsKey(ah$a.toLowerCase(Locale.US)) && !this.ag$a.containsKey(ah$a)) {
                    field2.setAccessible(true);
                    this.ag$a.put(ah$a, field2);
                }
            }
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                break;
            }
        } while (!cls2.equals(Object.class));
        if (this.valueOf.isEmpty()) {
            throw new DatabaseException("No properties to serialize found on class " + cls.getName());
        }
    }

    private void toString(String str) {
        String put = this.valueOf.put(str.toLowerCase(Locale.US), str);
        if (put == null || str.equals(put)) {
            return;
        }
        throw new DatabaseException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(Locale.US));
    }

    public T ag$a(Map<String, Object> map) {
        return ah$a(map, Collections.emptyMap());
    }

    public T ah$a(Map<String, Object> map, Map<TypeVariable<Class<T>>, Type> map2) {
        Object valueOf;
        Object valueOf2;
        Constructor<T> constructor = this.values;
        if (constructor == null) {
            throw new DatabaseException("Class " + this.ah$a.getName() + " does not define a no-argument constructor. If you are using ProGuard, make sure these constructors are not stripped.");
        }
        try {
            T newInstance = constructor.newInstance(new Object[0]);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                if (this.HaptikSDK$a.containsKey(key)) {
                    Method method = this.HaptikSDK$a.get(key);
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    if (genericParameterTypes.length == 1) {
                        valueOf = RecyclerView.ItemAnimator.ItemHolderInfo.valueOf(entry.getValue(), valueOf(genericParameterTypes[0], map2));
                        try {
                            method.invoke(newInstance, valueOf);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        } catch (InvocationTargetException e2) {
                            throw new RuntimeException(e2);
                        }
                    } else {
                        throw new IllegalStateException("Setter does not have exactly one parameter");
                    }
                } else if (this.ag$a.containsKey(key)) {
                    Field field = this.ag$a.get(key);
                    valueOf2 = RecyclerView.ItemAnimator.ItemHolderInfo.valueOf(entry.getValue(), valueOf(field.getGenericType(), map2));
                    try {
                        field.set(newInstance, valueOf2);
                    } catch (IllegalAccessException e3) {
                        throw new RuntimeException(e3);
                    }
                } else {
                    String str = "No setter/field for " + key + " found on class " + this.ah$a.getName();
                    if (this.valueOf.containsKey(key.toLowerCase(Locale.US))) {
                        str = str + " (fields/setters are case sensitive!)";
                    }
                    if (this.invoke) {
                        throw new DatabaseException(str);
                    }
                    if (this.HaptikSDK$b) {
                        Log.w("ClassMapper", str);
                    }
                }
            }
            return newInstance;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    private Type valueOf(Type type, Map<TypeVariable<Class<T>>, Type> map) {
        if (type instanceof TypeVariable) {
            Type type2 = map.get(type);
            if (type2 != null) {
                return type2;
            }
            throw new IllegalStateException("Could not resolve type " + type);
        }
        return type;
    }

    private static boolean toString(Method method) {
        return ((!method.getName().startsWith("get") && !method.getName().startsWith("is")) || method.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(method.getModifiers()) || Modifier.isStatic(method.getModifiers()) || method.getReturnType().equals(Void.TYPE) || method.getParameterTypes().length != 0 || method.isAnnotationPresent(onExitLayoutOrScroll.class)) ? false : true;
    }

    private static boolean ah$a(Method method) {
        return method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(onExitLayoutOrScroll.class);
    }

    private static boolean valueOf(Field field) {
        return (field.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(field.getModifiers()) || Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers()) || field.isAnnotationPresent(onExitLayoutOrScroll.class)) ? false : true;
    }

    private static boolean values(Method method, Method method2) {
        RecyclerView.ItemAnimator.AdapterChanges.valueOf(method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()), "Expected override from a base class");
        RecyclerView.ItemAnimator.AdapterChanges.valueOf(method.getReturnType().equals(Void.TYPE), "Expected void return type");
        RecyclerView.ItemAnimator.AdapterChanges.valueOf(method2.getReturnType().equals(Void.TYPE), "Expected void return type");
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?>[] parameterTypes2 = method2.getParameterTypes();
        RecyclerView.ItemAnimator.AdapterChanges.valueOf(parameterTypes.length == 1, "Expected exactly one parameter");
        RecyclerView.ItemAnimator.AdapterChanges.valueOf(parameterTypes2.length == 1, "Expected exactly one parameter");
        return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
    }

    private static String ah$a(Field field) {
        String ag$a = ag$a(field);
        return ag$a != null ? ag$a : field.getName();
    }

    private static String values(Method method) {
        String ag$a = ag$a(method);
        return ag$a != null ? ag$a : values(method.getName());
    }

    private static String ag$a(AccessibleObject accessibleObject) {
        if (accessibleObject.isAnnotationPresent(removeAnimatingView.class)) {
            return ((removeAnimatingView) accessibleObject.getAnnotation(removeAnimatingView.class)).values();
        }
        return null;
    }

    private static String values(String str) {
        String[] strArr = {"get", "set", "is"};
        String str2 = null;
        for (int i = 0; i < 3; i++) {
            String str3 = strArr[i];
            if (str.startsWith(str3)) {
                str2 = str3;
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Unknown Bean prefix for method: " + str);
        }
        char[] charArray = str.substring(str2.length()).toCharArray();
        for (int i2 = 0; i2 < charArray.length && Character.isUpperCase(charArray[i2]); i2++) {
            charArray[i2] = Character.toLowerCase(charArray[i2]);
        }
        return new String(charArray);
    }
}
