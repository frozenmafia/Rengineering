package o;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.app.dream11.dream11.BaseActivity;
import com.app.dream11.model.ErrorModel;
import java.lang.annotation.Annotation;
/* loaded from: classes.dex */
public abstract class conditional extends Dialog {
    private View ag$a;
    private int ah$a;
    private BaseActivity toString;
    private attachCompleter valueOf;
    protected getStateDrawableIndex values;

    protected abstract void values(Bundle bundle);

    public conditional(BaseActivity baseActivity, int i) {
        super(baseActivity);
        this.valueOf = new attachCompleter();
        this.values = new getStateDrawableIndex(this);
        this.toString = baseActivity;
        this.ah$a = i;
    }

    @Override // android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HaptikSDK$a();
        values(ah$a());
        ag$a();
        values(bundle);
        HaptikSDK$c();
    }

    private void HaptikSDK$c() {
        Annotation[] annotations;
        String simpleName = getClass().getSimpleName();
        try {
            for (Annotation annotation : getClass().getAnnotations()) {
                if (annotation instanceof ResourcesCompat) {
                    simpleName = ((ResourcesCompat) annotation).valueOf();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.valueOf.ag$a(simpleName);
    }

    protected View ah$a() {
        View inflate = LayoutInflater.from(this.toString).inflate(com.app.dream11Pro.R.layout.res_0x7f0d0158, (ViewGroup) null);
        LayoutInflater.from(this.toString).inflate(this.ah$a, (ViewGroup) inflate.findViewById(com.app.dream11Pro.R.id.rootDialogLayout));
        return inflate;
    }

    public void values(View view) {
        this.ag$a = view;
        setContentView(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public View values() {
        return this.ag$a;
    }

    public BaseActivity valueOf() {
        return this.toString;
    }

    protected void HaptikSDK$a() {
        requestWindowFeature(1);
    }

    protected void ag$a() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.dimAmount = 0.9f;
        window.setAttributes(attributes);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }

    public void ah$a(View view, ErrorModel errorModel) {
        getOptionalIconsVisible.ah$a().values(view, errorModel);
    }

    public void ag$a(View view, String str, String str2) {
        ah$a(view, new ErrorModel("", str, str2));
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
