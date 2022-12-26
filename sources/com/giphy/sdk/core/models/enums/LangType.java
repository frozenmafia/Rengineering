package com.giphy.sdk.core.models.enums;

import android.graphics.Color;
import o.moveToFirst;
/* loaded from: classes4.dex */
public enum LangType {
    english("en"),
    spanish("es"),
    portuguese("pt"),
    indonesian(valueOf(new char[]{44069, 53069}, 2 - Color.alpha(0)).intern()),
    french("fr"),
    arabic("ar"),
    turkish("tr"),
    thai("th"),
    vietnamese("vi"),
    german("de"),
    italian("it"),
    japanese("ja"),
    chineseSimplified("zh-CN"),
    chineseTraditional("zh-TW"),
    russian("ru"),
    korean("ko"),
    polish("pl"),
    dutch("nl"),
    romanian("ro"),
    hungarian("hu"),
    swedish("sv"),
    czech("cs"),
    hindi("hi"),
    bengali("bn"),
    danish("da"),
    farsi("fa"),
    filipino("tl"),
    finnish("fi"),
    hebrew("iw"),
    malay("ms"),
    norwegian("no"),
    ukrainian("uk");
    
    private static int ag$a = 0;
    private static char ah$a = 0;
    private static int invoke = 1;
    private static char toString;
    private static char valueOf;
    private static char values;
    private final String lang;

    public static LangType valueOf(String str) {
        LangType langType;
        int i = invoke + 121;
        ag$a = i % 128;
        if ((i % 2 != 0 ? '\b' : '\"') != '\"') {
            try {
                langType = (LangType) Enum.valueOf(LangType.class, str);
                Object obj = null;
                super.hashCode();
            } catch (Exception e) {
                throw e;
            }
        } else {
            langType = (LangType) Enum.valueOf(LangType.class, str);
        }
        int i2 = invoke + 87;
        ag$a = i2 % 128;
        int i3 = i2 % 2;
        return langType;
    }

    static void valueOf() {
        values = (char) 21324;
        ah$a = (char) 11606;
        toString = (char) 42687;
        valueOf = (char) 22112;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LangType[] valuesCustom() {
        int i = invoke + 63;
        ag$a = i % 128;
        if (i % 2 != 0) {
            LangType[] langTypeArr = (LangType[]) values().clone();
            Object[] objArr = null;
            int length = objArr.length;
            return langTypeArr;
        }
        return (LangType[]) values().clone();
    }

    LangType(String str) {
        this.lang = str;
    }

    static {
        valueOf();
        int i = ag$a + 87;
        invoke = i % 128;
        int i2 = i % 2;
    }

    @Override // java.lang.Enum
    public String toString() {
        String str;
        try {
            int i = invoke + 33;
            ag$a = i % 128;
            if ((i % 2 != 0 ? '\n' : (char) 22) != 22) {
                str = this.lang;
                Object[] objArr = null;
                int length = objArr.length;
            } else {
                str = this.lang;
            }
            int i2 = invoke + 79;
            ag$a = i2 % 128;
            int i3 = i2 % 2;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    private static String valueOf(char[] cArr, int i) {
        String str;
        synchronized (moveToFirst.ah$a) {
            char[] cArr2 = new char[cArr.length];
            moveToFirst.values = 0;
            char[] cArr3 = new char[2];
            while (moveToFirst.values < cArr.length) {
                cArr3[0] = cArr[moveToFirst.values];
                cArr3[1] = cArr[moveToFirst.values + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    cArr3[1] = (char) (cArr3[1] - (((cArr3[0] + i2) ^ ((cArr3[0] << 4) + ah$a)) ^ ((cArr3[0] >>> 5) + toString)));
                    cArr3[0] = (char) (cArr3[0] - (((cArr3[1] + i2) ^ ((cArr3[1] << 4) + valueOf)) ^ ((cArr3[1] >>> 5) + values)));
                    i2 -= 40503;
                }
                cArr2[moveToFirst.values] = cArr3[0];
                cArr2[moveToFirst.values + 1] = cArr3[1];
                moveToFirst.values += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
