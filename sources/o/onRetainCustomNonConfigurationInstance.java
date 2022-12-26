package o;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.amazon.identity.auth.device.interactive.InteractiveRequestRecord;
import o.onRequestPermissionsResult;
/* loaded from: classes.dex */
public abstract class onRetainCustomNonConfigurationInstance<T extends onRequestPermissionsResult<S, U, V>, S, U, V> implements onRequestPermissionsResult<S, U, V> {
    private getOnBackPressedDispatcher valueOf;

    public onRetainCustomNonConfigurationInstance(getOnBackPressedDispatcher getonbackpresseddispatcher) {
        values(getonbackpresseddispatcher);
    }

    private onRequestPermissionsResult<S, U, V> valueOf() {
        return this.valueOf.ah$a(this);
    }

    public Bundle HaptikSDK$c() {
        return null;
    }

    public getOnBackPressedDispatcher HaptikSDK$d() {
        return this.valueOf;
    }

    @Override // o.onRequestPermissionsResult, o.ensureViewModelStore
    public void ag$a(V v) {
        valueOf().ag$a(v);
    }

    public Context ah$b() {
        return this.valueOf.ah$a();
    }

    public abstract Class<T> invoke();

    @Override // o.IMediaSession.Default
    public void toString(Context context, InteractiveRequestRecord interactiveRequestRecord, Uri uri) {
        valueOf().toString(context, interactiveRequestRecord, uri);
    }

    @Override // o.onRequestPermissionsResult, o.ensureViewModelStore
    public void toString(S s) {
        valueOf().toString(s);
    }

    @Override // o.onRequestPermissionsResult
    public void valueOf(U u) {
        valueOf().valueOf(u);
    }

    public void values(getOnBackPressedDispatcher getonbackpresseddispatcher) {
        if (getonbackpresseddispatcher == null) {
            throw new IllegalArgumentException("requestContext must be non-null");
        }
        this.valueOf = getonbackpresseddispatcher;
    }
}
