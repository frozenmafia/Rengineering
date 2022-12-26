package o;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class setDialogIcon$ah$a implements createAdapter$ah$a {
    private Context valueOf;

    private setDialogIcon$ah$a() {
    }

    @Override // o.createAdapter$ah$a
    /* renamed from: valueOf */
    public setDialogIcon$ah$a ag$a(Context context) {
        this.valueOf = (Context) context.getClass();
        return this;
    }

    @Override // o.createAdapter$ah$a
    public createAdapter values() {
        setPendingShowSoftInputRequest.toString(this.valueOf, Context.class);
        return new setDialogIcon(this.valueOf);
    }
}
