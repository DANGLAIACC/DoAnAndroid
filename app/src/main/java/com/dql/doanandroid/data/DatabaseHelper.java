package com.dql.doanandroid.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.Editable;
import android.widget.Toast;

import com.dql.doanandroid.model.Dish;
import com.dql.doanandroid.model.Evaluate;
import com.dql.doanandroid.model.Shop;
import com.dql.doanandroid.model.User;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "SearchFood";
    private static final int VERSION = 1;
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
    private final String SHOPIMG = "shopImg";

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
            + SHOPIMG + " text,"
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
        db.execSQL(qryCreateTblDishType);
        db.execSQL(qryCreateTblShopType);
        db.execSQL(qryCreateTblShop);
        db.execSQL(qryCreateTblDish);
        db.execSQL(qryCreateTblUser);
        db.execSQL(qryCreateTblEvaluate);

        addUser(db);
        addShopType(db);
        addShop(db);
        addDishType(db);
        addDish(db);
        addEvaluate(db);
    }

    public void addUser(SQLiteDatabase db) {
        try {
            exampleData.lstUser.forEach(i -> {
                ContentValues content = new ContentValues();

                content.put(USRUSR, i.getUsrUsr());
                content.put(USRPWD, i.getUsrPwd());
                content.put(USRNAME, i.getUsrName());
                content.put(USRADDRESS, i.getUsrAddress());
                content.put(USRGENDER, i.getUsrGender());

                db.insert(TABLE_USER, null, content);
            });
        } catch (Exception ex) {
            System.err.println("line DatabaseHelper.java:129 - ex.getMessage() :" + ex.getMessage());
        }
    }

    public void addShopType(SQLiteDatabase db) {
        try {
            exampleData.lstShopType.forEach(i -> {
                ContentValues content = new ContentValues();
                content.put(SHOPTYPETEXT, i.getShopTypeText());
                db.insert(TABLE_SHOPTYPE, null, content);
            });
        } catch (Exception ex) {
            System.err.println("line DatabaseHelper.java:140 - ex.getMessage() :" + ex.getMessage());
        }
    }

    public void addShop(SQLiteDatabase db) {
        try {
            exampleData.lstShop.forEach(i -> {
                ContentValues content = new ContentValues();
                content.put(SHOPTYPEID, i.getShopTypeId());
                content.put(SHOPNAME, i.getShopName());
                content.put(SHOPADDRESS, i.getShopAddress());
                content.put(SHOPARTICLE, i.getShopArticle());
                content.put(SHOPIMG, i.getShopImg());
                db.insert(TABLE_SHOP, null, content);
            });
        } catch (Exception ex) {
            System.err.println("line DatabaseHelper.java:154 - ex.getMessage() :" + ex.getMessage());
        }
    }

    public void addDishType(SQLiteDatabase db) {
        try {

            exampleData.lstDishType.forEach(i -> {
                ContentValues content = new ContentValues();
                content.put(DISHTYPETEXT, i.getDishTypeText());
                db.insert(TABLE_DISHTYPE, null, content);
            });
        } catch (Exception ex) {
            System.err.println("line DatabaseHelper.java:154 - ex.getMessage() :" + ex.getMessage());
        }
    }

    public void addDish(SQLiteDatabase db) {
        try {
            exampleData.lstDish.forEach(i -> {
                ContentValues content = new ContentValues();
                content.put(SHOPID, i.getShopId());
                content.put(DISHTYPEID, i.getDishTypeId());
                content.put(DISHNAME, i.getDishName());
                content.put(DISHIMG, i.getDishImg());
                content.put(DISHPRICE, i.getDishPrice());
                content.put(DISHARTICLE, i.getDishArticle());
                db.insert(TABLE_DISH, null, content);
            });
        } catch (Exception ex) {
            System.err.println("line DatabaseHelper.java:177 - ex.getMessage() :" + ex.getMessage());
        }
    }

    public void addEvaluate(SQLiteDatabase db) {
        try {
            exampleData.lstEvaluate.forEach(i -> {
                ContentValues content = new ContentValues();
                content.put(SHOPID, i.getShopId());
                content.put(EVARATE, i.getEvaRate());
                content.put(USRUSR, i.getUsrUsr());
                content.put(EVACONTENT, i.getEvaContent());
                content.put(EVATITLE, i.getEvaTitle());
                content.put(EVATIME, i.getEvaTime());
                content.put(EVAIMGS, i.getEvaImgs());
                db.insert(TABLE_EVALUATE, null, content);
            });
        } catch (Exception ex) {
            System.err.println("line DatabaseHelper.java:194 - ex.getMessage() :" + ex.getMessage());
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

    public List<Shop> getNearestShop(String location) {
        List<Shop> lstShop = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor;
        try {
            String qry = String.format("select * from %s where %s like %s or %s like %s",
                    TABLE_SHOP,
                    SHOPNAME,
                    "'%"+location.trim()+"%'",
                    SHOPADDRESS,
                    "'%"+location.trim()+"%'"
            );
//            System.err.println("line DatabaseHelper.java:247 - qry: "+qry);
            cursor = db.rawQuery(qry, null);

            if (cursor.moveToFirst()) {
                do {
                    Shop s = new Shop(
                            cursor.getInt(0),
                            cursor.getInt(5),
                            cursor.getString(1),
                            cursor.getString(2),
                            cursor.getString(3),
                            cursor.getString(4)
                    );
                    lstShop.add(s);
                } while (cursor.moveToNext());
            }
//            System.err.println("line DatabaseHelper.java:263 - lstShop.size(): "+lstShop.size());
            close(db, cursor);
        } catch (Exception e) {
            System.err.println("line DatabaseHelper.java:265 - e.getMessage(): "+e.getMessage());
        }
        return lstShop;
    }

    public List<Shop> getAllShop() {
        List<Shop> lstShop = new ArrayList<>();
        String qry = "select * from " + TABLE_SHOP;
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(qry, null);
        if (cursor.moveToFirst()) {
            do {
                Shop s = new Shop(
                        cursor.getInt(0),
                        cursor.getInt(5),
                        cursor.getString(1),
                        cursor.getString(2),
                        cursor.getString(3),
                        cursor.getString(4)
                );
                lstShop.add(s);
            } while (cursor.moveToNext());
        }
        close(db, cursor);
        return lstShop;
    }

    public Shop getShopById(int id) {
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_SHOP + " WHERE shopId = ?", new String[]{id + ""});
        if (cursor.moveToFirst()) {
            Shop s = new Shop(
                    cursor.getInt(0),
                    cursor.getInt(5),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getString(4)
            );

//            System.err.println("line DatabaseHelper.java:265: Tồn tại shopId = "+id);
            close(db, cursor);
            return s;
        } else {
            Toast.makeText(context, "Không tồn tại shopId = " + id, Toast.LENGTH_SHORT).show();
        }
        close(db, cursor);
        return new Shop(-1, -1, "", "", "", "");
    }

    /**
     * Lấy 1 số món ăn trong shop
     *
     * @param shopId
     * @param number ko lớn hơn 0 thì lấy tất cả
     * @return
     */
    public List<Dish> getDishInShop(int shopId, int number) {
        List<Dish> lstDish = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor;
        if (number <= 0) {
            cursor = db.rawQuery("SELECT * FROM " + TABLE_DISH + " WHERE shopId = ?", new String[]{shopId + ""});
        } else {
            cursor = db.rawQuery("SELECT * FROM " + TABLE_DISH + " WHERE shopId = ? ORDER BY ROWID ASC LIMIT " + number, new String[]{shopId + ""});
        }
        if (cursor.moveToFirst()) {
            do {
                Dish d = new Dish(
                        cursor.getInt(0),
                        cursor.getInt(1),
                        cursor.getInt(2),
                        cursor.getString(3),
                        cursor.getString(4),
                        cursor.getInt(5),
                        cursor.getString(6)
                );
                lstDish.add(d);
            } while (cursor.moveToNext());
        }
        close(db, cursor);
        return lstDish;
    }

    public List<Evaluate> getEvaluateById(String shopId) {
        List<Evaluate> lstEvaluate = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_EVALUATE + " WHERE shopId = ?", new String[]{shopId});
        if (cursor.moveToFirst()) {
            do {
                Evaluate d = new Evaluate(
                        cursor.getInt(0),
                        cursor.getInt(1),
                        cursor.getInt(2),
                        cursor.getString(3),
                        cursor.getString(4),
                        cursor.getString(5),
                        cursor.getString(6),
                        cursor.getString(7)
                );
                lstEvaluate.add(d);
            } while (cursor.moveToNext());
        }
        close(db, cursor);
        return lstEvaluate;
    }

    public User login(String username, String password) {
        String qry = String.format("select * from %s where %s = ? and %s = ?", TABLE_USER, USRUSR, USRPWD);
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery(qry, new String[]{username, password});
        if (cursor.moveToFirst()) {
            User u = new User(
                    cursor.getString(0),
                    cursor.getString(1),
                    cursor.getString(2),
                    cursor.getString(3),
                    cursor.getInt(4)
            );
            close(db, cursor);
            return u;
        }
        close(db, cursor);
        return null;
    }

    private void close(SQLiteDatabase s, Cursor c) {
        c.close();
        s.close();
    }
}
