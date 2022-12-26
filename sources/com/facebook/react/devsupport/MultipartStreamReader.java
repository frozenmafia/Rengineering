package com.facebook.react.devsupport;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import o.getMinSmallestWidth;
import o.parseSplitActivityRule;
import okio.ByteString;
/* loaded from: classes6.dex */
public class MultipartStreamReader {
    private static final String CRLF = "\r\n";
    private final String mBoundary;
    private long mLastProgressEvent;
    private final parseSplitActivityRule mSource;

    /* loaded from: classes6.dex */
    public interface ChunkListener {
        void onChunkComplete(Map<String, String> map, getMinSmallestWidth getminsmallestwidth, boolean z) throws IOException;

        void onChunkProgress(Map<String, String> map, long j, long j2) throws IOException;
    }

    public MultipartStreamReader(parseSplitActivityRule parsesplitactivityrule, String str) {
        this.mSource = parsesplitactivityrule;
        this.mBoundary = str;
    }

    private Map<String, String> parseHeaders(getMinSmallestWidth getminsmallestwidth) {
        String[] split;
        HashMap hashMap = new HashMap();
        for (String str : getminsmallestwidth.onMessageChannelReady().split(CRLF)) {
            int indexOf = str.indexOf(":");
            if (indexOf != -1) {
                hashMap.put(str.substring(0, indexOf).trim(), str.substring(indexOf + 1).trim());
            }
        }
        return hashMap;
    }

    private void emitChunk(getMinSmallestWidth getminsmallestwidth, boolean z, ChunkListener chunkListener) throws IOException {
        ByteString encodeUtf8 = ByteString.encodeUtf8("\r\n\r\n");
        long ag$a = getminsmallestwidth.ag$a(encodeUtf8);
        if (ag$a == -1) {
            chunkListener.onChunkComplete(null, getminsmallestwidth, z);
            return;
        }
        getMinSmallestWidth getminsmallestwidth2 = new getMinSmallestWidth();
        getMinSmallestWidth getminsmallestwidth3 = new getMinSmallestWidth();
        getminsmallestwidth.read(getminsmallestwidth2, ag$a);
        getminsmallestwidth.HaptikSDK$a(encodeUtf8.size());
        getminsmallestwidth.ag$a(getminsmallestwidth3);
        chunkListener.onChunkComplete(parseHeaders(getminsmallestwidth2), getminsmallestwidth3, z);
    }

    private void emitProgress(Map<String, String> map, long j, boolean z, ChunkListener chunkListener) throws IOException {
        if (map == null || chunkListener == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.mLastProgressEvent > 16 || z) {
            this.mLastProgressEvent = currentTimeMillis;
            chunkListener.onChunkProgress(map, j, map.get("Content-Length") != null ? Long.parseLong(map.get("Content-Length")) : 0L);
        }
    }

    public boolean readAllParts(ChunkListener chunkListener) throws IOException {
        boolean z;
        long j;
        ByteString encodeUtf8 = ByteString.encodeUtf8("\r\n--" + this.mBoundary + CRLF);
        ByteString encodeUtf82 = ByteString.encodeUtf8("\r\n--" + this.mBoundary + "--" + CRLF);
        ByteString encodeUtf83 = ByteString.encodeUtf8("\r\n\r\n");
        getMinSmallestWidth getminsmallestwidth = new getMinSmallestWidth();
        long j2 = 0L;
        long j3 = 0L;
        long j4 = 0L;
        Map<String, String> map = null;
        while (true) {
            long max = Math.max(j2 - encodeUtf82.size(), j3);
            long values = getminsmallestwidth.values(encodeUtf8, max);
            if (values == -1) {
                values = getminsmallestwidth.values(encodeUtf82, max);
                z = true;
            } else {
                z = false;
            }
            if (values == -1) {
                long onPostMessage = getminsmallestwidth.onPostMessage();
                if (map == null) {
                    long values2 = getminsmallestwidth.values(encodeUtf83, max);
                    if (values2 >= 0) {
                        this.mSource.read(getminsmallestwidth, values2);
                        getMinSmallestWidth getminsmallestwidth2 = new getMinSmallestWidth();
                        j = j3;
                        getminsmallestwidth.toString(getminsmallestwidth2, max, values2 - max);
                        j4 = getminsmallestwidth2.onPostMessage() + encodeUtf83.size();
                        map = parseHeaders(getminsmallestwidth2);
                    } else {
                        j = j3;
                    }
                } else {
                    j = j3;
                    emitProgress(map, getminsmallestwidth.onPostMessage() - j4, false, chunkListener);
                }
                if (this.mSource.read(getminsmallestwidth, 4096) <= 0) {
                    return false;
                }
                j2 = onPostMessage;
                j3 = j;
            } else {
                long j5 = j3;
                if (j5 > 0) {
                    getMinSmallestWidth getminsmallestwidth3 = new getMinSmallestWidth();
                    getminsmallestwidth.HaptikSDK$a(j5);
                    getminsmallestwidth.read(getminsmallestwidth3, values - j5);
                    emitProgress(map, getminsmallestwidth3.onPostMessage() - j4, true, chunkListener);
                    emitChunk(getminsmallestwidth3, z, chunkListener);
                    j4 = 0;
                    map = null;
                } else {
                    getminsmallestwidth.HaptikSDK$a(values);
                }
                if (z) {
                    return true;
                }
                j3 = encodeUtf8.size();
                j2 = j3;
            }
        }
    }
}
