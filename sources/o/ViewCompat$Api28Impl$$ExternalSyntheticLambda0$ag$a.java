package o;

import o.ViewCompat;
/* loaded from: classes3.dex */
public class ViewCompat$Api28Impl$$ExternalSyntheticLambda0$ag$a implements ViewCompat.OnReceiveContentListenerAdapter {
    private final int valueOf;
    private final String[] values;

    public ViewCompat$Api28Impl$$ExternalSyntheticLambda0$ag$a() {
        this(10);
    }

    public ViewCompat$Api28Impl$$ExternalSyntheticLambda0$ag$a(int i) {
        int i2 = 2;
        for (int i3 = 1; i3 < i; i3++) {
            i2 *= 2;
        }
        this.valueOf = i2 - 1;
        this.values = new String[i2];
    }

    @Override // o.ViewCompat.OnReceiveContentListenerAdapter
    public String values(char[] cArr, int i) {
        long j = -2128831035;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j ^ ((byte) cArr[i2])) * 16777619;
        }
        int i3 = this.valueOf & ((int) j);
        String str = this.values[i3];
        if (str == null) {
            return values(i3, cArr, i);
        }
        if (str.length() != i) {
            return values(i3, cArr, i);
        }
        for (int i4 = 0; i4 < str.length(); i4++) {
            if (str.charAt(i4) != cArr[i4]) {
                return values(i3, cArr, i);
            }
        }
        return str;
    }

    private String values(int i, char[] cArr, int i2) {
        String str = new String(cArr, 0, i2);
        this.values[i] = str;
        return str;
    }
}
