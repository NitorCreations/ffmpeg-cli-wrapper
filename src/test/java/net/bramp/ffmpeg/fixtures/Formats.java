package net.bramp.ffmpeg.fixtures;

import com.google.common.collect.ImmutableList;
import net.bramp.ffmpeg.info.Format;

import java.util.List;

/**
 * Class that contains all formats as defined in the unit tests This should not be used to test if a
 * format is available, because every install of ffmpeg is different. Call ffmpeg.formats() to
 * discover.
 * 
 * @author bramp
 *
 */
public final class Formats {

  private Formats() {
    throw new AssertionError("No instances for you!");
  }

  public final static List<Format> FORMATS = new ImmutableList.Builder<Format>().add(
      new Format("3g2", "3GP2 format", " E"),
      new Format("3gp", "3GP format", " E"),
      new Format("4xm", "4X Technologies format", "D "),
      new Format("IFF", "IFF format", "D "),
      new Format("ISS", "Funcom ISS format", "D "),
      new Format("MTV", "MTV format", "D "),
      new Format("RoQ", "raw id RoQ format", "DE"),
      new Format("a64", "a64 - video for Commodore 64", " E"),
      new Format("aac", "raw ADTS AAC", "D "),
      new Format("ac3", "raw AC-3", "DE"),
      new Format("act", "ACT Voice file format", "D "),
      new Format("adf", "Artworx Data Format", "D "),
      new Format("adts", "ADTS AAC", " E"),
      new Format("adx", "CRI ADX", "DE"),
      new Format("aea", "MD STUDIO audio", "D "),
      new Format("aiff", "Audio IFF", "DE"),
      new Format("alaw", "PCM A-law format", "DE"),
      new Format("alsa", "ALSA audio output", "DE"),
      new Format("amr", "3GPP AMR file format", "DE"),
      new Format("anm", "Deluxe Paint Animation", "D "),
      new Format("apc", "CRYO APC format", "D "),
      new Format("ape", "Monkey's Audio", "D "),
      new Format("applehttp", "Apple HTTP Live Streaming format", "D "),
      new Format("asf", "ASF format", "DE"),
      new Format("asf_stream", "ASF format", " E"),
      new Format("ass", "Advanced SubStation Alpha subtitle format", "DE"),
      new Format("au", "SUN AU format", "DE"),
      new Format("avi", "AVI format", "DE"),
      new Format("avm2", "Flash 9 (AVM2) format", " E"),
      new Format("avs", "AVS format", "D "),
      new Format("bethsoftvid", "Bethesda Softworks VID format", "D "),
      new Format("bfi", "Brute Force & Ignorance", "D "),
      new Format("bin", "Binary text", "D "),
      new Format("bink", "Bink", "D "),
      new Format("bit", "G.729 BIT file format", "DE"),
      new Format("bmv", "Discworld II BMV", "D "),
      new Format("c93", "Interplay C93", "D "),
      new Format("caf", "Apple Core Audio Format", "DE"),
      new Format("cavsvideo", "raw Chinese AVS video", "DE"),
      new Format("cdg", "CD Graphics Format", "D "),
      new Format("crc", "CRC testing format", " E"),
      new Format("daud", "D-Cinema audio format", "DE"),
      new Format("dfa", "Chronomaster DFA", "D "),
      new Format("dirac", "raw Dirac", "DE"),
      new Format("dnxhd", "raw DNxHD (SMPTE VC-3)", "DE"),
      new Format("dsicin", "Delphine Software International CIN format", "D "),
      new Format("dts", "raw DTS", "DE"),
      new Format("dv", "DV video format", "DE"),
      new Format("dv1394", "DV1394 A/V grab", "D "),
      new Format("dvd", "MPEG-2 PS format (DVD VOB)", " E"),
      new Format("dxa", "DXA", "D "),
      new Format("ea", "Electronic Arts Multimedia Format", "D "),
      new Format("ea_cdata", "Electronic Arts cdata", "D "),
      new Format("eac3", "raw E-AC-3", "DE"),
      new Format("f32be", "PCM 32 bit floating-point big-endian format", "DE"),
      new Format("f32le", "PCM 32 bit floating-point little-endian format", "DE"),
      new Format("f64be", "PCM 64 bit floating-point big-endian format", "DE"),
      new Format("f64le", "PCM 64 bit floating-point little-endian format", "DE"),
      new Format("fbdev", "Linux framebuffer", "D "),
      new Format("ffm", "FFM (FFserver live feed) format", "DE"),
      new Format("ffmetadata", "FFmpeg metadata in text format", "DE"),
      new Format("film_cpk", "Sega FILM/CPK format", "D "),
      new Format("filmstrip", "Adobe Filmstrip", "DE"),
      new Format("flac", "raw FLAC", "DE"),
      new Format("flic", "FLI/FLC/FLX animation format", "D "),
      new Format("flv", "FLV format", "DE"),
      new Format("framecrc", "framecrc testing format", " E"),
      new Format("framemd5", "Per-frame MD5 testing format", " E"),
      new Format("g722", "raw G.722", "DE"),
      new Format("g723_1", "raw G.723.1", "DE"),
      new Format("g729", "G.729 raw format demuxer", "D "),
      new Format("gif", "GIF Animation", " E"),
      new Format("gsm", "raw GSM", "D "),
      new Format("gxf", "GXF format", "DE"),
      new Format("h261", "raw H.261", "DE"),
      new Format("h263", "raw H.263", "DE"),
      new Format("h264", "raw H.264 video format", "DE"),
      new Format("ico", "Microsoft Windows ICO", "D "),
      new Format("idcin", "id Cinematic format", "D "),
      new Format("idf", "iCE Draw File", "D "),
      new Format("image2", "image2 sequence", "DE"),
      new Format("image2pipe", "piped image2 sequence", "DE"),
      new Format("ingenient", "raw Ingenient MJPEG", "D "),
      new Format("ipmovie", "Interplay MVE format", "D "),
      new Format("ipod", "iPod H.264 MP4 format", " E"),
      new Format("ismv", "ISMV/ISMA (Smooth Streaming) format", " E"),
      new Format("iv8", "A format generated by IndigoVision 8000 video server", "D "),
      new Format("ivf", "On2 IVF", "DE"),
      new Format("jack", "JACK Audio Connection Kit", "D "),
      new Format("jv", "Bitmap Brothers JV", "D "),
      new Format("latm", "LOAS/LATM", "DE"),
      new Format("lavfi", "Libavfilter virtual input device", "D "),
      new Format("libcdio", "", "D "),
      new Format("libdc1394", "dc1394 A/V grab", "D "),
      new Format("lmlm4", "lmlm4 raw format", "D "),
      new Format("loas", "LOAS AudioSyncStream", "D "),
      new Format("lxf", "VR native stream format (LXF)", "D "),
      new Format("m4v", "raw MPEG-4 video format", "DE"),
      new Format("matroska", "Matroska file format", " E"),
      new Format("matroska,webm", "Matroska/WebM file format", "D "),
      new Format("md5", "MD5 testing format", " E"),
      new Format("microdvd", "MicroDVD subtitle format", "DE"),
      new Format("mjpeg", "raw MJPEG video", "DE"),
      new Format("mlp", "raw MLP", "DE"),
      new Format("mm", "American Laser Games MM format", "D "),
      new Format("mmf", "Yamaha SMAF", "DE"),
      new Format("mov", "MOV format", " E"),
      new Format("mov,mp4,m4a,3gp,3g2,mj2", "QuickTime/MPEG-4/Motion JPEG 2000 format", "D "),
      new Format("mp2", "MPEG audio layer 2", " E"),
      new Format("mp3", "MPEG audio layer 3", "DE"),
      new Format("mp4", "MP4 format", " E"),
      new Format("mpc", "Musepack", "D "),
      new Format("mpc8", "Musepack SV8", "D "),
      new Format("mpeg", "MPEG-1 System format", "DE"),
      new Format("mpeg1video", "raw MPEG-1 video", " E"),
      new Format("mpeg2video", "raw MPEG-2 video", " E"),
      new Format("mpegts", "MPEG-2 transport stream format", "DE"),
      new Format("mpegtsraw", "MPEG-2 raw transport stream format", "D "),
      new Format("mpegvideo", "raw MPEG video", "D "),
      new Format("mpjpeg", "MIME multipart JPEG format", " E"),
      new Format("msnwctcp", "MSN TCP Webcam stream", "D "),
      new Format("mulaw", "PCM mu-law format", "DE"),
      new Format("mvi", "Motion Pixels MVI format", "D "),
      new Format("mxf", "Material eXchange Format", "DE"),
      new Format("mxf_d10", "Material eXchange Format, D-10 Mapping", " E"),
      new Format("mxg", "MxPEG clip file format", "D "),
      new Format("nc", "NC camera feed format", "D "),
      new Format("nsv", "Nullsoft Streaming Video", "D "),
      new Format("null", "raw null video format", " E"),
      new Format("nut", "NUT format", "DE"),
      new Format("nuv", "NuppelVideo format", "D "),
      new Format("ogg", "Ogg", "DE"),
      new Format("oma", "Sony OpenMG audio", "DE"),
      new Format("oss", "Open Sound System playback", "DE"),
      new Format("pmp", "Playstation Portable PMP format", "D "),
      new Format("psp", "PSP MP4 format", " E"),
      new Format("psxstr", "Sony Playstation STR format", "D "),
      new Format("pulse", "Pulse audio input", "D "),
      new Format("pva", "TechnoTrend PVA file and stream format", "D "),
      new Format("qcp", "QCP format", "D "),
      new Format("r3d", "REDCODE R3D format", "D "),
      new Format("rawvideo", "raw video format", "DE"),
      new Format("rcv", "VC-1 test bitstream", " E"),
      new Format("rl2", "RL2 format", "D "),
      new Format("rm", "RealMedia format", "DE"),
      new Format("rpl", "RPL/ARMovie format", "D "),
      new Format("rso", "Lego Mindstorms RSO format", "DE"),
      new Format("rtp", "RTP output format", "DE"),
      new Format("rtsp", "RTSP output format", "DE"),
      new Format("s16be", "PCM signed 16 bit big-endian format", "DE"),
      new Format("s16le", "PCM signed 16 bit little-endian format", "DE"),
      new Format("s24be", "PCM signed 24 bit big-endian format", "DE"),
      new Format("s24le", "PCM signed 24 bit little-endian format", "DE"),
      new Format("s32be", "PCM signed 32 bit big-endian format", "DE"),
      new Format("s32le", "PCM signed 32 bit little-endian format", "DE"),
      new Format("s8", "PCM signed 8 bit format", "DE"),
      new Format("sap", "SAP output format", "DE"),
      new Format("sbg", "SBaGen binaural beats script", "D "),
      new Format("sdl", "SDL output device", " E"),
      new Format("sdp", "SDP", "D "),
      new Format("segment", "segment muxer", " E"),
      new Format("shn", "raw Shorten", "D "),
      new Format("siff", "Beam Software SIFF", "D "),
      new Format("smjpeg", "Loki SDL MJPEG", "DE"),
      new Format("smk", "Smacker video", "D "),
      new Format("sol", "Sierra SOL format", "D "),
      new Format("sox", "SoX native format", "DE"),
      new Format("spdif", "IEC 61937 (used on S/PDIF - IEC958)", "DE"),
      new Format("srt", "SubRip subtitle format", "DE"),
      new Format("svcd", "MPEG-2 PS format (VOB)", " E"),
      new Format("swf", "Flash format", "DE"),
      new Format("thp", "THP", "D "),
      new Format("tiertexseq", "Tiertex Limited SEQ format", "D "),
      new Format("tmv", "8088flex TMV", "D "),
      new Format("truehd", "raw TrueHD", "DE"),
      new Format("tta", "True Audio", "D "),
      new Format("tty", "Tele-typewriter", "D "),
      new Format("txd", "Renderware TeXture Dictionary", "D "),
      new Format("u16be", "PCM unsigned 16 bit big-endian format", "DE"),
      new Format("u16le", "PCM unsigned 16 bit little-endian format", "DE"),
      new Format("u24be", "PCM unsigned 24 bit big-endian format", "DE"),
      new Format("u24le", "PCM unsigned 24 bit little-endian format", "DE"),
      new Format("u32be", "PCM unsigned 32 bit big-endian format", "DE"),
      new Format("u32le", "PCM unsigned 32 bit little-endian format", "DE"),
      new Format("u8", "PCM unsigned 8 bit format", "DE"),
      new Format("vc1", "raw VC-1", "D "),
      new Format("vc1test", "VC-1 test bitstream format", "D "),
      new Format("vcd", "MPEG-1 System format (VCD)", " E"),
      new Format("video4linux2,v4l2", "Video4Linux2 device grab", "D "),
      new Format("vmd", "Sierra VMD format", "D "),
      new Format("vob", "MPEG-2 PS format (VOB)", " E"),
      new Format("voc", "Creative Voice file format", "DE"),
      new Format("vqf", "Nippon Telegraph and Telephone Corporation (NTT) TwinVQ", "D "),
      new Format("w64", "Sony Wave64 format", "D "),
      new Format("wav", "WAV format", "DE"),
      new Format("wc3movie", "Wing Commander III movie format", "D "),
      new Format("webm", "WebM file format", " E"),
      new Format("wsaud", "Westwood Studios audio format", "D "),
      new Format("wsvqa", "Westwood Studios VQA format", "D "),
      new Format("wtv", "Windows Television (WTV)", "DE"),
      new Format("wv", "WavPack", "D "),
      new Format("x11grab", "X11grab", "D "),
      new Format("xa", "Maxis XA File Format", "D "),
      new Format("xbin", "eXtended BINary text (XBIN)", "D "),
      new Format("xmv", "Microsoft XMV", "D "),
      new Format("xwma", "Microsoft xWMA", "D "),
      new Format("yop", "Psygnosis YOP Format", "D "),
      new Format("yuv4mpegpipe", "YUV4MPEG pipe format", "DE")
      ).build();
}
