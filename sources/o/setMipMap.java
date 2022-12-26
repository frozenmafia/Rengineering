package o;
/* loaded from: classes3.dex */
public class setMipMap {
    public final Object ag$a;
    public final int ah$a;
    public final int toString;
    public final int valueOf;
    public final long values;

    public setMipMap(Object obj) {
        this(obj, -1L);
    }

    public setMipMap(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public setMipMap(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public setMipMap(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public setMipMap(setMipMap setmipmap) {
        this.ag$a = setmipmap.ag$a;
        this.valueOf = setmipmap.valueOf;
        this.toString = setmipmap.toString;
        this.values = setmipmap.values;
        this.ah$a = setmipmap.ah$a;
    }

    private setMipMap(Object obj, int i, int i2, long j, int i3) {
        this.ag$a = obj;
        this.valueOf = i;
        this.toString = i2;
        this.values = j;
        this.ah$a = i3;
    }

    public setMipMap toString(Object obj) {
        return this.ag$a.equals(obj) ? this : new setMipMap(obj, this.valueOf, this.toString, this.values, this.ah$a);
    }

    public boolean valueOf() {
        return this.valueOf != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setMipMap) {
            setMipMap setmipmap = (setMipMap) obj;
            return this.ag$a.equals(setmipmap.ag$a) && this.valueOf == setmipmap.valueOf && this.toString == setmipmap.toString && this.values == setmipmap.values && this.ah$a == setmipmap.ah$a;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.ag$a.hashCode();
        int i = this.valueOf;
        return ((((((((hashCode + androidx.databinding.library.baseAdapters.BR.userTeamVM) * 31) + i) * 31) + this.toString) * 31) + ((int) this.values)) * 31) + this.ah$a;
    }
}
