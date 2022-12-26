package o;

import android.view.View;
import android.widget.Button;
import com.google.android.material.checkbox.MaterialCheckBox;
import o.EmojiProcessor;
/* loaded from: classes4.dex */
public final class getFlushMetadata implements androidx.viewbinding.ViewBinding {
    public final MaterialCheckBox ag$a;
    public final androidx.constraintlayout.widget.Group ah$a;
    public final Button toString;
    public final View valueOf;
    private final View values;

    private getFlushMetadata(View view, View view2, Button button, MaterialCheckBox materialCheckBox, androidx.constraintlayout.widget.Group group) {
        this.values = view;
        this.valueOf = view2;
        this.toString = button;
        this.ag$a = materialCheckBox;
        this.ah$a = group;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.values;
    }

    public static getFlushMetadata toString(View view) {
        int i = EmojiProcessor.ProcessorSm.valueOf.backgroundView;
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            i = EmojiProcessor.ProcessorSm.valueOf.btnNext;
            Button button = (Button) view.findViewById(i);
            if (button != null) {
                i = EmojiProcessor.ProcessorSm.valueOf.cbRememberUserId;
                MaterialCheckBox materialCheckBox = (MaterialCheckBox) view.findViewById(i);
                if (materialCheckBox != null) {
                    i = EmojiProcessor.ProcessorSm.valueOf.groupNbUsername;
                    androidx.constraintlayout.widget.Group group = (androidx.constraintlayout.widget.Group) view.findViewById(i);
                    if (group != null) {
                        return new getFlushMetadata(view, findViewById, button, materialCheckBox, group);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
