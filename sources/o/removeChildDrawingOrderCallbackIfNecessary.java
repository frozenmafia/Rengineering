package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class removeChildDrawingOrderCallbackIfNecessary {
    private static final postDispatchSwipe values = ag$a();
    private static final postDispatchSwipe valueOf = new scrollIfNecessary();

    removeChildDrawingOrderCallbackIfNecessary() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static postDispatchSwipe values() {
        return values;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static postDispatchSwipe valueOf() {
        return valueOf;
    }

    private static postDispatchSwipe ag$a() {
        try {
            return (postDispatchSwipe) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
