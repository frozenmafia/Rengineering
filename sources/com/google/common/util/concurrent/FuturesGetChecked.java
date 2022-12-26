package com.google.common.util.concurrent;

import com.google.common.collect.Ordering;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import o.hasPendingUpdates;
import o.markViewHoldersUpdated;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class FuturesGetChecked {
    private static final Ordering<Constructor<?>> ag$a = Ordering.natural().onResultOf(new hasPendingUpdates<Constructor<?>, Boolean>() { // from class: com.google.common.util.concurrent.FuturesGetChecked.3
        @Override // o.hasPendingUpdates
        /* renamed from: values */
        public Boolean apply(Constructor<?> constructor) {
            return Boolean.valueOf(Arrays.asList(constructor.getParameterTypes()).contains(String.class));
        }
    }).reverse();

    static FuturesGetChecked$ah$a valueOf() {
        return GetCheckedTypeValidatorHolder.WeakSetValidator.INSTANCE;
    }

    /* loaded from: classes7.dex */
    static class GetCheckedTypeValidatorHolder {
        static final FuturesGetChecked$ah$a toString = valueOf();

        GetCheckedTypeValidatorHolder() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes7.dex */
        public enum WeakSetValidator implements FuturesGetChecked$ah$a {
            INSTANCE;
            
            private static final Set<WeakReference<Class<? extends Exception>>> validClasses = new CopyOnWriteArraySet();

            public void validateClass(Class<? extends Exception> cls) {
                for (WeakReference<Class<? extends Exception>> weakReference : validClasses) {
                    if (cls.equals(weakReference.get())) {
                        return;
                    }
                }
                FuturesGetChecked.valueOf(cls);
                Set<WeakReference<Class<? extends Exception>>> set = validClasses;
                if (set.size() > 1000) {
                    set.clear();
                }
                set.add(new WeakReference<>(cls));
            }
        }

        static FuturesGetChecked$ah$a valueOf() {
            return FuturesGetChecked.valueOf();
        }
    }

    private static boolean ah$a(Class<? extends Exception> cls) {
        try {
            values(cls, new Exception());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static <X extends Exception> X values(Class<X> cls, Throwable th) {
        for (Constructor constructor : values(Arrays.asList(cls.getConstructors()))) {
            X x = (X) ag$a(constructor, th);
            if (x != null) {
                if (x.getCause() == null) {
                    x.initCause(th);
                }
                return x;
            }
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 82);
        sb.append("No appropriate constructor for exception of type ");
        sb.append(valueOf);
        sb.append(" in response to chained exception");
        throw new IllegalArgumentException(sb.toString(), th);
    }

    private static <X extends Exception> List<Constructor<X>> values(List<Constructor<X>> list) {
        return (List<Constructor<X>>) ag$a.sortedCopy(list);
    }

    private static <X> X ag$a(Constructor<X> constructor, Throwable th) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Class<?> cls = parameterTypes[i];
            if (cls.equals(String.class)) {
                objArr[i] = th.toString();
            } else if (!cls.equals(Throwable.class)) {
                return null;
            } else {
                objArr[i] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    static boolean values(Class<? extends Exception> cls) {
        return !RuntimeException.class.isAssignableFrom(cls);
    }

    static void valueOf(Class<? extends Exception> cls) {
        markViewHoldersUpdated.toString(values(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        markViewHoldersUpdated.toString(ah$a(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }
}
