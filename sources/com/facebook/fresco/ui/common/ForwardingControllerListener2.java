package com.facebook.fresco.ui.common;

import android.util.Log;
import com.facebook.fresco.ui.common.ControllerListener2;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes4.dex */
public class ForwardingControllerListener2<I> extends BaseControllerListener2<I> {
    private static final String TAG = "FwdControllerListener2";
    private final List<ControllerListener2<I>> mListeners = new ArrayList(2);

    public void addListener(ControllerListener2<I> controllerListener2) {
        synchronized (this) {
            this.mListeners.add(controllerListener2);
        }
    }

    public void removeListener(ControllerListener2<I> controllerListener2) {
        synchronized (this) {
            int indexOf = this.mListeners.indexOf(controllerListener2);
            if (indexOf != -1) {
                this.mListeners.remove(indexOf);
            }
        }
    }

    public void removeAllListeners() {
        synchronized (this) {
            this.mListeners.clear();
        }
    }

    private void onException(String str, Throwable th) {
        synchronized (this) {
            Log.e(TAG, str, th);
        }
    }

    @Override // com.facebook.fresco.ui.common.BaseControllerListener2, com.facebook.fresco.ui.common.ControllerListener2
    public void onSubmit(String str, Object obj, ControllerListener2.Extras extras) {
        int size = this.mListeners.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener2<I> controllerListener2 = this.mListeners.get(i);
                if (controllerListener2 != null) {
                    controllerListener2.onSubmit(str, obj, extras);
                }
            } catch (Exception e) {
                onException("ForwardingControllerListener2 exception in onSubmit", e);
            }
        }
    }

    @Override // com.facebook.fresco.ui.common.BaseControllerListener2, com.facebook.fresco.ui.common.ControllerListener2
    public void onFinalImageSet(String str, I i, ControllerListener2.Extras extras) {
        int size = this.mListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ControllerListener2<I> controllerListener2 = this.mListeners.get(i2);
                if (controllerListener2 != null) {
                    controllerListener2.onFinalImageSet(str, i, extras);
                }
            } catch (Exception e) {
                onException("ForwardingControllerListener2 exception in onFinalImageSet", e);
            }
        }
    }

    @Override // com.facebook.fresco.ui.common.BaseControllerListener2, com.facebook.fresco.ui.common.ControllerListener2
    public void onFailure(String str, Throwable th, ControllerListener2.Extras extras) {
        int size = this.mListeners.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener2<I> controllerListener2 = this.mListeners.get(i);
                if (controllerListener2 != null) {
                    controllerListener2.onFailure(str, th, extras);
                }
            } catch (Exception e) {
                onException("ForwardingControllerListener2 exception in onFailure", e);
            }
        }
    }

    @Override // com.facebook.fresco.ui.common.BaseControllerListener2, com.facebook.fresco.ui.common.ControllerListener2
    public void onRelease(String str, ControllerListener2.Extras extras) {
        int size = this.mListeners.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener2<I> controllerListener2 = this.mListeners.get(i);
                if (controllerListener2 != null) {
                    controllerListener2.onRelease(str, extras);
                }
            } catch (Exception e) {
                onException("ForwardingControllerListener2 exception in onRelease", e);
            }
        }
    }
}
