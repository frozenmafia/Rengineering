package com.facebook.react.views.textinput;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.Iterator;
/* loaded from: classes4.dex */
class ReactEditText$ah$a implements TextWatcher {
    final /* synthetic */ ReactEditText toString;

    private ReactEditText$ah$a(ReactEditText reactEditText) {
        this.toString = reactEditText;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.toString.toString || this.toString.values || ReactEditText.ag$a(this.toString) == null) {
            return;
        }
        Iterator it = ReactEditText.ag$a(this.toString).iterator();
        while (it.hasNext()) {
            ((TextWatcher) it.next()).beforeTextChanged(charSequence, i, i2, i3);
        }
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (!this.toString.toString) {
            if (!this.toString.values && ReactEditText.ag$a(this.toString) != null) {
                Iterator it = ReactEditText.ag$a(this.toString).iterator();
                while (it.hasNext()) {
                    ((TextWatcher) it.next()).onTextChanged(charSequence, i, i2, i3);
                }
            }
            ReactEditText reactEditText = this.toString;
            ReactEditText.ag$a(reactEditText, !reactEditText.values && !this.toString.ah$a && i == 0 && i2 == 0);
        }
        ReactEditText.valueOf(this.toString);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (this.toString.toString || this.toString.values || ReactEditText.ag$a(this.toString) == null) {
            return;
        }
        Iterator it = ReactEditText.ag$a(this.toString).iterator();
        while (it.hasNext()) {
            ((TextWatcher) it.next()).afterTextChanged(editable);
        }
    }
}
