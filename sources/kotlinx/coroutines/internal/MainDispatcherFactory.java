package kotlinx.coroutines.internal;

import java.util.List;
import o.drawPath;
/* loaded from: classes5.dex */
public interface MainDispatcherFactory {
    drawPath createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
