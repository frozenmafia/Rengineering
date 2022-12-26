package o;

import org.apache.http.message.TokenParser;
/* loaded from: classes5.dex */
public abstract class applyPendingUpdatesToPosition implements findViewHolder<Character> {
    public abstract boolean ag$a(char c);

    public static applyPendingUpdatesToPosition values() {
        return values.ag$a;
    }

    public static applyPendingUpdatesToPosition valueOf(final char c) {
        return new applyPendingUpdatesToPosition$ag$a(c) { // from class: o.applyPendingUpdatesToPosition$ah$a
            private final char values;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.values = c;
            }

            @Override // o.applyPendingUpdatesToPosition
            public boolean ag$a(char c2) {
                return c2 == this.values;
            }

            @Override // o.applyPendingUpdatesToPosition
            public String toString() {
                String values2 = applyPendingUpdatesToPosition.values(this.values);
                StringBuilder sb = new StringBuilder(String.valueOf(values2).length() + 18);
                sb.append("CharMatcher.is('");
                sb.append(values2);
                sb.append("')");
                return sb.toString();
            }
        };
    }

    public static applyPendingUpdatesToPosition ah$a(char c, char c2) {
        return new toString(c, c2);
    }

    public boolean valueOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!ag$a(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public int toString(CharSequence charSequence, int i) {
        int length = charSequence.length();
        markViewHoldersUpdated.toString(i, length, "index");
        while (i < length) {
            if (ag$a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // o.findViewHolder
    @Deprecated
    /* renamed from: values */
    public boolean apply(Character ch) {
        return ag$a(ch.charValue());
    }

    public String toString() {
        return super.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String values(char c) {
        char[] cArr = {TokenParser.ESCAPE, 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    /* loaded from: classes5.dex */
    static abstract class valueOf extends applyPendingUpdatesToPosition$ag$a {
        private final String ah$a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public valueOf(String str) {
            this.ah$a = (String) markViewHoldersUpdated.toString(str);
        }

        @Override // o.applyPendingUpdatesToPosition
        public final String toString() {
            return this.ah$a;
        }
    }

    /* loaded from: classes7.dex */
    static final class values extends valueOf {
        static final values ag$a = new values();

        @Override // o.applyPendingUpdatesToPosition
        public boolean ag$a(char c) {
            return c <= 127;
        }

        values() {
            super("CharMatcher.ascii()");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes7.dex */
    public static final class toString extends applyPendingUpdatesToPosition$ag$a {
        private final char ag$a;
        private final char ah$a;

        toString(char c, char c2) {
            markViewHoldersUpdated.values(c2 >= c);
            this.ah$a = c;
            this.ag$a = c2;
        }

        @Override // o.applyPendingUpdatesToPosition
        public boolean ag$a(char c) {
            return this.ah$a <= c && c <= this.ag$a;
        }

        @Override // o.applyPendingUpdatesToPosition
        public String toString() {
            String values = applyPendingUpdatesToPosition.values(this.ah$a);
            String values2 = applyPendingUpdatesToPosition.values(this.ag$a);
            StringBuilder sb = new StringBuilder(String.valueOf(values).length() + 27 + String.valueOf(values2).length());
            sb.append("CharMatcher.inRange('");
            sb.append(values);
            sb.append("', '");
            sb.append(values2);
            sb.append("')");
            return sb.toString();
        }
    }
}
