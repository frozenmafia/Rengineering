package o;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
/* loaded from: classes5.dex */
public final class execSQL {
    static final int[][] toString;
    private static final int[][] values;
    private final byte[] ag$a;
    static final String[] ah$a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    static final int[][] valueOf = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    static {
        int[][] iArr = (int[][]) Array.newInstance(Integer.TYPE, 5, 256);
        values = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            values[0][i] = (i - 65) + 2;
        }
        values[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            values[1][i2] = (i2 - 97) + 2;
        }
        values[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            values[2][i3] = (i3 - 48) + 2;
        }
        int[][] iArr2 = values;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            values[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr4[i5] > 0) {
                values[4][iArr4[i5]] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance(Integer.TYPE, 6, 6);
        toString = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = toString;
        iArr7[0][4] = 0;
        iArr7[1][4] = 0;
        iArr7[1][0] = 28;
        iArr7[3][4] = 0;
        iArr7[2][4] = 0;
        iArr7[2][0] = 15;
    }

    public execSQL(byte[] bArr) {
        this.ag$a = bArr;
    }

    public getMaximumSize ah$a() {
        int i;
        Collection<disableWriteAheadLogging> singletonList = Collections.singletonList(disableWriteAheadLogging.ag$a);
        int i2 = 0;
        while (true) {
            byte[] bArr = this.ag$a;
            if (i2 < bArr.length) {
                int i3 = i2 + 1;
                byte b2 = i3 < bArr.length ? bArr[i3] : (byte) 0;
                byte b3 = bArr[i2];
                if (b3 == 13) {
                    if (b2 == 10) {
                        i = 2;
                    }
                    i = 0;
                } else if (b3 == 44) {
                    if (b2 == 32) {
                        i = 4;
                    }
                    i = 0;
                } else if (b3 != 46) {
                    if (b3 == 58 && b2 == 32) {
                        i = 5;
                    }
                    i = 0;
                } else {
                    if (b2 == 32) {
                        i = 3;
                    }
                    i = 0;
                }
                if (i > 0) {
                    singletonList = valueOf(singletonList, i2, i);
                    i2 = i3;
                } else {
                    singletonList = ah$a(singletonList, i2);
                }
                i2++;
            } else {
                return ((disableWriteAheadLogging) Collections.min(singletonList, new Comparator<disableWriteAheadLogging>() { // from class: o.execSQL.5
                    @Override // java.util.Comparator
                    /* renamed from: toString */
                    public int compare(disableWriteAheadLogging disablewriteaheadlogging, disableWriteAheadLogging disablewriteaheadlogging2) {
                        return disablewriteaheadlogging.values() - disablewriteaheadlogging2.values();
                    }
                })).values(this.ag$a);
            }
        }
    }

    private Collection<disableWriteAheadLogging> ah$a(Iterable<disableWriteAheadLogging> iterable, int i) {
        LinkedList linkedList = new LinkedList();
        for (disableWriteAheadLogging disablewriteaheadlogging : iterable) {
            valueOf(disablewriteaheadlogging, i, linkedList);
        }
        return ag$a(linkedList);
    }

    private void valueOf(disableWriteAheadLogging disablewriteaheadlogging, int i, Collection<disableWriteAheadLogging> collection) {
        char c = (char) (this.ag$a[i] & 255);
        boolean z = values[disablewriteaheadlogging.valueOf()][c] > 0;
        disableWriteAheadLogging disablewriteaheadlogging2 = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = values[i2][c];
            if (i3 > 0) {
                if (disablewriteaheadlogging2 == null) {
                    disablewriteaheadlogging2 = disablewriteaheadlogging.ah$a(i);
                }
                if (!z || i2 == disablewriteaheadlogging.valueOf() || i2 == 2) {
                    collection.add(disablewriteaheadlogging2.values(i2, i3));
                }
                if (!z && toString[disablewriteaheadlogging.valueOf()][i2] >= 0) {
                    collection.add(disablewriteaheadlogging2.toString(i2, i3));
                }
            }
        }
        if (disablewriteaheadlogging.ag$a() > 0 || values[disablewriteaheadlogging.valueOf()][c] == 0) {
            collection.add(disablewriteaheadlogging.ag$a(i));
        }
    }

    private static Collection<disableWriteAheadLogging> valueOf(Iterable<disableWriteAheadLogging> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (disableWriteAheadLogging disablewriteaheadlogging : iterable) {
            ah$a(disablewriteaheadlogging, i, i2, linkedList);
        }
        return ag$a(linkedList);
    }

    private static void ah$a(disableWriteAheadLogging disablewriteaheadlogging, int i, int i2, Collection<disableWriteAheadLogging> collection) {
        disableWriteAheadLogging ah$a2 = disablewriteaheadlogging.ah$a(i);
        collection.add(ah$a2.values(4, i2));
        if (disablewriteaheadlogging.valueOf() != 4) {
            collection.add(ah$a2.toString(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(ah$a2.values(2, 16 - i2).values(2, 1));
        }
        if (disablewriteaheadlogging.ag$a() > 0) {
            collection.add(disablewriteaheadlogging.ag$a(i).ag$a(i + 1));
        }
    }

    private static Collection<disableWriteAheadLogging> ag$a(Iterable<disableWriteAheadLogging> iterable) {
        LinkedList linkedList = new LinkedList();
        for (disableWriteAheadLogging disablewriteaheadlogging : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                disableWriteAheadLogging disablewriteaheadlogging2 = (disableWriteAheadLogging) it.next();
                if (disablewriteaheadlogging2.valueOf(disablewriteaheadlogging)) {
                    z = false;
                    break;
                } else if (disablewriteaheadlogging.valueOf(disablewriteaheadlogging2)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(disablewriteaheadlogging);
            }
        }
        return linkedList;
    }
}
