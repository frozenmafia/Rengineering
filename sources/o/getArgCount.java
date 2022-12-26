package o;

import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.reactnativegooglesignin.RNGoogleSigninModule;
/* loaded from: classes5.dex */
public class getArgCount {
    private String ah$a;
    private Promise toString;

    public void valueOf(Promise promise, String str) {
        Promise promise2 = this.toString;
        if (promise2 != null) {
            ah$a(promise2, str);
        }
        this.toString = promise;
        this.ah$a = str;
    }

    public void values(Object obj) {
        Promise promise = this.toString;
        if (promise == null) {
            Log.w(RNGoogleSigninModule.MODULE_NAME, "cannot resolve promise because it's null");
            return;
        }
        values();
        promise.resolve(obj);
    }

    public void toString(String str, Throwable th) {
        Promise promise = this.toString;
        if (promise == null) {
            Log.w(RNGoogleSigninModule.MODULE_NAME, "cannot reject promise because it's null");
            return;
        }
        values();
        promise.reject(str, th.getLocalizedMessage(), th);
    }

    public void valueOf(String str, String str2) {
        Promise promise = this.toString;
        if (promise == null) {
            Log.w(RNGoogleSigninModule.MODULE_NAME, "cannot reject promise because it's null");
            return;
        }
        values();
        promise.reject(str, str2);
    }

    public String ah$a() {
        return this.ah$a;
    }

    private void values() {
        this.toString = null;
        this.ah$a = null;
    }

    private void ah$a(Promise promise, String str) {
        promise.reject("ASYNC_OP_IN_PROGRESS", "Warning: previous promise did not settle and was overwritten. You've called \"" + str + "\" while \"" + ah$a() + "\" was already in progress and has not completed yet.");
    }
}
