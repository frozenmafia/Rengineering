package o;

import org.apache.http.message.TokenParser;
/* loaded from: classes5.dex */
public final class getMessage {
    public static final getMessage ah$a;
    public static final byte[] valueOf;
    public static final char[] values;

    private getMessage() {
    }

    static {
        getMessage getmessage = new getMessage();
        ah$a = getmessage;
        values = new char[117];
        valueOf = new byte[126];
        getmessage.ah$a();
        getmessage.values();
    }

    private final void ah$a() {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            toString(i, 'u');
            if (i2 > 31) {
                toString(8, 'b');
                toString(9, 't');
                toString(10, 'n');
                toString(12, 'f');
                toString(13, 'r');
                toString('/', '/');
                toString('\"', '\"');
                toString(TokenParser.ESCAPE, TokenParser.ESCAPE);
                return;
            }
            i = i2;
        }
    }

    private final void values() {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            toString(i, Byte.MAX_VALUE);
            if (i2 > 32) {
                toString(9, (byte) 3);
                toString(10, (byte) 3);
                toString(13, (byte) 3);
                toString(32, (byte) 3);
                ah$a(',', (byte) 4);
                ah$a(':', (byte) 5);
                ah$a('{', (byte) 6);
                ah$a('}', (byte) 7);
                ah$a('[', (byte) 8);
                ah$a(']', (byte) 9);
                ah$a('\"', (byte) 1);
                ah$a(TokenParser.ESCAPE, (byte) 2);
                return;
            }
            i = i2;
        }
    }

    private final void toString(int i, char c) {
        if (c != 'u') {
            values[c] = (char) i;
        }
    }

    private final void toString(char c, char c2) {
        toString((int) c, c2);
    }

    private final void toString(int i, byte b2) {
        valueOf[i] = b2;
    }

    private final void ah$a(char c, byte b2) {
        toString(c, b2);
    }
}
