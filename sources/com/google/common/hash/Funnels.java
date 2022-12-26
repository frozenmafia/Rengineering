package com.google.common.hash;

import java.io.Serializable;
import java.nio.charset.Charset;
import o.findRelativeAdapterPositionIn;
import o.markViewHoldersUpdated;
/* loaded from: classes7.dex */
public final class Funnels {

    /* loaded from: classes7.dex */
    enum ByteArrayFunnel implements Funnel<byte[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.byteArrayFunnel()";
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(byte[] bArr, findRelativeAdapterPositionIn findrelativeadapterpositionin) {
            findrelativeadapterpositionin.values(bArr);
        }
    }

    /* loaded from: classes7.dex */
    enum UnencodedCharsFunnel implements Funnel<CharSequence> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.unencodedCharsFunnel()";
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(CharSequence charSequence, findRelativeAdapterPositionIn findrelativeadapterpositionin) {
            findrelativeadapterpositionin.ag$a(charSequence);
        }
    }

    public static Funnel<CharSequence> valueOf(Charset charset) {
        return new StringCharsetFunnel(charset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static class StringCharsetFunnel implements Funnel<CharSequence>, Serializable {
        private final Charset charset;

        StringCharsetFunnel(Charset charset) {
            this.charset = (Charset) markViewHoldersUpdated.toString(charset);
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(CharSequence charSequence, findRelativeAdapterPositionIn findrelativeadapterpositionin) {
            findrelativeadapterpositionin.toString(charSequence, this.charset);
        }

        public String toString() {
            String name = this.charset.name();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 22);
            sb.append("Funnels.stringFunnel(");
            sb.append(name);
            sb.append(")");
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (obj instanceof StringCharsetFunnel) {
                return this.charset.equals(((StringCharsetFunnel) obj).charset);
            }
            return false;
        }

        public int hashCode() {
            return StringCharsetFunnel.class.hashCode() ^ this.charset.hashCode();
        }

        Object writeReplace() {
            return new SerializedForm(this.charset);
        }

        /* loaded from: classes7.dex */
        static class SerializedForm implements Serializable {
            private static final long serialVersionUID = 0;
            private final String charsetCanonicalName;

            SerializedForm(Charset charset) {
                this.charsetCanonicalName = charset.name();
            }

            private Object readResolve() {
                return Funnels.valueOf(Charset.forName(this.charsetCanonicalName));
            }
        }
    }

    /* loaded from: classes7.dex */
    enum IntegerFunnel implements Funnel<Integer> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.integerFunnel()";
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(Integer num, findRelativeAdapterPositionIn findrelativeadapterpositionin) {
            findrelativeadapterpositionin.values(num.intValue());
        }
    }

    /* loaded from: classes7.dex */
    static class SequentialFunnel<E> implements Funnel<Iterable<? extends E>>, Serializable {
        private final Funnel<E> elementFunnel;

        @Override // com.google.common.hash.Funnel
        public /* bridge */ /* synthetic */ void funnel(Object obj, findRelativeAdapterPositionIn findrelativeadapterpositionin) {
            funnel((Iterable) ((Iterable) obj), findrelativeadapterpositionin);
        }

        SequentialFunnel(Funnel<E> funnel) {
            this.elementFunnel = (Funnel) markViewHoldersUpdated.toString(funnel);
        }

        public void funnel(Iterable<? extends E> iterable, findRelativeAdapterPositionIn findrelativeadapterpositionin) {
            for (E e : iterable) {
                this.elementFunnel.funnel(e, findrelativeadapterpositionin);
            }
        }

        public String toString() {
            String valueOf = String.valueOf(this.elementFunnel);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Funnels.sequentialFunnel(");
            sb.append(valueOf);
            sb.append(")");
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (obj instanceof SequentialFunnel) {
                return this.elementFunnel.equals(((SequentialFunnel) obj).elementFunnel);
            }
            return false;
        }

        public int hashCode() {
            return SequentialFunnel.class.hashCode() ^ this.elementFunnel.hashCode();
        }
    }

    /* loaded from: classes7.dex */
    enum LongFunnel implements Funnel<Long> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Funnels.longFunnel()";
        }

        @Override // com.google.common.hash.Funnel
        public void funnel(Long l, findRelativeAdapterPositionIn findrelativeadapterpositionin) {
            findrelativeadapterpositionin.valueOf(l.longValue());
        }
    }
}
