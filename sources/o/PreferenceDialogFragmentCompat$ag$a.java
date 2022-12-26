package o;

import android.util.Property;
import o.PreferenceDialogFragmentCompat;
/* loaded from: classes7.dex */
public class PreferenceDialogFragmentCompat$ag$a extends Property<PreferenceDialogFragmentCompat, PreferenceDialogFragmentCompat.valueOf> {
    public static final Property<PreferenceDialogFragmentCompat, PreferenceDialogFragmentCompat.valueOf> ag$a = new PreferenceDialogFragmentCompat$ag$a("circularReveal");

    private PreferenceDialogFragmentCompat$ag$a(String str) {
        super(PreferenceDialogFragmentCompat.valueOf.class, str);
    }

    @Override // android.util.Property
    /* renamed from: ah$a */
    public PreferenceDialogFragmentCompat.valueOf get(PreferenceDialogFragmentCompat preferenceDialogFragmentCompat) {
        return preferenceDialogFragmentCompat.ah$b();
    }

    @Override // android.util.Property
    /* renamed from: ag$a */
    public void set(PreferenceDialogFragmentCompat preferenceDialogFragmentCompat, PreferenceDialogFragmentCompat.valueOf valueof) {
        preferenceDialogFragmentCompat.setRevealInfo(valueof);
    }
}
