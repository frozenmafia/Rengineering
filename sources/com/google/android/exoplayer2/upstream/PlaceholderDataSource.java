package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
/* loaded from: classes5.dex */
public final class PlaceholderDataSource implements DataSource {
    public static final PlaceholderDataSource INSTANCE = new PlaceholderDataSource();
    public static final DataSource.Factory FACTORY = PlaceholderDataSource$$ExternalSyntheticLambda0.INSTANCE;

    public static /* synthetic */ PlaceholderDataSource $r8$lambda$Qku_15DubQGfyuKLu3QSDqilS4U() {
        return new PlaceholderDataSource();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public void close() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public /* synthetic */ Map getResponseHeaders() {
        Map emptyMap;
        emptyMap = Collections.emptyMap();
        return emptyMap;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Uri getUri() {
        return null;
    }

    private PlaceholderDataSource() {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.upstream.HttpDataSource
    public long open(DataSpec dataSpec) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader, com.google.android.exoplayer2.upstream.HttpDataSource
    public int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }
}
