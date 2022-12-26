package com.app.dream11.ui;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
/* loaded from: classes3.dex */
public class PreFixEditText extends AppCompatEditText {
    private String ag$a;
    private String ah$a;

    public PreFixEditText(Context context) {
        super(context);
        this.ag$a = getText().toString().trim();
        valueOf();
    }

    public PreFixEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ag$a = getText().toString().trim();
        valueOf();
    }

    public PreFixEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.ag$a = getText().toString().trim();
        valueOf();
    }

    public void setPrefix(String str) {
        this.ag$a = str.trim();
        setText(str);
    }

    private void valueOf() {
        addTextChangedListener(new TextWatcher() { // from class: com.app.dream11.ui.PreFixEditText.3
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                PreFixEditText.this.ah$a = charSequence.toString().replace(PreFixEditText.this.ag$a, "");
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                String charSequence2 = charSequence.toString();
                int length = PreFixEditText.this.ag$a.length();
                if (charSequence2.length() < length) {
                    String str = PreFixEditText.this.ag$a;
                    PreFixEditText.this.setText(str);
                    PreFixEditText.this.setSelection(str.length());
                } else if (charSequence2.substring(0, length).equals(PreFixEditText.this.ag$a)) {
                } else {
                    PreFixEditText preFixEditText = PreFixEditText.this;
                    if (charSequence2.matches(preFixEditText.values(preFixEditText.ag$a))) {
                        String str2 = PreFixEditText.this.ag$a + charSequence2.replace(PreFixEditText.this.ag$a, "");
                        PreFixEditText.this.setText(str2);
                        PreFixEditText.this.setSelection(str2.length());
                        return;
                    }
                    String str3 = PreFixEditText.this.ag$a + PreFixEditText.this.ah$a;
                    PreFixEditText.this.setText(str3);
                    PreFixEditText.this.setSelection(str3.length());
                }
            }
        });
    }

    public String ah$a() {
        return super.getText().toString().replace(this.ag$a, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String values(String str) {
        return str.replace("+", "\\+").replace("$", "\\$").replace("^", "\\^").replace("*", "\\*").replace("?", "\\?");
    }
}
