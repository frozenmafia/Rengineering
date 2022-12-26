package o;

import java.io.IOException;
import o.QueryInterceptorDatabase$$ExternalSyntheticLambda11;
/* loaded from: classes7.dex */
public class QueryInterceptorDatabase$$ExternalSyntheticLambda0 {
    private QueryInterceptorDatabase$$ExternalSyntheticLambda11$HaptikSDK$b HaptikSDK$a;
    private boolean HaptikSDK$b;
    private QueryInterceptorDatabase$$ExternalSyntheticLambda11$HaptikSDK$b HaptikSDK$c;
    private boolean ah$b;
    private QueryInterceptorDatabase$$ExternalSyntheticLambda11.invoke invoke;
    private boolean valueOf;
    private boolean values;
    public static final QueryInterceptorDatabase$$ExternalSyntheticLambda0 ah$a = new QueryInterceptorDatabase$$ExternalSyntheticLambda0();
    public static final QueryInterceptorDatabase$$ExternalSyntheticLambda0 toString = new QueryInterceptorDatabase$$ExternalSyntheticLambda0(-1);
    public static final QueryInterceptorDatabase$$ExternalSyntheticLambda0 ag$a = new QueryInterceptorDatabase$$ExternalSyntheticLambda0(2);

    public void HaptikSDK$a(Appendable appendable) throws IOException {
    }

    public void ah$b(Appendable appendable) throws IOException {
    }

    public void toString(Appendable appendable) throws IOException {
    }

    public void values(Appendable appendable) throws IOException {
    }

    public QueryInterceptorDatabase$$ExternalSyntheticLambda0(int i) {
        QueryInterceptorDatabase$$ExternalSyntheticLambda11$HaptikSDK$b queryInterceptorDatabase$$ExternalSyntheticLambda11$HaptikSDK$b;
        this.ah$b = (i & 1) == 0;
        this.HaptikSDK$b = (i & 4) == 0;
        this.valueOf = (i & 2) == 0;
        this.values = (i & 16) > 0;
        if ((i & 8) > 0) {
            queryInterceptorDatabase$$ExternalSyntheticLambda11$HaptikSDK$b = QueryInterceptorDatabase$$ExternalSyntheticLambda11.valueOf;
        } else {
            queryInterceptorDatabase$$ExternalSyntheticLambda11$HaptikSDK$b = QueryInterceptorDatabase$$ExternalSyntheticLambda11.ag$a;
        }
        if (this.HaptikSDK$b) {
            this.HaptikSDK$a = QueryInterceptorDatabase$$ExternalSyntheticLambda11.values;
        } else {
            this.HaptikSDK$a = queryInterceptorDatabase$$ExternalSyntheticLambda11$HaptikSDK$b;
        }
        if (this.ah$b) {
            this.HaptikSDK$c = QueryInterceptorDatabase$$ExternalSyntheticLambda11.values;
        } else {
            this.HaptikSDK$c = queryInterceptorDatabase$$ExternalSyntheticLambda11$HaptikSDK$b;
        }
        if (this.valueOf) {
            this.invoke = QueryInterceptorDatabase$$ExternalSyntheticLambda11.ah$a;
        } else {
            this.invoke = QueryInterceptorDatabase$$ExternalSyntheticLambda11.toString;
        }
    }

    public QueryInterceptorDatabase$$ExternalSyntheticLambda0() {
        this(0);
    }

    public boolean values() {
        return this.values;
    }

    public boolean toString(String str) {
        return this.HaptikSDK$c.values(str);
    }

    public boolean valueOf(String str) {
        return this.HaptikSDK$a.values(str);
    }

    public void valueOf(Appendable appendable, String str) throws IOException {
        if (!valueOf(str)) {
            appendable.append(str);
            return;
        }
        appendable.append('\"');
        lambda$setTransactionSuccessful$5$androidxroomQueryInterceptorDatabase.ag$a(str, appendable, this);
        appendable.append('\"');
    }

    public void ah$a(String str, Appendable appendable) {
        this.invoke.toString(str, appendable);
    }

    public void HaptikSDK$b(Appendable appendable) throws IOException {
        appendable.append('{');
    }

    public void getSignupData(Appendable appendable) throws IOException {
        appendable.append('}');
    }

    public void HaptikSDK$c(Appendable appendable) throws IOException {
        appendable.append(',');
    }

    public void invoke(Appendable appendable) throws IOException {
        appendable.append(':');
    }

    public void valueOf(Appendable appendable) throws IOException {
        appendable.append('[');
    }

    public void ag$a(Appendable appendable) throws IOException {
        appendable.append(']');
    }

    public void ah$a(Appendable appendable) throws IOException {
        appendable.append(',');
    }
}
