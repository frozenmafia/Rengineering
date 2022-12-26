package com.clevertap.android.sdk.displayunits;

import android.text.TextUtils;
import android.util.Log;
import androidx.room.FtsOptions;
/* loaded from: classes4.dex */
public enum CTDisplayUnitType {
    SIMPLE(FtsOptions.TOKENIZER_SIMPLE),
    SIMPLE_WITH_IMAGE("simple-image"),
    CAROUSEL("carousel"),
    CAROUSEL_WITH_IMAGE("carousel-image"),
    MESSAGE_WITH_ICON("message-icon"),
    CUSTOM_KEY_VALUE("custom-key-value");
    
    public final String type;

    public static CTDisplayUnitType type(String str) {
        if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1799711058:
                    if (str.equals("carousel-image")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1332589953:
                    if (str.equals("message-icon")) {
                        c = 1;
                        break;
                    }
                    break;
                case -902286926:
                    if (str.equals(FtsOptions.TOKENIZER_SIMPLE)) {
                        c = 2;
                        break;
                    }
                    break;
                case -876980953:
                    if (str.equals("custom-key-value")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2908512:
                    if (str.equals("carousel")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1818845568:
                    if (str.equals("simple-image")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                return CAROUSEL_WITH_IMAGE;
            }
            if (c == 1) {
                return MESSAGE_WITH_ICON;
            }
            if (c == 2) {
                return SIMPLE;
            }
            if (c == 3) {
                return CUSTOM_KEY_VALUE;
            }
            if (c == 4) {
                return CAROUSEL;
            }
            if (c == 5) {
                return SIMPLE_WITH_IMAGE;
            }
        }
        Log.d("DisplayUnit : ", "Unsupported Display Unit Type");
        return null;
    }

    CTDisplayUnitType(String str) {
        this.type = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.type;
    }
}
