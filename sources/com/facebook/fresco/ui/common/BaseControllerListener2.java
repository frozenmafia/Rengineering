package com.facebook.fresco.ui.common;

import com.facebook.fresco.ui.common.ControllerListener2;
/* loaded from: classes4.dex */
public class BaseControllerListener2<INFO> implements ControllerListener2<INFO> {
    private static final ControllerListener2 NO_OP_LISTENER = new BaseControllerListener2();

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onFailure(String str, Throwable th, ControllerListener2.Extras extras) {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onFinalImageSet(String str, INFO info, ControllerListener2.Extras extras) {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onIntermediateImageFailed(String str) {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onIntermediateImageSet(String str, INFO info) {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onRelease(String str, ControllerListener2.Extras extras) {
    }

    @Override // com.facebook.fresco.ui.common.ControllerListener2
    public void onSubmit(String str, Object obj, ControllerListener2.Extras extras) {
    }

    public static <I> ControllerListener2<I> getNoOpListener() {
        return NO_OP_LISTENER;
    }
}
