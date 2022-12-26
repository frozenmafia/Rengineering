package org.jsoup.parser;

import com.dreampay.commons.constants.Constants;
import o.isWindowLayoutComponentValid;
import o.windowExtensionsProviderClass;
import org.jsoup.parser.Token;
/* loaded from: classes5.dex */
public final class Token$ah$b extends Token$HaptikSDK$a {
    public Token$ah$b() {
        this.toString = new windowExtensionsProviderClass();
        this.ag$a = Token.TokenType.StartTag;
    }

    @Override // org.jsoup.parser.Token$HaptikSDK$a, org.jsoup.parser.Token
    /* renamed from: HaptikSDK$d */
    public Token$HaptikSDK$a HaptikSDK$e() {
        super.HaptikSDK$e();
        this.toString = new windowExtensionsProviderClass();
        return this;
    }

    public Token$ah$b toString(String str, windowExtensionsProviderClass windowextensionsproviderclass) {
        this.values = str;
        this.toString = windowextensionsproviderclass;
        this.ah$a = isWindowLayoutComponentValid.valueOf(this.values);
        return this;
    }

    public String toString() {
        if (this.toString != null && this.toString.ah$b() > 0) {
            return "<" + isLogoutPending() + Constants.WHITE_SPACE + this.toString.toString() + ">";
        }
        return "<" + isLogoutPending() + ">";
    }
}
