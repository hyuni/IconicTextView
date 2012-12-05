/*
 * Copyright (C) 2012 Artur Termenji
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.atermenji.android.iconictextview.icon;

import com.atermenji.android.iconictextview.util.TypefaceManager.IconicTypeface;

/**
 * A wrapper for Entypo icon font (http://www.entypo.com). 
 */
public enum EntypoIcon implements Icon {

    PHONE(0x1F4DE),
    MOBILE(0x1F4F1),
    MOUSE(0xE789),
    ADDRESS(0xE723),
    MAIL(0x2709),
    PAPER_PLANE(0x1F53F),
    PENCIL(0x270E),
    FEATHER(0x2712),
    ATTACH(0x1F4CE),
    INBOX(0xE777),
    REPLY(0xE712),
    REPLY_ALL(0xE713),
    FORWARD(0x27A6),
    USER(0x1F464),
    USERS(0x1F465),
    ADD_USER(0xE700),
    VCARD(0xE722),
    EXPORT(0xE715),
    LOCATION(0xE724),
    MAP(0xE727),
    COMPASS(0xE728),
    DIRECTION(0x27A2),
    HAIR_CROSS(0x1F3AF),
    SHARE(0xE73C),
    SHAREABLE(0xE73E),
    HEART(0x2665),
    HEART_EMPTY(0x2661),
    STAR(0x2605),
    STAR_EMPTY(0x2606),
    THUMBS_UP(0x1F44D),
    THUMBS_DOWN(0x1F44E),
    CHAT(0xE720),
    COMMENT(0xE718),
    QUOTE(0x275E),
    HOME(0x2302),
    POPUP(0xE74C),
    SEARCH(0x1F50D),
    FLASHLIGHT(0x1F526),
    PRINT(0xE716),
    BELL(0x1F514),
    LINK(0x1F517),
    FLAG(0x2691),
    COG(0x2699),
    TOOLS(0x2692),
    TROPHY(0x1F3C6),
    TAG(0xE70C),
    CAMERA(0x1F4F7),
    MEGAPHONE(0x1F4E3),
    MOON(0x263D),
    PALETTE(0x1F3A8),
    LEAF(0x1F342),
    NOTE(0x266A),
    BEAMED_NOTE(0x266B),
    NEW(0x1F4A5),
    GRADUATION_CAP(0x1F393),
    BOOK(0x1F4D5),
    NEWSPAPER(0x1F4F0),
    BAG(0x1F45C),
    AIRPLANE(0x2708),
    LIFEBUOY(0xE788),
    EYE(0xE70A),
    CLOCK(0x1F554),
    MIC(0x1F3A4),
    CALENDAR(0x1F4C5),
    FLASH(0x26A1),
    THUNDER_CLOUD(0x26C8),
    DROPLET(0x1F4A7),
    CD(0x1F4BF),
    BRIEFCASE(0x1F4BC),
    AIR(0x1F4A8),
    HOURGLASS(0x23F3),
    GAUGE(0x1F6C7),
    LANGUAGE(0x1F394),
    NETWORK(0xE776),
    KEY(0x1F511),
    BATTERY(0x1F50B),
    BUCKET(0x1F4FE),
    MAGNET(0xE7A1),
    DRIVE(0x1F4FD),
    CUP(0x2615),
    ROCKET(0x1F680),
    BRUSH(0xE79A),
    SUITCASE(0x1F6C6),
    TRAFFIC_CONE(0x1F6C8),
    GLOBE(0x1F30E),
    KEYBOARD(0x2328),
    BROWSER(0xE74E),
    PUBLISH(0xE74D),
    PROGRESS_3(0xE76B),
    PROGRESS_2(0xE76A),
    PROGRESS_1(0xE769),
    PROGRESS_0(0xE768),
    LIGHT_DOWN(0x1F505),
    LIGHT_UP(0x1F506),
    ADJUST(0x25D1),
    CODE(0xE714),
    MONITOR(0x1F4BB),
    INFINITY(0x221E),
    LIGHT_BULB(0x1F4A1),
    CREDIT_CARD(0x1F4B3),
    DATABASE(0x1F4F8),
    VOICEMAIL(0x2707),
    CLIPBOARD(0x1F4CB),
    CART(0xE73D),
    BOX(0x1F4E6),
    TICKET(0x1F3AB),
    RSS(0xE73A),
    SIGNAL(0x1F4F6),
    THERMOMETER(0x1F4FF),
    WATER(0x1F4A6),
    SWEDEN(0xF601),
    LINE_GRAPH(0x1F4C8),
    PIE_CHART(0x25F4),
    BAR_GRAPH(0x1F4CA),
    AREA_GRAPH(0x1F53E),
    LOCK(0x1F512),
    LOCK_OPEN(0x1F513),
    LOGOUT(0xE741),
    LOGIN(0xE740),
    CHECK(0x2713),
    CROSS(0x274C),
    SQUARED_MINUS(0x229F),
    SQUARED_PLUS(0x229E),
    SQUARED_CROSS(0x274E ),
    CIRCLED_MINUS(0x2296),
    CIRCLED_PLUS(0x2295),
    CIRCLED_CROSS(0x2716),
    MINUS(0x2796),
    PLUS(0x2795),
    ERASE(0x232B),
    BLOCK(0x1F6AB),
    INFO(0x2139),
    CIRCLED_INFO(0xE705),
    HELP(0x2753),
    CIRCLED_HELP(0xE704),
    WARNING(0x26A0),
    CYCLE(0x1F504),
    CW(0x27F3),
    CCW(0x27F2),
    SHUFFLE(0x1F500),
    BACK(0x1F519),
    LEVEL_DOWN(0x21B3),
    RETWEET(0xE717),
    LOOP(0x1F501),
    BACK_IN_TIME(0xE771),
    LEVEL_UP(0x21B0),
    SWITCH(0x21C6),
    NUMBERED_LIST(0xE005),
    ADD_TO_LIST(0xE003),
    LAYOUT(0x268F),
    LIST(0x2630),
    TEXT_DOC(0x1F4C4),
    TEXT_DOC_INVERTED(0xE731),
    DOC(0xE730),
    DOCS(0xE736),
    LANDSCAPE_DOC(0xE737),
    PICTURE(0x1F304),
    VIDEO(0x1F3AC),
    MUSIC(0x1F3B5),
    FOLDER(0x1F4C1),
    ARCHIVE(0xE800),
    TRASH(0xE729),
    UPLOAD(0x1F4E4),
    DOWNLOAD(0x1F4E5),
    SAVE(0x1F4BE),
    INSTALL(0xE778),
    CLOUD(0x2601),
    UPLOAD_CLOUD(0xE711),
    BOOKMARK(0x1F516),
    BOOKMARKS(0x1F4D1),
    OPEN_BOOK(0x1F4D6),
    PLAY(0x25B6),
    PAUS(0x2016),
    RECORD(0x25CF),
    STOP(0x25A0),
    FF(0x23E9),
    FB(0x23EA),
    TO_START(0x23EE),
    TO_END(0x23ED),
    RESIZE_FULL(0xE744),
    RESIZE_SMALL(0xE746),
    VOLUME(0x23F7),
    SOUND(0x1F50A),
    MUTE(0x1F507),
    FLOW_CASCADE(0x1F568),
    FLOW_BRANCH(0x1F569),
    FLOW_TREE(0x1F56A),
    FLOW_LINE(0x1F56B),
    FLOW_PARALLEL(0x1F56C),
    LEFT_BOLD(0xE4AD),
    DOWN_BOLD(0xE4B0),
    UP_BOLD(0xE4AF),
    RIGHT_BOLD(0xE4AE),
    LEFT(0x2B05),
    DOWN(0x2B07),
    UP(0x2B06),
    RIGHT(0x27A1),
    CIRCLED_LEFT(0xE759),
    CIRCLED_DOWN(0xE758),
    CIRCLED_UP(0xE75B),
    CIRCLED_RIGHT(0xE75A),
    TRIANGLE_LEFT(0x25C2),
    TRIANGLE_DOWN(0x25BE),
    TRIANGLE_UP(0x25B4),
    TRIANGLE_RIGHT(0x25B8),
    CHEVRON_LEFT(0xE75D),
    CHEVRON_DOWN(0xE75C),
    CHEVRON_UP(0xE75F),
    CHEVRON_RIGHT(0xE75E),
    CHEVRON_SMALL_LEFT(0xE761),
    CHEVRON_SMALL_DOWN(0xE760),
    CHEVRON_SMALL_UP(0xE763),
    CHEVRON_SMALL_RIGHT(0xE762),
    CHEVRON_THIN_LEFT(0xE765),
    CHEVRON_THIN_DOWN(0xE764),
    CHEVRON_THIN_UP(0xE767),
    CHEVRON_THIN_RIGHT(0xE766),
    LEFT_THIN(0x2190),
    DOWN_THIN(0x2193),
    UP_THIN(0x2191),
    RIGHT_THIN(0x2192),
    ARROW_COMBO(0xE74F),
    THREE_DOTS(0x23F6),
    TWO_DOTS(0x23F5),
    DOT(0x23F4),
    CC(0x1F545),
    CC_BY(0x1F546),
    CC_NC(0x1F547),
    CC_NC_EU(0x1F548),
    CC_NC_JP(0x1F549),
    CC_SA(0x1F54A),
    CC_ND(0x1F54B),
    CC_PD(0x1F54C),
    CC_ZERO(0x1F54D),
    CC_SHARE(0x1F54E),
    CC_REMIX(0x1F54F),
    DB_LOGO(0x1F5F9),
    DB_SHAPE(0x1F5FA);
    
    private final int mIconUtfValue;

    private EntypoIcon(int iconUtfValue) {
        mIconUtfValue = iconUtfValue;
    }

    @Override
    public IconicTypeface getIconicTypeface() {
        return IconicTypeface.ENTYPO;
    }

    @Override
    public int getIconUtfValue() {
        return mIconUtfValue;
    }
}
