package o;
/* loaded from: classes7.dex */
public final class hasPendingShowSoftInputRequest<T> implements needInputMethod<T> {
    private static final hasPendingShowSoftInputRequest<Object> values = new hasPendingShowSoftInputRequest<>(null);
    private final T valueOf;

    public static <T> needInputMethod<T> values(T t) {
        return new hasPendingShowSoftInputRequest(setPendingShowSoftInputRequest.values(t, "instance cannot be null"));
    }

    private hasPendingShowSoftInputRequest(T t) {
        this.valueOf = t;
    }

    @Override // javax.inject.Provider
    public T ah$a() {
        return this.valueOf;
    }
}
