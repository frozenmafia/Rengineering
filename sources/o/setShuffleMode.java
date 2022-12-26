package o;

import android.content.Context;
import android.net.Uri;
import com.amazon.identity.auth.device.interactive.InteractiveRequestRecord;
import java.util.Collections;
import java.util.Set;
import o.onRequestPermissionsResult;
/* loaded from: classes.dex */
public final class setShuffleMode<T extends onRequestPermissionsResult<S, U, V>, S, U, V> implements onRequestPermissionsResult<S, U, V> {
    private String ah$a;
    private Set<T> toString;

    public setShuffleMode(String str, Set<T> set) {
        this.ah$a = str;
        set = set == null ? Collections.emptySet() : set;
        this.toString = set;
        for (T t : set) {
            if (!str.equals(t.ah$a())) {
                throw new IllegalStateException("AggregateInteractiveListener created for request type \"" + str + "\" but received listener with request type \"" + t.ah$a() + "\"");
            }
        }
    }

    @Override // o.onRequestPermissionsResult, o.ensureViewModelStore
    public void ag$a(V v) {
        for (T t : this.toString) {
            t.ag$a(v);
        }
    }

    @Override // o.getSavedStateRegistry
    public String ah$a() {
        return this.ah$a;
    }

    @Override // o.IMediaSession.Default
    public void toString(Context context, InteractiveRequestRecord interactiveRequestRecord, Uri uri) {
        for (T t : this.toString) {
            t.toString(context, interactiveRequestRecord, uri);
        }
    }

    @Override // o.onRequestPermissionsResult, o.ensureViewModelStore
    public void toString(S s) {
        for (T t : this.toString) {
            t.toString(s);
        }
    }

    @Override // o.onRequestPermissionsResult
    public void valueOf(U u) {
        for (T t : this.toString) {
            t.valueOf(u);
        }
    }
}
