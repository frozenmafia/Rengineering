package o;

import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
/* loaded from: classes6.dex */
public abstract class saveBasicState extends burpActive$ag$a {
    private final NativeModuleCallExceptionHandler values;

    protected abstract void toString(long j);

    @Override // o.burpActive$ag$a
    public final void doFrame(long j) {
        try {
            toString(j);
        } catch (RuntimeException e) {
            this.values.handleException(e);
        }
    }
}
