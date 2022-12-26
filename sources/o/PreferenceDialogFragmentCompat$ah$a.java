package o;

import android.animation.TypeEvaluator;
import o.PreferenceDialogFragmentCompat;
import o.PreferenceFragmentCompat;
/* loaded from: classes7.dex */
public class PreferenceDialogFragmentCompat$ah$a implements TypeEvaluator<PreferenceDialogFragmentCompat.valueOf> {
    public static final TypeEvaluator<PreferenceDialogFragmentCompat.valueOf> valueOf = new PreferenceDialogFragmentCompat$ah$a();
    private final PreferenceDialogFragmentCompat.valueOf ag$a = new PreferenceDialogFragmentCompat.valueOf();

    @Override // android.animation.TypeEvaluator
    /* renamed from: ag$a */
    public PreferenceDialogFragmentCompat.valueOf evaluate(float f, PreferenceDialogFragmentCompat.valueOf valueof, PreferenceDialogFragmentCompat.valueOf valueof2) {
        this.ag$a.values(PreferenceFragmentCompat.AnonymousClass3.toString(valueof.values, valueof2.values, f), PreferenceFragmentCompat.AnonymousClass3.toString(valueof.toString, valueof2.toString, f), PreferenceFragmentCompat.AnonymousClass3.toString(valueof.ag$a, valueof2.ag$a, f));
        return this.ag$a;
    }
}
