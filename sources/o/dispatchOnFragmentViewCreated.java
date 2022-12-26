package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import java.net.HttpURLConnection;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class dispatchOnFragmentViewCreated {
    private static registerFragmentLifecycleCallbacks ah$a;
    private static dispatchOnFragmentViewCreated valueOf;
    private static ConcurrentHashMap<String, CompletableFuture<GraphResponse>> values;

    private dispatchOnFragmentViewCreated(Context context) {
        IntentFilter intentFilter = new IntentFilter("com.facebook.gamingservices.DAEMON_RESPONSE");
        HandlerThread handlerThread = new HandlerThread("com.facebook.gamingservices.DAEMON_RESPONSE_HANDLER");
        handlerThread.start();
        context.registerReceiver(new valueOf(), intentFilter, null, new Handler(handlerThread.getLooper()));
        values = new ConcurrentHashMap<>();
        ah$a = registerFragmentLifecycleCallbacks.toString(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConcurrentHashMap<String, CompletableFuture<GraphResponse>> values() {
        ConcurrentHashMap<String, CompletableFuture<GraphResponse>> concurrentHashMap;
        synchronized (this) {
            concurrentHashMap = values;
        }
        return concurrentHashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dispatchOnFragmentViewCreated valueOf(Context context) {
        dispatchOnFragmentViewCreated dispatchonfragmentviewcreated;
        synchronized (dispatchOnFragmentViewCreated.class) {
            if (valueOf == null) {
                valueOf = new dispatchOnFragmentViewCreated(context);
            }
            dispatchonfragmentviewcreated = valueOf;
        }
        return dispatchonfragmentviewcreated;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GraphResponse toString(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull("success")) {
            return values(jSONObject, str);
        }
        if (!jSONObject.isNull("error")) {
            return ag$a(jSONObject, str);
        }
        return values(str);
    }

    private static GraphResponse values(JSONObject jSONObject, String str) {
        if (jSONObject.optJSONObject("success") != null) {
            ah$a.ah$a(str);
            return new GraphResponse(new GraphRequest(), (HttpURLConnection) null, "", jSONObject.optJSONObject("success"));
        } else if (jSONObject.optJSONArray("success") != null) {
            ah$a.ah$a(str);
            return new GraphResponse(new GraphRequest(), (HttpURLConnection) null, "", jSONObject.optJSONArray("success"));
        } else {
            return values(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static GraphResponse valueOf(FacebookRequestError facebookRequestError, String str) {
        ah$a.valueOf(facebookRequestError, str);
        return new GraphResponse(new GraphRequest(), null, facebookRequestError);
    }

    private static GraphResponse ag$a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject("error");
        if (optJSONObject != null) {
            return valueOf(new FacebookRequestError(optJSONObject.optInt("code"), optJSONObject.optString("type"), optJSONObject.optString("message")), str);
        }
        return values(str);
    }

    private static GraphResponse values(String str) {
        return valueOf(new FacebookRequestError(20, "UNSUPPORTED_FORMAT", "The response format is invalid."), str);
    }

    /* loaded from: classes6.dex */
    static class valueOf extends BroadcastReceiver {
        private valueOf() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CompletableFuture completableFuture;
            try {
                JSONObject jSONObject = new JSONObject(intent.getStringExtra("returnPayload"));
                String string = jSONObject.getString("requestID");
                if (!dispatchOnFragmentViewCreated.values.containsKey(string) || (completableFuture = (CompletableFuture) dispatchOnFragmentViewCreated.values.remove(string)) == null) {
                    return;
                }
                completableFuture.complete(dispatchOnFragmentViewCreated.toString(jSONObject, string));
            } catch (JSONException unused) {
            }
        }
    }
}
