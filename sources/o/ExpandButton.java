package o;

import java.lang.Throwable;
/* loaded from: classes7.dex */
public interface ExpandButton<TInput, TResult, TException extends Throwable> {
    TResult values(TInput tinput) throws Throwable;
}
