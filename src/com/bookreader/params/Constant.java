package com.bookreader.params;

public class Constant {
	public final static String M_LINE_NUMBER = "mLineNumber";
	public final static String M_OFFSET = "mOffset";
	public final static String M_IS_MARK = "mIsMark";
	public final static String BOOK = "book";
	public final static String MARK = "mark";
	public final static int DATA_LENGTH = 65535;
	public static String FILE_PATH = "";
	public static String IMAGE_PATH = "";
	public static int BOOK_ID_IN_DATABASE = 0;

	/** For the key of file path ,intent use it */
	public final static String FILE_PATH_KEY = "filePath";

	/** the font size var */
	public final static int FONT16 = 16;
	public final static int FONT18 = 18;
	public final static int FONT20 = 20;
	public final static int FONT22 = 22;
	public final static int FONT24 = 24;

	/** text encode */
	public final static String GB2312 = "GB2312";
	public final static String GBK = "GBK";
	public final static String UTF8 = "UTF-8";

	/** the text color */
	public final static String YELLOW = "黄色";
	public final static String BLACK = "黑色";
	public final static String RED = "红色";
	public final static String GRAY = "灰色";
	public final static String GREEN = "绿色";
	public final static String BLUE = "蓝色";
	public final static String WHITE = "白色";
	/** note */
	public final static String NOTE_TABLE_NAME = "notetable";
	public final static String NOTENAME = "notename";
	public final static String NOTECONTENT = "notecontent";
	public final static String NOTESAVETIME = "notesavetime";
	public final static String NOTECATALOG = "notecatalog";
	public final static String NOTEOFFSET = "noteoffset";

	/** read file error */
	public final static String FILENOTFOUND = "文件无法读取！请返回...";
	public final static String NODATAINFILE = "文件中没有数据！";

	public final static String BOOKMARK = "书签";

	/** mesure text */
	public final static String UPPERASCII = "A";
	public final static String LOWERASCII = "a";
	public final static String CHINESE = "汉";

	/** Percent */
	public final static String PERCENTCHAR = "%";

	/** background */
	public static String QXLY = "清新绿叶";
	public static String HZHX = "火红烛心";
	public static String HYDQ = "黑夜灯桥";
	public static String HSSP = "黄色书皮";
	public static String HSSB = "灰色书本";
	public static String LYXG = "蓝月星光";
	public static String YJST = "忆景思甜";
	public static String PGHS = "苹果灰色";

	/** SQL */
	/** database name */
	public final static String DB_NAME = "coolreader.db";
	public final static int DB_VERSION = 2;

	/** book table name and field */
	public final static String BOOK_TABLE_NAME = "book";
	public final static String BOOK_ID = "bid";
	public final static String BOOK_PATH = "bpath";
	public final static String BOOK_AUTHOR="bauthor";
	public final static String BOOK_CATALOG="bcatalog";
	
	/** book mark table name and field */
	public final static String BOOK_MARK_TABLE_ID = "bmtid";
	public final static String BOOK_MARK_TABLE_NAME = "bookmark";
	public final static String BOOK_MARK_ID = "bmid";
	public final static String BOOK_MARK_NAME = "bmname";
	public final static String BOOK_MARK_X = "bmx";
	public final static String Book_MARK_Y = "bmy";
	
	public final static String BOOK_CATALOG_TABLE_NAME = "catalogtable";
	public final static String BOOK_CATALOG_ID="bcid";
	public final static String BOOK_CATALOG_NAME="bcname";
	
	public final static String BOOK_RECORD_TABLE_NAME = "recordtable";
	public final static String BOOK_RECORD_TABLE_ID = "brtid";
	public final static String BOOK_RECORD_ID="brid";
	public final static String BOOK_RECORD_NAME="brname";
	public final static String BOOK_RECORD_PAGE = "brpage";
	public final static String BOOK_RECORD_X = "brx";
	public final static String Book_RECORD_Y = "bry";
	/** create table */
	public final static String CREATE_TABLE_BOOK = "create table IF NOT EXISTS book(bid integer primary key autoincrement,bauthor varchar(255) not null,bcatalog varchar(255) not null,bpath varchar(255) not null);";
	public final static String CREATE_TABLE_BOOK_MARK = "create table IF NOT EXISTS bookmark(bmtid integer primary key autoincrement,"
			+ "bmid integer not null,bmname varchar(50) not null,bmpage integer not null,bmx integer not null,bmy integer not null);";
	public final static String CREATE_TABLE_BOOK_CATALOG = "create table IF NOT EXISTS catalogtable(bcid integer primary key autoincrement,bcname varchar(255) not null)";
	public final static String CREATE_TABLE_BOOK_RECORD="create table IF NOT EXISTS recordtable(brtid integer primary key autoincrement,brid integer not null,brname varchar(255) not null,brpage integer not null,brx integer not null,bry integer not null,brtime integer not null)";
}
