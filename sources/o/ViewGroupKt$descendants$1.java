package o;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import o.invokeSuspend;
/* loaded from: classes3.dex */
public abstract class ViewGroupKt$descendants$1<T> implements invokeSuspend<T> {
    private final String ah$a;
    private T toString;
    private final AssetManager valueOf;

    protected abstract void toString(T t) throws IOException;

    protected abstract T values(AssetManager assetManager, String str) throws IOException;

    @Override // o.invokeSuspend
    public void values() {
    }

    public ViewGroupKt$descendants$1(AssetManager assetManager, String str) {
        this.valueOf = assetManager;
        this.ah$a = str;
    }

    @Override // o.invokeSuspend
    public void valueOf(Priority priority, invokeSuspend.toString<? super T> tostring) {
        try {
            T values = values(this.valueOf, this.ah$a);
            this.toString = values;
            tostring.values((invokeSuspend.toString<? super T>) values);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            tostring.values((Exception) e);
        }
    }

    @Override // o.invokeSuspend
    public void valueOf() {
        T t = this.toString;
        if (t == null) {
            return;
        }
        try {
            toString(t);
        } catch (IOException unused) {
        }
    }

    @Override // o.invokeSuspend
    public DataSource ah$a() {
        return DataSource.LOCAL;
    }
}
