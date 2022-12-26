package o;
/* loaded from: classes4.dex */
public interface dumpLoaders<INFO> {
    void onFailure(String str, Throwable th);

    void onFinalImageSet(String str, INFO info, android.graphics.drawable.Animatable animatable);

    void onIntermediateImageFailed(String str, Throwable th);

    void onIntermediateImageSet(String str, INFO info);

    void onRelease(String str);

    void onSubmit(String str, Object obj);
}
