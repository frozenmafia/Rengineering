package com.app.dream11.localeManager;

import com.facebook.hermes.intl.Constants;
import o.getTargetTypes;
import o.parentsMatch;
import o.runAnimators;
import o.setIdentityTransforms;
/* loaded from: classes.dex */
public enum D11Locale {
    ENGLISH("en", "English", true),
    HINDI("hi", "हिंदी - Hindi", true),
    KANNADA(Constants.COLLATION_EXTENSION_PARAM_NUMERIC_SHORT, "ಕನ್ನಡ - Kannada", true),
    UNKNOWN("unknown", "Unknown", false);
    
    public static final values Companion = new values(null);
    private final String androidLangKey;
    private boolean enabled;
    private final setIdentityTransforms langKey$delegate = parentsMatch.ah$a(new D11Locale$langKey$2(this));
    private final String langTitle;

    public static final D11Locale from(String str) {
        return Companion.toString(str);
    }

    D11Locale(String str, String str2, boolean z) {
        this.androidLangKey = str;
        this.langTitle = str2;
        this.enabled = z;
    }

    public final String getAndroidLangKey() {
        return this.androidLangKey;
    }

    public final String getLangTitle() {
        return this.langTitle;
    }

    public final void disableLocale() {
        this.enabled = false;
    }

    public final boolean isEnabled() {
        return this.enabled;
    }

    public final String getLangKey() {
        return (String) this.langKey$delegate.getValue();
    }

    /* loaded from: classes.dex */
    public static final class values {
        public /* synthetic */ values(getTargetTypes gettargettypes) {
            this();
        }

        private values() {
        }

        public final D11Locale toString(String str) {
            D11Locale d11Locale;
            runAnimators.ag$a(str, "langKey");
            D11Locale[] values = D11Locale.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    d11Locale = null;
                    break;
                }
                d11Locale = values[i];
                if (runAnimators.values((Object) d11Locale.getLangKey(), (Object) str)) {
                    break;
                }
                i++;
            }
            return d11Locale == null ? D11Locale.UNKNOWN : d11Locale;
        }
    }
}
