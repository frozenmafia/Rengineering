package com.facebook.appevents.codeless.internal;

import android.view.ViewConfiguration;
import java.util.Arrays;
import o.getDouble;
import o.getTargetTypes;
import o.runAnimators;
import org.apache.http.message.TokenParser;
import org.json.JSONObject;
/* loaded from: classes4.dex */
public final class PathComponent {
    private static int[] HaptikSDK$b = null;
    private static int HaptikWebView = 1;
    public static final values ag$a;
    private static int getSignupData;
    private final int HaptikSDK$a;
    private final String HaptikSDK$c;
    private final String ah$a;
    private final String ah$b;
    private final int invoke;
    private final int toString;
    private final String valueOf;
    private final String values;

    static {
        invoke();
        ag$a = new values(null);
        int i = HaptikWebView + 71;
        getSignupData = i % 128;
        if ((i % 2 != 0 ? TokenParser.CR : '_') != '_') {
            int i2 = 89 / 0;
        }
    }

    static void invoke() {
        HaptikSDK$b = new int[]{-399766609, -635775917, 1805434254, -1567135565, -34963735, 225198981, -1258424547, 1150733534, -1388931220, -1040255955, 756258512, 869909350, -74040834, 1565016847, 590558296, -1769958203, 1797090939, 1655854123};
    }

    /* loaded from: classes4.dex */
    public enum MatchBitmaskType {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);
        
        private final int value;

        MatchBitmaskType(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static MatchBitmaskType[] valuesCustom() {
            MatchBitmaskType[] valuesCustom = values();
            return (MatchBitmaskType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public PathComponent(JSONObject jSONObject) {
        runAnimators.ag$a(jSONObject, "component");
        String string = jSONObject.getString("class_name");
        runAnimators.ah$a(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.valueOf = string;
        this.HaptikSDK$a = jSONObject.optInt("index", -1);
        this.toString = jSONObject.optInt(ag$a(new int[]{-1373138557, -612513477}, 2 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
        String optString = jSONObject.optString("text");
        runAnimators.ah$a(optString, "component.optString(PATH_TEXT_KEY)");
        this.ah$b = optString;
        String optString2 = jSONObject.optString("tag");
        runAnimators.ah$a(optString2, "component.optString(PATH_TAG_KEY)");
        this.HaptikSDK$c = optString2;
        String optString3 = jSONObject.optString("description");
        runAnimators.ah$a(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.values = optString3;
        String optString4 = jSONObject.optString("hint");
        runAnimators.ah$a(optString4, "component.optString(PATH_HINT_KEY)");
        this.ah$a = optString4;
        this.invoke = jSONObject.optInt("match_bitmask");
    }

    public final String valueOf() {
        int i = HaptikWebView + 125;
        getSignupData = i % 128;
        if ((i % 2 != 0 ? 'A' : 'R') != 'A') {
            return this.valueOf;
        }
        try {
            int i2 = 76 / 0;
            return this.valueOf;
        } catch (Exception e) {
            throw e;
        }
    }

    public final int ah$b() {
        int i = getSignupData + 23;
        HaptikWebView = i % 128;
        if ((i % 2 == 0 ? (char) 19 : 'S') != 'S') {
            int i2 = this.HaptikSDK$a;
            Object obj = null;
            super.hashCode();
            return i2;
        }
        return this.HaptikSDK$a;
    }

    public final int values() {
        int i;
        int i2 = HaptikWebView + 1;
        getSignupData = i2 % 128;
        if ((i2 % 2 != 0 ? 'A' : 'H') != 'H') {
            i = this.toString;
            int i3 = 11 / 0;
        } else {
            i = this.toString;
        }
        int i4 = HaptikWebView + 87;
        getSignupData = i4 % 128;
        int i5 = i4 % 2;
        return i;
    }

    public final String HaptikSDK$b() {
        int i = getSignupData + 91;
        HaptikWebView = i % 128;
        int i2 = i % 2;
        String str = this.ah$b;
        int i3 = HaptikWebView + 29;
        getSignupData = i3 % 128;
        int i4 = i3 % 2;
        return str;
    }

    public final String HaptikSDK$a() {
        String str;
        int i = getSignupData + 23;
        HaptikWebView = i % 128;
        if ((i % 2 == 0 ? 'Y' : ',') != 'Y') {
            str = this.HaptikSDK$c;
        } else {
            str = this.HaptikSDK$c;
            Object[] objArr = null;
            int length = objArr.length;
        }
        int i2 = HaptikWebView + 9;
        getSignupData = i2 % 128;
        int i3 = i2 % 2;
        return str;
    }

    public final String ah$a() {
        int i = getSignupData + 67;
        HaptikWebView = i % 128;
        if ((i % 2 == 0 ? (char) 7 : '<') != 7) {
            return this.values;
        }
        int i2 = 99 / 0;
        return this.values;
    }

    public final String ag$a() {
        try {
            int i = getSignupData + 115;
            try {
                HaptikWebView = i % 128;
                int i2 = i % 2;
                String str = this.ah$a;
                int i3 = getSignupData + 121;
                HaptikWebView = i3 % 128;
                int i4 = i3 % 2;
                return str;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public final int HaptikSDK$c() {
        int i = HaptikWebView + 21;
        getSignupData = i % 128;
        if (i % 2 == 0) {
            try {
                return this.invoke;
            } catch (Exception e) {
                throw e;
            }
        }
        int i2 = this.invoke;
        Object[] objArr = null;
        int length = objArr.length;
        return i2;
    }

    /* loaded from: classes4.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }
    }

    private static String ag$a(int[] iArr, int i) {
        String str;
        synchronized (getDouble.ag$a) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) HaptikSDK$b.clone();
            getDouble.toString = 0;
            while (getDouble.toString < iArr.length) {
                cArr[0] = (char) (iArr[getDouble.toString] >> 16);
                cArr[1] = (char) iArr[getDouble.toString];
                cArr[2] = (char) (iArr[getDouble.toString + 1] >> 16);
                cArr[3] = (char) iArr[getDouble.toString + 1];
                getDouble.valueOf = (cArr[0] << 16) + cArr[1];
                getDouble.values = (cArr[2] << 16) + cArr[3];
                getDouble.values(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = getDouble.valueOf ^ iArr2[i2];
                    getDouble.valueOf = i3;
                    getDouble.values = getDouble.toString(i3) ^ getDouble.values;
                    int i4 = getDouble.valueOf;
                    getDouble.valueOf = getDouble.values;
                    getDouble.values = i4;
                }
                int i5 = getDouble.valueOf;
                getDouble.valueOf = getDouble.values;
                getDouble.values = i5;
                getDouble.values = i5 ^ iArr2[16];
                getDouble.valueOf ^= iArr2[17];
                int i6 = getDouble.valueOf;
                int i7 = getDouble.values;
                cArr[0] = (char) (getDouble.valueOf >>> 16);
                cArr[1] = (char) getDouble.valueOf;
                cArr[2] = (char) (getDouble.values >>> 16);
                cArr[3] = (char) getDouble.values;
                getDouble.values(iArr2);
                cArr2[getDouble.toString << 1] = cArr[0];
                cArr2[(getDouble.toString << 1) + 1] = cArr[1];
                cArr2[(getDouble.toString << 1) + 2] = cArr[2];
                cArr2[(getDouble.toString << 1) + 3] = cArr[3];
                getDouble.toString += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
