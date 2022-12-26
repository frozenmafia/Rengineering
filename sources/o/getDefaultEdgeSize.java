package o;

import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.message.TokenParser;
/* loaded from: classes4.dex */
public final class getDefaultEdgeSize implements getViewHorizontalDragRange {
    private static int HaptikSDK$a = 1;
    private static int invoke = 0;
    private static char[] valueOf = {38184, 2536, 44182, 17341, 58952, 34162};
    private static long values = 6100676016474987740L;
    private final SearchViewBindingAdapter ag$a;
    private final setCurrentTabTag ah$a;
    private final ObservableListAdapter toString;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
        if ((r4 == r5 ? 'L' : '+') != '+') goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
        if ((r5 instanceof o.getDefaultEdgeSize) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
        if (r0 == true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
        r5 = o.getDefaultEdgeSize.HaptikSDK$a + 39;
        o.getDefaultEdgeSize.invoke = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
        if ((r5 % 2) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0038, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
        if (r5 == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003d, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003e, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
        r5 = (o.getDefaultEdgeSize) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
        if (o.runAnimators.values(r4.toString, r5.toString) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004b, code lost:
        r5 = o.getDefaultEdgeSize.invoke + 9;
        o.getDefaultEdgeSize.HaptikSDK$a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0055, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0060, code lost:
        if (o.runAnimators.values(r4.ag$a, r5.ag$a) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0062, code lost:
        r5 = o.getDefaultEdgeSize.invoke + 121;
        o.getDefaultEdgeSize.HaptikSDK$a = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006c, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
        if (o.runAnimators.values(r4.ah$a, r5.ah$a) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007a, code lost:
        if (r5 == true) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007e, code lost:
        r5 = o.getDefaultEdgeSize.invoke + 17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0082, code lost:
        o.getDefaultEdgeSize.HaptikSDK$a = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0084, code lost:
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0086, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0087, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0088, code lost:
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0089, code lost:
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008a, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
        if (r4 == r5) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = o.getDefaultEdgeSize.HaptikSDK$a
            int r0 = r0 + 67
            int r1 = r0 % 128
            o.getDefaultEdgeSize.invoke = r1
            int r0 = r0 % 2
            r1 = 1
            if (r0 == 0) goto L16
            r0 = 0
            super.hashCode()     // Catch: java.lang.Throwable -> L14
            if (r4 != r5) goto L22
            goto L21
        L14:
            r5 = move-exception
            throw r5
        L16:
            r0 = 43
            if (r4 != r5) goto L1d
            r2 = 76
            goto L1f
        L1d:
            r2 = 43
        L1f:
            if (r2 == r0) goto L22
        L21:
            return r1
        L22:
            boolean r0 = r5 instanceof o.getDefaultEdgeSize
            r2 = 0
            if (r0 != 0) goto L29
            r0 = 0
            goto L2a
        L29:
            r0 = 1
        L2a:
            if (r0 == r1) goto L3f
            int r5 = o.getDefaultEdgeSize.HaptikSDK$a
            int r5 = r5 + 39
            int r0 = r5 % 128
            o.getDefaultEdgeSize.invoke = r0
            int r5 = r5 % 2
            if (r5 == 0) goto L3a
            r5 = 0
            goto L3b
        L3a:
            r5 = 1
        L3b:
            if (r5 == 0) goto L3e
            return r2
        L3e:
            return r1
        L3f:
            o.getDefaultEdgeSize r5 = (o.getDefaultEdgeSize) r5
            o.ObservableListAdapter r0 = r4.toString
            o.ObservableListAdapter r3 = r5.toString
            boolean r0 = o.runAnimators.values(r0, r3)
            if (r0 != 0) goto L58
            int r5 = o.getDefaultEdgeSize.invoke     // Catch: java.lang.Exception -> L56
            int r5 = r5 + 9
            int r0 = r5 % 128
            o.getDefaultEdgeSize.HaptikSDK$a = r0     // Catch: java.lang.Exception -> L56
            int r5 = r5 % 2
            return r2
        L56:
            r5 = move-exception
            goto L89
        L58:
            o.SearchViewBindingAdapter r0 = r4.ag$a
            o.SearchViewBindingAdapter r3 = r5.ag$a
            boolean r0 = o.runAnimators.values(r0, r3)
            if (r0 != 0) goto L6d
            int r5 = o.getDefaultEdgeSize.invoke
            int r5 = r5 + 121
            int r0 = r5 % 128
            o.getDefaultEdgeSize.HaptikSDK$a = r0
            int r5 = r5 % 2
            return r2
        L6d:
            o.setCurrentTabTag r0 = r4.ah$a
            o.setCurrentTabTag r5 = r5.ah$a
            boolean r5 = o.runAnimators.values(r0, r5)
            if (r5 != 0) goto L79
            r5 = 0
            goto L7a
        L79:
            r5 = 1
        L7a:
            if (r5 == r1) goto L8a
            int r5 = o.getDefaultEdgeSize.invoke     // Catch: java.lang.Exception -> L56
            int r5 = r5 + 17
            int r0 = r5 % 128
            o.getDefaultEdgeSize.HaptikSDK$a = r0     // Catch: java.lang.Exception -> L87
            int r5 = r5 % 2
            return r2
        L87:
            r5 = move-exception
            throw r5
        L89:
            throw r5
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDefaultEdgeSize.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = invoke + 47;
        HaptikSDK$a = i % 128;
        int hashCode = (i % 2 == 0 ? (char) 19 : (char) 16) != 19 ? (((this.toString.hashCode() * 31) + this.ag$a.hashCode()) * 31) + this.ah$a.hashCode() : (((this.toString.hashCode() + 105) % this.ag$a.hashCode()) / 122) - this.ah$a.hashCode();
        int i2 = invoke + 85;
        HaptikSDK$a = i2 % 128;
        if ((i2 % 2 == 0 ? TokenParser.SP : 'R') != ' ') {
            return hashCode;
        }
        Object obj = null;
        super.hashCode();
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("SearchOptionClicked(_recent_searches_shown=");
            sb.append(this.toString);
            sb.append(", _screenName=");
            sb.append(this.ag$a);
            sb.append(", _source=");
            sb.append(this.ah$a);
            sb.append(')');
            String sb2 = sb.toString();
            int i = invoke + 91;
            HaptikSDK$a = i % 128;
            int i2 = i % 2;
            return sb2;
        } catch (Exception e) {
            throw e;
        }
    }

    public getDefaultEdgeSize(ObservableListAdapter observableListAdapter, SearchViewBindingAdapter searchViewBindingAdapter, setCurrentTabTag setcurrenttabtag) {
        runAnimators.ag$a(observableListAdapter, "_recent_searches_shown");
        runAnimators.ag$a(searchViewBindingAdapter, "_screenName");
        runAnimators.ag$a(setcurrenttabtag, "_source");
        this.toString = observableListAdapter;
        this.ag$a = searchViewBindingAdapter;
        this.ah$a = setcurrenttabtag;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "SearchOptionClicked");
        hashMap.put("recent_searches_shown", Integer.valueOf(this.toString.ag$a()));
        hashMap.put("screenName", this.ag$a.ag$a());
        hashMap.put(values(TextUtils.lastIndexOf("", '0', 0, 0) + 7, Gravity.getAbsoluteGravity(0, 0), (char) (38236 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern(), this.ah$a.ah$a());
        int i = invoke + 103;
        HaptikSDK$a = i % 128;
        if ((i % 2 == 0 ? (char) 20 : '>') != 20) {
            return hashMap;
        }
        int i2 = 90 / 0;
        return hashMap;
    }

    private static String values(int i, int i2, char c) {
        String str;
        synchronized (move.valueOf) {
            char[] cArr = new char[i];
            move.values = 0;
            while (move.values < i) {
                cArr[move.values] = (char) ((valueOf[move.values + i2] ^ (move.values * values)) ^ c);
                move.values++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
