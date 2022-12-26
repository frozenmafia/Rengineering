package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class EditTextPreferenceDialogFragmentCompat$ah$a {
    private ListPreference ag$a = null;
    private List<initLayout> values = new ArrayList();
    private scheduleShowSoftInput ah$a = null;
    private String toString = "";

    public EditTextPreferenceDialogFragmentCompat values() {
        return new EditTextPreferenceDialogFragmentCompat(this.ag$a, Collections.unmodifiableList(this.values), this.ah$a, this.toString);
    }

    public EditTextPreferenceDialogFragmentCompat$ah$a toString(ListPreference listPreference) {
        this.ag$a = listPreference;
        return this;
    }

    public EditTextPreferenceDialogFragmentCompat$ah$a values(initLayout initlayout) {
        this.values.add(initlayout);
        return this;
    }

    public EditTextPreferenceDialogFragmentCompat$ah$a toString(scheduleShowSoftInput scheduleshowsoftinput) {
        this.ah$a = scheduleshowsoftinput;
        return this;
    }

    public EditTextPreferenceDialogFragmentCompat$ah$a ah$a(String str) {
        this.toString = str;
        return this;
    }
}
