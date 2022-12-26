package o;

import android.app.Service;
import android.content.Context;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public final class dispose<T> {
    private final valueOf<T> ag$a;
    private final T valueOf;

    /* loaded from: classes5.dex */
    public interface valueOf<T> {
        List<String> ag$a(T t);
    }

    public static dispose<Context> ag$a(Context context, Class<? extends Service> cls) {
        return new dispose<>(context, new dispose$ah$a(cls));
    }

    dispose(T t, valueOf<T> valueof) {
        this.valueOf = t;
        this.ag$a = valueof;
    }

    public List<quickRecycleScrapView<ComponentRegistrar>> ag$a() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.ag$a.ag$a(this.valueOf)) {
            arrayList.add(new quickRecycleScrapView() { // from class: o.getCachedItemCount
                @Override // o.quickRecycleScrapView
                public final Object ag$a() {
                    ComponentRegistrar ag$a;
                    ag$a = dispose.ag$a(str);
                    return ag$a;
                }
            });
        }
        return arrayList;
    }

    public static ComponentRegistrar ag$a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (!ComponentRegistrar.class.isAssignableFrom(cls)) {
                throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
            }
            return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e4);
        }
    }
}
