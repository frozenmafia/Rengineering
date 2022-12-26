package o;
/* loaded from: classes5.dex */
public interface IdlingResource<T> {

    /* loaded from: classes7.dex */
    public interface ResourceCallback<T> {
        void onError(Throwable th);

        void onSubscribe(dataStart datastart);

        void onSuccess(T t);
    }

    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(dataStart datastart);
}
