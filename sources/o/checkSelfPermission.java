package o;

import android.widget.TextView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
/* loaded from: classes3.dex */
public final class checkSelfPermission {
    @androidx.databinding.BindingAdapter({"specialPlayerHeaderText"})
    public static final void values(TextView textView, ArrayList<getExternalCacheDirs> arrayList) {
        runAnimators.ag$a(textView, Promotion.ACTION_VIEW);
        String str = "";
        if (arrayList != null) {
            int i = 0;
            for (Object obj : arrayList) {
                if (i < 0) {
                    reserveEndViewTransition.ag$a();
                }
                getExternalCacheDirs getexternalcachedirs = (getExternalCacheDirs) obj;
                str = ((Object) str) + onIsPermissionRevocationEnabledForAppResult.ah$a.toString(getexternalcachedirs) + textView.getContext().getString(com.app.dream11Pro.R.string.res_0x7f120bc5) + onIsPermissionRevocationEnabledForAppResult.ah$a.values(getexternalcachedirs.valueOf()) + textView.getContext().getString(com.app.dream11Pro.R.string.res_0x7f120bc4);
                if (i < arrayList.size() - 1) {
                    str = ((Object) str) + textView.getContext().getString(com.app.dream11Pro.R.string.res_0x7f120bc6);
                }
                i++;
            }
        }
        textView.setText(str);
    }
}
