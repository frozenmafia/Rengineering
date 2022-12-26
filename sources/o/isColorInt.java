package o;

import com.app.dream11.model.IAppDataProvider;
import o.AbstractResolvableFuture;
/* loaded from: classes3.dex */
public final class isColorInt extends TrustedWebActivityCallbackRemote {
    private final MenuDialogHelper ah$a;
    private final int valueOf;
    private final int values;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isColorInt(AbstractResolvableFuture.AtomicHelper atomicHelper, IAppDataProvider iAppDataProvider) {
        super(iAppDataProvider, atomicHelper);
        runAnimators.ag$a(atomicHelper, "provider");
        runAnimators.ag$a(iAppDataProvider, "dataProvider");
        MenuDialogHelper HaptikSDK$e = atomicHelper.HaptikSDK$e();
        runAnimators.ah$a(HaptikSDK$e, "provider.httpClient");
        this.ah$a = HaptikSDK$e;
        this.values = 1200;
        this.valueOf = 80;
    }
}
