package o;

import android.content.Context;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import o.setCaptioningEnabled;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpRequestBase;
/* loaded from: classes.dex */
public abstract class prepareFromSearch<T extends setCaptioningEnabled> extends prepare<T> {
    public prepareFromSearch(Context context, ag agVar) {
        super(context, agVar);
    }

    @Override // o.prepare
    protected void a_() throws UnsupportedEncodingException {
    }

    @Override // o.prepare
    protected HttpRequestBase ah$a(String str) {
        return new HttpGet(str);
    }

    @Override // o.prepare
    protected void ah$a() throws IOException {
    }
}
