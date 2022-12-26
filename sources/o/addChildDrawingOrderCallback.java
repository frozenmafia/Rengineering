package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class addChildDrawingOrderCallback {
    private static final checkHorizontalSwipe<?> valueOf = new setSpanIndexCacheEnabled();
    private static final checkHorizontalSwipe<?> ag$a = ag$a();

    addChildDrawingOrderCallback() {
    }

    private static checkHorizontalSwipe<?> ag$a() {
        try {
            return (checkHorizontalSwipe) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static checkHorizontalSwipe<?> valueOf() {
        return valueOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static checkHorizontalSwipe<?> values() {
        checkHorizontalSwipe<?> checkhorizontalswipe = ag$a;
        if (checkhorizontalswipe != null) {
            return checkhorizontalswipe;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
