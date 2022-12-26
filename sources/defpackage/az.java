package defpackage;

import android.content.Context;
import com.amazon.identity.auth.device.AuthError;
import java.util.ArrayList;
import java.util.List;
import o.putEncryptedObject;
import o.rate;
import org.apache.http.HttpResponse;
import org.apache.http.message.BasicNameValuePair;
/* renamed from: az  reason: default package */
/* loaded from: classes.dex */
public class az extends at<rate> {
    private static final String values = "az";
    private final String HaptikSDK$b;
    private final String ag$a;
    private final String ah$a;
    private final String invoke;

    public az(String str, String str2, String str3, String str4, ag agVar, Context context) throws AuthError {
        super(context, agVar);
        this.ah$a = str;
        this.ag$a = str3;
        this.HaptikSDK$b = str4;
        this.invoke = str2;
    }

    @Override // o.prepare
    public void HaptikWebView() {
        putEncryptedObject.toString(values, "Executing OAuth Code for Token Exchange. redirectUri=" + this.ag$a + " appId=" + HaptikSDK$c(), "code=" + this.ah$a, null);
    }

    @Override // defpackage.at, o.prepare
    public String ah$a() {
        return "authorization_code";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.prepare
    /* renamed from: ah$a */
    public rate toString(HttpResponse httpResponse) {
        return new rate(httpResponse, HaptikSDK$c(), this.HaptikSDK$b);
    }

    @Override // defpackage.at
    protected List<BasicNameValuePair> valueOf() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("code", this.ah$a));
        arrayList.add(new BasicNameValuePair("redirect_uri", this.ag$a));
        arrayList.add(new BasicNameValuePair("code_verifier", this.invoke));
        return arrayList;
    }
}
