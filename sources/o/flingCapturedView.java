package o;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class flingCapturedView implements getViewHorizontalDragRange {
    private static int ag$a = 1;
    private static long toString = -8441342629167290998L;
    private static int valueOf;
    private final setCurrentTabTag ah$a;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r5 == r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
        if ((r5 == r6 ? 'M' : org.apache.http.message.TokenParser.ESCAPE) != '\\') goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
        if ((r6 instanceof o.flingCapturedView) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
        r6 = o.flingCapturedView.valueOf + 81;
        o.flingCapturedView.ag$a = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
        if ((r6 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
        r3 = 77 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003e, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x003f, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0040, code lost:
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004b, code lost:
        if (o.runAnimators.values(r5.ah$a, ((o.flingCapturedView) r6).ah$a) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x004f, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0050, code lost:
        if (r6 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0052, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0053, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = o.flingCapturedView.ag$a
            int r0 = r0 + 95
            int r1 = r0 % 128
            o.flingCapturedView.valueOf = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L10
            r0 = 0
            goto L11
        L10:
            r0 = 1
        L11:
            r3 = 77
            if (r0 == r2) goto L1e
            r0 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L1c
            if (r5 != r6) goto L2a
            goto L29
        L1c:
            r6 = move-exception
            throw r6
        L1e:
            r0 = 92
            if (r5 != r6) goto L25
            r4 = 77
            goto L27
        L25:
            r4 = 92
        L27:
            if (r4 == r0) goto L2a
        L29:
            return r2
        L2a:
            boolean r0 = r6 instanceof o.flingCapturedView
            if (r0 != 0) goto L41
            int r6 = o.flingCapturedView.valueOf     // Catch: java.lang.Exception -> L3f
            int r6 = r6 + 81
            int r0 = r6 % 128
            o.flingCapturedView.ag$a = r0     // Catch: java.lang.Exception -> L3f
            int r6 = r6 % 2
            if (r6 != 0) goto L3e
            int r3 = r3 / r1
            return r1
        L3c:
            r6 = move-exception
            throw r6
        L3e:
            return r1
        L3f:
            r6 = move-exception
            throw r6
        L41:
            o.flingCapturedView r6 = (o.flingCapturedView) r6
            o.setCurrentTabTag r0 = r5.ah$a
            o.setCurrentTabTag r6 = r6.ah$a
            boolean r6 = o.runAnimators.values(r0, r6)
            if (r6 != 0) goto L4f
            r6 = 0
            goto L50
        L4f:
            r6 = 1
        L50:
            if (r6 == 0) goto L53
            return r2
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.flingCapturedView.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = valueOf + 59;
        ag$a = i % 128;
        int i2 = i % 2;
        int hashCode = this.ah$a.hashCode();
        int i3 = ag$a + 123;
        valueOf = i3 % 128;
        if ((i3 % 2 != 0 ? 'K' : '+') != 'K') {
            return hashCode;
        }
        Object[] objArr = null;
        int length = objArr.length;
        return hashCode;
    }

    public String toString() {
        String str = "SaveNameClient(_source=" + this.ah$a + ')';
        int i = valueOf + 39;
        ag$a = i % 128;
        int i2 = i % 2;
        return str;
    }

    public flingCapturedView(setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(setcurrenttabtag, "_source");
        this.ah$a = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "SaveNameClient");
        hashMap.put(valueOf(new char[]{36345, 36234, 39592, 48973, 17235, 38444, 2098, 59072, 7090, 8575}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1).intern(), this.ah$a.ah$a());
        int i = valueOf + 29;
        ag$a = i % 128;
        int i2 = i % 2;
        return hashMap;
    }

    private static String valueOf(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(toString, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * toString));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}
