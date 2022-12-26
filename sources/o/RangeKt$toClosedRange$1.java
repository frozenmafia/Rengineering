package o;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes3.dex */
public final class RangeKt$toClosedRange$1 {
    private float HaptikSDK$b;
    private int ag$a;
    private int valueOf;
    private String getSignupData = "";
    private String HaptikWebView = "";
    private Set<String> HaptikSDK$e = Collections.emptySet();
    private String a = "";
    private String toString = null;
    private boolean invoke = false;
    private boolean HaptikSDK$a = false;
    private int HaptikSDK$d = -1;
    private int ak = -1;
    private int ah$a = -1;
    private int ah$b = -1;
    private int HaptikSDK$c = -1;
    private int getInitSettings = -1;
    private boolean values = false;

    public void ah$a(String str) {
        this.getSignupData = str;
    }

    public void valueOf(String str) {
        this.HaptikWebView = str;
    }

    public void toString(String[] strArr) {
        this.HaptikSDK$e = new HashSet(Arrays.asList(strArr));
    }

    public void values(String str) {
        this.a = str;
    }

    public int valueOf(String str, String str2, Set<String> set, String str3) {
        if (this.getSignupData.isEmpty() && this.HaptikWebView.isEmpty() && this.HaptikSDK$e.isEmpty() && this.a.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int values = values(values(values(0, this.getSignupData, str, 1073741824), this.HaptikWebView, str2, 2), this.a, str3, 4);
        if (values == -1 || !set.containsAll(this.HaptikSDK$e)) {
            return 0;
        }
        return values + (this.HaptikSDK$e.size() * 4);
    }

    public int HaptikSDK$b() {
        int i = this.ah$a;
        if (i == -1 && this.ah$b == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.ah$b == 1 ? 2 : 0);
    }

    public boolean HaptikWebView() {
        return this.HaptikSDK$d == 1;
    }

    public boolean HaptikSDK$d() {
        return this.ak == 1;
    }

    public RangeKt$toClosedRange$1 ag$a(boolean z) {
        this.ak = z ? 1 : 0;
        return this;
    }

    public RangeKt$toClosedRange$1 valueOf(boolean z) {
        this.ah$a = z ? 1 : 0;
        return this;
    }

    public RangeKt$toClosedRange$1 values(boolean z) {
        this.ah$b = z ? 1 : 0;
        return this;
    }

    public String ah$a() {
        return this.toString;
    }

    public RangeKt$toClosedRange$1 ag$a(String str) {
        this.toString = str == null ? null : postponeAndUpdateViewHolders.valueOf(str);
        return this;
    }

    public int ag$a() {
        if (!this.invoke) {
            throw new IllegalStateException("Font color not defined");
        }
        return this.ag$a;
    }

    public RangeKt$toClosedRange$1 ah$a(int i) {
        this.ag$a = i;
        this.invoke = true;
        return this;
    }

    public boolean HaptikSDK$e() {
        return this.invoke;
    }

    public int values() {
        if (!this.HaptikSDK$a) {
            throw new IllegalStateException("Background color not defined.");
        }
        return this.valueOf;
    }

    public RangeKt$toClosedRange$1 valueOf(int i) {
        this.valueOf = i;
        this.HaptikSDK$a = true;
        return this;
    }

    public boolean HaptikSDK$a() {
        return this.HaptikSDK$a;
    }

    public RangeKt$toClosedRange$1 toString(float f) {
        this.HaptikSDK$b = f;
        return this;
    }

    public RangeKt$toClosedRange$1 ag$a(int i) {
        this.HaptikSDK$c = i;
        return this;
    }

    public int invoke() {
        return this.HaptikSDK$c;
    }

    public float ah$b() {
        return this.HaptikSDK$b;
    }

    public RangeKt$toClosedRange$1 toString(int i) {
        this.getInitSettings = i;
        return this;
    }

    public int HaptikSDK$c() {
        return this.getInitSettings;
    }

    public RangeKt$toClosedRange$1 toString(boolean z) {
        this.values = z;
        return this;
    }

    public boolean valueOf() {
        return this.values;
    }

    private static int values(int i, String str, String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }
}
