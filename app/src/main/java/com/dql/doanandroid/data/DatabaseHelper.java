package com.dql.doanandroid.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "SearchFood";
    private static final int VERSION = 3;
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


    final String qryCreateTblUser = "CREATE TABLE " + TABLE_USER + " ("
            + USRUSR + " text primary key,"
            + USRPWD + " text not null,"
            + USRNAME + " text,"
            + USRADDRESS + " text,"
            + USRGENDER + " INTEGER);";
    final String qryCreateTblShopType = "CREATE TABLE " + TABLE_SHOPTYPE + " ("
            + SHOPTYPEID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + SHOPTYPETEXT + " text not null);";
    final String qryCreateTblShop = "CREATE TABLE " + TABLE_SHOP + " ("
            + SHOPID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + SHOPNAME + " text not null,"
            + SHOPADDRESS + " text,"
            + SHOPARTICLE + " text,"
            + SHOPTYPEID + " INTEGER);";
    final String qryCreateTblDishType = "CREATE TABLE " + TABLE_DISHTYPE + " ("
            + DISHTYPEID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + DISHTYPETEXT + " text not null);";
    final String qryCreateTblDish = "CREATE TABLE " + TABLE_DISH + " ("
            + DISHID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
            + SHOPID + " INTEGER,"
            + DISHTYPEID + " INTEGER,"
            + DISHNAME + " text not null,"
            + DISHIMG + " text,"
            + DISHPRICE + " integer,"
            + DISHARTICLE + " text);";
    final String qryCreateTblEvaluate = "CREATE TABLE " + TABLE_EVALUATE + " ("
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
        getWritableDatabase();
        this.context = context;
    }

    private ExampleData exampleData = new ExampleData();

    @Override
    public void onCreate(SQLiteDatabase db) {
//        db = this.getWritableDatabase();
        try {

            db.execSQL(qryCreateTblDishType);
            db.execSQL(qryCreateTblShopType);
            db.execSQL(qryCreateTblShop);
            db.execSQL(qryCreateTblDish);
            db.execSQL(qryCreateTblUser);
            db.execSQL(qryCreateTblEvaluate);

        } catch (Exception e) {
            System.err.println("line DatabaseHelper.java:107 - exampleData.getMessage() :" + e.getMessage());
        }

        addUser();
        addShopType();
        addShop();
        addDishType();
        addDish();
        addEvaluate();
    }

    public void addUser() {
        ContentValues content = new ContentValues();
        SQLiteDatabase db = getReadableDatabase();
        exampleData.lstUser.forEach(i -> {
            content.put("usrUsr", i.getUsrUsr());
            content.put("usrPwd", i.getUsrPwd());
            content.put("usrName", i.getUsrName());
            content.put("usrAddress", i.getUsrAddress());
            content.put("usrGender", i.getUsrGender());

            try {
                db.insert(TABLE_USER, null, content);
            } catch (Exception ex) {
                System.err.println("line DatabaseHelper.java:129 - ex.getMessage() :" + ex.getMessage());
            }
        });
    }

    public void addShopType() {
        ContentValues content = new ContentValues();
        SQLiteDatabase db = getReadableDatabase();
        exampleData.lstShopType.forEach(i -> {
            content.put("shopTypeText", i.getShopTypeText());
            try {
                db.insert(TABLE_SHOPTYPE, null, content);
            } catch (Exception ex) {
                System.err.println("line DatabaseHelper.java:140 - ex.getMessage() :" + ex.getMessage());
            }
        });
    }

    public void addShop() {
        ContentValues content = new ContentValues();
        SQLiteDatabase db = getReadableDatabase();

        exampleData.lstShop.forEach(i -> {
            content.put("shopTypeId", i.getShopTypeId());
            content.put("shopName", i.getShopName());
            content.put("shopAddress", i.getShopAddress());
            content.put("shopArticle", i.getShopArticle());
            content.put("shopImg", i.getShopImg());

            try {
                db.insert(TABLE_SHOP, null, content);
            } catch (Exception ex) {
                System.err.println("line DatabaseHelper.java:154 - ex.getMessage() :" + ex.getMessage());
            }
        });
    }

    public void addDishType() {
        ContentValues content = new ContentValues();
        SQLiteDatabase db = getReadableDatabase();

        exampleData.lstDishType.forEach(i -> {
            content.put("dishTypeText", i.getDishTypeText());
            try {
                db.insert(TABLE_DISHTYPE, null, content);
            } catch (Exception ex) {
                Toast.makeText(context, "Thêm Shop thất bại: " + ex.toString(), Toast.LENGTH_SHORT).show();
                System.err.println("line DatabaseHelper.java:154 - ex.getMessage() :" + ex.getMessage());
            }
        });
    }

    public void addDish() {
        ContentValues content = new ContentValues();
        SQLiteDatabase db = getReadableDatabase();
        exampleData.lstDish.forEach(i -> {
            content.put("shopId", i.getShopId());
            content.put("dishTypeId", i.getDishTypeId());
            content.put("dishName", i.getDishName());
            content.put("dishImg", i.getDishImg());
            content.put("dishPrice", i.getDishPrice());
            content.put("dishArticle", i.getDishArticle());
            try {
                db.insert(TABLE_DISH, null, content);
            } catch (Exception ex) {
                System.err.println("line DatabaseHelper.java:177 - ex.getMessage() :" + ex.getMessage());
            }
        });
    }

    public void addEvaluate() {
        ContentValues content = new ContentValues();
        SQLiteDatabase db = getReadableDatabase();

        exampleData.lstEvaluate.forEach(i -> {

            content.put("shopId", i.getShopId());
            content.put("evaRate", i.getEvaRate());
            content.put("usrUsr", i.getUsrUsr());
            content.put("evaContent", i.getEvaContent());
            content.put("evaTitle", i.getEvaTitle());
            content.put("evaTime", i.getEvaTime());
            content.put("evaImgs", i.getEvaImgs());

            try {
                db.insert(TABLE_EVALUATE, null, content);
            } catch (Exception ex) {
                System.err.println("line DatabaseHelper.java:194 - ex.getMessage() :" + ex.getMessage());
            }
        });
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
