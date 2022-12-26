package o;

import java.util.LinkedList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class disableWriteAheadLogging {
    static final disableWriteAheadLogging ag$a = new disableWriteAheadLogging(getAttachedDbs.values, 0, 0, 0);
    private final int ah$a;
    private final int toString;
    private final getAttachedDbs valueOf;
    private final int values;

    private disableWriteAheadLogging(getAttachedDbs getattacheddbs, int i, int i2, int i3) {
        this.valueOf = getattacheddbs;
        this.toString = i;
        this.values = i2;
        this.ah$a = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int valueOf() {
        return this.toString;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int ag$a() {
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int values() {
        return this.ah$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public disableWriteAheadLogging values(int i, int i2) {
        int i3 = this.ah$a;
        getAttachedDbs getattacheddbs = this.valueOf;
        if (i != this.toString) {
            int i4 = execSQL.valueOf[this.toString][i];
            int i5 = i4 >> 16;
            getattacheddbs = getattacheddbs.values(i4 & 65535, i5);
            i3 += i5;
        }
        int i6 = i == 2 ? 4 : 5;
        return new disableWriteAheadLogging(getattacheddbs.values(i2, i6), i, 0, i3 + i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public disableWriteAheadLogging toString(int i, int i2) {
        getAttachedDbs getattacheddbs = this.valueOf;
        int i3 = this.toString == 2 ? 4 : 5;
        return new disableWriteAheadLogging(getattacheddbs.values(execSQL.toString[this.toString][i], i3).values(i2, 5), this.toString, 0, this.ah$a + i3 + 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public disableWriteAheadLogging ag$a(int i) {
        getAttachedDbs getattacheddbs = this.valueOf;
        int i2 = this.toString;
        int i3 = this.ah$a;
        if (i2 == 4 || i2 == 2) {
            int i4 = execSQL.valueOf[i2][0];
            int i5 = i4 >> 16;
            getattacheddbs = getattacheddbs.values(i4 & 65535, i5);
            i3 += i5;
            i2 = 0;
        }
        int i6 = this.values;
        disableWriteAheadLogging disablewriteaheadlogging = new disableWriteAheadLogging(getattacheddbs, i2, this.values + 1, i3 + ((i6 == 0 || i6 == 31) ? 18 : i6 == 62 ? 9 : 8));
        return disablewriteaheadlogging.values == 2078 ? disablewriteaheadlogging.ah$a(i + 1) : disablewriteaheadlogging;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public disableWriteAheadLogging ah$a(int i) {
        int i2 = this.values;
        return i2 == 0 ? this : new disableWriteAheadLogging(this.valueOf.valueOf(i - i2, i2), this.toString, 0, this.ah$a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean valueOf(disableWriteAheadLogging disablewriteaheadlogging) {
        int i;
        int i2 = this.ah$a + (execSQL.valueOf[this.toString][disablewriteaheadlogging.toString] >> 16);
        int i3 = disablewriteaheadlogging.values;
        if (i3 > 0 && ((i = this.values) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= disablewriteaheadlogging.ah$a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public getMaximumSize values(byte[] bArr) {
        LinkedList<getAttachedDbs> linkedList = new LinkedList();
        for (getAttachedDbs getattacheddbs = ah$a(bArr.length).valueOf; getattacheddbs != null; getattacheddbs = getattacheddbs.valueOf()) {
            linkedList.addFirst(getattacheddbs);
        }
        getMaximumSize getmaximumsize = new getMaximumSize();
        for (getAttachedDbs getattacheddbs2 : linkedList) {
            getattacheddbs2.ah$a(getmaximumsize, bArr);
        }
        return getmaximumsize;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", execSQL.ah$a[this.toString], Integer.valueOf(this.ah$a), Integer.valueOf(this.values));
    }
}
