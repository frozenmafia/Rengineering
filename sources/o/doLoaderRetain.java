package o;
/* loaded from: classes4.dex */
public class doLoaderRetain<INFO> implements dumpLoaders<INFO> {
    private static final dumpLoaders<Object> NO_OP_LISTENER = new doLoaderRetain();

    @Override // o.dumpLoaders
    public void onFailure(String str, Throwable th) {
    }

    @Override // o.dumpLoaders
    public void onFinalImageSet(String str, INFO info, android.graphics.drawable.Animatable animatable) {
    }

    @Override // o.dumpLoaders
    public void onIntermediateImageFailed(String str, Throwable th) {
    }

    @Override // o.dumpLoaders
    public void onIntermediateImageSet(String str, INFO info) {
    }

    @Override // o.dumpLoaders
    public void onRelease(String str) {
    }

    @Override // o.dumpLoaders
    public void onSubmit(String str, Object obj) {
    }

    public static <INFO> dumpLoaders<INFO> getNoOpListener() {
        return (dumpLoaders<INFO>) NO_OP_LISTENER;
    }
}
