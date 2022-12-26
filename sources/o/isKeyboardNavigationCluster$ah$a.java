package o;
/* loaded from: classes3.dex */
public final class isKeyboardNavigationCluster$ah$a {
    private static int ah$a = 1;
    private static long toString = -5701223721920885994L;
    private static int valueOf;

    private isKeyboardNavigationCluster$ah$a() {
    }

    public /* synthetic */ isKeyboardNavigationCluster$ah$a(getTargetTypes gettargettypes) {
        this();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        if ((r2 ? '4' : 28) != '4') goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
        if (o.runAnimators.values((java.lang.Object) valueOf(new char[]{36889, 36976, 31044, 29238, 42752, 48137}, android.text.TextUtils.indexOf("", "")).intern(), (java.lang.Object) r6.nextName()) != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
        r1 = r6.nextString();
        r6 = o.isKeyboardNavigationCluster$ah$a.valueOf + 111;
        o.isKeyboardNavigationCluster$ah$a.ah$a = r6 % 128;
        r6 = r6 % 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o.isKeyboardNavigationCluster ah$a(android.util.JsonReader r6) {
        /*
            r5 = this;
            java.lang.String r0 = "reader"
            o.runAnimators.valueOf(r6, r0)
            r0 = 0
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            r6.beginObject()
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L79
            int r2 = o.isKeyboardNavigationCluster$ah$a.valueOf
            int r2 = r2 + 101
            int r3 = r2 % 128
            o.isKeyboardNavigationCluster$ah$a.ah$a = r3
            int r2 = r2 % 2
            if (r2 != 0) goto L20
            r2 = 1
            goto L21
        L20:
            r2 = 0
        L21:
            r3 = 6
            java.lang.String r4 = ""
            if (r2 == 0) goto L50
            char[] r2 = new char[r3]
            r2 = {x0080: FILL_ARRAY_DATA  , data: [-28647, -28560, 31044, 29238, -22784, -17399} // fill-array
            int r3 = android.text.TextUtils.indexOf(r4, r4)
            java.lang.String r2 = valueOf(r2, r3)
            java.lang.String r2 = r2.intern()
            java.lang.String r3 = r6.nextName()
            boolean r2 = o.runAnimators.values(r2, r3)
            super.hashCode()     // Catch: java.lang.Throwable -> L4e
            r0 = 52
            if (r2 == 0) goto L49
            r2 = 52
            goto L4b
        L49:
            r2 = 28
        L4b:
            if (r2 == r0) goto L6b
            goto L79
        L4e:
            r6 = move-exception
            throw r6
        L50:
            char[] r0 = new char[r3]
            r0 = {x008a: FILL_ARRAY_DATA  , data: [-28647, -28560, 31044, 29238, -22784, -17399} // fill-array
            int r2 = android.text.TextUtils.indexOf(r4, r4)
            java.lang.String r0 = valueOf(r0, r2)
            java.lang.String r0 = r0.intern()
            java.lang.String r2 = r6.nextName()
            boolean r0 = o.runAnimators.values(r0, r2)
            if (r0 == 0) goto L79
        L6b:
            java.lang.String r1 = r6.nextString()
            int r6 = o.isKeyboardNavigationCluster$ah$a.valueOf
            int r6 = r6 + 111
            int r0 = r6 % 128
            o.isKeyboardNavigationCluster$ah$a.ah$a = r0
            int r6 = r6 % 2
        L79:
            o.isKeyboardNavigationCluster r6 = new o.isKeyboardNavigationCluster
            r6.<init>(r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.isKeyboardNavigationCluster$ah$a.ah$a(android.util.JsonReader):o.isKeyboardNavigationCluster");
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
