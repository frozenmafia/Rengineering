package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.util.TypedValue;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceInputStream;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import o.getWantsAllOnMoveCalls;
/* loaded from: classes5.dex */
class Aes128DataSource implements DataSource {
    private static int ag$a = 1;
    private static int ah$a = 0;
    private static long valueOf = 7354447060699253630L;
    private CipherInputStream cipherInputStream;
    private final byte[] encryptionIv;
    private final byte[] encryptionKey;
    private final DataSource upstream;

    public Aes128DataSource(DataSource dataSource, byte[] bArr, byte[] bArr2) {
        this.upstream = dataSource;
        this.encryptionKey = bArr;
        this.encryptionIv = bArr2;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void addTransferListener(TransferListener transferListener) {
        int i = ag$a + 27;
        ah$a = i % 128;
        int i2 = i % 2;
        try {
            Assertions.checkNotNull(transferListener);
            this.upstream.addTransferListener(transferListener);
            int i3 = ah$a + 81;
            ag$a = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public final long open(DataSpec dataSpec) throws IOException {
        try {
            Cipher cipherInstance = getCipherInstance();
            try {
                cipherInstance.init(2, new SecretKeySpec(this.encryptionKey, values(new char[]{58398, 58463, 64829, 41384, 62982, 46855, 15628}, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()), new IvParameterSpec(this.encryptionIv));
                DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(this.upstream, dataSpec);
                this.cipherInputStream = new CipherInputStream(dataSourceInputStream, cipherInstance);
                dataSourceInputStream.open();
                int i = ag$a + 61;
                ah$a = i % 128;
                if ((i % 2 != 0 ? 'a' : (char) 30) != 'a') {
                    return -1L;
                }
                int i2 = 42 / 0;
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int i3 = ah$a + 41;
            ag$a = i3 % 128;
            int i4 = i3 % 2;
            Assertions.checkNotNull(this.cipherInputStream);
            int read = this.cipherInputStream.read(bArr, i, i2);
            Object obj = null;
            if (read < 0) {
                int i5 = ah$a + 57;
                ag$a = i5 % 128;
                if (i5 % 2 == 0) {
                    super.hashCode();
                }
                read = -1;
            }
            int i6 = ag$a + 55;
            ah$a = i6 % 128;
            if (i6 % 2 == 0) {
                return read;
            }
            super.hashCode();
            return read;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        int i = ah$a + 75;
        ag$a = i % 128;
        int i2 = i % 2;
        Uri uri = this.upstream.getUri();
        try {
            int i3 = ah$a + 9;
            ag$a = i3 % 128;
            int i4 = i3 % 2;
            return uri;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public final Map<String, List<String>> getResponseHeaders() {
        try {
            int i = ag$a + 83;
            ah$a = i % 128;
            int i2 = i % 2;
            Map<String, List<String>> responseHeaders = this.upstream.getResponseHeaders();
            int i3 = ah$a + 13;
            ag$a = i3 % 128;
            int i4 = i3 % 2;
            return responseHeaders;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public void close() throws IOException {
        if ((this.cipherInputStream != null ? 'J' : (char) 29) != 29) {
            int i = ag$a + 67;
            ah$a = i % 128;
            if (i % 2 == 0) {
                this.cipherInputStream = null;
                this.upstream.close();
            } else {
                try {
                    this.cipherInputStream = null;
                    try {
                        this.upstream.close();
                        int i2 = 96 / 0;
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
        }
        int i3 = ah$a + 113;
        ag$a = i3 % 128;
        int i4 = i3 % 2;
    }

    protected Cipher getCipherInstance() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher;
        int i = ah$a + 109;
        ag$a = i % 128;
        if (!(i % 2 == 0)) {
            cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
        } else {
            cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            Object obj = null;
            super.hashCode();
        }
        int i2 = ag$a + 119;
        ah$a = i2 % 128;
        if (!(i2 % 2 == 0)) {
            int i3 = 58 / 0;
            return cipher;
        }
        return cipher;
    }

    private static String values(char[] cArr, int i) {
        String str;
        synchronized (getWantsAllOnMoveCalls.ag$a) {
            char[] getwantsallonmovecalls = getWantsAllOnMoveCalls.toString(valueOf, cArr, i);
            getWantsAllOnMoveCalls.values = 4;
            while (getWantsAllOnMoveCalls.values < getwantsallonmovecalls.length) {
                getWantsAllOnMoveCalls.toString = getWantsAllOnMoveCalls.values - 4;
                getwantsallonmovecalls[getWantsAllOnMoveCalls.values] = (char) ((getwantsallonmovecalls[getWantsAllOnMoveCalls.values] ^ getwantsallonmovecalls[getWantsAllOnMoveCalls.values % 4]) ^ (getWantsAllOnMoveCalls.toString * valueOf));
                getWantsAllOnMoveCalls.values++;
            }
            str = new String(getwantsallonmovecalls, 4, getwantsallonmovecalls.length - 4);
        }
        return str;
    }
}
