package o;

import android.graphics.Rect;
import android.text.Spannable;
import android.text.method.TransformationMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.View;
import android.widget.TextView;
import com.app.dream11.ui.DreamUrlSpan;
/* loaded from: classes6.dex */
public class CamColor implements TransformationMethod {
    DreamUrlSpan.valueOf toString;
    boolean valueOf;

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public CamColor(DreamUrlSpan.valueOf valueof, boolean z) {
        this.toString = valueof;
        this.valueOf = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.text.Spannable] */
    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            Linkify.addLinks(textView, 15);
            if (textView.getText() != null && (textView.getText() instanceof Spannable)) {
                charSequence = (Spannable) textView.getText();
                URLSpan[] uRLSpanArr = (URLSpan[]) charSequence.getSpans(0, textView.length(), URLSpan.class);
                for (int length = uRLSpanArr.length - 1; length >= 0; length--) {
                    URLSpan uRLSpan = uRLSpanArr[length];
                    int spanStart = charSequence.getSpanStart(uRLSpan);
                    int spanEnd = charSequence.getSpanEnd(uRLSpan);
                    String url = uRLSpan.getURL();
                    charSequence.removeSpan(uRLSpan);
                    charSequence.setSpan(new DreamUrlSpan(url, textView, this.valueOf, this.toString), spanStart, spanEnd, 33);
                }
            }
        }
        return charSequence;
    }
}
