package o;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.ChipTextInputComboView;
import com.google.android.material.timepicker.TimeModel;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public class onCreateItem implements TextView.OnEditorActionListener, View.OnKeyListener {
    private boolean ag$a = false;
    private final ChipTextInputComboView ah$a;
    private final TimeModel toString;
    private final ChipTextInputComboView values;

    /* JADX INFO: Access modifiers changed from: package-private */
    public onCreateItem(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.values = chipTextInputComboView;
        this.ah$a = chipTextInputComboView2;
        this.toString = timeModel;
    }

    public void values() {
        TextInputLayout values = this.values.values();
        TextInputLayout values2 = this.ah$a.values();
        EditText invoke = values.invoke();
        EditText invoke2 = values2.invoke();
        invoke.setImeOptions(268435461);
        invoke2.setImeOptions(268435462);
        invoke.setOnEditorActionListener(this);
        invoke.setOnKeyListener(this);
        invoke2.setOnKeyListener(this);
    }

    private void ag$a(int i) {
        this.ah$a.setChecked(i == 12);
        this.values.setChecked(i == 10);
        this.toString.ag$a = i;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z) {
            ag$a(12);
        }
        return z;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean values;
        if (this.ag$a) {
            return false;
        }
        this.ag$a = true;
        EditText editText = (EditText) view;
        if (this.toString.ag$a == 12) {
            values = ag$a(i, keyEvent, editText);
        } else {
            values = values(i, keyEvent, editText);
        }
        this.ag$a = false;
        return values;
    }

    private boolean ag$a(int i, KeyEvent keyEvent, EditText editText) {
        if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            ag$a(10);
            return true;
        }
        return false;
    }

    private boolean values(int i, KeyEvent keyEvent, EditText editText) {
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
            ag$a(12);
            return true;
        }
        return false;
    }
}
