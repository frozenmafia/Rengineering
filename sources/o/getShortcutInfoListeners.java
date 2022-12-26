package o;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.app.dream11.ui.CustomTextView;
/* loaded from: classes3.dex */
public class getShortcutInfoListeners {
    CustomTextView ag$a;
    Dialog ah$a;
    ImageView toString;
    RelativeLayout valueOf;
    Context values;

    public getShortcutInfoListeners(Context context) {
        this.values = context;
        Dialog dialog = new Dialog(this.values);
        this.ah$a = dialog;
        dialog.requestWindowFeature(1);
        this.ah$a.setCanceledOnTouchOutside(false);
        this.ah$a.setContentView(com.app.dream11Pro.R.layout.res_0x7f0d01e9);
        this.toString = (ImageView) this.ah$a.findViewById(com.app.dream11Pro.R.id.res_0x7f0a0602);
        this.ag$a = (CustomTextView) this.ah$a.findViewById(com.app.dream11Pro.R.id.text);
        RelativeLayout relativeLayout = (RelativeLayout) this.ah$a.findViewById(com.app.dream11Pro.R.id.selection);
        this.valueOf = relativeLayout;
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: o.getShortcutInfoListeners.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    getShortcutInfoListeners.this.ag$a();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void valueOf(boolean z) {
        this.ah$a.setCanceledOnTouchOutside(z);
    }

    public void ag$a(String str) {
        if (str == null || "".equals(str)) {
            return;
        }
        this.ag$a.setText(str);
    }

    public void valueOf(int i) {
        this.toString.setBackgroundResource(i);
    }

    public void valueOf() {
        try {
            this.ah$a.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ag$a() {
        try {
            this.ah$a.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
