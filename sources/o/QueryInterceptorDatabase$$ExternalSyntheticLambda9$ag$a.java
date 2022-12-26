package o;
/* loaded from: classes7.dex */
public class QueryInterceptorDatabase$$ExternalSyntheticLambda9$ag$a {
    int ag$a = -1;
    char[] values;

    public QueryInterceptorDatabase$$ExternalSyntheticLambda9$ag$a(int i) {
        this.values = new char[i];
    }

    public void valueOf(char c) {
        int i = this.ag$a + 1;
        this.ag$a = i;
        char[] cArr = this.values;
        if (cArr.length <= i) {
            char[] cArr2 = new char[(cArr.length * 2) + 1];
            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
            this.values = cArr2;
        }
        this.values[this.ag$a] = c;
    }

    public String toString() {
        return new String(this.values, 0, this.ag$a + 1);
    }

    public void ah$a() {
        this.ag$a = -1;
    }
}
