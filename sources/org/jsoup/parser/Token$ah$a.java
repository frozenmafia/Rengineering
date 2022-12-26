package org.jsoup.parser;

import org.jsoup.parser.Token;
/* loaded from: classes5.dex */
public final class Token$ah$a extends Token {
    private String values;

    public Token$ah$a() {
        super();
        this.ag$a = Token.TokenType.Character;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // org.jsoup.parser.Token
    public Token HaptikSDK$e() {
        this.values = null;
        return this;
    }

    public Token$ah$a values(String str) {
        this.values = str;
        return this;
    }

    public String HaptikSDK$d() {
        return this.values;
    }

    public String toString() {
        return HaptikSDK$d();
    }
}
