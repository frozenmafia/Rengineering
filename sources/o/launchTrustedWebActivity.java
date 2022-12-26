package o;

import com.app.dream11.model.BaseCampaignRequest;
import com.app.dream11.model.IAppDataProvider;
import o.AbstractResolvableFuture;
/* loaded from: classes.dex */
public class launchTrustedWebActivity extends TrustedWebActivityCallbackRemote {
    public launchTrustedWebActivity(IAppDataProvider iAppDataProvider, AbstractResolvableFuture.AtomicHelper atomicHelper) {
        super(iAppDataProvider, atomicHelper);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ah$a(String str, String str2, onApplyThemeResource onapplythemeresource) {
        if (!str.isEmpty()) {
            onapplythemeresource.valueOf().ah$a("user_type", "referral");
        } else if (!str2.isEmpty() && !BaseCampaignRequest.ORGANIC_VALUE.equalsIgnoreCase(str2)) {
            onapplythemeresource.valueOf().ah$a("user_type", "marketing");
        } else {
            onapplythemeresource.valueOf().ah$a("user_type", "organic");
        }
    }
}
