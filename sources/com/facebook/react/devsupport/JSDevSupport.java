package com.facebook.react.devsupport;

import android.view.View;
import com.facebook.fbreact.specs.NativeJSDevSupportSpec;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import java.util.HashMap;
import java.util.Map;
import o.FragmentStateManager;
@FragmentStateManager.AnonymousClass1(values = JSDevSupport.MODULE_NAME)
/* loaded from: classes6.dex */
public class JSDevSupport extends NativeJSDevSupportSpec {
    public static final int ERROR_CODE_EXCEPTION = 0;
    public static final int ERROR_CODE_VIEW_NOT_FOUND = 1;
    public static final String MODULE_NAME = "JSDevSupport";
    private volatile DevSupportCallback mCurrentCallback;

    /* loaded from: classes6.dex */
    public interface DevSupportCallback {
        void onFailure(int i, Exception exc);

        void onSuccess(String str);
    }

    /* loaded from: classes6.dex */
    public interface JSDevSupportModule extends JavaScriptModule {
        void getJSHierarchy(int i);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public JSDevSupport(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mCurrentCallback = null;
    }

    public void computeDeepestJSHierarchy(View view, DevSupportCallback devSupportCallback) {
        synchronized (this) {
            getJSHierarchy(Integer.valueOf(((View) ViewHierarchyUtil.getDeepestLeaf(view).first).getId()).intValue(), devSupportCallback);
        }
    }

    public void getJSHierarchy(int i, DevSupportCallback devSupportCallback) {
        synchronized (this) {
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            JSDevSupportModule jSDevSupportModule = reactApplicationContextIfActiveOrWarn != null ? (JSDevSupportModule) reactApplicationContextIfActiveOrWarn.getJSModule(JSDevSupportModule.class) : null;
            if (jSDevSupportModule == null) {
                devSupportCallback.onFailure(0, new JSCHeapCapture.CaptureException("JSDevSupport module not registered."));
                return;
            }
            this.mCurrentCallback = devSupportCallback;
            jSDevSupportModule.getJSHierarchy(i);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeJSDevSupportSpec
    public void onSuccess(String str) {
        synchronized (this) {
            if (this.mCurrentCallback != null) {
                this.mCurrentCallback.onSuccess(str);
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeJSDevSupportSpec
    public void onFailure(double d, String str) {
        synchronized (this) {
            int i = (int) d;
            if (this.mCurrentCallback != null) {
                this.mCurrentCallback.onFailure(i, new RuntimeException(str));
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeJSDevSupportSpec
    public Map<String, Object> getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("ERROR_CODE_EXCEPTION", 0);
        hashMap.put("ERROR_CODE_VIEW_NOT_FOUND", 1);
        return hashMap;
    }
}
