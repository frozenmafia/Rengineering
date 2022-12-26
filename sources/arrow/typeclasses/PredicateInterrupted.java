package arrow.typeclasses;
/* loaded from: classes6.dex */
public final class PredicateInterrupted extends RuntimeException {
    public static final PredicateInterrupted INSTANCE = new PredicateInterrupted();

    private PredicateInterrupted() {
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        return this;
    }
}
