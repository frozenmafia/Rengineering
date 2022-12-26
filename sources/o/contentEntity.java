package o;

import android.content.Context;
import com.microsoft.fraudprotection.androidsdk.AttributeType;
import java.util.concurrent.TimeUnit;
import o.IMultiInstanceInvalidationService;
import org.json.JSONObject;
/* loaded from: classes5.dex */
class contentEntity extends onDelete {
    private Index toString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public contentEntity(Context context, JSONObject jSONObject) {
        super(context, jSONObject);
    }

    @Override // o.onDelete
    public String valueOf() {
        return AttributeType.USER_PREFERENCES.getType();
    }

    @Override // o.onDelete
    public void valueOf(Index index) {
        this.toString = index;
        try {
            this.valueOf = System.nanoTime();
            new beginTransactionInternal(this.ah$a, this.values, this.ag$a).ag$a();
            toString(null);
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString(valueOf() + " execute error ", e);
            toString(new IMultiInstanceInvalidationCallback(e.toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.onDelete
    public void toString(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback) {
        long millis;
        if (iMultiInstanceInvalidationCallback != null) {
            this.values.ag$a(valueOf(), iMultiInstanceInvalidationCallback.ah$a());
            millis = -1;
        } else {
            millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.valueOf);
        }
        this.toString.ah$a(this.values, millis);
    }
}
