package de.adito.aditoweb.nbm.vaadinicons;

import de.adito.swing.icon.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.awt.Image;
import java.util.Map;
import java.util.Set;

/**
 * Delivers all icons that are available for the NeonClient
 *
 * @author m.kaspera, 16.07.2020
 */
public interface IVaadinIconsProvider
{

  /**
   * @return Delivers all available icons
   */
  @NotNull
  Map<String, Integer> getAllIcons();

  /**
   * Creates an image based on a name, or <tt>null</tt> if not found
   *
   * @param pName           name of the icon
   * @param pIconAttributes IconAttributes object with the wanted attributes of the icon, e.g. color or size
   * @return the image or <tt>null</tt>
   */
  @Nullable
  Image findImage(@NotNull String pName, @NotNull IconAttributes pIconAttributes);

  @Nullable
  default Image findImage(@NotNull VaadinIcon pVaadinIcon, @NotNull IconAttributes pIconAttributes) {
    return findImage(pVaadinIcon.toString(), pIconAttributes);
  }

  /**
   * Creates an image based on a name, not <tt>null</tt>
   *
   * @param pName           name of the icon
   * @param pIconAttributes IconAttributes object with the wanted attributes of the icon, e.g. color or size
   * @return the image
   * @throws VaadinIconNotFoundException if no Vaadin icon with the passed name is found
   */
  @NotNull
  Image getImage(@NotNull String pName, @NotNull IconAttributes pIconAttributes) throws VaadinIconNotFoundException;

  @NotNull
  default Image getImage(@NotNull VaadinIcon pVaadinIcon, @NotNull IconAttributes pIconAttributes) throws VaadinIconNotFoundException {
    return getImage(pVaadinIcon.toString(), pIconAttributes);
  }

  /**
   * Delivers an image as Base64_String
   *
   * @param pName           name of the icon
   * @param pIconAttributes IconAttributes object with the wanted attributes of the icon, e.g. color or size
   * @return the image as Base64 or <tt>null</tt>
   */
  @Nullable
  String findImageBase64(@NotNull String pName, @NotNull IconAttributes pIconAttributes);

  @Nullable
  default String findImageBase64(@NotNull VaadinIcon pVaadinIcon, @NotNull IconAttributes pIconAttributes) {
    return findImageBase64(pVaadinIcon.toString(), pIconAttributes);
  }

  /**
   * @return Delivers a set of all available iconProviders. Example: NEON, VAADIN, etc.
   */
  @NotNull
  Set<String> getIconProviderIDs();

