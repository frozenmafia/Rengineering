package androidx.emoji.widget;

import android.content.Context;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.core.widget.TextViewCompat;
/* loaded from: classes6.dex */
public class EmojiEditText extends EditText {
    private EmojiEditTextHelper mEmojiEditTextHelper;
    private boolean mInitialized;

    public EmojiEditText(Context context) {
        super(context);
        init(null, 0, 0);
    }

    public EmojiEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, 16842862, 0);
    }

    public EmojiEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i, 0);
    }

    public EmojiEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(attributeSet, i, i2);
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        if (this.mInitialized) {
            return;
        }
        this.mInitialized = true;
        setMaxEmojiCount(new EditTextAttributeHelper(this, attributeSet, i, i2).getMaxEmojiCount());
        setKeyListener(super.getKeyListener());
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            keyListener = getEmojiEditTextHelper().getKeyListener(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return getEmojiEditTextHelper().onCreateInputConnection(super.onCreateInputConnection(editorInfo), editorInfo);
    }

    public void setMaxEmojiCount(int i) {
        getEmojiEditTextHelper().setMaxEmojiCount(i);
    }

    public int getMaxEmojiCount() {
        return getEmojiEditTextHelper().getMaxEmojiCount();
    }

    private EmojiEditTextHelper getEmojiEditTextHelper() {
        if (this.mEmojiEditTextHelper == null) {
            this.mEmojiEditTextHelper = new EmojiEditTextHelper(this);
        }
        return this.mEmojiEditTextHelper;
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }
}
