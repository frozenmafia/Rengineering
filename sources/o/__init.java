package o;
/* loaded from: classes7.dex */
public final class __init {
    public static void ah$a() {
        if (endMetadataList.valueOf()) {
            if ((Thread.currentThread() instanceof InterfaceC0360addId) || endMetadataList.ah$a()) {
                throw new IllegalStateException("Attempt to block on a Scheduler " + Thread.currentThread().getName() + " that doesn't support blocking operators as they may lead to deadlock");
            }
        }
    }
}
