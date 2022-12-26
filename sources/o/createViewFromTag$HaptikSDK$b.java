package o;

import android.graphics.Color;
/* loaded from: classes.dex */
public final class createViewFromTag$HaptikSDK$b extends createViewFromTag {
    private static long ah$a = 3438072167535146653L;
    private static int toString = 0;
    private static int values = 1;
    private final String ag$a;
    private final String valueOf;

    public boolean equals(Object obj) {
        int i = toString + 121;
        values = i % 128;
        int i2 = i % 2;
        if (this != obj) {
            if (obj instanceof createViewFromTag$HaptikSDK$b) {
                createViewFromTag$HaptikSDK$b createviewfromtag_haptiksdk_b = (createViewFromTag$HaptikSDK$b) obj;
                return runAnimators.values((Object) this.valueOf, (Object) createviewfromtag_haptiksdk_b.valueOf) && runAnimators.values((Object) this.ag$a, (Object) createviewfromtag_haptiksdk_b.ag$a);
            }
            int i3 = toString + 9;
            values = i3 % 128;
            return !(i3 % 2 != 0);
        }
        try {
            int i4 = values + 67;
            try {
                toString = i4 % 128;
                return i4 % 2 == 0;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public int hashCode() {
        try {
            int i = toString + 13;
            values = i % 128;
            int i2 = i % 2;
            int hashCode = (this.valueOf.hashCode() * 31) + this.ag$a.hashCode();
            int i3 = values + 57;
            toString = i3 % 128;
            if ((i3 % 2 != 0 ? 'F' : 'J') != 'F') {
                return hashCode;
            }
            int i4 = 22 / 0;
            return hashCode;
        } catch (Exception e) {
            throw e;
        }
    }

    public String toString() {
        try {
            String str = this.valueOf;
            String str2 = this.ag$a;
            StringBuilder sb = new StringBuilder();
            try {
                sb.append("YetToBatVM(title=");
                sb.append(str);
                sb.append(", description=");
                sb.append(str2);
                sb.append(")");
                String sb2 = sb.toString();
                int i = values + 55;
                toString = i % 128;
                int i2 = i % 2;
                return sb2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final String ah$a() {
        String str;
        int i = values + 39;
        toString = i % 128;
        if ((i % 2 != 0 ? (char) 14 : 'A') != 14) {
            str = this.valueOf;
        } else {
            str = this.valueOf;
            int i2 = 92 / 0;
        }
        int i3 = toString + 45;
        values = i3 % 128;
        if ((i3 % 2 == 0 ? 'W' : 'M') != 'W') {
            return str;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createViewFromTag$HaptikSDK$b(String str, String str2) {
        super(null);
        runAnimators.ag$a(str, valueOf(new char[]{56589, 56697, 60222, 4095, 27770, 7626, 58033, 36801, 1820}, (-16777215) - Color.rgb(0, 0, 0)).intern());
        runAnimators.ag$a(str2, "description");
        this.valueOf = str;
        this.ag$a = str2;
    }

    public final String values() {
        try {
            int i = toString + 63;
            values = i % 128;
            int i2 = i % 2;
            String str = this.ag$a;
            try {
                int i3 = toString + 25;
                values = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Override // o.createCheckBox
    public int getRoot() {
        int i = toString + 59;
        values = i % 128;
        int i2 = i % 2;
        try {
            int valueOf = createButton.valueOf(this);
            int i3 = toString + 21;
            values = i3 % 128;
            int i4 = i3 % 2;
            return valueOf;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String valueOf(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(ah$a, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * ah$a));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}
