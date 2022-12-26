package androidx.window.core;

import java.math.BigInteger;
import kotlin.jvm.internal.Lambda;
import o.Styleable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class Version$bigInteger$2 extends Lambda implements Styleable.ArcMotion<BigInteger> {
    final /* synthetic */ Version this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Version$bigInteger$2(Version version) {
        super(0);
        this.this$0 = version;
    }

    @Override // o.Styleable.ArcMotion
    public final BigInteger invoke() {
        return BigInteger.valueOf(this.this$0.getMajor()).shiftLeft(32).or(BigInteger.valueOf(this.this$0.getMinor())).shiftLeft(32).or(BigInteger.valueOf(this.this$0.getPatch()));
    }
}
