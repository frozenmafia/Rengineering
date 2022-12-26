package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import o.drawPath;
import o.fromInputStream;
import o.putVersionedParcelable;
/* loaded from: classes7.dex */
public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public int getLoadPriority() {
        return 1073741823;
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public drawPath createDispatcher(List<? extends MainDispatcherFactory> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            throw new IllegalStateException("The main looper is not available");
        }
        return new fromInputStream(putVersionedParcelable.values(mainLooper, true), null, 2, null);
    }
}
