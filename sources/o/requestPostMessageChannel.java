package o;
/* loaded from: classes6.dex */
public final class requestPostMessageChannel {
    public static final boolean valueOf(Throwable th) {
        runAnimators.valueOf(th, "t");
        return ((th instanceof VirtualMachineError) || (th instanceof ThreadDeath) || (th instanceof InterruptedException) || (th instanceof LinkageError)) ? false : true;
    }

    public static final Throwable ag$a(Throwable th) {
        runAnimators.valueOf(th, "$this$nonFatalOrThrow");
        if (valueOf(th)) {
            return th;
        }
        throw th;
    }
}
