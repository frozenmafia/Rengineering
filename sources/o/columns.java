package o;
/* loaded from: classes7.dex */
public interface columns<T> {
    void onSuccess(T t);

    boolean tryOnError(Throwable th);
}
