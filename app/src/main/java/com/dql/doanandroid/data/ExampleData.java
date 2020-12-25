package com.dql.doanandroid.data;

import com.dql.doanandroid.model.Dish;
import com.dql.doanandroid.model.DishType;
import com.dql.doanandroid.model.Evaluate;
import com.dql.doanandroid.model.Shop;
import com.dql.doanandroid.model.ShopType;
import com.dql.doanandroid.model.User;

import java.util.ArrayList;

public class ExampleData {
    ArrayList<User> lstUser;
    ArrayList<ShopType> lstShopType;
    ArrayList<Shop> lstShop;
    ArrayList<DishType> lstDishType;
    ArrayList<Dish> lstDish;
    ArrayList<Evaluate> lstEvaluate;

    public ExampleData() {
        lstUser = new ArrayList<>();
        lstShopType = new ArrayList<>();
        lstShop = new ArrayList<>();
        lstDishType = new ArrayList<>();
        lstDish = new ArrayList<>();
        lstEvaluate = new ArrayList<>();

        lstUser.add(new User("admin","amdin","Đặng Quốc Lai","Thủ Đức", 1));
        lstUser.add(new User("vtluan","vtluan","Văn Tiến Luận","Thủ Đức", 1));
        lstUser.add(new User("dtthien","dtthien","Đặng Trần Thanh Hiền","Quận 2", 0));
        lstUser.add(new User("dttha","dttha","Đặng Trần Thanh Hà","Bình Thạnh", 0));

        lstUser.add(new User("tmduc","tmduc","Tào Mạnh Đức","Quận 1", 1));

        lstUser.add(new User("lhduc","lhduc","Lưu Huyền Đức","Quận 2", 1));
        lstUser.add(new User("ntmkhai","ntmkhai","Nguyễn Thị Minh Khai","Quận 3", 0));
        lstUser.add(new User("ntthanh","ntthanh","Nguyễn Tất Thành","Quận 4", 1));
        lstUser.add(new User("ntphuong","ntphuong","Nguyễn Tri Phương","Quận 5", 1));
        lstUser.add(new User("vtsau","vtsau","Võ Thị Sáu","Quận 6", 0));
        lstUser.add(new User("ntthap","ntthap","Nguyễn Thị Thập","Quận 7", 0));
        lstUser.add(new User("adlan","adlan","Âu Dương Lân","Quận 8", 1));
        lstUser.add(new User("ttthuc","ttthuc","Trần Thị Thức","Quận 9", 0));
        lstUser.add(new User("nquyen","nquyen","Ngô Quyền","Quận 10", 1));
        lstUser.add(new User("ntnho","ntnho","Nguyễn Thị Nhỏ","Quận 11", 0));
        lstUser.add(new User("hhgiap","hhgiap","Hà Huy Giáp","Quận 12", 1));
        lstUser.add(new User("qtrung","qtrung","Quang Trung","Quận Gò Vấp", 1));
        lstUser.add(new User("hvhue","hvhue","Hồ Văn Huê","Quận Phú Nhuận", 0));
        lstEvaluate.add(new Evaluate(1,2,"admin","evaContent","evatitle","evaTime",""));
        lstShopType.add(new ShopType("Quán ăn"));
        lstShopType.add(new ShopType("Nhà hàng"));
        lstShopType.add(new ShopType("Chỉ bán online"));

        lstShop.add(new Shop(1,"Bếp Dựng - Phá Lấu & Bánh Ướt Lòng Gà","1/1D Đường Số 18, P. Linh Chiểu,  Quận Thủ Đức, TP. HCM","","g106/1059315/prof/s576x330/file_restaurant_photo_klot_16079-ab2da1ee-201214114028.jpg"));
        lstShop.add(new Shop(1,"2 Quỳnh - Cơm & Bún Thịt Nướng","25 Đường Số 8 , P. Linh Trung,  Quận Thủ Đức, TP. HCM","","g100/999445/prof/s576x330/image-023e4f12-200910114154.jpeg"));
        lstShop.add(new Shop(1,"Bánh 9 Sạch - Bánh Sầu Riêng - Đường Số 7", "61 Đường Số 7, P. Thạnh Mỹ Lợi,  Quận 2, TP. HCM","", "g106/1052143/prof/s576x330/foody-upload-api-foody-mobile-93524d78-38af-471e-9-201021173958.jpg"));
        lstShop.add(new Shop(1,"Happy Veggie - Quán Chay", "33/12 Quốc Hương, P. Thảo Điền,  Quận 2, TP. HCM","",  "g102/1019157/prof/s576x330/foody-upload-api-foody-mobile-cach-nuosng-muc-4-201214160501.jpg"));
        lstShop.add(new Shop(1,"Ốc Cây Keo - Bình Quới", "153 Bình Quới,  Quận Bình Thạnh, TP. HCM","",  "g8/79320/prof/s576x330/foody-mobile-foody-oc-cay-keo-bin-146-635748136412849358.jpg"));
        lstShop.add(new Shop(1,"Bún Bò Huế Xưa - Vạn Kiếp", "163 Vạn Kiếp, P. 3,  Quận Bình Thạnh, TP. HCM","",   "g72/712196/prof/s576x330/foody-mobile-hmmmmmmmmmm-jpg.jpg"));


    }
}
