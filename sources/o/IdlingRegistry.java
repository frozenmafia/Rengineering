package o;
/* loaded from: classes7.dex */
public interface IdlingRegistry<T> {
    void onComplete();

    void onError(Throwable th);

    void onSubscribe(dataStart datastart);

    void onSuccess(T t);
}
