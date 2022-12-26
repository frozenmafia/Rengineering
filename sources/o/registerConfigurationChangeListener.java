package o;
/* loaded from: classes.dex */
public interface registerConfigurationChangeListener<T> {
    void onComplete();

    void onError(Throwable th);

    void onNext(T t);

    void onSubscribe(getSidecarVersion getsidecarversion);
}
