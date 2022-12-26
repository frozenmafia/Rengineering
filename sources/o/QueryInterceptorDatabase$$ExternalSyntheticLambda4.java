package o;
/* loaded from: classes7.dex */
public class QueryInterceptorDatabase$$ExternalSyntheticLambda4 {
    public static int ah$a;
    private QueryInterceptorDatabase$$ExternalSyntheticLambda8 toString;
    private int valueOf;

    static {
        ah$a = System.getProperty("JSON_SMART_SIMPLE") != null ? 960 : -1;
    }

    public QueryInterceptorDatabase$$ExternalSyntheticLambda4() {
        this.valueOf = ah$a;
    }

    public QueryInterceptorDatabase$$ExternalSyntheticLambda4(int i) {
        this.valueOf = i;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [o.QueryInterceptorDatabase$$ExternalSyntheticLambda8] */
    public Object values(String str) throws com.nimbusds.jose.shaded.json.parser.ParseException {
        if (this.toString == null) {
            final int i = this.valueOf;
            this.toString = new QueryInterceptorDatabase$$ExternalSyntheticLambda6(i) { // from class: o.QueryInterceptorDatabase$$ExternalSyntheticLambda8
                private String ak$a;

                public Object ag$a(String str2) throws com.nimbusds.jose.shaded.json.parser.ParseException {
                    return ag$a(str2, QueryInterceptorDatabase$$ExternalSyntheticLambda2.ag$a, QueryInterceptorDatabase$$ExternalSyntheticLambda10.values);
                }

                public Object ag$a(String str2, QueryInterceptorDatabase$$ExternalSyntheticLambda2 queryInterceptorDatabase$$ExternalSyntheticLambda2, QueryInterceptorDatabase$$ExternalSyntheticLambda3 queryInterceptorDatabase$$ExternalSyntheticLambda3) throws com.nimbusds.jose.shaded.json.parser.ParseException {
                    this.ak$a = str2;
                    this.extraCallbackWithResult = str2.length();
                    this.ak = -1;
                    return toString(queryInterceptorDatabase$$ExternalSyntheticLambda2, queryInterceptorDatabase$$ExternalSyntheticLambda3);
                }

                @Override // o.QueryInterceptorDatabase$$ExternalSyntheticLambda6
                protected void valueOf(int i2, int i3) {
                    this.ICustomTabsCallback = this.ak$a.substring(i2, i3);
                }

                @Override // o.QueryInterceptorDatabase$$ExternalSyntheticLambda6
                protected int values(char c, int i2) {
                    return this.ak$a.indexOf(c, i2);
                }

                @Override // o.QueryInterceptorDatabase$$ExternalSyntheticLambda9
                protected void valueOf() {
                    int i2 = this.ak + 1;
                    this.ak = i2;
                    if (i2 >= this.extraCallbackWithResult) {
                        this.getInitSettings = (char) 26;
                    } else {
                        this.getInitSettings = this.ak$a.charAt(this.ak);
                    }
                }

                @Override // o.QueryInterceptorDatabase$$ExternalSyntheticLambda9
                protected void HaptikSDK$c() {
                    int i2 = this.ak + 1;
                    this.ak = i2;
                    if (i2 >= this.extraCallbackWithResult) {
                        this.getInitSettings = (char) 26;
                    } else {
                        this.getInitSettings = this.ak$a.charAt(this.ak);
                    }
                }

                @Override // o.QueryInterceptorDatabase$$ExternalSyntheticLambda9
                protected void HaptikSDK$a() throws com.nimbusds.jose.shaded.json.parser.ParseException {
                    int i2 = this.ak + 1;
                    this.ak = i2;
                    if (i2 >= this.extraCallbackWithResult) {
                        this.getInitSettings = (char) 26;
                        throw new com.nimbusds.jose.shaded.json.parser.ParseException(this.ak - 1, 3, "EOF");
                    } else {
                        this.getInitSettings = this.ak$a.charAt(this.ak);
                    }
                }
            };
        }
        return ag$a(str);
    }
}
