package o;
/* loaded from: classes5.dex */
public final class inflateTransitionManager {
    public static final inflateTransitionManager values = new inflateTransitionManager();

    private inflateTransitionManager() {
    }

    public final <T> TransitionManager<Object, T> values() {
        return new getRunningTransitions();
    }
}
