package com.google.common.primitives;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import o.markViewHoldersUpdated;
/* loaded from: classes5.dex */
public final class Bytes {
    public static int ah$a(byte b2) {
        return b2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int valueOf(byte[] bArr, byte b2, int i, int i2) {
        while (i < i2) {
            if (bArr[i] == b2) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
        r0 = r0 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int valueOf(byte[] r5, byte[] r6) {
        /*
            java.lang.String r0 = "array"
            o.markViewHoldersUpdated.valueOf(r5, r0)
            java.lang.String r0 = "target"
            o.markViewHoldersUpdated.valueOf(r6, r0)
            int r0 = r6.length
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0 = 0
        L10:
            int r2 = r5.length
            int r3 = r6.length
            int r2 = r2 - r3
            int r2 = r2 + 1
            if (r0 >= r2) goto L2a
            r2 = 0
        L18:
            int r3 = r6.length
            if (r2 >= r3) goto L29
            int r3 = r0 + r2
            r3 = r5[r3]
            r4 = r6[r2]
            if (r3 == r4) goto L26
            int r0 = r0 + 1
            goto L10
        L26:
            int r2 = r2 + 1
            goto L18
        L29:
            return r0
        L2a:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.primitives.Bytes.valueOf(byte[], byte[]):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ah$a(byte[] bArr, byte b2, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (bArr[i3] == b2) {
                return i3;
            }
        }
        return -1;
    }

    /* loaded from: classes7.dex */
    static class ByteArrayAsList extends AbstractList<Byte> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final byte[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        ByteArrayAsList(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        ByteArrayAsList(byte[] bArr, int i, int i2) {
            this.array = bArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Byte get(int i) {
            markViewHoldersUpdated.toString(i, size());
            return Byte.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Byte) && Bytes.valueOf(this.array, ((Byte) obj).byteValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int valueOf;
            if (!(obj instanceof Byte) || (valueOf = Bytes.valueOf(this.array, ((Byte) obj).byteValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return valueOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int ah$a;
            if (!(obj instanceof Byte) || (ah$a = Bytes.ah$a(this.array, ((Byte) obj).byteValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return ah$a - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Byte set(int i, Byte b2) {
            markViewHoldersUpdated.toString(i, size());
            byte[] bArr = this.array;
            int i2 = this.start + i;
            byte b3 = bArr[i2];
            bArr[i2] = ((Byte) markViewHoldersUpdated.toString(b2)).byteValue();
            return Byte.valueOf(b3);
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Byte> subList(int i, int i2) {
            markViewHoldersUpdated.ag$a(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            byte[] bArr = this.array;
            int i3 = this.start;
            return new ByteArrayAsList(bArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof ByteArrayAsList) {
                ByteArrayAsList byteArrayAsList = (ByteArrayAsList) obj;
                int size = size();
                if (byteArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != byteArrayAsList.array[byteArrayAsList.start + i]) {
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
                i = (i * 31) + Bytes.ah$a(this.array[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 5);
            sb.append('[');
            sb.append((int) this.array[this.start]);
            int i = this.start;
            while (true) {
                i++;
                if (i < this.end) {
                    sb.append(", ");
                    sb.append((int) this.array[i]);
                } else {
                    sb.append(']');
                    return sb.toString();
                }
            }
        }

        byte[] toByteArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }
}
