package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class getPath {
    private final getPageSize ag$a;
    private final int[] values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getPath(getPageSize getpagesize, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.ag$a = getpagesize;
        int length = iArr.length;
        if (length > 1 && iArr[0] == 0) {
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.values = new int[]{0};
                return;
            }
            int i2 = length - i;
            int[] iArr2 = new int[i2];
            this.values = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            return;
        }
        this.values = iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] values() {
        return this.values;
    }

    int ah$a() {
        return this.values.length - 1;
    }

    boolean ag$a() {
        return this.values[0] == 0;
    }

    int toString(int i) {
        int[] iArr = this.values;
        return iArr[(iArr.length - 1) - i];
    }

    getPath toString(getPath getpath) {
        if (!this.ag$a.equals(getpath.ag$a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (ag$a()) {
            return getpath;
        }
        if (getpath.ag$a()) {
            return this;
        }
        int[] iArr = this.values;
        int[] iArr2 = getpath.values;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = getPageSize.ah$a(iArr2[i - length], iArr[i]);
        }
        return new getPath(this.ag$a, iArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public getPath ah$a(getPath getpath) {
        if (!this.ag$a.equals(getpath.ag$a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (ag$a() || getpath.ag$a()) {
            return this.ag$a.ag$a();
        }
        int[] iArr = this.values;
        int length = iArr.length;
        int[] iArr2 = getpath.values;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = getPageSize.ah$a(iArr3[i4], this.ag$a.valueOf(i2, iArr2[i3]));
            }
        }
        return new getPath(this.ag$a, iArr3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public getPath values(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.ag$a.ag$a();
            }
            int length = this.values.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.ag$a.valueOf(this.values[i3], i2);
            }
            return new getPath(this.ag$a, iArr);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public getPath[] values(getPath getpath) {
        if (!this.ag$a.equals(getpath.ag$a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (getpath.ag$a()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        getPath ag$a = this.ag$a.ag$a();
        int valueOf = this.ag$a.valueOf(getpath.toString(getpath.ah$a()));
        getPath getpath2 = this;
        while (getpath2.ah$a() >= getpath.ah$a() && !getpath2.ag$a()) {
            int ah$a = getpath2.ah$a() - getpath.ah$a();
            int valueOf2 = this.ag$a.valueOf(getpath2.toString(getpath2.ah$a()), valueOf);
            getPath values = getpath.values(ah$a, valueOf2);
            ag$a = ag$a.toString(this.ag$a.toString(ah$a, valueOf2));
            getpath2 = getpath2.toString(values);
        }
        return new getPath[]{ag$a, getpath2};
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ah$a() * 8);
        for (int ah$a = ah$a(); ah$a >= 0; ah$a--) {
            int getpath = toString(ah$a);
            if (getpath != 0) {
                if (getpath < 0) {
                    sb.append(" - ");
                    getpath = -getpath;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (ah$a == 0 || getpath != 1) {
                    int ag$a = this.ag$a.ag$a(getpath);
                    if (ag$a == 0) {
                        sb.append('1');
                    } else if (ag$a == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(ag$a);
                    }
                }
                if (ah$a != 0) {
                    if (ah$a == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(ah$a);
                    }
                }
            }
        }
        return sb.toString();
    }
}
