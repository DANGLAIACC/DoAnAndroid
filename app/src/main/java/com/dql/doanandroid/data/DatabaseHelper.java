package com.dql.doanandroid.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "SearchFood";
    private static final int VERSION = 2;
    private Context context;

    private final String TABLE_USER = "user";
    private final String TABLE_DISH = "dish";
    private final String TABLE_DISHTYPE = "dishtype";
    private final String TABLE_EVALUATE = "evaluate";
    private final String TABLE_SHOP = "shop";
    private final String TABLE_SHOPTYPE = "shoptype";

    private final String USRUSR = "usrUsr";
    private final String USRPWD = "usrPwd";
    private final String USRNAME = "usrName";
    private final String USRADDRESS = "usrAddress";
    private final String USRGENDER = "usrGender";


    private final String DISHID = "dishId";
    private final String SHOPID = "shopId";
    private final String DISHTYPEID = "dishTypeId";
    private final String DISHNAME = "dishName";
    private final String DISHIMG = "dishImg";
    private final String DISHPRICE = "dishPrice";
    private final String DISHARTICLE = "dishArticle";

    private final String DISHTYPETEXT = "dishTypeText";

    private final String EVAID = "evaId";
    private final String EVARATE = "evaRate";
    private final String EVACONTENT = "evaContent";
    private final String EVATITLE = "evaTitle";
    private final String EVATIME = "evaTime";
    private final String EVAIMGS = "evaImgs";

    private final String SHOPTYPEID = "shopTypeId";
    private final String SHOPNAME = "shopName";
    private final String SHOPADDRESS = "shopAddress";
    private final String SHOPARTICLE = "shopArticle";
    
    private final String SHOPTYPETEXT = "shopTypeText";


    final String qryCreateTblUser = "CREATE TABLE "+ TABLE_USER + " ("
            + USRUSR + " text primary key,"
            + USRPWD + " text not null,"
            + USRNAME + " text,"
            + USRADDRESS + " text,"
            + USRGENDER + " INTEGER);";
    final String qryCreateTblShopType = "CREATE TABLE "+ TABLE_SHOPTYPE + " ("
            + SHOPTYPEID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + SHOPTYPETEXT + " text not null);";
    final String qryCreateTblShop =  "CREATE TABLE "+ TABLE_SHOP + " ("
            + SHOPID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + SHOPNAME + " text not null,"
            + SHOPADDRESS + " text,"
            + SHOPARTICLE + " text,"
            + SHOPTYPEID + " INTEGER);";
    final String qryCreateTblDishType = "CREATE TABLE "+ TABLE_DISHTYPE + " ("
            + DISHTYPEID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + DISHTYPETEXT + " text not null);";
    final String qryCreateTblDish = "CREATE TABLE "+ TABLE_DISH + " ("
            + DISHID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + SHOPID + " INTEGER,"
            + DISHTYPEID + " INTEGER,"
            + DISHNAME + " text not null,"
            + DISHIMG + " text,"
            + DISHPRICE + " integer,"
            + DISHARTICLE + " text);";
    final String qryCreateTblEvaluate = "CREATE TABLE "+ TABLE_EVALUATE + " ("
            + EVAID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + SHOPID + " INTEGER,"
            + EVARATE + " INTEGER,"
            + USRUSR + " text not null,"
            + EVATITLE + " text,"
            + EVACONTENT + " text,"
            + EVAIMGS + " text,"
            + EVATIME + " text);";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
//        getWritableDatabase();
        this.context = context;

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        try{

            db.execSQL(qryCreateTblDishType);
            db.execSQL(qryCreateTblShopType);
            db.execSQL(qryCreateTblShop);
            db.execSQL(qryCreateTblDish);
            db.execSQL(qryCreateTblUser);
            db.execSQL(qryCreateTblEvaluate);
        }catch(Exception e){
            System.err.println("line DatabaseHelper.java:107 - e.getMessage() :"+e.getMessage());
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DISH);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DISHTYPE);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SHOP);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SHOPTYPE);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EVALUATE);
        onCreate(db);

    }
}
