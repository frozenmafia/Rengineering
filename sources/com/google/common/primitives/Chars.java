package com.google.common.primitives;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import o.markViewHoldersUpdated;
/* loaded from: classes7.dex */
public final class Chars {
    public static int toString(char c) {
        return c;
    }

    public static int toString(char c, char c2) {
        return c - c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int ah$a(char[] cArr, char c, int i, int i2) {
        while (i < i2) {
            if (cArr[i] == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int valueOf(char[] cArr, char c, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            if (cArr[i3] == c) {
                return i3;
            }
        }
        return -1;
    }

    /* loaded from: classes7.dex */
    enum LexicographicalComparator implements Comparator<char[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Chars.lexicographicalComparator()";
        }

        @Override // java.util.Comparator
        public int compare(char[] cArr, char[] cArr2) {
            int min = Math.min(cArr.length, cArr2.length);
            for (int i = 0; i < min; i++) {
                int chars = Chars.toString(cArr[i], cArr2[i]);
                if (chars != 0) {
                    return chars;
                }
            }
            return cArr.length - cArr2.length;
        }
    }

    /* loaded from: classes7.dex */
    static class CharArrayAsList extends AbstractList<Character> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final char[] array;
        final int end;
        final int start;

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return false;
        }

        CharArrayAsList(char[] cArr) {
            this(cArr, 0, cArr.length);
        }

        CharArrayAsList(char[] cArr, int i, int i2) {
            this.array = cArr;
            this.start = i;
            this.end = i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.end - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int i) {
            markViewHoldersUpdated.toString(i, size());
            return Character.valueOf(this.array[this.start + i]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return (obj instanceof Character) && Chars.ah$a(this.array, ((Character) obj).charValue(), this.start, this.end) != -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public int indexOf(Object obj) {
            int ah$a;
            if (!(obj instanceof Character) || (ah$a = Chars.ah$a(this.array, ((Character) obj).charValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return ah$a - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public int lastIndexOf(Object obj) {
            int valueOf;
            if (!(obj instanceof Character) || (valueOf = Chars.valueOf(this.array, ((Character) obj).charValue(), this.start, this.end)) < 0) {
                return -1;
            }
            return valueOf - this.start;
        }

        @Override // java.util.AbstractList, java.util.List
        public Character set(int i, Character ch) {
            markViewHoldersUpdated.toString(i, size());
            char[] cArr = this.array;
            int i2 = this.start + i;
            char c = cArr[i2];
            cArr[i2] = ((Character) markViewHoldersUpdated.toString(ch)).charValue();
            return Character.valueOf(c);
        }

        @Override // java.util.AbstractList, java.util.List
        public List<Character> subList(int i, int i2) {
            markViewHoldersUpdated.ag$a(i, i2, size());
            if (i == i2) {
                return Collections.emptyList();
            }
            char[] cArr = this.array;
            int i3 = this.start;
            return new CharArrayAsList(cArr, i + i3, i3 + i2);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CharArrayAsList) {
                CharArrayAsList charArrayAsList = (CharArrayAsList) obj;
                int size = size();
                if (charArrayAsList.size() != size) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (this.array[this.start + i] != charArrayAsList.array[charArrayAsList.start + i]) {
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
                i = (i * 31) + Chars.toString(this.array[i2]);
            }
            return i;
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            StringBuilder sb = new StringBuilder(size() * 3);
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

        char[] toCharArray() {
            return Arrays.copyOfRange(this.array, this.start, this.end);
        }
    }
}
