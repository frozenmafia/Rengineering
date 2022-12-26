package o;

import android.content.Context;
import android.hardware.Sensor;
import com.microsoft.fraudprotection.androidsdk.AttributeType;
import java.util.concurrent.TimeUnit;
import o.IMultiInstanceInvalidationService;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes5.dex */
class parentColumns extends tokenizer {
    private Index HaptikSDK$c;
    private final boolean ah$b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public parentColumns(Context context, JSONObject jSONObject, boolean z) {
        super(context, jSONObject);
        this.ah$b = z;
    }

    @Override // o.onDelete
    public String valueOf() {
        return AttributeType.ACCELEROMETER.getType();
    }

    @Override // o.onDelete
    public void valueOf(Index index) {
        this.HaptikSDK$c = index;
        try {
            this.valueOf = System.nanoTime();
            Sensor defaultSensor = this.HaptikSDK$a.getDefaultSensor(1);
            if (defaultSensor != null) {
                this.values.valueOf("g4", defaultSensor.getName());
                this.values.valueOf("g5", defaultSensor.getVendor());
                this.values.valueOf("g6", Float.valueOf(defaultSensor.getPower()));
                this.values.valueOf("g7", Integer.valueOf(defaultSensor.getVersion()));
                if (this.ah$b) {
                    this.toString = new JSONArray();
                    values(defaultSensor);
                } else {
                    toString(null);
                }
            } else {
                toString(new IMultiInstanceInvalidationCallback("Accelerometer sensor returns null"));
            }
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString(valueOf() + " execute error ", e);
            toString(new IMultiInstanceInvalidationCallback(e.toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.onDelete
    public void toString(IMultiInstanceInvalidationCallback iMultiInstanceInvalidationCallback) {
        if (this.toString != null && this.toString.length() > 0) {
            this.values.valueOf("g8", this.toString);
        }
        ag$a();
        long j = -1;
        if (iMultiInstanceInvalidationCallback != null) {
            this.values.ag$a(valueOf(), iMultiInstanceInvalidationCallback.ah$a());
        } else {
            j = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.valueOf);
            if (j == 0) {
                j = 1;
            }
        }
        this.HaptikSDK$c.ah$a(this.values, j);
    }
}
