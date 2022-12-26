package com.google.api.client.util;

import com.google.api.client.util.GenericData;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.PrintHelper;
import o.PrintHelper$OnPrintFinishCallback$ag$a;
import o.isPortrait;
import o.printBitmap;
import o.setColorMode;
/* loaded from: classes7.dex */
public class GenericData extends AbstractMap<String, Object> implements Cloneable {
    public final setColorMode classInfo;
    Map<String, Object> unknownFields;

    /* loaded from: classes7.dex */
    public enum Flags {
        IGNORE_CASE
    }

    public GenericData() {
        this(EnumSet.noneOf(Flags.class));
    }

    public GenericData(EnumSet<Flags> enumSet) {
        this.unknownFields = isPortrait.valueOf();
        this.classInfo = setColorMode.ag$a(getClass(), enumSet.contains(Flags.IGNORE_CASE));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            PrintHelper.PrintBitmapAdapter ag$a = this.classInfo.ag$a(str);
            if (ag$a != null) {
                return ag$a.ah$a(this);
            }
            if (this.classInfo.ag$a()) {
                str = str.toLowerCase(Locale.US);
            }
            return this.unknownFields.get(str);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: valueOf */
    public final Object put(String str, Object obj) {
        PrintHelper.PrintBitmapAdapter ag$a = this.classInfo.ag$a(str);
        if (ag$a != null) {
            Object ah$a = ag$a.ah$a(this);
            ag$a.toString(this, obj);
            return ah$a;
        }
        if (this.classInfo.ag$a()) {
            str = str.toLowerCase(Locale.US);
        }
        return this.unknownFields.put(str, obj);
    }

    public GenericData ag$a(String str, Object obj) {
        PrintHelper.PrintBitmapAdapter ag$a = this.classInfo.ag$a(str);
        if (ag$a != null) {
            ag$a.toString(this, obj);
        } else {
            if (this.classInfo.ag$a()) {
                str = str.toLowerCase(Locale.US);
            }
            this.unknownFields.put(str, obj);
        }
        return this;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends String, ?> map) {
        for (Map.Entry<? extends String, ?> entry : map.entrySet()) {
            ag$a(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (this.classInfo.ag$a(str) != null) {
                throw new UnsupportedOperationException();
            }
            if (this.classInfo.ag$a()) {
                str = str.toLowerCase(Locale.US);
            }
            return this.unknownFields.remove(str);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<String, Object>> entrySet() {
        return new AbstractSet<Map.Entry<String, Object>>() { // from class: com.google.api.client.util.GenericData$ag$a
            private final PrintHelper$OnPrintFinishCallback$ag$a ah$a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.ah$a = new PrintHelper.OnPrintFinishCallback(GenericData.this, GenericData.this.classInfo.ag$a()).entrySet();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<String, Object>> iterator() {
                return new GenericData.valueOf(this.ah$a);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return GenericData.this.unknownFields.size() + this.ah$a.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public void clear() {
                GenericData.this.unknownFields.clear();
                this.ah$a.clear();
            }
        };
    }

    @Override // java.util.AbstractMap
    /* renamed from: valueOf */
    public GenericData clone() {
        try {
            GenericData genericData = (GenericData) super.clone();
            printBitmap.ag$a(this, genericData);
            genericData.unknownFields = (Map) printBitmap.toString(this.unknownFields);
            return genericData;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof GenericData)) {
            return false;
        }
        GenericData genericData = (GenericData) obj;
        return super.equals(genericData) && Objects.equals(this.classInfo, genericData.classInfo);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.classInfo);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return "GenericData{classInfo=" + this.classInfo.toString + ", " + super.toString() + "}";
    }

    /* loaded from: classes7.dex */
    final class valueOf implements Iterator<Map.Entry<String, Object>> {
        private final Iterator<Map.Entry<String, Object>> ah$a;
        private boolean valueOf;
        private final Iterator<Map.Entry<String, Object>> values;

        /* JADX INFO: Access modifiers changed from: package-private */
        public valueOf(PrintHelper$OnPrintFinishCallback$ag$a printHelper$OnPrintFinishCallback$ag$a) {
            this.ah$a = printHelper$OnPrintFinishCallback$ag$a.iterator();
            this.values = GenericData.this.unknownFields.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.ah$a.hasNext() || this.values.hasNext();
        }

        @Override // java.util.Iterator
        /* renamed from: ag$a */
        public Map.Entry<String, Object> next() {
            if (!this.valueOf) {
                if (this.ah$a.hasNext()) {
                    return this.ah$a.next();
                }
                this.valueOf = true;
            }
            return this.values.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.valueOf) {
                this.values.remove();
            }
            this.ah$a.remove();
        }
    }
}
