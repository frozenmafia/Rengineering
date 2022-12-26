package o;
/* loaded from: classes3.dex */
public final class getCustomDataCount extends androidx.databinding.BaseObservable {
    private final MotionController ag$a;
    private String ah$a;
    private androidx.databinding.ObservableField<Boolean> toString;
    private String valueOf;
    private String values;

    public getCustomDataCount(MotionController motionController) {
        runAnimators.ag$a(motionController, "iStreamingQualityHandler");
        this.ag$a = motionController;
        this.valueOf = "";
        this.ah$a = "";
        this.values = "";
        this.toString = new androidx.databinding.ObservableField<>(false);
    }

    public final MotionController ah$a() {
        return this.ag$a;
    }

    public final String valueOf() {
        return this.valueOf;
    }

    public final void values(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.valueOf = str;
    }

    public final void valueOf(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.ah$a = str;
    }

    public final String values() {
        return this.ah$a;
    }

    public final String ag$a() {
        return this.values;
    }

    public final void ag$a(String str) {
        runAnimators.ag$a(str, "<set-?>");
        this.values = str;
    }

    public final androidx.databinding.ObservableField<Boolean> HaptikSDK$b() {
        return this.toString;
    }
}
