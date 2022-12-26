package o;
/* loaded from: classes3.dex */
public final class isAtLeastNMR1 {
    public final createFromIcon ag$a;
    public final createFromIcon ah$a;
    public final int toString;
    public final String valueOf;
    public final int values;

    public isAtLeastNMR1(String str, createFromIcon createfromicon, createFromIcon createfromicon2, int i, int i2) {
        FingerprintManagerCompat.toString(i == 0 || i2 == 0);
        this.valueOf = FingerprintManagerCompat.toString(str);
        this.ag$a = (createFromIcon) FingerprintManagerCompat.toString(createfromicon);
        this.ah$a = (createFromIcon) FingerprintManagerCompat.toString(createfromicon2);
        this.values = i;
        this.toString = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        isAtLeastNMR1 isatleastnmr1 = (isAtLeastNMR1) obj;
        return this.values == isatleastnmr1.values && this.toString == isatleastnmr1.toString && this.valueOf.equals(isatleastnmr1.valueOf) && this.ag$a.equals(isatleastnmr1.ag$a) && this.ah$a.equals(isatleastnmr1.ah$a);
    }

    public int hashCode() {
        int i = this.values;
        int i2 = this.toString;
        int hashCode = this.valueOf.hashCode();
        return ((((((((i + androidx.databinding.library.baseAdapters.BR.userTeamVM) * 31) + i2) * 31) + hashCode) * 31) + this.ag$a.hashCode()) * 31) + this.ah$a.hashCode();
    }
}
