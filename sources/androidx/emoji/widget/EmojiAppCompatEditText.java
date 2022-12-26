package androidx.emoji.widget;

import android.content.Context;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.R;
import androidx.appcompat.widget.AppCompatEditText;
/* loaded from: classes6.dex */
public class EmojiAppCompatEditText extends AppCompatEditText {
    private EmojiEditTextHelper mEmojiEditTextHelper;
    private boolean mInitialized;

    public EmojiAppCompatEditText(Context context) {
        super(context);
        init(null, 0);
    }

    public EmojiAppCompatEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, R.attr.editTextStyle);
    }

    public EmojiAppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i);
    }

    private void init(AttributeSet attributeSet, int i) {
        if (this.mInitialized) {
            return;
        }
        this.mInitialized = true;
        setMaxEmojiCount(new EditTextAttributeHelper(this, attributeSet, i, 0).getMaxEmojiCount());
        setKeyListener(super.getKeyListener());
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        if (keyListener != null) {
            keyListener = getEmojiEditTextHelper().getKeyListener(keyListener);
        }
        super.setKeyListener(keyListener);
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
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
}
