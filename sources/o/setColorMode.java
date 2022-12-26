package o;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import o.PrintHelper;
/* loaded from: classes7.dex */
public final class setColorMode {
    private static final ConcurrentMap<Class<?>, setColorMode> ag$a = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, setColorMode> valueOf = new ConcurrentHashMap();
    private final boolean ah$a;
    private final IdentityHashMap<String, PrintHelper.PrintBitmapAdapter> invoke = new IdentityHashMap<>();
    public final List<String> toString;
    private final Class<?> values;

    public static setColorMode valueOf(Class<?> cls) {
        return ag$a(cls, false);
    }

    public static setColorMode ag$a(Class<?> cls, boolean z) {
        if (cls == null) {
            return null;
        }
        ConcurrentMap<Class<?>, setColorMode> concurrentMap = z ? valueOf : ag$a;
        setColorMode setcolormode = concurrentMap.get(cls);
        if (setcolormode == null) {
            setColorMode setcolormode2 = new setColorMode(cls, z);
            setColorMode putIfAbsent = concurrentMap.putIfAbsent(cls, setcolormode2);
            return putIfAbsent == null ? setcolormode2 : putIfAbsent;
        }
        return setcolormode;
    }

    public final boolean ag$a() {
        return this.ah$a;
    }

    public PrintHelper.PrintBitmapAdapter ag$a(String str) {
        if (str != null) {
            if (this.ah$a) {
                str = str.toLowerCase(Locale.US);
            }
            str = str.intern();
        }
        return this.invoke.get(str);
    }

    private setColorMode(Class<?> cls, boolean z) {
        Field[] declaredFields;
        List<String> unmodifiableList;
        this.values = cls;
        this.ah$a = z;
        PrintHelper.PrintUriAdapter.AnonymousClass1.valueOf((z && cls.isEnum()) ? false : true, "cannot ignore case on an enum: " + cls);
        TreeSet treeSet = new TreeSet(new Comparator<String>() { // from class: o.setColorMode.1
            {
                setColorMode.this = this;
            }

            @Override // java.util.Comparator
            /* renamed from: ah$a */
            public int compare(String str, String str2) {
                boolean values;
                values = recycleUpdateOp.values(str, str2);
                if (values) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            }
        });
        for (Field field : cls.getDeclaredFields()) {
            PrintHelper.PrintBitmapAdapter valueOf2 = PrintHelper.PrintBitmapAdapter.valueOf(field);
            if (valueOf2 != null) {
                String ag$a2 = valueOf2.ag$a();
                ag$a2 = z ? ag$a2.toLowerCase(Locale.US).intern() : ag$a2;
                PrintHelper.PrintBitmapAdapter printBitmapAdapter = this.invoke.get(ag$a2);
                boolean z2 = printBitmapAdapter == null;
                Object[] objArr = new Object[4];
                objArr[0] = z ? "case-insensitive " : "";
                objArr[1] = ag$a2;
                objArr[2] = field;
                objArr[3] = printBitmapAdapter == null ? null : printBitmapAdapter.valueOf();
                markViewHoldersUpdated.values(z2, "two fields have the same %sname <%s>: %s and %s", objArr);
                this.invoke.put(ag$a2, valueOf2);
                treeSet.add(ag$a2);
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null) {
            setColorMode ag$a3 = ag$a(superclass, z);
            treeSet.addAll(ag$a3.toString);
            for (Map.Entry<String, PrintHelper.PrintBitmapAdapter> entry : ag$a3.invoke.entrySet()) {
                String key = entry.getKey();
                if (!this.invoke.containsKey(key)) {
                    this.invoke.put(key, entry.getValue());
                }
            }
        }
        if (treeSet.isEmpty()) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(treeSet));
        }
        this.toString = unmodifiableList;
    }
}
