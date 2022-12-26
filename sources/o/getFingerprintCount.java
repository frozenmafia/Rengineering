package o;

import android.view.View;
import com.app.dream11.dream11.BaseActivity;
import com.app.dream11.model.ErrorModel;
import com.app.dream11.ui.CommonDialog;
/* loaded from: classes3.dex */
public class getFingerprintCount {
    public static boolean toString = false;

    public static boolean values(ErrorModel errorModel) {
        if (errorModel == null || errorModel.getError() == null) {
            return false;
        }
        return "MG351".equalsIgnoreCase(errorModel.getError().getMsgCode()) || "MG352".equalsIgnoreCase(errorModel.getError().getMsgCode());
    }

    public static void ag$a(final BaseActivity baseActivity, ErrorModel errorModel) {
        if (errorModel == null || errorModel.getError() == null) {
            return;
        }
        final CommonDialog commonDialog = new CommonDialog(baseActivity);
        commonDialog.toString(errorModel.getError().getMsgTitle());
        commonDialog.ag$a(errorModel.getError().getMsgText());
        commonDialog.valueOf(errorModel.getError().getMsgActionTitle());
        commonDialog.valueOf(new CommonDialog.toString() { // from class: o.compare
            @Override // com.app.dream11.ui.CommonDialog.toString
            public final void values(View view) {
                getFingerprintCount.values(BaseActivity.this, commonDialog, view);
            }
        });
        commonDialog.show();
    }

    public static /* synthetic */ void values(BaseActivity baseActivity, CommonDialog commonDialog, View view) {
        if (baseActivity != null) {
            loadFont.valueOf(baseActivity, baseActivity.getString(com.app.dream11Pro.R.string.res_0x7f1205cc), "contactus/");
        }
        commonDialog.dismiss();
    }
}
