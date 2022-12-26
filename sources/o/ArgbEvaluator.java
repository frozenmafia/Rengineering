package o;

import java.lang.Throwable;
import o.ArgbEvaluator;
/* loaded from: classes5.dex */
public interface ArgbEvaluator<T extends Throwable & ArgbEvaluator<T>> {
    T createCopy();
}
