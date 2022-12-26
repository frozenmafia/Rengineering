package androidx.emoji.widget;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
/* loaded from: classes6.dex */
public class EmojiAppCompatButton extends AppCompatButton {
    private EmojiTextViewHelper mEmojiTextViewHelper;
    private boolean mInitialized;

    public EmojiAppCompatButton(Context context) {
        super(context);
        init();
    }

    public EmojiAppCompatButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public EmojiAppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }

    private void init() {
        if (this.mInitialized) {
            return;
        }
        this.mInitialized = true;
        getEmojiTextViewHelper().updateTransformationMethod();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().getFilters(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().setAllCaps(z);
    }

    private EmojiTextViewHelper getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new EmojiTextViewHelper(this);
        }
        return this.mEmojiTextViewHelper;
    }
}
