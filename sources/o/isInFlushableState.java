package o;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import o.EmojiProcessor;
/* loaded from: classes4.dex */
public final class isInFlushableState implements androidx.viewbinding.ViewBinding {
    private final View HaptikSDK$a;
    public final ImageView ag$a;
    public final androidx.constraintlayout.widget.Group ah$a;
    public final TextView toString;
    public final View valueOf;
    public final Button values;

    private isInFlushableState(View view, View view2, Button button, androidx.constraintlayout.widget.Group group, ImageView imageView, TextView textView) {
        this.HaptikSDK$a = view;
        this.valueOf = view2;
        this.values = button;
        this.ah$a = group;
        this.ag$a = imageView;
        this.toString = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.HaptikSDK$a;
    }

    public static isInFlushableState ah$a(View view) {
        int i = EmojiProcessor.ProcessorSm.valueOf.backgroundView;
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            i = EmojiProcessor.ProcessorSm.valueOf.btnNbSubmit;
            Button button = (Button) view.findViewById(i);
            if (button != null) {
                i = EmojiProcessor.ProcessorSm.valueOf.groupNbPassword;
                androidx.constraintlayout.widget.Group group = (androidx.constraintlayout.widget.Group) view.findViewById(i);
                if (group != null) {
                    i = EmojiProcessor.ProcessorSm.valueOf.ivPasswordVisiblity;
                    ImageView imageView = (ImageView) view.findViewById(i);
                    if (imageView != null) {
                        i = EmojiProcessor.ProcessorSm.valueOf.tvNbPassword;
                        TextView textView = (TextView) view.findViewById(i);
                        if (textView != null) {
                            return new isInFlushableState(view, findViewById, button, group, imageView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
