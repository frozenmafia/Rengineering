package o;

import o.getApplicationContext;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class cleanUpSession$ag$a implements getApplicationContext.values {
    private getColorSchemeParams toString;

    private cleanUpSession$ag$a() {
    }

    @Override // o.getApplicationContext.values
    /* renamed from: ag$a */
    public cleanUpSession$ag$a ah$a(getColorSchemeParams getcolorschemeparams) {
        this.toString = (getColorSchemeParams) getUserAuthenticationValidityDurationSeconds.toString(getcolorschemeparams);
        return this;
    }

    @Override // o.getApplicationContext.values
    public getApplicationContext ag$a() {
        getUserAuthenticationValidityDurationSeconds.toString(this.toString, getColorSchemeParams.class);
        return new cleanUpSession(this.toString);
    }
}
