package defpackage;

import android.content.Context;
import com.amazon.identity.auth.device.AuthError;
import java.util.ArrayList;
import java.util.List;
import o.prepare;
import o.setCaptioningEnabled;
import org.apache.http.Header;
import org.apache.http.message.BasicNameValuePair;
/* renamed from: at  reason: default package */
/* loaded from: classes.dex */
public abstract class at<T extends setCaptioningEnabled> extends prepare<T> {
    private final String ag$a;
    private final String ah$a;

    public at(Context context, ag agVar) throws AuthError {
        super(context, agVar);
        if (agVar == null) {
            throw new AuthError("Appinfo can not be null to make an OAuthTokenRequest", AuthError.ERROR_TYPE.ERROR_UNKNOWN);
        }
        this.ah$a = agVar.ag$a();
        this.ag$a = agVar.ah$b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String HaptikSDK$c() {
        return this.ah$a;
    }

    @Override // o.prepare
    public List<Header> ag$a() {
        return new ArrayList();
    }

    @Override // o.prepare
    protected abstract String ah$a();

    @Override // o.prepare
    public List<BasicNameValuePair> invoke() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new BasicNameValuePair("grant_type", ah$a()));
        arrayList.add(new BasicNameValuePair("client_id", this.ag$a));
        List<BasicNameValuePair> valueOf = valueOf();
        if (valueOf != null) {
            arrayList.addAll(valueOf);
        }
        return arrayList;
    }

    protected abstract List<BasicNameValuePair> valueOf();

    @Override // o.prepare
    public String values() {
        return "/auth/o2/token";
    }
}
