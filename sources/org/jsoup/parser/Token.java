package org.jsoup.parser;
/* loaded from: classes5.dex */
public abstract class Token {
    public TokenType ag$a;

    /* loaded from: classes5.dex */
    public enum TokenType {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    public abstract Token HaptikSDK$e();

    private Token() {
    }

    public String getInitSettings() {
        return getClass().getSimpleName();
    }

    public static void ag$a(StringBuilder sb) {
        if (sb != null) {
            sb.delete(0, sb.length());
        }
    }

    /* loaded from: classes5.dex */
    public static final class values extends Token {
        boolean ah$a;
        final StringBuilder ah$b;
        String toString;
        final StringBuilder valueOf;
        final StringBuilder values;

        public values() {
            super();
            this.values = new StringBuilder();
            this.toString = null;
            this.valueOf = new StringBuilder();
            this.ah$b = new StringBuilder();
            this.ah$a = false;
            this.ag$a = TokenType.Doctype;
        }

        @Override // org.jsoup.parser.Token
        public Token HaptikSDK$e() {
            ag$a(this.values);
            this.toString = null;
            ag$a(this.valueOf);
            ag$a(this.ah$b);
            this.ah$a = false;
            return this;
        }

        public String HaptikSDK$d() {
            return this.values.toString();
        }

        public String isLogoutPending() {
            return this.toString;
        }

        public String aj$a() {
            return this.valueOf.toString();
        }

        public String onXdkEvent() {
            return this.ah$b.toString();
        }

        public boolean ak() {
            return this.ah$a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class toString extends Token$HaptikSDK$a {
        public toString() {
            this.ag$a = TokenType.EndTag;
        }

        public String toString() {
            return "</" + isLogoutPending() + ">";
        }
    }

    /* loaded from: classes5.dex */
    static final class valueOf extends Token {
        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // org.jsoup.parser.Token
        public Token HaptikSDK$e() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public valueOf() {
            super();
            this.ag$a = TokenType.EOF;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean invoke() {
        return this.ag$a == TokenType.Doctype;
    }

    public final values ag$a() {
        return (values) this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean HaptikWebView() {
        return this.ag$a == TokenType.StartTag;
    }

    public final Token$ah$b ah$b() {
        return (Token$ah$b) this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean getSignupData() {
        return this.ag$a == TokenType.EndTag;
    }

    public final toString values() {
        return (toString) this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean HaptikSDK$c() {
        return this.ag$a == TokenType.Comment;
    }

    public final Token$ag$a valueOf() {
        return (Token$ag$a) this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean HaptikSDK$b() {
        return this.ag$a == TokenType.Character;
    }

    public final Token$ah$a ah$a() {
        return (Token$ah$a) this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean HaptikSDK$a() {
        return this.ag$a == TokenType.EOF;
    }
}
