package o;

import com.app.dream11.ui.CustomTextView;
/* loaded from: classes.dex */
public final class mask {
    public static final void toString(CustomTextView customTextView, double d) {
        String string;
        runAnimators.ag$a(customTextView, "<this>");
        string = customTextView.getContext().getResources().getString(com.app.dream11Pro.R.string.res_0x7f120b15);
        String loadfont = loadFont.toString(d);
        customTextView.setText(string + loadfont);
    }
}
