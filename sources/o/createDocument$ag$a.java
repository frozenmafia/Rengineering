package o;

import com.google.android.exoplayer2.C;
import java.io.IOException;
import o.DocumentsContractCompat;
import o.RequestExecutor;
import o.createDocument;
/* loaded from: classes6.dex */
final class createDocument$ag$a implements CallbackWithHandler, CallbackWithHandler$ah$a {
    private final CallbackWithHandler ah$a;
    private final long toString;
    private CallbackWithHandler$ah$a values;

    public createDocument$ag$a(CallbackWithHandler callbackWithHandler, long j) {
        this.ah$a = callbackWithHandler;
        this.toString = j;
    }

    @Override // o.CallbackWithHandler
    public void ah$a(CallbackWithHandler$ah$a callbackWithHandler$ah$a, long j) {
        this.values = callbackWithHandler$ah$a;
        this.ah$a.ah$a(this, j - this.toString);
    }

    @Override // o.CallbackWithHandler
    public void ah$b() throws IOException {
        this.ah$a.ah$b();
    }

    @Override // o.CallbackWithHandler
    public getCertificatesArrayResId ah$a() {
        return this.ah$a.ah$a();
    }

    @Override // o.CallbackWithHandler
    public long valueOf(RequestExecutor.DefaultThreadFactory[] defaultThreadFactoryArr, boolean[] zArr, DocumentsContractCompat.DocumentsContractApi24Impl[] documentsContractApi24ImplArr, boolean[] zArr2, long j) {
        DocumentsContractCompat.DocumentsContractApi24Impl[] documentsContractApi24ImplArr2 = new DocumentsContractCompat.DocumentsContractApi24Impl[documentsContractApi24ImplArr.length];
        int i = 0;
        while (true) {
            DocumentsContractCompat.DocumentsContractApi24Impl documentsContractApi24Impl = null;
            if (i >= documentsContractApi24ImplArr.length) {
                break;
            }
            createDocument.values valuesVar = (createDocument.values) documentsContractApi24ImplArr[i];
            if (valuesVar != null) {
                documentsContractApi24Impl = valuesVar.values();
            }
            documentsContractApi24ImplArr2[i] = documentsContractApi24Impl;
            i++;
        }
        long valueOf = this.ah$a.valueOf(defaultThreadFactoryArr, zArr, documentsContractApi24ImplArr2, zArr2, j - this.toString);
        for (int i2 = 0; i2 < documentsContractApi24ImplArr.length; i2++) {
            DocumentsContractCompat.DocumentsContractApi24Impl documentsContractApi24Impl2 = documentsContractApi24ImplArr2[i2];
            if (documentsContractApi24Impl2 == null) {
                documentsContractApi24ImplArr[i2] = null;
            } else if (documentsContractApi24ImplArr[i2] == null || ((createDocument.values) documentsContractApi24ImplArr[i2]).values() != documentsContractApi24Impl2) {
                documentsContractApi24ImplArr[i2] = new createDocument.values(documentsContractApi24Impl2, this.toString);
            }
        }
        return valueOf + this.toString;
    }

    @Override // o.CallbackWithHandler
    public void values(long j, boolean z) {
        this.ah$a.values(j - this.toString, z);
    }

    @Override // o.CallbackWithHandler
    public long HaptikSDK$a() {
        long HaptikSDK$a = this.ah$a.HaptikSDK$a();
        return HaptikSDK$a == C.TIME_UNSET ? C.TIME_UNSET : this.toString + HaptikSDK$a;
    }

    @Override // o.CallbackWithHandler
    public long valueOf(long j) {
        return this.ah$a.valueOf(j - this.toString) + this.toString;
    }

    @Override // o.CallbackWithHandler
    public long ag$a(long j, lambda$onGpsStatusChanged$3$androidxcorelocationLocationManagerCompat$GpsStatusTransport lambda_ongpsstatuschanged_3_androidxcorelocationlocationmanagercompat_gpsstatustransport) {
        return this.ah$a.ag$a(j - this.toString, lambda_ongpsstatuschanged_3_androidxcorelocationlocationmanagercompat_gpsstatustransport) + this.toString;
    }

    @Override // o.CallbackWithHandler, o.DocumentsContractCompat.DocumentsContractApi21Impl
    public long values() {
        long values = this.ah$a.values();
        if (values == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.toString + values;
    }

    @Override // o.CallbackWithHandler, o.DocumentsContractCompat.DocumentsContractApi21Impl
    public long valueOf() {
        long valueOf = this.ah$a.valueOf();
        if (valueOf == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.toString + valueOf;
    }

    @Override // o.CallbackWithHandler, o.DocumentsContractCompat.DocumentsContractApi21Impl
    public boolean ah$a(long j) {
        return this.ah$a.ah$a(j - this.toString);
    }

    @Override // o.CallbackWithHandler, o.DocumentsContractCompat.DocumentsContractApi21Impl
    public boolean ag$a() {
        return this.ah$a.ag$a();
    }

    @Override // o.CallbackWithHandler, o.DocumentsContractCompat.DocumentsContractApi21Impl
    public void toString(long j) {
        this.ah$a.toString(j - this.toString);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // o.CallbackWithHandler$ah$a
    public void ah$a(CallbackWithHandler callbackWithHandler) {
        ((CallbackWithHandler$ah$a) FingerprintManagerCompat.toString(this.values)).ah$a((CallbackWithHandler) this);
    }

    @Override // o.DocumentsContractCompat.DocumentsContractApi21Impl.values
    /* renamed from: toString */
    public void ah$a(CallbackWithHandler callbackWithHandler) {
        ((CallbackWithHandler$ah$a) FingerprintManagerCompat.toString(this.values)).ah$a((CallbackWithHandler$ah$a) this);
    }
}
