package io.grpc;
/* loaded from: classes7.dex */
public abstract class Context$HaptikSDK$b {
    public abstract void ag$a(Context context, Context context2);

    public abstract Context ah$a();

    @Deprecated
    public void ag$a(Context context) {
        throw new UnsupportedOperationException("Deprecated. Do not call.");
    }

    public Context valueOf(Context context) {
        Context ah$a = ah$a();
        ag$a(context);
        return ah$a;
    }
}
