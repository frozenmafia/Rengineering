package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class checkArgumentInRange {
    public final checkStringNotEmpty HaptikSDK$a;
    public final String HaptikSDK$b;
    public final long HaptikSDK$c;
    private final HashMap<String, Integer> HaptikWebView;
    public final String ag$a;
    public final boolean ah$a;
    public final String ah$b;
    private final String[] getInitSettings;
    private final HashMap<String, Integer> getSignupData;
    private List<checkArgumentInRange> invoke;
    public final checkArgumentInRange toString;
    public final long valueOf;
    public final String values;

    public static checkArgumentInRange valueOf(String str) {
        return new checkArgumentInRange(null, RangeKt.toString(str), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    public static checkArgumentInRange values(String str, long j, long j2, checkStringNotEmpty checkstringnotempty, String[] strArr, String str2, String str3, checkArgumentInRange checkargumentinrange) {
        return new checkArgumentInRange(str, null, j, j2, checkstringnotempty, strArr, str2, str3, checkargumentinrange);
    }

    private checkArgumentInRange(String str, String str2, long j, long j2, checkStringNotEmpty checkstringnotempty, String[] strArr, String str3, String str4, checkArgumentInRange checkargumentinrange) {
        this.HaptikSDK$b = str;
        this.ah$b = str2;
        this.ag$a = str4;
        this.HaptikSDK$a = checkstringnotempty;
        this.getInitSettings = strArr;
        this.ah$a = str2 != null;
        this.HaptikSDK$c = j;
        this.valueOf = j2;
        this.values = (String) FingerprintManagerCompat.toString(str3);
        this.toString = checkargumentinrange;
        this.HaptikWebView = new HashMap<>();
        this.getSignupData = new HashMap<>();
    }

    public boolean valueOf(long j) {
        int i;
        long j2 = this.HaptikSDK$c;
        int i2 = (j2 > C.TIME_UNSET ? 1 : (j2 == C.TIME_UNSET ? 0 : -1));
        return (i2 == 0 && this.valueOf == C.TIME_UNSET) || (j2 <= j && this.valueOf == C.TIME_UNSET) || ((i2 == 0 && j < this.valueOf) || (i <= 0 && j < this.valueOf));
    }

    public void values(checkArgumentInRange checkargumentinrange) {
        if (this.invoke == null) {
            this.invoke = new ArrayList();
        }
        this.invoke.add(checkargumentinrange);
    }

    public checkArgumentInRange valueOf(int i) {
        List<checkArgumentInRange> list = this.invoke;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        return list.get(i);
    }

    public int valueOf() {
        List<checkArgumentInRange> list = this.invoke;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public long[] values() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        valueOf(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    private void valueOf(TreeSet<Long> treeSet, boolean z) {
        boolean equals = TtmlNode.TAG_P.equals(this.HaptikSDK$b);
        boolean equals2 = TtmlNode.TAG_DIV.equals(this.HaptikSDK$b);
        if (z || equals || (equals2 && this.ag$a != null)) {
            long j = this.HaptikSDK$c;
            if (j != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.valueOf;
            if (j2 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.invoke == null) {
            return;
        }
        for (int i = 0; i < this.invoke.size(); i++) {
            this.invoke.get(i).valueOf(treeSet, z || equals);
        }
    }

    public String[] ah$a() {
        return this.getInitSettings;
    }

    public List<isCompatTintEnabled> valueOf(long j, Map<String, checkStringNotEmpty> map, Map<String, checkArgument> map2, Map<String, String> map3) {
        List<android.util.Pair<String, String>> arrayList = new ArrayList<>();
        valueOf(j, this.values, arrayList);
        TreeMap treeMap = new TreeMap();
        toString(j, false, this.values, treeMap);
        ag$a(j, map, map2, this.values, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (android.util.Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                checkArgument checkargument = (checkArgument) FingerprintManagerCompat.toString(map2.get(pair.first));
                arrayList2.add(new isCompatTintEnabled$ah$a().values(decodeByteArray).toString(checkargument.invoke).toString(0).toString(checkargument.values, 0).valueOf(checkargument.ag$a).ag$a(checkargument.ah$b).ah$a(checkargument.toString).values(checkargument.HaptikSDK$b).values());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            checkArgument checkargument2 = (checkArgument) FingerprintManagerCompat.toString(map2.get(entry.getKey()));
            isCompatTintEnabled$ah$a iscompattintenabled_ah_a = (isCompatTintEnabled$ah$a) entry.getValue();
            ag$a((SpannableStringBuilder) FingerprintManagerCompat.toString(iscompattintenabled_ah_a.ah$b()));
            iscompattintenabled_ah_a.toString(checkargument2.values, checkargument2.valueOf);
            iscompattintenabled_ah_a.valueOf(checkargument2.ag$a);
            iscompattintenabled_ah_a.toString(checkargument2.invoke);
            iscompattintenabled_ah_a.ag$a(checkargument2.ah$b);
            iscompattintenabled_ah_a.values(checkargument2.HaptikSDK$a, checkargument2.HaptikSDK$c);
            iscompattintenabled_ah_a.values(checkargument2.HaptikSDK$b);
            arrayList2.add(iscompattintenabled_ah_a.values());
        }
        return arrayList2;
    }

    private void valueOf(long j, String str, List<android.util.Pair<String, String>> list) {
        if (!"".equals(this.values)) {
            str = this.values;
        }
        if (valueOf(j) && TtmlNode.TAG_DIV.equals(this.HaptikSDK$b) && this.ag$a != null) {
            list.add(new android.util.Pair<>(str, this.ag$a));
            return;
        }
        for (int i = 0; i < valueOf(); i++) {
            valueOf(i).valueOf(j, str, list);
        }
    }

    private void toString(long j, boolean z, String str, Map<String, isCompatTintEnabled$ah$a> map) {
        this.HaptikWebView.clear();
        this.getSignupData.clear();
        if (TtmlNode.TAG_METADATA.equals(this.HaptikSDK$b)) {
            return;
        }
        if (!"".equals(this.values)) {
            str = this.values;
        }
        if (this.ah$a && z) {
            toString(str, map).append((CharSequence) FingerprintManagerCompat.toString(this.ah$b));
        } else if (TtmlNode.TAG_BR.equals(this.HaptikSDK$b) && z) {
            toString(str, map).append('\n');
        } else if (valueOf(j)) {
            for (Map.Entry<String, isCompatTintEnabled$ah$a> entry : map.entrySet()) {
                this.HaptikWebView.put(entry.getKey(), Integer.valueOf(((CharSequence) FingerprintManagerCompat.toString(entry.getValue().ah$b())).length()));
            }
            boolean equals = TtmlNode.TAG_P.equals(this.HaptikSDK$b);
            for (int i = 0; i < valueOf(); i++) {
                valueOf(i).toString(j, z || equals, str, map);
            }
            if (equals) {
                RangeKt.valueOf(toString(str, map));
            }
            for (Map.Entry<String, isCompatTintEnabled$ah$a> entry2 : map.entrySet()) {
                this.getSignupData.put(entry2.getKey(), Integer.valueOf(((CharSequence) FingerprintManagerCompat.toString(entry2.getValue().ah$b())).length()));
            }
        }
    }

    private static SpannableStringBuilder toString(String str, Map<String, isCompatTintEnabled$ah$a> map) {
        if (!map.containsKey(str)) {
            isCompatTintEnabled$ah$a iscompattintenabled_ah_a = new isCompatTintEnabled$ah$a();
            iscompattintenabled_ah_a.ah$a(new SpannableStringBuilder());
            map.put(str, iscompattintenabled_ah_a);
        }
        return (SpannableStringBuilder) FingerprintManagerCompat.toString(map.get(str).ah$b());
    }

    private void ag$a(long j, Map<String, checkStringNotEmpty> map, Map<String, checkArgument> map2, String str, Map<String, isCompatTintEnabled$ah$a> map3) {
        int i;
        if (valueOf(j)) {
            String str2 = "".equals(this.values) ? str : this.values;
            Iterator<Map.Entry<String, Integer>> it = this.getSignupData.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int intValue = this.HaptikWebView.containsKey(key) ? this.HaptikWebView.get(key).intValue() : 0;
                int intValue2 = next.getValue().intValue();
                if (intValue != intValue2) {
                    values(map, (isCompatTintEnabled$ah$a) FingerprintManagerCompat.toString(map3.get(key)), intValue, intValue2, ((checkArgument) FingerprintManagerCompat.toString(map2.get(str2))).HaptikSDK$b);
                }
            }
            for (i = 0; i < valueOf(); i++) {
                valueOf(i).ag$a(j, map, map2, str2, map3);
            }
        }
    }

    private void values(Map<String, checkStringNotEmpty> map, isCompatTintEnabled$ah$a iscompattintenabled_ah_a, int i, int i2, int i3) {
        checkStringNotEmpty values = RangeKt.values(this.HaptikSDK$a, this.getInitSettings, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) iscompattintenabled_ah_a.ah$b();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            iscompattintenabled_ah_a.ah$a(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (values != null) {
            RangeKt.valueOf(spannableStringBuilder2, i, i2, values, this.toString, map, i3);
            if (TtmlNode.TAG_P.equals(this.HaptikSDK$b)) {
                if (values.HaptikWebView() != Float.MAX_VALUE) {
                    iscompattintenabled_ah_a.values((values.HaptikWebView() * (-90.0f)) / 100.0f);
                }
                if (values.getSignupData() != null) {
                    iscompattintenabled_ah_a.toString(values.getSignupData());
                }
                if (values.HaptikSDK$b() != null) {
                    iscompattintenabled_ah_a.values(values.HaptikSDK$b());
                }
            }
        }
    }

    private static void ag$a(SpannableStringBuilder spannableStringBuilder) {
        checkFlagsArgument[] checkflagsargumentArr;
        for (checkFlagsArgument checkflagsargument : (checkFlagsArgument[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), checkFlagsArgument.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(checkflagsargument), spannableStringBuilder.getSpanEnd(checkflagsargument), "");
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }
}
