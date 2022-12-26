package com.google.common.primitives;

import com.google.common.base.Converter;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import o.markViewHoldersUpdated;
import o.setHasStableIds;
/* loaded from: classes5.dex */
public final class Floats extends setHasStableIds {
    public static int ah$a(float f) {
        return Float.valueOf(f).hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ag$a(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ah$a(float[] fArr, float f, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (fArr[i3] == f) {
                return i3;
            }
        }
        return -1;
    }

    /* loaded from: classes7.dex */
    static final class FloatConverter extends Converter<String, Float> implements Serializable {
        static final FloatConverter INSTANCE = new FloatConverter();
        private static final long serialVersionUID = 1;

        public String toString() {
            return "Floats.stringConverter()";
        }

        private FloatConverter() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public Float doForward(String str) {
            return Float.valueOf(str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        public String doBackward(Float f) {
            return f.toString();
        }

        private Object readResolve() {
            return INSTANCE;
        }
    }

    /* loaded from: classes7.dex */
    enum LexicographicalComparator implements Comparator<float[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Floats.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(float[] fArr, float[] fArr2) {
            int min = Math.min(fArr.length, fArr2.length);
            for (int i = 0; i < min; i++) {
                int compare = Float.compare(fArr[i], fArr2[i]);
                if (compare != 0) {
                    return compare;
                }
            }
            return fArr.length - fArr2.length;
        }
    }

    /* loaded from: classes7.dex */
    static class FloatArrayAsList extends AbstractList<Float> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final float[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        FloatArrayAsList(float[] fArr) {
            this(fArr, 0, fArr.length);
        }

        FloatArrayAsList(float[] fArr, int i, int i2) {
            this.array = fArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Float get(int i) {
            markViewHoldersUpdated.toString(i, size());
            return Float.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Float) && Floats.ag$a(this.array, ((Float) obj).floatValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int ag$a;
            if (!(obj instanceof Float) || (ag$a = Floats.ag$a(this.array, ((Float) obj).floatValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return ag$a - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int ah$a;
            if (!(obj instanceof Float) || (ah$a = Floats.ah$a(this.array, ((Float) obj).floatValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return ah$a - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Float set(int i, Float f) {
            markViewHoldersUpdated.toString(i, size());
            float[] fArr = this.array;
            int i2 = this.start + i;
            float f2 = fArr[i2];
            fArr[i2] = ((Float) markViewHoldersUpdated.toString(f)).floatValue();
            return Float.valueOf(f2);
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Float> subList(int i, int i2) {
            markViewHoldersUpdated.ag$a(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            float[] fArr = this.array;
            int i3 = this.start;
            return new FloatArrayAsList(fArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof FloatArrayAsList) {
                FloatArrayAsList floatArrayAsList = (FloatArrayAsList) obj;
                int size = size();
                if (floatArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != floatArrayAsList.array[floatArrayAsList.start + i]) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            int i = 1;
            for (int i2 = this.start; i2 < this.end; i2++) {
                i = (i * 31) + Floats.ah$a(this.array[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 12);
            sb.append('[');
            sb.append(this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i < this.end) {
                    sb.append(", ");
                    sb.append(this.array[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        float[] toFloatArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }
}
