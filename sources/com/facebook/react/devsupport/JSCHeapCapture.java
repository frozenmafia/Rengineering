package com.facebook.react.devsupport;

import com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import o.FragmentStateManager;
@FragmentStateManager.AnonymousClass1(HaptikSDK$c = true, values = JSCHeapCapture.TAG)
/* loaded from: classes4.dex */
public class JSCHeapCapture extends NativeJSCHeapCaptureSpec {
    public static final String TAG = "JSCHeapCapture";
    private CaptureCallback mCaptureInProgress;

    /* loaded from: classes4.dex */
    public interface CaptureCallback {
        void onFailure(CaptureException captureException);

        void onSuccess(File file);
    }

    /* loaded from: classes6.dex */
    public interface HeapCapture extends JavaScriptModule {
        void captureHeap(String str);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    /* loaded from: classes6.dex */
    public static class CaptureException extends Exception {
        /* JADX INFO: Access modifiers changed from: package-private */
        public CaptureException(String str) {
            super(str);
        }

        CaptureException(String str, Throwable th) {
            super(str, th);
        }
    }

    public JSCHeapCapture(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mCaptureInProgress = null;
    }

    public void captureHeap(String str, CaptureCallback captureCallback) {
        synchronized (this) {
            if (this.mCaptureInProgress != null) {
                captureCallback.onFailure(new CaptureException("Heap capture already in progress."));
                return;
            }
            File file = new File(str + "/capture.json");
            file.delete();
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                HeapCapture heapCapture = (HeapCapture) reactApplicationContextIfActiveOrWarn.getJSModule(HeapCapture.class);
                if (heapCapture == null) {
                    captureCallback.onFailure(new CaptureException("Heap capture js module not registered."));
                } else {
                    this.mCaptureInProgress = captureCallback;
                    heapCapture.captureHeap(file.getPath());
                }
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec
    public void captureComplete(String str, String str2) {
        synchronized (this) {
            CaptureCallback captureCallback = this.mCaptureInProgress;
            if (captureCallback != null) {
                if (str2 == null) {
                    captureCallback.onSuccess(new File(str));
                } else {
                    captureCallback.onFailure(new CaptureException(str2));
                }
                this.mCaptureInProgress = null;
            }
        }
    }
}
