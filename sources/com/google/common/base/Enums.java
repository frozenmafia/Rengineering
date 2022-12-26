package com.google.common.base;

import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
import o.markViewHoldersUpdated;
/* loaded from: classes7.dex */
public final class Enums {
    private static final Map<Class<? extends Enum<?>>, Map<String, WeakReference<? extends Enum<?>>>> values = new WeakHashMap();

    /* loaded from: classes7.dex */
    static final class StringConverter<T extends Enum<T>> extends Converter<String, T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Class<T> enumClass;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.base.Converter
        protected /* bridge */ /* synthetic */ String doBackward(Object obj) {
            return doBackward((StringConverter<T>) ((Enum) obj));
        }

        StringConverter(Class<T> cls) {
            this.enumClass = (Class) markViewHoldersUpdated.toString(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public T doForward(String str) {
            return (T) Enum.valueOf(this.enumClass, str);
        }

        protected String doBackward(T t) {
            return t.name();
        }

        @Override // com.google.common.base.Converter, o.hasPendingUpdates
        public boolean equals(Object obj) {
            if (obj instanceof StringConverter) {
                return this.enumClass.equals(((StringConverter) obj).enumClass);
            }
            return false;
        }

        public int hashCode() {
            return this.enumClass.hashCode();
        }

        public String toString() {
            String name = this.enumClass.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 29);
            sb.append("Enums.stringConverter(");
            sb.append(name);
            sb.append(".class)");
            return sb.toString();
        }
    }
}
