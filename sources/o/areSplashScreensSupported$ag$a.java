package o;

import o.ConnectionHolder;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class areSplashScreensSupported$ag$a implements ConnectionHolder.WrapperFactory.valueOf {
    private getColorSchemeParams ag$a;

    private areSplashScreensSupported$ag$a() {
    }

    @Override // o.ConnectionHolder.WrapperFactory.valueOf
    /* renamed from: toString */
    public areSplashScreensSupported$ag$a ag$a(getColorSchemeParams getcolorschemeparams) {
        this.ag$a = (getColorSchemeParams) getUserAuthenticationValidityDurationSeconds.toString(getcolorschemeparams);
        return this;
    }

    @Override // o.ConnectionHolder.WrapperFactory.valueOf
    public ConnectionHolder.WrapperFactory ag$a() {
        getUserAuthenticationValidityDurationSeconds.toString(this.ag$a, getColorSchemeParams.class);
        return new areSplashScreensSupported(this.ag$a);
    }
}
