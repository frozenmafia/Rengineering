package o;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import java.io.IOException;
/* loaded from: classes6.dex */
public abstract class CursorLoader extends getSelectionArgs {
    protected int HaptikSDK$a;
    protected int HaptikSDK$b;
    protected char[] HaptikSDK$c;
    protected setSelectionArgs HaptikSDK$d;
    protected long ah$a;
    protected int ah$b;
    protected final rollbackContentChanged getInitSettings;
    protected int getSignupData;
    protected final onStopLoading invoke;
    protected boolean toString;
    protected int valueOf;
    protected int values;

    protected abstract void valueOf() throws IOException;

    /* JADX INFO: Access modifiers changed from: protected */
    public CursorLoader(onStopLoading onstoploading, int i) {
        super(i);
        this.valueOf = 1;
        this.getSignupData = 1;
        this.HaptikSDK$a = 0;
        this.invoke = onstoploading;
        this.getInitSettings = onstoploading.ah$b();
        this.HaptikSDK$d = setSelectionArgs.ag$a(JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? abandon.values(this) : null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.toString) {
            return;
        }
        this.HaptikSDK$b = Math.max(this.HaptikSDK$b, this.ah$b);
        this.toString = true;
        try {
            valueOf();
        } finally {
            ag$a();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonLocation values() {
        int i = this.HaptikSDK$b;
        int i2 = this.values;
        return new JsonLocation(ah$a(), -1L, this.HaptikSDK$b + this.ah$a, this.valueOf, (i - i2) + 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ag$a() throws IOException {
        this.getInitSettings.ah$a();
        char[] cArr = this.HaptikSDK$c;
        if (cArr != null) {
            this.HaptikSDK$c = null;
            this.invoke.ah$a(cArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object ah$a() {
        if (JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(this.ag$a)) {
            return this.invoke.HaptikSDK$c();
        }
        return null;
    }
}
