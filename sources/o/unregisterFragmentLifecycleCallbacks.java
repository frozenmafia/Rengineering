package o;

import android.content.Context;
import android.content.Intent;
import com.facebook.FacebookRequestError;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class unregisterFragmentLifecycleCallbacks {
    private toString ag$a;
    private ConcurrentHashMap<String, CompletableFuture<GraphResponse>> ah$a;
    private Context toString;
    private JSONObject valueOf;
    private registerFragmentLifecycleCallbacks values;

    /* loaded from: classes6.dex */
    public interface toString {
        void ag$a(GraphResponse graphResponse);
    }

    unregisterFragmentLifecycleCallbacks(Context context, JSONObject jSONObject, toString tostring) {
        this.toString = context;
        this.valueOf = jSONObject;
        this.ag$a = tostring;
        this.ah$a = dispatchOnFragmentViewCreated.valueOf(context).values();
        this.values = registerFragmentLifecycleCallbacks.toString(context);
    }

    private void values() throws ExecutionException, InterruptedException {
        valueOf().thenAccept((java.util.function.Consumer<? super GraphResponse>) new java.util.function.Consumer<GraphResponse>() { // from class: o.unregisterFragmentLifecycleCallbacks.1
            @Override // java.util.function.Consumer
            /* renamed from: toString */
            public void accept(GraphResponse graphResponse) {
                if (unregisterFragmentLifecycleCallbacks.this.ag$a != null) {
                    unregisterFragmentLifecycleCallbacks.this.ag$a.ag$a(graphResponse);
                }
            }
        });
    }

    private CompletableFuture<GraphResponse> valueOf() {
        return CompletableFuture.supplyAsync(new java.util.function.Supplier<GraphResponse>() { // from class: o.unregisterFragmentLifecycleCallbacks.4
            @Override // java.util.function.Supplier
            /* renamed from: ah$a */
            public GraphResponse get() {
                String uuid = UUID.randomUUID().toString();
                try {
                    unregisterFragmentLifecycleCallbacks.this.valueOf.put("requestID", uuid);
                    Intent intent = new Intent();
                    String string = unregisterFragmentLifecycleCallbacks.this.valueOf.getString("type");
                    unregisterFragmentLifecycleCallbacks.this.values.valueOf(string, uuid, unregisterFragmentLifecycleCallbacks.this.valueOf);
                    if (!string.equals(SDKMessageEnum.GET_ACCESS_TOKEN.toString()) && !string.equals(SDKMessageEnum.IS_ENV_READY.toString())) {
                        String string2 = unregisterFragmentLifecycleCallbacks.this.toString.getSharedPreferences("com.facebook.gamingservices.cloudgaming:preferences", 0).getString("daemonPackageName", null);
                        if (string2 == null) {
                            return dispatchOnFragmentViewCreated.valueOf(new FacebookRequestError(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request with a secure connection"), uuid);
                        }
                        intent.setPackage(string2);
                    }
                    intent.setAction("com.facebook.gamingservices.DAEMON_REQUEST");
                    Iterator<String> keys = unregisterFragmentLifecycleCallbacks.this.valueOf.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        intent.putExtra(next, unregisterFragmentLifecycleCallbacks.this.valueOf.getString(next));
                    }
                    CompletableFuture completableFuture = new CompletableFuture();
                    unregisterFragmentLifecycleCallbacks.this.ah$a.put(uuid, completableFuture);
                    unregisterFragmentLifecycleCallbacks.this.toString.sendBroadcast(intent);
                    unregisterFragmentLifecycleCallbacks.this.values.ah$a(string, uuid, unregisterFragmentLifecycleCallbacks.this.valueOf);
                    return (GraphResponse) completableFuture.get();
                } catch (InterruptedException | ExecutionException | JSONException unused) {
                    return dispatchOnFragmentViewCreated.valueOf(new FacebookRequestError(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), uuid);
                }
            }
        });
    }

    public static void ag$a(Context context, JSONObject jSONObject, toString tostring, SDKMessageEnum sDKMessageEnum) {
        JSONObject put;
        try {
            if (jSONObject == null) {
                put = new JSONObject().put("type", sDKMessageEnum.toString());
            } else {
                put = jSONObject.put("type", sDKMessageEnum.toString());
            }
            new unregisterFragmentLifecycleCallbacks(context, put, tostring).values();
        } catch (InterruptedException | ExecutionException | JSONException unused) {
            if (tostring != null) {
                tostring.ag$a(dispatchOnFragmentViewCreated.valueOf(new FacebookRequestError(-1, "DAEMON_REQUEST_EXECUTE_ASYNC_FAILED", "Unable to correctly create the request or obtain response"), null));
            }
        }
    }
}
