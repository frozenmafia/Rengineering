package o;
/* loaded from: classes3.dex */
public final class buildLegacyExtrasBundle {
    private final androidx.databinding.ObservableField<Boolean> ag$a;
    private final String ah$a;
    private final androidx.databinding.ObservableField<Boolean> toString;
    private final buildLegacyExtrasBundle$ag$a valueOf;

    public buildLegacyExtrasBundle(String str, androidx.databinding.ObservableField<Boolean> observableField, androidx.databinding.ObservableField<Boolean> observableField2, buildLegacyExtrasBundle$ag$a buildlegacyextrasbundle_ag_a) {
        runAnimators.ag$a(str, "buttonLabel");
        runAnimators.ag$a(observableField, "isBtnEnabled");
        runAnimators.ag$a(observableField2, "isLoading");
        runAnimators.ag$a(buildlegacyextrasbundle_ag_a, "uihandler");
        this.ah$a = str;
        this.ag$a = observableField;
        this.toString = observableField2;
        this.valueOf = buildlegacyextrasbundle_ag_a;
    }

    public final androidx.databinding.ObservableField<Boolean> ag$a() {
        return this.ag$a;
    }

    public final buildLegacyExtrasBundle$ag$a ah$a() {
        return this.valueOf;
    }

    public final androidx.databinding.ObservableField<Boolean> valueOf() {
        return this.toString;
    }

    public final String values() {
        return this.ah$a;
    }
}
