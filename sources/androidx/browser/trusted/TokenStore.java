package androidx.browser.trusted;
/* loaded from: classes5.dex */
public interface TokenStore {
    Token load();

    void store(Token token);
}
