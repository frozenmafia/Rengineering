package o;

import o.CustomTabsService;
import o.CustomTabsServiceConnection;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class CustomTabsService$Relation$ah$a implements CustomTabsServiceConnection$1$ah$a {
    private getColorSchemeParams toString;

    private CustomTabsService$Relation$ah$a() {
    }

    @Override // o.CustomTabsServiceConnection$1$ah$a
    /* renamed from: values */
    public CustomTabsService$Relation$ah$a toString(getColorSchemeParams getcolorschemeparams) {
        this.toString = (getColorSchemeParams) getUserAuthenticationValidityDurationSeconds.toString(getcolorschemeparams);
        return this;
    }

    @Override // o.CustomTabsServiceConnection$1$ah$a
    public CustomTabsServiceConnection.AnonymousClass1 ag$a() {
        getUserAuthenticationValidityDurationSeconds.toString(this.toString, getColorSchemeParams.class);
        return new CustomTabsService.Relation(this.toString);
    }
}
