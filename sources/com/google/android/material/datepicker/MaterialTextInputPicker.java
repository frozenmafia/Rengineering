package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import o.addPreferencesFromResource;
import o.getCallbackFragment;
/* loaded from: classes7.dex */
public final class MaterialTextInputPicker<S> extends getCallbackFragment<S> {
    private CalendarConstraints ah$a;
    private DateSelector<S> toString;
    private int valueOf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> MaterialTextInputPicker<T> ag$a(DateSelector<T> dateSelector, int i, CalendarConstraints calendarConstraints) {
        MaterialTextInputPicker<T> materialTextInputPicker = new MaterialTextInputPicker<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        materialTextInputPicker.setArguments(bundle);
        return materialTextInputPicker;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.valueOf);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.toString);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.ah$a);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.valueOf = bundle.getInt("THEME_RES_ID_KEY");
        this.toString = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.ah$a = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.toString.ah$a(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.valueOf)), viewGroup, bundle, this.ah$a, new addPreferencesFromResource<S>() { // from class: com.google.android.material.datepicker.MaterialTextInputPicker.5
            @Override // o.addPreferencesFromResource
            public void values(S s) {
                Iterator<addPreferencesFromResource<S>> it = MaterialTextInputPicker.this.ag$a.iterator();
                while (it.hasNext()) {
                    it.next().values(s);
                }
            }
        });
    }
}
