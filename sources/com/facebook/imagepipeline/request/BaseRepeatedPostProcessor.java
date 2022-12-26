package com.facebook.imagepipeline.request;
/* loaded from: classes6.dex */
public abstract class BaseRepeatedPostProcessor extends BasePostprocessor implements RepeatedPostprocessor {
    private RepeatedPostprocessorRunner mCallback;

    @Override // com.facebook.imagepipeline.request.RepeatedPostprocessor
    public void setCallback(RepeatedPostprocessorRunner repeatedPostprocessorRunner) {
        synchronized (this) {
            this.mCallback = repeatedPostprocessorRunner;
        }
    }

    private RepeatedPostprocessorRunner getCallback() {
        RepeatedPostprocessorRunner repeatedPostprocessorRunner;
        synchronized (this) {
            repeatedPostprocessorRunner = this.mCallback;
        }
        return repeatedPostprocessorRunner;
    }

    public void update() {
        RepeatedPostprocessorRunner callback = getCallback();
        if (callback != null) {
            callback.update();
        }
    }
}
