package o;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.textinput.ReactEditText;
/* loaded from: classes4.dex */
public class setListShown extends InputConnectionWrapper {
    private boolean ag$a;
    private EventDispatcher toString;
    private String valueOf;
    private ReactEditText values;

    public setListShown(InputConnection inputConnection, ReactContext reactContext, ReactEditText reactEditText, EventDispatcher eventDispatcher) {
        super(inputConnection, false);
        this.valueOf = null;
        this.toString = eventDispatcher;
        this.values = reactEditText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.ag$a = true;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        this.ag$a = false;
        String str = this.valueOf;
        if (str != null) {
            values(str);
            this.valueOf = null;
        }
        return super.endBatchEdit();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i) {
        int selectionStart = this.values.getSelectionStart();
        int selectionEnd = this.values.getSelectionEnd();
        boolean composingText = super.setComposingText(charSequence, i);
        int selectionStart2 = this.values.getSelectionStart();
        boolean z = false;
        ag$a((((selectionStart2 < selectionStart || selectionStart2 <= 0) ? true : true) || (!(selectionStart == selectionEnd) && (selectionStart2 == selectionStart))) ? "Backspace" : String.valueOf(this.values.getText().charAt(selectionStart2 - 1)));
        return composingText;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.length() <= 2) {
            if (charSequence2.equals("")) {
                charSequence2 = "Backspace";
            }
            ag$a(charSequence2);
        }
        return super.commitText(charSequence, i);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i, int i2) {
        values("Backspace");
        return super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            boolean z = keyEvent.getUnicodeChar() < 58 && keyEvent.getUnicodeChar() > 47;
            if (keyEvent.getKeyCode() == 67) {
                values("Backspace");
            } else if (keyEvent.getKeyCode() == 66) {
                values("Enter");
            } else if (z) {
                values(String.valueOf(keyEvent.getNumber()));
            }
        }
        return super.sendKeyEvent(keyEvent);
    }

    private void ag$a(String str) {
        if (this.ag$a) {
            this.valueOf = str;
        } else {
            values(str);
        }
    }

    private void values(String str) {
        if (str.equals("\n")) {
            str = "Enter";
        }
        this.toString.dispatchEvent(new updateFinalState(this.values.getId(), str));
    }
}
