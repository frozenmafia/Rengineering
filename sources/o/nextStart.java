package o;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.app.dream11.dream11.BaseActivity;
import com.app.dream11.ui.CustomTextView;
import o.AnyRes;
/* loaded from: classes3.dex */
public final class nextStart extends conditional {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nextStart(BaseActivity baseActivity) {
        super(baseActivity, com.app.dream11Pro.R.layout.res_0x7f0d01ed);
        runAnimators.ag$a(baseActivity, "baseActivity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void valueOf(nextStart nextstart, View view) {
        runAnimators.ag$a(nextstart, "this$0");
        nextstart.dismiss();
    }

    @Override // o.conditional
    protected void values(Bundle bundle) {
        ((CustomTextView) findViewById(AnyRes.values.BtngotIt)).setOnClickListener(new View.OnClickListener() { // from class: o.getFloats
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nextStart.valueOf(nextStart.this, view);
            }
        });
    }

    @Override // o.conditional
    protected void ag$a() {
        Window window = getWindow();
        runAnimators.toString(window);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.7f;
        window.setAttributes(attributes);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }
}
