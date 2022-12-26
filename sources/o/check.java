package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.dreampay.webview.DreamPayWebView;
import o.EmojiProcessor;
/* loaded from: classes4.dex */
public final class check implements androidx.viewbinding.ViewBinding {
    public final DreamPayWebView toString;
    public final ProgressBar valueOf;
    private final androidx.constraintlayout.widget.ConstraintLayout values;

    private check(androidx.constraintlayout.widget.ConstraintLayout constraintLayout, ProgressBar progressBar, DreamPayWebView dreamPayWebView) {
        this.values = constraintLayout;
        this.valueOf = progressBar;
        this.toString = dreamPayWebView;
    }

    @Override // androidx.viewbinding.ViewBinding
    /* renamed from: ag$a */
    public androidx.constraintlayout.widget.ConstraintLayout getRoot() {
        return this.values;
    }

    public static check values(LayoutInflater layoutInflater) {
        return toString(layoutInflater, null, false);
    }

    public static check toString(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(EmojiProcessor.ProcessorSm.values.activity_base_web_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return ag$a(inflate);
    }

    public static check ag$a(View view) {
        int i = EmojiProcessor.ProcessorSm.valueOf.progressBar;
        ProgressBar progressBar = (ProgressBar) view.findViewById(i);
        if (progressBar != null) {
            i = EmojiProcessor.ProcessorSm.valueOf.webView;
            DreamPayWebView dreamPayWebView = (DreamPayWebView) view.findViewById(i);
            if (dreamPayWebView != null) {
                return new check((androidx.constraintlayout.widget.ConstraintLayout) view, progressBar, dreamPayWebView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
