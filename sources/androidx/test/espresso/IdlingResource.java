package androidx.test.espresso;
/* loaded from: classes6.dex */
public interface IdlingResource {

    /* loaded from: classes6.dex */
    public interface ResourceCallback {
        void onTransitionToIdle();
    }

    String getName();

    boolean isIdleNow();

    void registerIdleTransitionCallback(ResourceCallback resourceCallback);
}
