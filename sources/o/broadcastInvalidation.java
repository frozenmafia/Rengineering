package o;

import android.content.Context;
import com.microsoft.fraudprotection.androidsdk.ConfigData;
import com.microsoft.fraudprotection.androidsdk.FPRunnableType;
import o.IMultiInstanceInvalidationCallback;
import o.IMultiInstanceInvalidationService;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class broadcastInvalidation extends IMultiInstanceInvalidationCallback.Stub {
    private final String HaptikSDK$a;
    private final ConfigData HaptikSDK$c;
    private final JSONObject ah$b;

    public broadcastInvalidation(String str, String str2, String str3, Context context, Ignore ignore, onConflict onconflict, InvalidationTracker invalidationTracker, ConfigData configData, JSONObject jSONObject) {
        super(FPRunnableType.SEND, str, str2, context, ignore, onconflict, invalidationTracker);
        this.HaptikSDK$a = str3;
        this.HaptikSDK$c = configData;
        this.ah$b = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        valueOf();
    }

    private void valueOf() {
        try {
            this.ah$b.getJSONObject("error").putOpt(easypay.manager.Constants.EASY_PAY_CONFIG_PREF_KEY, this.HaptikSDK$b.values());
            this.ah$b.getJSONObject("error").putOpt("sendfpt", this.HaptikSDK$b.valueOf());
            ConfigData configData = this.HaptikSDK$c;
            if (configData != null && !configData.shouldSendTelemetry()) {
                this.ah$b.remove("error");
                this.ah$b.remove("latency");
            }
            this.toString.ah$a(this.invoke, this.valueOf, this.HaptikSDK$a, this.ah$b.toString(), this.values);
        } catch (Exception e) {
            IMultiInstanceInvalidationService.Default.toString("Exception while sending combining fingerprints to server: ", e);
            this.values.toString(new IMultiInstanceInvalidationCallback.Stub.Proxy<>(this.ah$a, new IMultiInstanceInvalidationCallback(e.getMessage())));
        }
    }
}
