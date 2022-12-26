package org.jsoup.parser;

import org.jsoup.parser.Token;
/* loaded from: classes5.dex */
public final class Token$ag$a extends Token {
    public boolean ah$a;
    final StringBuilder valueOf;

    @Override // org.jsoup.parser.Token
    public Token HaptikSDK$e() {
        ag$a(this.valueOf);
        this.ah$a = false;
        return this;
    }

    public Token$ag$a() {
        super();
        this.valueOf = new StringBuilder();
        this.ah$a = false;
        this.ag$a = Token.TokenType.Comment;
    }

    public String HaptikSDK$d() {
        return this.valueOf.toString();
    }

    public String toString() {
        return "<!--" + HaptikSDK$d() + "-->";
    }
}
