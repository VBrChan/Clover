/*
 * Clover - 4chan browser https://github.com/Floens/Clover/
 * Copyright (C) 2014  Floens
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.floens.chan.chan;

import java.util.Locale;

public class ChanUrls {
    private static String scheme;
    private static String urlName = "brchan.org";
    private static boolean brchanTeste = true;

    public static void loadScheme(boolean useHttps) {
        scheme = useHttps ? "https" : "http";
    }

    public static String getCatalogUrl(String board) {
        if (!brchanTeste){
            return scheme + "://a.4cdn.org/" + board + "/catalog.json";
        }else{
           return scheme + "://"+ urlName +"/" + board + "/catalog.json";
        }

    }

    public static String getPageUrl(String board, int pageNumber) {
        if (!brchanTeste){
            return scheme + "://a.4cdn.org/" + board + "/" + (pageNumber + 1) + ".json";
        }else{
            return scheme + "://"+ urlName +"/" + board + "/" + (pageNumber) + ".json";
        }
    }

    public static String getThreadUrl(String board, int no) {
        if (!brchanTeste){
            return scheme + "://a.4cdn.org/" + board + "/thread/" + no + ".json";
        }else{
            return scheme + "://"+ urlName +"/" + board + "/res/" + no + ".json";
        }
    }

    public static String getCaptchaSiteKey() {
        return "6Ldp2bsSAAAAAAJ5uyx_lx34lJeEpTLVkP5k04qc";
    }

    public static String getImageUrl(String board, String code, String extension) {
        if (!brchanTeste){
            return scheme + "://i.4cdn.org/" + board + "/" + code + "." + extension;
        }else{
            if (extension.compareTo("yutb") == 0){
                return scheme + "://www.youtube.com/embed/" + code;
            }else{
                return scheme + "://"+ urlName +"/" + board + "/src/" + code + "." + extension;
            }


        }
    }

    public static String getThumbnailUrl(String board, String code, String extension) {
        if (!brchanTeste){
            return scheme + "://t.4cdn.org/" + board + "/" + code + "s.jpg";
        }else{
            switch (extension){
                case "webm":
                    return scheme + "://"+ urlName +"/" + board + "/thumb/" + code + ".jpg";
                case "mp3":
                    return scheme + "://"+ urlName +"/" + board + "/thumb/" + code + ".jpg";
                case "mp4":
                    return scheme + "://"+ urlName +"/" + board + "/thumb/" + code + ".jpg";
                case "yutb":
                    return scheme + "://img.youtube.com/vi/"+ code +"/0.jpg";
                default:
                    return scheme + "://"+ urlName +"/" + board + "/thumb/" + code + "." + extension;
            }
        }
    }

    public  static String getThumbnailAudio(){
        return  scheme + "://" + urlName +"/static/audio.png";
    }

    public static String getSpoilerUrl() {
        if (!brchanTeste){
            return scheme + "://s.4cdn.org/image/spoiler.png";
        }else{
            return scheme + "://"+ urlName +"/static/spoiler.png";
        }
    }

    public static String getCustomSpoilerUrl(String board, int value) {
        if (!brchanTeste){
            return scheme + "://s.4cdn.org/image/spoiler-" + board + value + ".png";
        }else{
            return scheme + "://"+ urlName +"/static/spoiler.png";
        }
    }

    public static String getCountryFlagUrl(String countryCode) {
        if (!brchanTeste){
            return scheme + "://s.4cdn.org/image/country/" + countryCode.toLowerCase(Locale.ENGLISH) + ".gif";
        }else{
            return scheme + "://"+ urlName +"/static/flags/" + countryCode.toLowerCase(Locale.ENGLISH) + ".png";
        }
    }

    public static String getBoardsUrl() {
        if (!brchanTeste){
            return scheme + "://a.4cdn.org/boards.json";
        }else{
            return "";
        }
    }

    public static String getReplyUrl(String board) {
        if (!brchanTeste){
            return "https://sys.4chan.org/" + board + "/post";
        }else{
            return "https://"+ urlName +"/altpost.php";
        }
    }

    public static String getDeleteUrl(String board) {
        if (!brchanTeste){
            return "https://sys.4chan.org/" + board + "/imgboard.php";
        }else{
            return getReplyUrl(board);
        }
    }

    public static String getBoardUrlDesktop(String board) {
        if (!brchanTeste){
            return scheme + "://boards.4chan.org/" + board + "/";
        }else{
            return scheme + "://"+ urlName +"/" + board + "/";
        }
    }

    public static String getThreadUrlDesktop(String board, int no) {
        if (!brchanTeste){
            return scheme + "://boards.4chan.org/" + board + "/thread/" + no;
        }else{
            return scheme + "://"+ urlName +"/" + board + "/res/" + no + ".html";
        }
    }

    public static String getThreadUrlDesktop(String board, int no, int postNo) {
        if (!brchanTeste){
            return scheme + "://boards.4chan.org/" + board + "/thread/" + no + "#p" + postNo;
        }else{
            return scheme + "://"+ urlName +"/" + board + "/res/" + no + ".html#" + postNo;
        }
    }

    public static String getCatalogUrlDesktop(String board) {
        if (!brchanTeste){
           return scheme + "://boards.4chan.org/" + board + "/catalog";
        }else{
            return scheme + "://"+ urlName +"/" + board + "/catalog.html";
        }
    }

    public static String getPassUrl() {
        if (!brchanTeste){
            return "https://sys.4chan.org/auth";
        }else{
            return "";
        }
    }

    public static String getReportUrl(String board, int no) {
        if (!brchanTeste){
            return "https://sys.4chan.org/" + board + "/imgboard.php?mode=report&no=" + no;
        }else{
            return "";
        }


    }
}
