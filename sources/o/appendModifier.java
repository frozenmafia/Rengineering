package o;

import com.app.dream11.core.service.HttpInterface;
import javax.inject.Provider;
/* loaded from: classes2.dex */
public final class appendModifier implements MasterKey<MenuDialogHelper$ag$a> {
    private final Provider<HttpInterface> ag$a;
    private final Provider<showsTextAsAction> ah$a;
    private final Provider<setHeaderIconInt> valueOf;

    public appendModifier(Provider<HttpInterface> provider, Provider<setHeaderIconInt> provider2, Provider<showsTextAsAction> provider3) {
        this.ag$a = provider;
        this.valueOf = provider2;
        this.ah$a = provider3;
    }

    @Override // javax.inject.Provider
    /* renamed from: values */
    public MenuDialogHelper$ag$a ah$a() {
        return toString(this.ag$a.ah$a(), this.valueOf.ah$a(), this.ah$a.ah$a());
    }

    public static appendModifier toString(Provider<HttpInterface> provider, Provider<setHeaderIconInt> provider2, Provider<showsTextAsAction> provider3) {
        return new appendModifier(provider, provider2, provider3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o.MenuDialogHelper$ag$a] */
    public static MenuDialogHelper$ag$a toString(final HttpInterface httpInterface, final setHeaderIconInt setheadericonint, final showsTextAsAction showstextasaction) {
        return new MenuDialogHelper(httpInterface, setheadericonint, showstextasaction) { // from class: o.MenuDialogHelper$ag$a
            private setHeaderIconInt ag$a;
            private showsTextAsAction valueOf;
            private HttpInterface values;

            {
                this.values = httpInterface;
                this.ag$a = setheadericonint;
                this.valueOf = showstextasaction;
            }

            @Override // o.MenuDialogHelper
            public HttpInterface ag$a() {
                return this.values;
            }

            @Override // o.MenuDialogHelper
            public showsTextAsAction ah$a() {
                return this.valueOf;
            }

            @Override // o.MenuDialogHelper
            public setHeaderIconInt values() {
                return this.ag$a;
            }
        };
    }
}
