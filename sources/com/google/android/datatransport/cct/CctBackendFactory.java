package com.google.android.datatransport.cct;

import o.EditTextPreference;
import o.fillLayoutParams;
import o.getEditTextPreference;
import o.setOnBindEditTextListener;
/* loaded from: classes7.dex */
public class CctBackendFactory implements setOnBindEditTextListener {
    @Override // o.setOnBindEditTextListener
    public getEditTextPreference create(EditTextPreference.SavedState.AnonymousClass1 anonymousClass1) {
        return new fillLayoutParams(anonymousClass1.ag$a(), anonymousClass1.values(), anonymousClass1.ah$a());
    }
}
