package o;

import android.text.TextUtils;
import android.widget.ExpandableListView;
import com.app.dream11.matchcentre.matchpicker.flowstates.HeadToHeadMatchPickerFlowState;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes4.dex */
public final class setFilterQueryProvider implements getViewHorizontalDragRange {
    private static int HaptikSDK$b = 1;
    private static int toString = 0;
    private static int valueOf = 149;
    private final setPhoneNumber ag$a;
    private final onRatingChanged ah$a;
    private final setCurrentTabTag values;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
        if ((r5 == r6 ? 'O' : '8') != 'O') goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
        if (r5 == r6) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
        if ((r6 instanceof o.setFilterQueryProvider) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0028, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
        r6 = (o.setFilterQueryProvider) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
        if (o.runAnimators.values(r5.ah$a, r6.ah$a) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
        r6 = o.setFilterQueryProvider.HaptikSDK$b + 43;
        o.setFilterQueryProvider.toString = r6 % 128;
        r6 = r6 % 2;
        r6 = o.setFilterQueryProvider.toString + 25;
        o.setFilterQueryProvider.HaptikSDK$b = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
        if ((r6 % 2) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
        r3 = 5 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
        if (o.runAnimators.values(r5.values, r6.values) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
        if (r0 == true) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0068, code lost:
        if (o.runAnimators.values(r5.ag$a, r6.ag$a) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006a, code lost:
        r6 = 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006d, code lost:
        r6 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006e, code lost:
        if (r6 == 5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0070, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0072, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0073, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0074, code lost:
        throw r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = o.setFilterQueryProvider.HaptikSDK$b
            int r0 = r0 + 3
            int r1 = r0 % 128
            o.setFilterQueryProvider.toString = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            if (r0 == r1) goto L1f
            r0 = 79
            if (r5 != r6) goto L1a
            r3 = 79
            goto L1c
        L1a:
            r3 = 56
        L1c:
            if (r3 == r0) goto L23
            goto L24
        L1f:
            r0 = 0
            int r0 = r0.length     // Catch: java.lang.Throwable -> L75
            if (r5 != r6) goto L24
        L23:
            return r1
        L24:
            boolean r0 = r6 instanceof o.setFilterQueryProvider
            if (r0 != 0) goto L29
            return r2
        L29:
            o.setFilterQueryProvider r6 = (o.setFilterQueryProvider) r6     // Catch: java.lang.Exception -> L73
            o.onRatingChanged r0 = r5.ah$a     // Catch: java.lang.Exception -> L73
            o.onRatingChanged r3 = r6.ah$a     // Catch: java.lang.Exception -> L73
            boolean r0 = o.runAnimators.values(r0, r3)     // Catch: java.lang.Exception -> L73
            r3 = 5
            if (r0 != 0) goto L51
            int r6 = o.setFilterQueryProvider.HaptikSDK$b
            int r6 = r6 + 43
            int r0 = r6 % 128
            o.setFilterQueryProvider.toString = r0
            int r6 = r6 % 2
            int r6 = o.setFilterQueryProvider.toString
            int r6 = r6 + 25
            int r0 = r6 % 128
            o.setFilterQueryProvider.HaptikSDK$b = r0
            int r6 = r6 % 2
            if (r6 != 0) goto L50
            int r3 = r3 / r2
            return r2
        L4e:
            r6 = move-exception
            throw r6
        L50:
            return r2
        L51:
            o.setCurrentTabTag r0 = r5.values
            o.setCurrentTabTag r4 = r6.values
            boolean r0 = o.runAnimators.values(r0, r4)
            if (r0 != 0) goto L5d
            r0 = 1
            goto L5e
        L5d:
            r0 = 0
        L5e:
            if (r0 == r1) goto L72
            o.setPhoneNumber r0 = r5.ag$a
            o.setPhoneNumber r6 = r6.ag$a
            boolean r6 = o.runAnimators.values(r0, r6)
            if (r6 != 0) goto L6d
            r6 = 31
            goto L6e
        L6d:
            r6 = 5
        L6e:
            if (r6 == r3) goto L71
            return r2
        L71:
            return r1
        L72:
            return r2
        L73:
            r6 = move-exception
            throw r6
        L75:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setFilterQueryProvider.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = toString + 79;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        int hashCode = (((this.ah$a.hashCode() * 31) + this.values.hashCode()) * 31) + this.ag$a.hashCode();
        int i3 = HaptikSDK$b + 101;
        toString = i3 % 128;
        int i4 = i3 % 2;
        return hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("HOFShareInitiated(_roundId=");
            sb.append(this.ah$a);
            sb.append(", _source=");
            sb.append(this.values);
            sb.append(", _tourId=");
            sb.append(this.ag$a);
            sb.append(')');
            String sb2 = sb.toString();
            try {
                int i = HaptikSDK$b + 81;
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

    public setFilterQueryProvider(onRatingChanged onratingchanged, setCurrentTabTag setcurrenttabtag, setPhoneNumber setphonenumber) {
        runAnimators.ag$a(onratingchanged, "_roundId");
        runAnimators.ag$a(setcurrenttabtag, "_source");
        runAnimators.ag$a(setphonenumber, "_tourId");
        this.ah$a = onratingchanged;
        this.values = setcurrenttabtag;
        this.ag$a = setphonenumber;
    }

    @Override // o.getViewHorizontalDragRange
    public Map<String, Object> values() {
        HashMap hashMap = new HashMap();
        hashMap.put("eventName", "HOFShareInitiated");
        hashMap.put(HeadToHeadMatchPickerFlowState.ROUND_ID, Integer.valueOf(this.ah$a.values()));
        hashMap.put(valueOf(TextUtils.lastIndexOf("", '0', 0) + 3, 258 - ExpandableListView.getPackedPositionGroup(0L), true, 6 - ExpandableListView.getPackedPositionType(0L), new char[]{2, 6, 65528, 65526, 5, '\b'}).intern(), this.values.ah$a());
        hashMap.put("tourId", Integer.valueOf(this.ag$a.values()));
        int i = toString + 11;
        HaptikSDK$b = i % 128;
        int i2 = i % 2;
        return hashMap;
    }

    private static String valueOf(int i, int i2, boolean z, int i3, char[] cArr) {
        String str;
        synchronized (isAfterLast.valueOf) {
            char[] cArr2 = new char[i3];
            isAfterLast.values = 0;
            while (isAfterLast.values < i3) {
                isAfterLast.ag$a = cArr[isAfterLast.values];
                cArr2[isAfterLast.values] = (char) (isAfterLast.ag$a + i2);
                int i4 = isAfterLast.values;
                cArr2[i4] = (char) (cArr2[i4] - valueOf);
                isAfterLast.values++;
            }
            if (i > 0) {
                isAfterLast.toString = i;
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr2, 0, cArr3, 0, i3);
                System.arraycopy(cArr3, 0, cArr2, i3 - isAfterLast.toString, isAfterLast.toString);
                System.arraycopy(cArr3, isAfterLast.toString, cArr2, 0, i3 - isAfterLast.toString);
            }
            if (z) {
                char[] cArr4 = new char[i3];
                isAfterLast.values = 0;
                while (isAfterLast.values < i3) {
                    cArr4[isAfterLast.values] = cArr2[(i3 - isAfterLast.values) - 1];
                    isAfterLast.values++;
                }
                cArr2 = cArr4;
            }
            str = new String(cArr2);
        }
        return str;
    }
}
