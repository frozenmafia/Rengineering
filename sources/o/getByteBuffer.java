package o;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.IBinder;
import com.phonepe.intent.sdk.api.RequestCallback;
import irjuc.irjuc.cqqlq.irjuc.jmjou.jmjou;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes5.dex */
public class getByteBuffer implements handleException, ServiceConnection {
    public AsyncTask<Void, Void, String> HaptikSDK$b = new toString();
    public jmjou ag$a;
    public RequestCallback ah$a;
    public String invoke;
    public ChangeClipBounds toString;
    public String valueOf;
    public String values;

    /* loaded from: classes5.dex */
    public class toString extends AsyncTask<Void, Void, String> {
        public toString() {
        }

        @Override // android.os.AsyncTask
        public String doInBackground(Void[] voidArr) {
            try {
                beginAsyncSectionFallback.ag$a("SDKtoAppConnection", "Making Request");
                String changeClipBounds = getByteBuffer.this.toString.toString(getByteBuffer.this.valueOf, getByteBuffer.this.values, getByteBuffer.this.invoke);
                new JSONObject(changeClipBounds).put("timestamp", System.currentTimeMillis());
                getByteBuffer.this.ag$a.ag$a(getByteBuffer.this.valueOf, changeClipBounds);
                return changeClipBounds;
            } catch (Exception e) {
                beginAsyncSectionFallback.valueOf("SDKtoAppConnection", "CAUGHT EXCEPTION: " + e.getMessage(), e);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public void onPostExecute(String str) {
            String str2 = str;
            super.onPostExecute(str2);
            getByteBuffer.this.values(str2);
            getByteBuffer getbytebuffer = getByteBuffer.this;
            getbytebuffer.ag$a.getClass();
            jmjou.valueOf.unbindService(getbytebuffer);
        }
    }

    public final void ah$a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(com.dreampay.commons.constants.Constants.RESULT, false);
            jSONObject.put("phonepeResponded", false);
            values(jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
            values(null);
        }
    }

    @Override // o.handleException
    public void init(jmjou jmjouVar, jmjou.chmha chmhaVar) {
        this.ag$a = jmjouVar;
        this.valueOf = (String) chmhaVar.irjuc("request", null);
        this.values = (String) chmhaVar.irjuc("constraints", null);
        this.ah$a = (RequestCallback) chmhaVar.irjuc("callback", null);
        if (jmjouVar.toString(this.valueOf) != null) {
            try {
                String str = (String) jmjouVar.toString(this.valueOf);
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("timestamp")) {
                    if (System.currentTimeMillis() - jSONObject.getLong("timestamp") >= 300000) {
                        beginAsyncSectionFallback.ag$a("SDKtoAppConnection", "Sending Cached Response");
                        values(str);
                        return;
                    }
                    beginAsyncSectionFallback.ag$a("SDKtoAppConnection", "Cached Data expired fetching again.");
                }
            } catch (Exception e) {
                beginAsyncSectionFallback.valueOf("SDKtoAppConnection", e.getMessage(), e);
            }
        }
        Intent intent = new Intent();
        intent.setAction("com.phonepe.app.remote.service.MERCHANTSERVICE");
        intent.setComponent(new ComponentName(beginAsyncSectionFallback.ag$a(jmjouVar), "com.phonepe.app.external.sdksupport.MerchantService"));
        intent.addFlags(1);
        this.invoke = jmjou.valueOf.getPackageName();
        int i = 0;
        boolean z = false;
        while (i < 20) {
            i++;
            z = jmjou.valueOf.bindService(intent, this, 1);
            if (z) {
                break;
            }
        }
        if (!z) {
            ah$a();
        }
        beginAsyncSectionFallback.ag$a("SDKtoAppConnection", "initConnection: Result: " + z + " Count: " + i + " Thread: " + Thread.currentThread().getName());
    }

    @Override // o.handleException
    public boolean isCachingAllowed() {
        return false;
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        beginAsyncSectionFallback.ag$a("SDKtoAppConnection", "onBindingDied: " + componentName.flattenToString());
        if (this.HaptikSDK$b.getStatus() == AsyncTask.Status.PENDING) {
            ah$a();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.toString = ChangeClipBounds$ag$a.values(iBinder);
        if (this.HaptikSDK$b.getStatus() == AsyncTask.Status.PENDING) {
            this.HaptikSDK$b.execute(new Void[0]);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        beginAsyncSectionFallback.ag$a("SDKtoAppConnection", "onServiceDisconnected: " + componentName.flattenToString());
        if (this.HaptikSDK$b.getStatus() == AsyncTask.Status.PENDING) {
            ah$a();
        }
    }

    public final void values(String str) {
        synchronized (this) {
            if (this.ah$a != null) {
                beginAsyncSectionFallback.ag$a("SDKtoAppConnection", "Got Response");
                this.ah$a.onResponse(str);
                this.ah$a = null;
            }
        }
    }
}
