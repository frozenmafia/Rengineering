package o;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import com.google.android.apps.nbu.paisa.inapp.aidl.IsReadyToPayRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import o.MultiDexExtractor;
import o.findCentralDirectory;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
/* loaded from: classes4.dex */
public final class PercentFrameLayout {
    private computeCrcOfCentralDir valueOf;

    /* loaded from: classes4.dex */
    public final class LayoutParams {

        /* loaded from: classes4.dex */
        public static final class toString {
            public static final int google_pay_inapp_api_config = 2131820550;
        }
    }

    public Task<Boolean> toString(Context context, String str) throws NoSuchAlgorithmException {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (!valueOf(context, 2)) {
            taskCompletionSource.setResult(false);
            return taskCompletionSource.getTask();
        }
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent("com.google.android.apps.nbu.paisa.user.inapp.sdk.service.IS_READY_TO_PAY");
        intent.setPackage(this.valueOf.ah$a());
        try {
            if (!applicationContext.bindService(intent, new toString(taskCompletionSource, str, applicationContext), 1)) {
                Log.w("GooglePayInApp", "Unable to bind isReadyToPay");
                taskCompletionSource.setResult(false);
            }
            return taskCompletionSource.getTask();
        } catch (SecurityException e) {
            Log.e("GooglePayInApp", "SecurityException in bindService", e);
            throw e;
        }
    }

    public void toString(Activity activity, String str, int i) throws NoSuchAlgorithmException {
        Context applicationContext = activity.getApplicationContext();
        if (!valueOf(applicationContext, 2)) {
            activity.startActivity(ag$a(applicationContext));
            return;
        }
        try {
            activity.startActivityForResult(ah$a(applicationContext, str), i);
        } catch (ActivityNotFoundException unused) {
            activity.startActivity(ag$a(applicationContext));
        }
    }

    public boolean valueOf(Context context, int i) throws NoSuchAlgorithmException {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(toString(context).ah$a(), 64);
            if ((i & 2) == 2) {
                long valueOf = toString(context).valueOf();
                if (Log.isLoggable("GooglePayInApp", 4)) {
                    Log.i("GooglePayInApp", String.format("Google Pay package version: %d [minimum: %d]", Integer.valueOf(packageInfo.versionCode), Long.valueOf(valueOf)));
                }
                if (packageInfo.versionCode < valueOf) {
                    return false;
                }
            }
            if (packageInfo.signatures.length != 1) {
                return false;
            }
            byte[] digest = MessageDigest.getInstance(MessageDigestAlgorithms.SHA_256).digest(packageInfo.signatures[0].toByteArray());
            byte[] ag$a = toString(context).ag$a();
            if (Log.isLoggable("GooglePayInApp", 4)) {
                Log.i("GooglePayInApp", String.format("Google Pay signature: %s [expected: %s]", Base64.encodeToString(digest, 2), Base64.encodeToString(ag$a, 2)));
            }
            return Arrays.equals(digest, ag$a);
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private computeCrcOfCentralDir toString(Context context) {
        if (this.valueOf == null) {
            this.valueOf = new computeCrcOfCentralDir(context, LayoutParams.toString.google_pay_inapp_api_config);
        }
        return this.valueOf;
    }

    private Intent ah$a(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("paymentDataRequestJson", str);
        Intent intent = new Intent("com.google.android.apps.nbu.paisa.user.LOAD_PAYMENT_DATA");
        intent.setPackage(toString(context).ah$a());
        intent.putExtras(bundle);
        return intent;
    }

    private Intent ag$a(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(String.format("market://details?id=%s", toString(context).ah$a())));
        return intent;
    }

    /* loaded from: classes4.dex */
    static final class toString implements ServiceConnection {
        findCentralDirectory ag$a;
        private final TaskCompletionSource<Boolean> ah$a;
        private final String toString;
        private final Context valueOf;
        private Boolean values = true;

        toString(TaskCompletionSource<Boolean> taskCompletionSource, String str, Context context) {
            this.ah$a = taskCompletionSource;
            this.toString = str;
            this.valueOf = context.getApplicationContext();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            MultiDexExtractor.ExtractedDex.toString tostring = new MultiDexExtractor.ExtractedDex.toString() { // from class: o.PercentFrameLayout.toString.4
                @Override // o.MultiDexExtractor.ExtractedDex
                public void toString(boolean z) throws RemoteException {
                    toString.this.ah$a.setResult(Boolean.valueOf(z));
                    toString.this.values();
                }
            };
            findCentralDirectory ah$a = findCentralDirectory.values.ah$a(iBinder);
            this.ag$a = ah$a;
            try {
                ah$a.values(new IsReadyToPayRequest(this.toString), tostring);
            } catch (RemoteException e) {
                Log.e("GooglePayInApp", "Exception in isReadyToPay", e);
                throw new RuntimeException("isReadyToPay error: ", e);
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            values();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void values() {
            synchronized (this) {
                if (this.values.booleanValue()) {
                    this.values = false;
                    this.valueOf.unbindService(this);
                }
            }
        }
    }
}
