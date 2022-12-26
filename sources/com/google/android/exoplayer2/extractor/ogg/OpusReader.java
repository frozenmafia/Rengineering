package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.extractor.VorbisUtil;
import com.google.android.exoplayer2.extractor.ogg.StreamReader;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class OpusReader extends StreamReader {
    private boolean firstCommentHeaderSeen;
    private static final byte[] OPUS_ID_HEADER_SIGNATURE = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] OPUS_COMMENT_HEADER_SIGNATURE = {79, 112, 117, 115, 84, 97, 103, 115};

    public static boolean verifyBitstreamType(ParsableByteArray parsableByteArray) {
        return peekPacketStartsWith(parsableByteArray, OPUS_ID_HEADER_SIGNATURE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    public void reset(boolean z) {
        super.reset(z);
        if (z) {
            this.firstCommentHeaderSeen = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    protected long preparePayload(ParsableByteArray parsableByteArray) {
        return convertTimeToGranule(getPacketDurationUs(parsableByteArray.getData()));
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.StreamReader
    protected boolean readHeaders(ParsableByteArray parsableByteArray, long j, StreamReader.SetupData setupData) throws ParserException {
        if (peekPacketStartsWith(parsableByteArray, OPUS_ID_HEADER_SIGNATURE)) {
            byte[] copyOf = Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit());
            int channelCount = OpusUtil.getChannelCount(copyOf);
            List<byte[]> buildInitializationData = OpusUtil.buildInitializationData(copyOf);
            if (setupData.format != null) {
                return true;
            }
            setupData.format = new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_OPUS).setChannelCount(channelCount).setSampleRate(OpusUtil.SAMPLE_RATE).setInitializationData(buildInitializationData).build();
            return true;
        }
        byte[] bArr = OPUS_COMMENT_HEADER_SIGNATURE;
        if (peekPacketStartsWith(parsableByteArray, bArr)) {
            Assertions.checkStateNotNull(setupData.format);
            if (this.firstCommentHeaderSeen) {
                return true;
            }
            this.firstCommentHeaderSeen = true;
            parsableByteArray.skipBytes(bArr.length);
            Metadata parseVorbisComments = VorbisUtil.parseVorbisComments(ImmutableList.copyOf(VorbisUtil.readVorbisCommentHeader(parsableByteArray, false, false).comments));
            if (parseVorbisComments == null) {
                return true;
            }
            setupData.format = setupData.format.buildUpon().setMetadata(parseVorbisComments.copyWithAppendedEntriesFrom(setupData.format.metadata)).build();
            return true;
        }
        Assertions.checkStateNotNull(setupData.format);
        return false;
    }

    private long getPacketDurationUs(byte[] bArr) {
        int i = bArr[0] & 255;
        int i2 = i & 3;
        int i3 = 2;
        if (i2 == 0) {
            i3 = 1;
        } else if (i2 != 1 && i2 != 2) {
            i3 = bArr[1] & 63;
        }
        int i4 = i >> 3;
        int i5 = i4 & 3;
        return i3 * (i4 >= 16 ? 2500 << i5 : i4 >= 12 ? 10000 << (i5 & 1) : i5 == 3 ? 60000 : 10000 << i5);
    }

    private static boolean peekPacketStartsWith(ParsableByteArray parsableByteArray, byte[] bArr) {
        if (parsableByteArray.bytesLeft() < bArr.length) {
            return false;
        }
        int position = parsableByteArray.getPosition();
        byte[] bArr2 = new byte[bArr.length];
        parsableByteArray.readBytes(bArr2, 0, bArr.length);
        parsableByteArray.setPosition(position);
        return Arrays.equals(bArr2, bArr);
    }
}
