package o;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public abstract class QueryInterceptorDatabase$$ExternalSyntheticLambda6 extends QueryInterceptorDatabase$$ExternalSyntheticLambda9 {
    protected int extraCallbackWithResult;

    protected abstract void valueOf(int i, int i2);

    protected abstract int values(char c, int i);

    public QueryInterceptorDatabase$$ExternalSyntheticLambda6(int i) {
        super(i);
    }

    @Override // o.QueryInterceptorDatabase$$ExternalSyntheticLambda9
    protected void values(boolean[] zArr) throws IOException {
        int i = this.ak;
        toString(zArr);
        toString(i, this.ak);
    }

    @Override // o.QueryInterceptorDatabase$$ExternalSyntheticLambda9
    protected Object valueOf(boolean[] zArr) throws com.nimbusds.jose.shaded.json.parser.ParseException, IOException {
        int i = this.ak;
        valueOf();
        HaptikSDK$e();
        if (this.getInitSettings != '.' && this.getInitSettings != 'E' && this.getInitSettings != 'e') {
            getSignupData();
            if (this.getInitSettings >= 0 && this.getInitSettings < '~' && !zArr[this.getInitSettings] && this.getInitSettings != 26) {
                toString(zArr);
                toString(i, this.ak);
                if (!this.ah$b) {
                    throw new com.nimbusds.jose.shaded.json.parser.ParseException(this.ak, 1, this.ICustomTabsCallback);
                }
                return this.ICustomTabsCallback;
            }
            toString(i, this.ak);
            return values(this.ICustomTabsCallback);
        }
        if (this.getInitSettings == '.') {
            valueOf();
            HaptikSDK$e();
        }
        if (this.getInitSettings != 'E' && this.getInitSettings != 'e') {
            getSignupData();
            if (this.getInitSettings >= 0 && this.getInitSettings < '~' && !zArr[this.getInitSettings] && this.getInitSettings != 26) {
                toString(zArr);
                toString(i, this.ak);
                if (!this.ah$b) {
                    throw new com.nimbusds.jose.shaded.json.parser.ParseException(this.ak, 1, this.ICustomTabsCallback);
                }
                return this.ICustomTabsCallback;
            }
            toString(i, this.ak);
            return ag$a();
        }
        this.a.valueOf('E');
        valueOf();
        if (this.getInitSettings == '+' || this.getInitSettings == '-' || (this.getInitSettings >= '0' && this.getInitSettings <= '9')) {
            this.a.valueOf(this.getInitSettings);
            valueOf();
            HaptikSDK$e();
            getSignupData();
            if (this.getInitSettings >= 0 && this.getInitSettings < '~' && !zArr[this.getInitSettings] && this.getInitSettings != 26) {
                toString(zArr);
                toString(i, this.ak);
                if (!this.ah$b) {
                    throw new com.nimbusds.jose.shaded.json.parser.ParseException(this.ak, 1, this.ICustomTabsCallback);
                }
                return this.ICustomTabsCallback;
            }
            toString(i, this.ak);
            return ag$a();
        }
        toString(zArr);
        toString(i, this.ak);
        if (!this.ah$b) {
            throw new com.nimbusds.jose.shaded.json.parser.ParseException(this.ak, 1, this.ICustomTabsCallback);
        }
        if (!this.HaptikSDK$b) {
            values();
        }
        return this.ICustomTabsCallback;
    }

    @Override // o.QueryInterceptorDatabase$$ExternalSyntheticLambda9
    protected void ah$b() throws com.nimbusds.jose.shaded.json.parser.ParseException, IOException {
        if (!this.HaptikSDK$a && this.getInitSettings == '\'') {
            if (this.ah$b) {
                values(valueOf);
                return;
            }
            throw new com.nimbusds.jose.shaded.json.parser.ParseException(this.ak, 0, Character.valueOf(this.getInitSettings));
        }
        int values = values(this.getInitSettings, this.ak + 1);
        if (values == -1) {
            throw new com.nimbusds.jose.shaded.json.parser.ParseException(this.extraCallbackWithResult, 3, null);
        }
        valueOf(this.ak + 1, values);
        if (this.ICustomTabsCallback.indexOf(92) == -1) {
            ah$a();
            this.ak = values;
            valueOf();
            return;
        }
        this.a.ah$a();
        HaptikSDK$d();
    }

    protected void toString(int i, int i2) {
        valueOf(i, i2);
        this.ICustomTabsCallback = this.ICustomTabsCallback.trim();
    }
}
