package o;

import com.facebook.datasource.AbstractDataSource;
import java.util.Map;
/* loaded from: classes4.dex */
public class removeAllViewsInLayout<T> extends AbstractDataSource<T> {
    private removeAllViewsInLayout() {
    }

    public static <T> removeAllViewsInLayout<T> ag$a() {
        return new removeAllViewsInLayout<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.datasource.AbstractDataSource
    public boolean setResult(T t, boolean z, Map<String, Object> map) {
        return super.setResult(t.getClass(), z, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean ag$a(T t) {
        return super.setResult(t.getClass(), true, null);
    }

    @Override // com.facebook.datasource.AbstractDataSource
    public boolean setFailure(Throwable th) {
        return super.setFailure((Throwable) th.getClass());
    }

    @Override // com.facebook.datasource.AbstractDataSource
    public boolean setProgress(float f) {
        return super.setProgress(f);
    }
}
