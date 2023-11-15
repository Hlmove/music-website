package com.example.yin.constant;

/**
 * @author Hlmove
 */
public class Constants {
    /* 歌曲图片，歌手图片，歌曲文件，歌单图片等文件的存放路径 */
//    public static String ASSETS_PATH = "file:F:/Code2023/finalCode/music-website/music-server";
    //改用腾讯云存储，前端的读取路径也进行了响应的修改
    public static String ASSETS_PATH = "https://music-1309454696.cos.ap-nanjing.myqcloud.com/";

    public static String AVATOR_IMAGES_PATH = ASSETS_PATH + "/img/avatorImages/";
    public static String SONGLIST_PIC_PATH = ASSETS_PATH + "/img/songListPic/";
    public static String SONG_PIC_PATH = ASSETS_PATH + "/img/songPic/";
    public static String SONG_PATH = ASSETS_PATH + "/song/";
    public static String SINGER_PIC_PATH = ASSETS_PATH + "/img/singerPic/";
    public static String BANNER_PIC_PATH = ASSETS_PATH + "/img/swiper/";

    /* 盐值加密 */
    public static String SALT = "zyt";
}
