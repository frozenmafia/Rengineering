package com.nytimes.android.external.cache;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class FuturesGetChecked {

    /* loaded from: classes7.dex */
    static class GetCheckedTypeValidatorHolder {
        static final String values = GetCheckedTypeValidatorHolder.class.getName() + "$ClassValueValidator";
        static final FuturesGetChecked$ah$a valueOf = ah$a();

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
                Set<WeakReference<Class<? extends Exception>>> set = validClasses;
                if (set.size() > 1000) {
                    set.clear();
                }
                set.add(new WeakReference<>(cls));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static FuturesGetChecked$ah$a ah$a() {
            try {
                return (FuturesGetChecked$ah$a) Class.forName(values).getEnumConstants()[0];
            } catch (Throwable unused) {
                return WeakSetValidator.INSTANCE;
            }
        }
    }
}
