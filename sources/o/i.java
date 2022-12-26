package o;

import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public interface i<T> extends Callable<T> {
    @Override // java.util.concurrent.Callable
    T call();
}
