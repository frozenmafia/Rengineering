package org.jsoup.parser;

import o.isWindowLayoutComponentValid;
import o.isWindowLayoutProviderValid;
import o.windowExtensionsProviderClass;
/* loaded from: classes5.dex */
public abstract class Token$HaptikSDK$a extends Token {
    private boolean HaptikSDK$a;
    private StringBuilder HaptikSDK$b;
    private String HaptikSDK$c;
    protected String ah$a;
    private String ah$b;
    private boolean invoke;
    public windowExtensionsProviderClass toString;
    boolean valueOf;
    public String values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Token$HaptikSDK$a() {
        super();
        this.HaptikSDK$b = new StringBuilder();
        this.HaptikSDK$a = false;
        this.invoke = false;
        this.valueOf = false;
    }

    @Override // org.jsoup.parser.Token
    /* renamed from: HaptikSDK$d */
    public Token$HaptikSDK$a HaptikSDK$e() {
        this.values = null;
        this.ah$a = null;
        this.ah$b = null;
        ag$a(this.HaptikSDK$b);
        this.HaptikSDK$c = null;
        this.HaptikSDK$a = false;
        this.invoke = false;
        this.valueOf = false;
        this.toString = null;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ak() {
        String str;
        if (this.toString == null) {
            this.toString = new windowExtensionsProviderClass();
        }
        String str2 = this.ah$b;
        if (str2 != null) {
            String trim = str2.trim();
            this.ah$b = trim;
            if (trim.length() > 0) {
                if (this.invoke) {
                    str = this.HaptikSDK$b.length() > 0 ? this.HaptikSDK$b.toString() : this.HaptikSDK$c;
                } else {
                    str = this.HaptikSDK$a ? "" : null;
                }
                this.toString.toString(this.ah$b, str);
            }
        }
        this.ah$b = null;
        this.HaptikSDK$a = false;
        this.invoke = false;
        ag$a(this.HaptikSDK$b);
        this.HaptikSDK$c = null;
    }

    public final void a() {
        if (this.ah$b != null) {
            ak();
        }
    }

    public final String isLogoutPending() {
        String str = this.values;
        isWindowLayoutProviderValid.valueOf(str == null || str.length() == 0);
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String extraCallbackWithResult() {
        return this.ah$a;
    }

    public final Token$HaptikSDK$a valueOf(String str) {
        this.values = str;
        this.ah$a = isWindowLayoutComponentValid.valueOf(str);
        return this;
    }

    public final boolean aj$a() {
        return this.valueOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final windowExtensionsProviderClass onXdkEvent() {
        return this.toString;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ah$a(String str) {
        String str2 = this.values;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.values = str;
        this.ah$a = isWindowLayoutComponentValid.valueOf(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void valueOf(char c) {
        ah$a(String.valueOf(c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ag$a(String str) {
        String str2 = this.ah$b;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.ah$b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void values(char c) {
        ag$a(String.valueOf(c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void values(String str) {
        extraCallback();
        if (this.HaptikSDK$b.length() == 0) {
            this.HaptikSDK$c = str;
        } else {
            this.HaptikSDK$b.append(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ah$a(char c) {
        extraCallback();
        this.HaptikSDK$b.append(c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void toString(int[] iArr) {
        extraCallback();
        for (int i : iArr) {
            this.HaptikSDK$b.appendCodePoint(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ICustomTabsCallback() {
        this.HaptikSDK$a = true;
    }

    private void extraCallback() {
        this.invoke = true;
        String str = this.HaptikSDK$c;
        if (str != null) {
            this.HaptikSDK$b.append(str);
            this.HaptikSDK$c = null;
        }
    }
}
