package butterknife;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class ButterKnife {
    private static boolean toString = false;
    static final Map<Class<?>, Constructor<? extends Unbinder>> values = new LinkedHashMap();

    private ButterKnife() {
        throw new AssertionError("No instances.");
    }

    public static Unbinder valueOf(Activity activity) {
        return ag$a(activity, activity.getWindow().getDecorView());
    }

    public static Unbinder ag$a(Object obj, View view) {
        Class<?> cls = obj.getClass();
        if (toString) {
            Log.d("ButterKnife", "Looking up binding for " + cls.getName());
        }
        Constructor<? extends Unbinder> ag$a = ag$a(cls);
        if (ag$a == null) {
            return Unbinder.ag$a;
        }
        try {
            return ag$a.newInstance(obj, view);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Unable to invoke " + ag$a, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Unable to invoke " + ag$a, e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unable to create binding instance.", cause);
        }
    }

    private static Constructor<? extends Unbinder> ag$a(Class<?> cls) {
        Constructor<? extends Unbinder> ag$a;
        Map<Class<?>, Constructor<? extends Unbinder>> map = values;
        Constructor<? extends Unbinder> constructor = map.get(cls);
        if (constructor != null || map.containsKey(cls)) {
            if (toString) {
                Log.d("ButterKnife", "HIT: Cached in binding map.");
            }
            return constructor;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.") || name.startsWith("androidx.")) {
            if (toString) {
                Log.d("ButterKnife", "MISS: Reached framework class. Abandoning search.");
                return null;
            }
            return null;
        }
        try {
            ClassLoader classLoader = cls.getClassLoader();
            ag$a = classLoader.loadClass(name + "_ViewBinding").getConstructor(cls, View.class);
            if (toString) {
                Log.d("ButterKnife", "HIT: Loaded binding class and constructor.");
            }
        } catch (ClassNotFoundException unused) {
            if (toString) {
                Log.d("ButterKnife", "Not found. Trying superclass " + cls.getSuperclass().getName());
            }
            ag$a = ag$a(cls.getSuperclass());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Unable to find binding constructor for " + name, e);
        }
        values.put(cls, ag$a);
        return ag$a;
    }
}