  /**
   * Enum that contains all possible vaadin icons, the toString method is implemented such that calling toString returns the string necessary
   * to load the icon
   */
  enum VaadinIcon {
    ABACUS,
    ABSOLUTE_POSITION,
    ACADEMY_CAP,
    ACCESSIBILITY,
    ACCORDION_MENU,
    ADD_DOCK,
    ADJUST,
    ADOBE_FLASH,
    AIRPLANE,
    ALARM,
    ALIGN_CENTER,
    ALIGN_JUSTIFY,
    ALIGN_LEFT,
    ALIGN_RIGHT,
    ALT,
    ALT_A,
    AMBULANCE,
    ANCHOR,
    ANGLE_DOUBLE_DOWN,
    ANGLE_DOUBLE_LEFT,
    ANGLE_DOUBLE_RIGHT,
    ANGLE_DOUBLE_UP,
    ANGLE_DOWN,
    ANGLE_LEFT,
    ANGLE_RIGHT,
    ANGLE_UP,
    ARCHIVE,
    ARCHIVES,
    AREA_SELECT,
    ARROW_BACKWARD,
    ARROW_CIRCLE_DOWN,
    ARROW_CIRCLE_DOWN_O,
    ARROW_CIRCLE_LEFT,
    ARROW_CIRCLE_LEFT_O,
    ARROW_CIRCLE_RIGHT,
    ARROW_CIRCLE_RIGHT_O,
    ARROW_CIRCLE_UP,
    ARROW_CIRCLE_UP_O,
    ARROW_DOWN,
    ARROW_FORWARD,
    ARROW_LEFT,
    ARROW_LONG_DOWN,
    ARROW_LONG_LEFT,
    ARROW_RIGHT,
    ARROWS,
    ARROWS_CROSS,
    ARROWS_LONG_H,
    ARROWS_LONG_RIGHT,
    ARROWS_LONG_UP,
    ARROWS_LONG_V,
    ARROW_UP,
    ASTERISK,
    AT,
    AUTOMATION,
    BACKSPACE,
    BACKSPACE_A,
    BACKWARDS,
    BAN,
    BAR_CHART,
    BAR_CHART_H,
    BAR_CHART_V,
    BARCODE,
    BED,
    BELL,
    BELL_O,
    BELL_SLASH,
    BELL_SLASH_O,
    BOAT,
    BOLD,
    BOLT,
    BOMB,
    BOOK,
    BOOK_DOLLAR,
    BOOKMARK,
    BOOKMARK_O,
    BOOK_PERCENT,
    BRIEFCASE,
    BROWSER,
    BUG,
    BUG_O,
    BUILDING,
    BUILDING_O,
    BULLETS,
    BULLSEYE,
    BUSS,
    BUTTON,
    CALC,
    CALC_BOOK,
    CALENDAR,
    CALENDAR_BRIEFCASE,
    CALENDAR_CLOCK,
    CALENDAR_ENVELOPE,
    CALENDAR_O,
    CALENDAR_USER,
    CAMERA,
    CAR,
    CARET_DOWN,
    CARET_LEFT,
    CARET_RIGHT,
    CARET_SQUARE_DOWN_O,
    CARET_SQUARE_LEFT_O,
    CARET_SQUARE_RIGHT_O,
    CARET_SQUARE_UP_O,
    CARET_UP,
    CART,
    CART_O,
    CASH,
    CHART,
    CHART_3D,
    CHART_GRID,
    CHART_LINE,
    CHART_TIMELINE,
    CHAT,
    CHECK,
    CHECK_CIRCLE,
    CHECK_CIRCLE_O,
    CHECK_SQUARE,
    CHECK_SQUARE_O,
    CHEVRON_CIRCLE_DOWN,
    CHEVRON_CIRCLE_DOWN_O,
    CHEVRON_CIRCLE_LEFT,
    CHEVRON_CIRCLE_LEFT_O,
    CHEVRON_CIRCLE_RIGHT,
    CHEVRON_CIRCLE_RIGHT_O,
    CHEVRON_CIRCLE_UP,
    CHEVRON_CIRCLE_UP_O,
    CHEVRON_DOWN,
    CHEVRON_DOWN_SMALL,
    CHEVRON_LEFT,
    CHEVRON_LEFT_SMALL,
    CHEVRON_RIGHT,
    CHEVRON_RIGHT_SMALL,
    CHEVRON_UP,
    CHEVRON_UP_SMALL,
    CHILD,
    CIRCLE,
    CIRCLE_THIN,
    CLIPBOARD,
    CLIPBOARD_CHECK,
    CLIPBOARD_CROSS,
    CLIPBOARD_HEART,
    CLIPBOARD_PULSE,
    CLIPBOARD_TEXT,
    CLIPBOARD_USER,
    CLOCK,
    CLOSE,
    CLOSE_BIG,
    CLOSE_CIRCLE,
    CLOSE_CIRCLE_O,
    CLOSE_SMALL,
    CLOUD,
    CLOUD_DOWNLOAD,
    CLOUD_DOWNLOAD_O,
    CLOUD_O,
    CLOUD_UPLOAD,
    CLOUD_UPLOAD_O,
    CLUSTER,
    CODE,
    COFFEE,
    COG,
    COG_O,
    COGS,
    COIN_PILES,
    COINS,
    COMBOBOX,
    COMMENT,
    COMMENT_ELLIPSIS,
    COMMENT_ELLIPSIS_O,
    COMMENT_O,
    COMMENTS,
    COMMENTS_O,
    COMPILE,
    COMPRESS,
    COMPRESS_SQUARE,
    CONNECT,
    CONNECT_O,
    CONTROLLER,
    COPY,
    COPY_O,
    COPYRIGHT,
    CORNER_LOWER_LEFT,
    CORNER_LOWER_RIGHT,
    CORNER_UPPER_LEFT,
    CORNER_UPPER_RIGHT,
    CREDIT_CARD,
    CROP,
    CROSS_CUTLERY,
    CROSSHAIRS,
    CSS,
    CTRL,
    CTRL_A,
    CUBE,
    CUBES,
    CURLY_BRACKETS,
    CURSOR,
    CURSOR_O,
    CUTLERY,
    DASHBOARD,
    DATABASE,
    DATE_INPUT,
    DEINDENT,
    DEL,
    DEL_A,
    DENTAL_CHAIR,
    DESKTOP,
    DIAMOND,
    DIAMOND_O,
    DIPLOMA,
    DIPLOMA_SCROLL,
    DISC,
    DOCTOR,
    DOCTOR_BRIEFCASE,
    DOLLAR,
    DOT_CIRCLE,
    DOWNLOAD,
    DOWNLOAD_ALT,
    DROP,
    EDIT,
    EJECT,
    ELASTIC,
    ELLIPSIS_CIRCLE,
    ELLIPSIS_CIRCLE_O,
    ELLIPSIS_DOTS_H,
    ELLIPSIS_DOTS_V,
    ELLIPSIS_H,
    ELLIPSIS_V,
    ENTER,
    ENTER_ARROW,
    ENVELOPE,
    ENVELOPE_O,
    ENVELOPE_OPEN,
    ENVELOPE_OPEN_O,
    ENVELOPES,
    ENVELOPES_O,
    ERASER,
    ESC,
    ESC_A,
    EURO,
    EXCHANGE,
    EXCLAMATION,
    EXCLAMATION_CIRCLE,
    EXCLAMATION_CIRCLE_O,
    EXIT,
    EXIT_O,
    EXPAND,
    EXPAND_FULL,
    EXPAND_SQUARE,
    EXTERNAL_BROWSER,
    EXTERNAL_LINK,
    EYE,
    EYEDROPPER,
    EYE_SLASH,
    FACEBOOK,
    FACEBOOK_SQUARE,
    FACTORY,
    FAMILY,
    FAST_BACKWARD,
    FAST_FORWARD,
    FEMALE,
    FILE,
    FILE_ADD,
    FILE_CODE,
    FILE_FONT,
    FILE_MOVIE,
    FILE_O,
    FILE_PICTURE,
    FILE_PRESENTATION,
    FILE_PROCESS,
    FILE_REFRESH,
    FILE_REMOVE,
    FILE_SEARCH,
    FILE_SOUND,
    FILE_START,
    FILE_TABLE,
    FILE_TEXT,
    FILE_TEXT_O,
    FILE_TREE,
    FILE_TREE_SMALL,
    FILE_TREE_SUB,
    FILE_ZIP,
    FILL,
    FILM,
    FILTER,
    FIRE,
    FLAG,
    FLAG_CHECKERED,
    FLAG_O,
    FLASH,
    FLASK,
    FLIGHT_LANDING,
    FLIGHT_TAKEOFF,
    FLIP_H,
    FLIP_V,
    FOLDER,
    FOLDER_ADD,
    FOLDER_O,
    FOLDER_OPEN,
    FOLDER_OPEN_O,
    FOLDER_REMOVE,
    FOLDER_SEARCH,
    FONT,
    FORM,
    FORWARD,
    FROWN_O,
    FUNCION,
    FUNNEL,
    GAMEPAD,
    GAVEL,
    GIFT,
    GLASS,
    GLASSES,
    GLOBE,
    GLOBE_WIRE,
    GOLF,
    GOOGLE_PLUS,
    GOOGLE_PLUS_SQUARE,
    GRAB,
    GRID,
    GRID_BEVEL,
    GRID_BIG,
    GRID_BIG_O,
    GRID_H,
    GRID_SMALL,
    GRID_SMALL_O,
    GRID_V,
    GROUP,
    HAMMER,
    HAND,
    HANDLE_CORNER,
    HANDSHAKE,
    HANDS_UP,
    HARDDRIVE,
    HARDDRIVE_O,
    HASH,
    HEADER,
    HEADPHONES,
    HEADSET,
    HEALTH_CARD,
    HEART,
    HEART_O,
    HOME,
    HOME_O,
    HOSPITAL,
    HOURGLASS,
    HOURGLASS_EMPTY,
    HOURGLASS_END,
    HOURGLASS_START,
    INBOX,
    INDENT,
    INFO,
    INFO_CIRCLE,
    INFO_CIRCLE_O,
    INPUT,
    INSERT,
    INSTITUTION,
    INVOICE,
    ITALIC,
    KEY,
    KEYBOARD,
    KEYBOARD_O,
    KEY_O,
    LAPTOP,
    LAYOUT,
    LEVEL_DOWN,
    LEVEL_DOWN_BOLD,
    LEVEL_LEFT,
    LEVEL_LEFT_BOLD,
    LEVEL_RIGHT,
    LEVEL_RIGHT_BOLD,
    LEVEL_UP,
    LEVEL_UP_BOLD,
    LIFEBUOY,
    LIGHTBULB,
    LINE_BAR_CHART,
    LINE_CHART,
    LINE_H,
    LINES,
    LINES_LIST,
    LINE_V,
    LINK,
    LIST,
    LIST_OL,
    LIST_SELECT,
    LIST_UL,
    LOCATION_ARROW,
    LOCATION_ARROW_CIRCLE,
    LOCATION_ARROW_CIRCLE_O,
    LOCK,
    MAGIC,
    MAGNET,
    MAILBOX,
    MALE,
    MAP_MARKER,
    MARGIN,
    MARGIN_BOTTOM,
    MARGIN_LEFT,
    MARGIN_RIGHT,
    MARGIN_TOP,
    MEDAL,
    MEGAFONE,
    MEH_O,
    MENU,
    MICROPHONE,
    MINUS,
    MINUS_CIRCLE,
    MINUS_CIRCLE_O,
    MINUS_SQUARE_O,
    MOBILE,
    MOBILE_BROWSER,
    MOBILE_RETRO,
    MODAL,
    MODAL_LIST,
    MONEY,
    MONEY_DEPOSIT,
    MONEY_EXCHANGE,
    MONEY_WITHDRAW,
    MOON,
    MOON_O,
    MORNING,
    MOVIE,
    MUSIC,
    MUTE,
    NATIVE_BUTTON,
    NEWSPAPER,
    NOTEBOOK,
    NURSE,
    OFFICE,
    OPEN_BOOK,
    OPTION,
    OPTION_A,
    OPTIONS,
    ORIENTATION,
    OUT,
    OUTBOX,
    PACKAGE,
    PADDING,
    PADDING_BOTTOM,
    PADDING_LEFT,
    PADDING_RIGHT,
    PADDING_TOP,
    PAINTBRUSH,
    PAINT_ROLL,
    PALETE,
    PANEL,
    PAPERCLIP,
    PAPERPLANE,
    PAPERPLANE_O,
    PARAGRAPH,
    PASSWORD,
    PASTE,
    PAUSE,
    PENCIL,
    PHONE,
    PHONE_LANDLINE,
    PICTURE,
    PIE_BAR_CHART,
    PIE_CHART,
    PIGGY_BANK,
    PIGGY_BANK_COIN,
    PILL,
    PILLS,
    PIN,
    PIN_POST,
    PLAY,
    PLAY_CIRCLE,
    PLAY_CIRCLE_O,
    PLUG,
    PLUS,
    PLUS_CIRCLE,
    PLUS_CIRCLE_O,
    PLUS_MINUS,
    PLUS_SQUARE_O,
    POINTER,
    POWER_OFF,
    PRESENTATION,
    PRINT,
    PROGRESSBAR,
    PUZZLE_PIECE,
    PYRAMID_CHART,
    QRCODE,
    QUESTION,
    QUESTION_CIRCLE,
    QUESTION_CIRCLE_O,
    QUOTE_LEFT,
    QUOTE_RIGHT,
    RANDOM,
    RASTER,
    RASTER_LOWER_LEFT,
    RECORDS,
    RECYCLE,
    REFRESH,
    REPLY,
    REPLY_ALL,
    RESIZE_H,
    RESIZE_V,
    RETWEET,
    RHOMBUS,
    ROAD,
    ROAD_BRANCH,
    ROAD_BRANCHES,
    ROAD_SPLIT,
    ROCKET,
    ROTATE_LEFT,
    ROTATE_RIGHT,
    RSS,
    RSS_SQUARE,
    SAFE,
    SAFE_LOCK,
    SCALE,
    SCALE_UNBALANCE,
    SCATTER_CHART,
    SCISSORS,
    SCREWDRIVER,
    SEARCH,
    SEARCH_MINUS,
    SEARCH_PLUS,
    SELECT,
    SERVER,
    SHARE,
    SHARE_SQUARE,
    SHIELD,
    SHIFT,
    SHIFT_ARROW,
    SHOP,
    SIGNAL,
    SIGN_IN,
    SIGN_IN_ALT,
    SIGN_OUT,
    SIGN_OUT_ALT,
    SITEMAP,
    SLIDER,
    SLIDERS,
    SMILEY_O,
    SORT,
    SOUND_DISABLE,
    SPARK_LINE,
    SPECIALIST,
    SPINNER,
    SPINNER_ARC,
    SPINNER_THIRD,
    SPLINE_AREA_CHART,
    SPLINE_CHART,
    SPLIT,
    SPLIT_H,
    SPLIT_V,
    SPOON,
    SQUARE_SHADOW,
    STAR,
    STAR_HALF_LEFT,
    STAR_HALF_LEFT_O,
    STAR_HALF_RIGHT,
    STAR_HALF_RIGHT_O,
    STAR_O,
    START_COG,
    STEP_BACKWARD,
    STEP_FORWARD,
    STETHOSCOPE,
    STOCK,
    STOP,
    STOP_COG,
    STOPWATCH,
    STORAGE,
    STRIKETHROUGH,
    SUBSCRIPT,
    SUITCASE,
    SUN_DOWN,
    SUN_O,
    SUN_RISE,
    SUPERSCRIPT,
    SWORD,
    TAB,
    TAB_A,
    TABLE,
    TABLET,
    TABS,
    TAG,
    TAGS,
    TASKS,
    TAXI,
    TEETH,
    TERMINAL,
    TEXT_HEIGHT,
    TEXT_INPUT,
    TEXT_LABEL,
    TEXT_WIDTH,
    THIN_SQUARE,
    THUMBS_DOWN,
    THUMBS_DOWN_O,
    THUMBS_UP,
    THUMBS_UP_O,
    TICKET,
    TIME_BACKWARD,
    TIME_FORWARD,
    TIMER,
    TOOLBOX,
    TOOLS,
    TOOTH,
    TOUCH,
    TRAIN,
    TRASH,
    TREE_TABLE,
    TRENDIND_DOWN,
    TRENDING_UP,
    TROPHY,
    TRUCK,
    TWIN_COL_SELECT,
    TWITTER,
    TWITTER_SQUARE,
    UMBRELLA,
    UNDERLINE,
    UNLINK,
    UNLOCK,
    UPLOAD,
    UPLOAD_ALT,
    USER,
    USER_CARD,
    USER_CHECK,
    USER_CLOCK,
    USER_HEART,
    USERS,
    USER_STAR,
    VAADIN_H,
    VAADIN_V,
    VIEWPORT,
    VIMEO,
    VIMEO_SQUARE,
    VOLUME,
    VOLUME_DOWN,
    VOLUME_OFF,
    VOLUME_UP,
    WALLET,
    WARNING,
    WORKPLACE,
    WRENCH,
    YOUTUBE,
    YOUTUBE_SQUARE;

    @Override
    public String toString()
    {
      return "VAADIN:" + super.toString();
    }
  }

}

