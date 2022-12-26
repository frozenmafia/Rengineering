package o;

import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* loaded from: classes7.dex */
public class applyUpdate {
    public static <T> T valueOf(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw ah$a(e, cls);
        } catch (InstantiationException e2) {
            throw ah$a(e2, cls);
        }
    }

    private static IllegalArgumentException ah$a(Exception exc, Class<?> cls) {
        StringBuilder sb = new StringBuilder("unable to create new instance of class ");
        sb.append(cls.getName());
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (cls.isArray()) {
            arrayList.add("because it is an array");
        } else if (cls.isPrimitive()) {
            arrayList.add("because it is primitive");
        } else if (cls == Void.class) {
            arrayList.add("because it is void");
        } else {
            if (Modifier.isInterface(cls.getModifiers())) {
                arrayList.add("because it is an interface");
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                arrayList.add("because it is abstract");
            }
            if (cls.getEnclosingClass() != null && !Modifier.isStatic(cls.getModifiers())) {
                arrayList.add("because it is not static");
            }
            if (!Modifier.isPublic(cls.getModifiers())) {
                arrayList.add("possibly because it is not public");
            } else {
                try {
                    cls.getConstructor(new Class[0]);
                } catch (NoSuchMethodException unused) {
                    arrayList.add("because it has no accessible default constructor");
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                sb.append(" and");
            } else {
                z = true;
            }
            sb.append(com.dreampay.commons.constants.Constants.WHITE_SPACE);
            sb.append(str);
        }
        return new IllegalArgumentException(sb.toString(), exc);
    }

    public static Type ag$a(WildcardType wildcardType) {
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (lowerBounds.length != 0) {
            return lowerBounds[0];
        }
        return wildcardType.getUpperBounds()[0];
    }

    public static <T> Iterable<T> ah$a(final Object obj) {
        if (obj instanceof Iterable) {
            return (Iterable) obj;
        }
        Class<?> cls = obj.getClass();
        markViewHoldersUpdated.values(cls.isArray(), "not an array or Iterable: %s", cls);
        if (!cls.getComponentType().isPrimitive()) {
            return Arrays.asList((Object[]) obj);
        }
        return new Iterable<T>() { // from class: o.applyUpdate.3
            @Override // java.lang.Iterable
            public Iterator<T> iterator() {
                return new Iterator<T>() { // from class: o.applyUpdate.3.2
                    final int ag$a;
                    int ah$a = 0;

                    {
                        this.ag$a = Array.getLength(obj);
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.ah$a < this.ag$a;
                    }

                    /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
                    @Override // java.util.Iterator
                    public T next() {
                        if (!hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object obj2 = obj;
                        int i = this.ah$a;
                        this.ah$a = i + 1;
                        return Array.get(obj2, i);
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    private applyUpdate() {
    }
}
