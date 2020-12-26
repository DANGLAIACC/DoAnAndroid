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

        lstUser.add(new User("admin", "amdin", "Đặng Quốc Lai", "Thủ Đức", 1));
        lstUser.add(new User("vtluan", "vtluan", "Văn Tiến Luận", "Thủ Đức", 1));
        lstUser.add(new User("dtthien", "dtthien", "Đặng Trần Thanh Hiền", "Quận 2", 0));
        lstUser.add(new User("dttha", "dttha", "Đặng Trần Thanh Hà", "Bình Thạnh", 0));
        lstUser.add(new User("tmduc", "tmduc", "Tào Mạnh Đức", "Quận 1", 1));

        lstUser.add(new User("lhduc", "lhduc", "Lưu Huyền Đức", "Quận 2", 1));
        lstUser.add(new User("ntmkhai", "ntmkhai", "Nguyễn Thị Minh Khai", "Quận 3", 0));
        lstUser.add(new User("ntthanh", "ntthanh", "Nguyễn Tất Thành", "Quận 4", 1));
        lstUser.add(new User("ntphuong", "ntphuong", "Nguyễn Tri Phương", "Quận 5", 1));
        lstUser.add(new User("vtsau", "vtsau", "Võ Thị Sáu", "Quận 6", 0));
        lstUser.add(new User("ntthap", "ntthap", "Nguyễn Thị Thập", "Quận 7", 0));
        lstUser.add(new User("adlan", "adlan", "Âu Dương Lân", "Quận 8", 1));
        lstUser.add(new User("ttthuc", "ttthuc", "Trần Thị Thức", "Quận 9", 0));
        lstUser.add(new User("nquyen", "nquyen", "Ngô Quyền", "Quận 10", 1));
        lstUser.add(new User("ntnho", "ntnho", "Nguyễn Thị Nhỏ", "Quận 11", 0));
        lstUser.add(new User("hhgiap", "hhgiap", "Hà Huy Giáp", "Quận 12", 1));
        lstUser.add(new User("qtrung", "qtrung", "Quang Trung", "Quận Gò Vấp", 1));
        lstUser.add(new User("hvhue", "hvhue", "Hồ Văn Huê", "Quận Phú Nhuận", 0));
        lstEvaluate.add(new Evaluate(1, 2, "admin", "evaContent", "evatitle", "evaTime", ""));
        lstShopType.add(new ShopType("Quán ăn"));
        lstShopType.add(new ShopType("Nhà hàng"));
        lstShopType.add(new ShopType("Chỉ bán online"));

        lstDishType.add(new DishType("Thức ăn nhanh"));
        lstDishType.add(new DishType("Bún"));
        lstDishType.add(new DishType("Phở"));
        lstDishType.add(new DishType("Đồ uống"));
        lstDishType.add(new DishType("Cơm"));
        lstDishType.add(new DishType("Cháo"));
        lstDishType.add(new DishType("Bánh mì"));
        lstDishType.add(new DishType("Hamburger"));
        lstDishType.add(new DishType("Mì"));
        lstDishType.add(new DishType("Hủ tíu"));

        lstShop.add(new Shop(1, "Bún Bò Huế Xưa - Vạn Kiếp", "163 Vạn Kiếp, P. 3,  Quận Bình Thạnh, TP. HCM", "", "g72/712196/prof/s576x330/foody-mobile-hmmmmmmmmmm-jpg.jpg"));

        lstEvaluate.add(new Evaluate(1, 2, "nquyen", "Thánh ghiền bún bò ăn thủ ở quán Huế xưa đi nè, ngon mà có nhiều chi nhánh , nay có thêm bán trên app foody ới cái giao tới tận răng.mà nó ngon vừa vị lắm nha quí zị", "Thánh ghiền bún bò thì vào đây", "25/12/2020 22:36", "g72/712196/s800/foody-bun-bo-hue-xua-van-kiep-458-637445326008317090.jpg;"));
        lstEvaluate.add(new Evaluate(1, 3, "adlan", "Bữa thèm cái thấy app đặt ngay về ăn cho đã cái nư thèm, ai ngờ ghiền quá mua thêm 1 tô ăn nữa kaka. Ngon nha, vị đậm đà sate thơm ngon cay chuẩn vị huế , ship nhanh mà nóng nữa", "Ngon Lắm", "17/12/2020 22:43", ""));
        lstEvaluate.add(new Evaluate(1, 2, "vtsau", "Có thể nói quán bún bò này là ngon nhất trước giờ mình từng ăn nè, quán nhìn sạch sẽ, nhân viên vui vẻ", "Ngon nhất từng ăn", "9/11/2020 20:49", ""));
        lstEvaluate.add(new Evaluate(1, 2, "ntthanh", "Quán không chỉ có bún bò ngon mà sa tế cũng siêu ngon nữa. Bữa đi ăn vừa dọn da nhìn mê liền. Ăn vào thì thôi ta nói số dzach.", "Sa tế cũng siêu ngon", "28/10/2020 9:29", ""));
        lstEvaluate.add(new Evaluate(1, 2, "ntthap", "Cá nhân mình thích bún bò xưa nhưng mà phải ghé mua trực tiếp nhen. Chứ order về dễ bị thất vọng lắm :(", "Bún bò ăn ổn khi mua trực tiếp", "25/10/2020 12:03", ""));
        lstEvaluate.add(new Evaluate(1, 2, "dttha", "Bún bò huế và sa tế chất lượng. rất thấm vị, nghe bạn khen nên order thử xem sao. Mùi sate thơm, bò ngon. Em và em em hài lòng lắm ạ", "Bún bò huế", "24/10/2020 17:34", ""));
        lstEvaluate.add(new Evaluate(1, 3, "ttthuc", "Mỗi khi đến đây ăn tôi đều gọi bún bò tái nạm. Không gian rộng, mát mẻ. Nói chung tuyệt vời so với tầm giá", "Nói chung ổn", "20/10/2020 10:16", ""));
        lstEvaluate.add(new Evaluate(1, 2, "hvhue", "Bún bò ăn ở đây ngon, mang về cũng y chang vậy không có bị bớt hay như nào. Tại hôm đó bận việc nhà nên không đến quán được chứ mình thích đến quán để ăn.", "Bún bò ăn ở đây ngon", "17/10/2020 22:35", ""));
        lstEvaluate.add(new Evaluate(1, 3, "ntmkhai", "Nước bún ở đây ngon đậm đà, ăn là ghiền luôn. Lần nào đến quán bún bò trên đường vạn kiếp này mình cũng phải ăn ở đây. Nhân viên phục vụ thức ăn nhanh, nhiệt tình. Quán mát mẻ.", "Ăn là ghiền", "15/10/2020 11:26", ""));
        lstEvaluate.add(new Evaluate(1, 3, "admin", "Mình đã đặt 2 phần bún bò huế ở đây giao về nhà. 1 phần 36k nạm gân chả và 1 phần 41k thập cẩm. Giao hàng nhanh,đóng gói kỹ, còn cả hộp để đựng (thật ra tiền hộp là 3k đã tính chung với tiền bún nhưng lúc xem bill mình mới thấy). Bún hơi ít,rau nhiều,thịt ăn đủ. Nước dùng ăn được nhưng không được đậm đà.", "Bún ngon nhưng không đậm đà", "12/10/2020 12:53", "g72/712196/s285x285/foody-bun-bo-hue-xua-van-kiep-321-637381051852481289.jpg;g72/712196/s285x285/foody-bun-bo-hue-xua-van-kiep-934-637381051844104195.jpg;g72/712196/s285x285/foody-bun-bo-hue-xua-van-kiep-258-637381051832228199.jpg;g72/712196/s285x285/foody-bun-bo-hue-xua-van-kiep-369-637381051822841787.jpg;g72/712196/s285x285/foody-bun-bo-hue-xua-van-kiep-201-637381051810714421.jpg;g72/712196/s285x285/foody-bun-bo-hue-xua-van-kiep-482-637381051796031929.jpg;"));

        lstDish.add(new Dish(
                1,
                3,
                "Bún bò Huế",
                "g72/712196/s800/foody-bun-bo-hue-xua-van-kiep-458-637445326008317090.jpg",
                50000,
                "Bún bò Huế chính gốc."
        ));
        lstDish.add(new Dish(
                1,
                4,
                "Revice chanh muối",
                "https://cf.shopee.vn/file/0cb760e7780f70ccc4b4d8e64fd80bb6",
                50000,
                "Bún bò Huế chính gốc."
        ));

        lstDish.add(new Dish(
                1,
                5,
                "7up",
                "https://sc01.alicdn.com/kf/UTB8mxgiyqrFXKJk43Ovq6ybnpXaX.jpg",
                50000,
                "Bún bò Huế chính gốc."
        ));

// https://www.foody.vn/ho-chi-minh/banh-trang-nuong-da-lat-ntp-binh-thanh
        lstShop.add(new Shop(1, "Bánh Tráng Nướng Đà Lạt NTP Bình Thạnh", "006 Lô B Chung Cư 23/49 Trường Sa, P. 3,  Quận Bình Thạnh, TP. HCM", "", "g19/189751/prof/s576x330/foody-mobile-12365-jpg.jpg"));
        lstEvaluate.add(new Evaluate(2, 2, "admin", "This is the 3rd time to come here. This place shows the possibility of Rice Paper. Most of people in Japan only recognize Rice Paper as the material for Goi Cuon. Hopefully, I have a chance to spread this “Vietnamese Pizza” and “Vietnamese Crape” to Japan.”", "Bánh Tráng Nướng Đà Lạt NTP Bình Thạnh", "11/8/2019 19:14", "g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-291-636954719659962292.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-853-636954719658243388.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-505-636954719656211949.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-677-636954719654493040.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-699-636954719655118103.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-322-636954719652930391.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-984-636954719647773663.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-661-636954719647461134.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-128-636954719646211018.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-261-636954719646367283.jpg;"));
        lstEvaluate.add(new Evaluate(2, 4, "tmduc", "Mình thì không thích ăn bánh tráng cho lắm đến khi ghé qua ăn thử bánh tráng COO2. Bánh tráng ở đây có nhiều loại phong phú và đa dạng, mix với nhau rất tròn vị, bánh tráng nướng đà lạt giòn giòn dai dai cuộn lại mà không hề bị bể vụn ăn ngon lắm, bánh tráng nướng phan rang hay sao mình quên rồi giòn rụm như bánh tráng mình hay bắt gặp được ở mấy xe bánh tráng nướng. Khoai tây chiên (20k hay 25k gì đó mình nhớ không rõ) siêu nhiều, mà ngon chứ không hề kém chất lượng. Bánh tráng cuốn mềm mềm cắn vào nước sốt chảy ra lan toả khắp miệng hoc hic thèm quá. Không gian rộng rãi thoáng mát đối diện bờ kè ngắm cảnh được luôn. Chỗ giữ xe ok ngay chỗ ngồi. Nhân viên phục vụ dễ thương.Giá giao động từ khoảng 10k-35k. Tổng thiệt hại của mấy món dưới là 120k hay hai mươi mấy à, rẻ mà ngon!!!", "Bánh tráng nướng ngon xuất sắc", "14/6/2019 4:13", "g19/189751/s285x285/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-688-636960824517150734.jpg;g19/189751/s285x285/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-877-636960824513400387.jpg;g19/189751/s285x285/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-992-636960824493418980.jpg;"));
        lstEvaluate.add(new Evaluate(2, 3, "vtluan", "Thấy C002 đông lấp phần thiên hạ, NTP nhỏ nhỏ bên cạnh chỉ với chưa tới chục bàn con...Menu cũng đơn giản hơn, ít hơn và ngắn gọn hơn.Ví như mình ăn bên C002 lúc chọn món cũng cực. Vì quá nhiều thứ để lựa, nên bạn nhân viên đứng chờ trong khi quán thì rất đông, nói thật là mình hơi ngại. Cảm giác khẩn trương Không cần thiết, còn NTP thư thả hơn. Nói chính xác là cảm giác thân thiện gần gũi hơn.Ăn cũng ổn. Vị khá nhất quán. Đậm đà. Sốt me ăn kèm hợp bánh tráng vô cùng.Cảm thấy gọi cái nào ra cũng hợp khẩu vị chứ ko đến mức ngồi đoán vị ồ sao bé vi diệu này là cái gì, đây là cái chi như bên kia ]]]", "Ko đông nhưng ăn ổn", "20/11/2017 6:06", "g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-221-636467547994252830.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-126-636467547989402159.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-284-636467547985027349.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-640-636467547980026403.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-722-636467547974081130.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-170-636467547967675092.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-791-636467547960016923.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-565-636467547939055569.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-416-636467547919387081.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-583-636467547906537561.jpg;"));
        lstEvaluate.add(new Evaluate(2, 3, "hhgiap", "Nằm ngay mé sông đường Trường Sa, ngồi vỉa hè nên được hóng mát gió sông. Quán có cả wifi đầy đủ cơ mỗi tội hôm mình đi mạng yếu lắm.Gọi bánh tráng kinh điển, nhân xúc xích, nhân bò. Đều là bánh giòn.Bánh nướng chín giòn đều. Phô mai tuy cho ít quá chừng cơ cũng tạm tạm.Ăn vị đậm đà, ăn cùng sốt me hành phi. Gọi cả hồ lô và nem nướng.Nem ổn. Hồ lô ko ngon lắm.Trà chanh dễ uống cơ ko đậm đà.Cơ từng ăn bên C002 cạnh bên, thấy thích NTP hơn dù ko đông bằng. Đúng nghĩa dòm qua bên kia C002 khách ùn ùn bên này ít khách cũng tội tội.Ăn giòn và ko bị ngán nên khá Ok.", "Bánh tráng nướng bờ kè", "2/11/2017 12:34", "g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-498-636452228746712671.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-559-636452228740774698.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-191-636452228735774303.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-946-636452228733430380.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-228-636452228726711106.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-252-636452228719991817.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-389-636452228714210116.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-348-636452228677801036.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-325-636452228657643213.jpg;g19/189751/s160x160/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-963-636452228641391950.jpg;"));
        lstEvaluate.add(new Evaluate(2, 3, "ntthanh", "Quán này có chi nhánh ở Hùng Vương ăn rất đông ở lề đường góc Hùng Vương và Nguyễn Tri Phương, dạo này quay lại thì không thấy do dời qua địa điểm khác trong nhà nên mình quyết định thử ở Chi nhánh Trường Sa, Bình Thạnh.Bánh tráng có tôm tươi, phần khá bự như hình, nướ chấm me pha ngon.Bánh tráng dẻo hông được ngon lắm do phải có nước me làm nhân nhưng quán lại thay thế bằng nguyên miếng ức gà, khá khô.", "Bánh Tráng Nướng Đà Lạt NTP Bình Thạnh", "26/10/2017 22:20", "g19/189751/s285x285/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-785-636446530129546681.jpg;g19/189751/s285x285/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-794-636446530129859200.jpg;g19/189751/s285x285/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-841-636446530127827797.jpg;"));
        lstEvaluate.add(new Evaluate(2, 4, "ttthuc", "Nay lượn vòng vòng thì thấy quán , kế bên còn có quán C002 được cô Việt Hương review 1 lần , có lẽ vì vậy mà quán này chiếm hết khách của quán NTP , thấy NTP vắng quá nên mình vô , chứ bên C002 đông quá nhìn nản .Nhờ vậy mà bỏ túi đc thêm 1 quán bánh tráng nướng ngon , giá cả hợp túi sv , để xe ngay quán dễ canh .Ngồi vỉa hè thoáng mát nhìn qua bên sông rất thoải mái .SẼ QUAY LẠI", "Bánh Tráng Nướng Đà Lạt NTP Bình Thạnh", "16/4/2017 20:51", "g19/189751/s285x285/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-330-636279726901589604.jpg;g19/189751/s285x285/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-579-636279726911434151.jpg;g19/189751/s285x285/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-618-636279726906590533.jpg;"));
        lstEvaluate.add(new Evaluate(2, 4, "lhduc", "Mình vừa đến đây mua vài phút trước, đây là lần đầu mình tới đây luôn nhưng mà mình thấy cực thích quán này rồi nhé. Anh chị chủ phải nói là siêu dễ thương luôn, giá cả phải chăng mà cực kỳ chất lượng. Ngon dễ sợ luôn, mốt thèm là mình ra đây ăn nữa!", "Bánh Tráng Nướng Đà Lạt NTP Bình Thạnh", "16/3/2017 18:53", ""));
        lstEvaluate.add(new Evaluate(2, 4, "adlan", "Mình đã ăn ở đây rất nhiều lần và lần nào cũng thấy hài lòng hết. Menu đa dạng các món, mình đã thử qua bánh tráng nướng heo quay, bò , hải sản, mực , xúc xích, truyền thống và món nào cũng ngon tuyệt vời. Giá thành rất ổn so với chất lượng , khoảng từ 12k-25k. Đồ uống thì mình mới thử qua trà chanh mật ong, thấy cũng ok lắm. Nước chấm me mình cũng kết lắm nhé, ăn với bánh giòn giòn nóng nóng tuyệt cú mèo luôn. Mình chắc chắn sẽ còn ghé quán lại nhiều lần nữa.", "Giá cả phù hợp, chất lượng thức ăn ngon", "28/12/2016 0:33", "g19/189751/s400x400/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-753-636184820016412148.jpg;g19/189751/s400x400/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-226-636184820016412148.jpg;"));
        lstEvaluate.add(new Evaluate(2, 3, "hvhue", "Đi chơi về trời mưa nên ghé quán này, hôm trước thấy Nguyễn Tri Phương có chi nhánh mà chưa ăn bao giờ nên hôm nay ghé bên đây ăn cho biếtKhông gian ngoài trời nên thoáng, dành cho mấy bạn thích ăn vặt, ngồi tám. Trời mưa nên quán vắng hoe, chỉ có mình với bàn bên cạnhMình gọi phần đặc biệt phô mai, truyền thống phô mai với mực. Độ ngon cũng theo cách sắp xếp của mình luôn. Mình thấy ngon nhất là đặc biệt phô mai tiếp theo là truyền thống rồi tới mực, cái mực ăn dai nhách hà, lúc đầu mình cứ tưởng là mực tươi, thất vọng nặng nề, thì ra là khô mực. Nói chung bánh tráng giòn, nướng liền nên còn nóng lắm. Trà chanh mật ong bình thườngNhân viên nhanh nhẹn, 3 bánh tráng ra liên tục, vừa ăn xong 1 bánh là 1 bánh tiếp theo có ngayTổng thiệt hại là 61k cho 3 bánh tráng với 1 ly trà chanh. Trời mưa ăn bánh tráng nướng nóng giòn là quá tuyệt luôn. Khi nào mình có đi ăn vặt sẽ nhớ tới bánh tráng nướng :)))", "Bánh Tráng Nướng Đà Lạt NTP Bình Thạnh", "9/10/2016 23:41", "g19/189751/s214x214/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-628-636116536364392889.jpg;g19/189751/s214x214/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-698-636116535437808864.jpg;g19/189751/s214x214/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-412-636116532873729113.jpg;g19/189751/s214x214/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-485-636116532866697308.jpg;g19/189751/s214x214/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-888-636116532859196715.jpg;g19/189751/s214x214/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-369-636116532857321582.jpg;g19/189751/s214x214/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-245-636116532855133885.jpg;g19/189751/s214x214/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-133-636116532854040058.jpg;"));
        lstEvaluate.add(new Evaluate(2, 2, "ntthap", "Hôm đó trời se lạnh minh và bạn mình đi ngang qua thấy quán bánh tráng nên ghé vào ăn thử. Quán ngồi lề đường khá thoải mái, sát sông nên mát lạnh luôn 😁😁. Minh thấy quán rất đa dạng các loại bánh tráng. Mình kiu 1 bánh đặc biệt và 2 trà sữa. Bánh ăn ngon giòn. Có vị mặn của ruốt hay con j đó nhỏ xíu, của khô bò và có phô mai, xúc xích nữa. Quán làm khá nhanh. Bánh đặt trong cái rổ nhỏ và Có kéo để cắt bánh. Bên cạnh đó bánh còn bán nhiều đồ ăn khác như hồ lô, xúc xích với nước trà đào, trà sữa. Phù hợp với mọi tuổi luôn 😊😊", "Bánh tráng ngon!", "22/7/2016 20:55", "g19/189751/s400x400/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-530-636048177058961633.jpg;g19/189751/s400x400/foody-banh-trang-nuong-da-lat-ntp-binh-thanh-648-636048177057242996.jpg;g24/235160/avt/c40x40/nucuoithienthan940-avatar-676-636758137616407645.jpg;"));
        lstDish.add(
                new Dish(
                        2,
                        1,
                        "Bánh tráng nướng",
                        "g19/189751/prof/s576x330/foody-mobile-12365-jpg.jpg",
                        45000,
                        "Bánh tráng nướng nhà làm.")
        );

// https://www.foody.vn/ho-chi-minh/mi-tron-delichi-quan-binh-thanh
        lstShop.add(new Shop(2, "Mì Trộn Delichi - Quận Bình Thạnh", "219/4 Ngô Tất Tố, P. 22,  Quận Bình Thạnh, TP. HCM", "", "g105/1040325/prof/s576x330/foody-upload-api-foody-mobile-foody-upload-api-foo-200805120842.jpg"));
        lstEvaluate.add(new Evaluate(2, 3, "ntnho", "Mì trộn thấm vị vô cùng kết hợp với sốt tiêu đen ngon ngất ngây sẽ làm bạn khi thưởng thức xong sẽ bị nghiện ngay đó nha ngoài mì ra thì còn có ngay một phần gà được chiên giòn rụm cắn một phát là say mê luôn nè. Chưa hết đâu nha còn có Coca-Cola mát lạnh nữa chứ quá đã đúng không nào.", "Ăn no cả bụng", "26/10/2020 16:41", "g105/1040325/s214x214/foody-mi-tron-delichi-quan-binh-thanh-198-637393272795406452.jpg;g105/1040325/s214x214/foody-mi-tron-delichi-quan-binh-thanh-494-637393272781686163.jpg;g105/1040325/s214x214/foody-mi-tron-delichi-quan-binh-thanh-281-637393272767935008.jpg;g105/1040325/s214x214/foody-mi-tron-delichi-quan-binh-thanh-909-637393272755935389.jpg;g105/1040325/s285x285/foody-mi-tron-delichi-quan-binh-thanh-323-637393272741092367.jpg;g105/1040325/s285x285/foody-mi-tron-delichi-quan-binh-thanh-911-637393272726288393.jpg;g105/1040325/s285x285/foody-mi-tron-delichi-quan-binh-thanh-586-637393272710964000.jpg;"));
        lstDish.add(new Dish(3, 1, "Mì trộn", "g105/1040325/prof/s576x330/foody-upload-api-foody-mobile-foody-upload-api-foo-200805120842.jpg", 45000, "Bánh tráng nướng nhà làm."));


// https://www.foody.vn/ho-chi-minh/ha-thanh-2-quan-chao-long-binh-dinh
        lstShop.add(new Shop(2, "Hà Thanh 2 - Cháo Lòng Bánh Hỏi Bình Định", "445/7 Nơ Trang Long, P. 13,  Quận Bình Thạnh, TP. HCM", "", "g70/690967/prof/s576x330/foody-mobile-2-jpg-788-636425324485691937.jpg"));
        lstEvaluate.add(new Evaluate(4, 5, "hvhue", "Quán cháo lòng Hà Thanh bữa nay có bán thêm Mì quảng và bánh hỏi thịt nướng, bún thịt nướng nữa.", "Hà Thanh 2 - Cháo Lòng Bánh Hỏi Bình Định", "17/10/2017 19:42", ""));
        lstDish.add(new Dish(4, 6, "Cháo lòng", "g70/690967/prof/s576x330/foody-mobile-2-jpg-788-636425324485691937.jpg", 25000, "Mô tả cháo lòng Bình Định"));

        // 5: https://www.foody.vn/ho-chi-minh/banh-mi-hoang-thanh-hiep-binh
        lstShop.add(new Shop(3, "Bánh Mì Hoàng Thanh - Hiệp Bình", "45A Hiệp Bình, P. Hiệp Bình Chánh,  Quận Thủ Đức, TP. HCM", "", "g78/774198/prof/s576x330/foody-upload-api-foody-mobile-hmkp-jpg-180829103108.jpg"));
        lstEvaluate.add(new Evaluate(5, 4, "vtsau", "Do nhà mình ở Bình Thạnh nên mỗi lần thèm bánh mì của quán đều phải đặt online. Quán khá nổi trên Grab, Now, Baemin, điểm bình chọn của người mua cũng khá cao. Quán phục vụ nhanh, mỗi lần đặt mình đều không phải chờ lâu.- Bánh mì giao đến tận nơi vẫn nóng giòn. Bánh mì đầy ụ nhân, cầm chắc tay.- Bánh mì chà bông gà chắc là best-seller của quán. Chà bông nhiều, mềm, thơm, tan trong miệng, nêm nếm đậm đà, rất vừa miệng, thêm chút pate, dưa leo, hành ngò, nước tương nữa là hết sẩy.Điểm trừ nhỏ: từ sau Tết bánh mì hơi cứng và khôBánh mì gà xé cũng rất đáng thử", "Quá ngon ăn hoài không ngán", "11/4/2020 20:53", "g78/774198/s214x214/foody-banh-mi-hoang-thanh-hiep-binh-877-637222356260441331.jpg;g78/774198/s214x214/foody-banh-mi-hoang-thanh-hiep-binh-522-637222356259660010.jpg;g78/774198/s214x214/foody-banh-mi-hoang-thanh-hiep-binh-701-637222356259034954.jpg;g78/774198/s214x214/foody-banh-mi-hoang-thanh-hiep-binh-697-637222356258097369.jpg;"));
        lstEvaluate.add(new Evaluate(5, 3, "dtthien", "Mình là khách quen đặt đồ ăn online của quán đã gần 1 năm rồi. Quán bán gần như cả ngày, rất đa dạng món ăn, món nào cũng chất lượng! Quán có mặt trên nhiều app Nowfood, Baemin, Grab...- Vị trí: khá xa trung tâm thành phố- Món ăn: bánh mì gà xé, đặc biệt là bánh mì chà bông gà theo mình là ngon nhất menu bánh mì. Chà bông gà nhiều ngập bánh mì, sợi mịn, mềm, vị đậm đà. Bánh mì đầy đủ dưa leo, rau mùi, hành, pate cũng rất thơm ngon. Bánh mì loại đặc ruột, xốp, không bị khô. Xôi gà cũng khá ngon nhưng xôi hơi nhão và hơi ít topping một xíu- Giá cả: tương xứng với chất lượng. Mặc dù giá có tăng một xíu so với trước đây nhưng chất lượng vẫn không đổi", "Rất ngon và chất lượng", "24/3/2020 20:04", "g78/774198/s214x214/foody-banh-mi-hoang-thanh-hiep-binh-767-637206781959365279.jpg;g78/774198/s214x214/foody-banh-mi-hoang-thanh-hiep-binh-593-637206781700962314.jpg;g78/774198/s214x214/foody-banh-mi-hoang-thanh-hiep-binh-925-637206781693774208.jpg;g78/774198/s214x214/foody-banh-mi-hoang-thanh-hiep-binh-378-637206781679241732.jpg;"));
        lstDish.add(new Dish(5, 7, "Bánh mì thịt", "g78/774198/s750x750/7b4d215f-d02d-4a45-b936-58808d0d7146.jpg", 12000, "Đoạn văn mô tả sản phẩm Bánh mì thịt"));
        lstDish.add(new Dish(5, 7, "Combo 5 ổ bánh mì thịt nguội", "g78/774198/s750x750/8374f221-7b77-4846-8327-62db0262-59e09d17-201112090220.jpeg", 94500, "Đoạn văn mô tả sản phẩm Combo 5 ổ bánh mì thịt nguội"));
        lstDish.add(new Dish(5, 7, "Bánh mì xá xíu - gà xé", "g78/774198/s750x750/ab1e5515-4cfd-435d-97a8-cc4a35a6-3cc8650c-201107141715.jpeg", 31500, "Đoạn văn mô tả sản phẩm Bánh mì xá xíu - gà xé"));
        lstDish.add(new Dish(5, 7, "Bánh mì xá xíu - chả lụa", "g78/774198/s750x750/de05d4a0-c9f3-4126-8d6f-ece30627-c0c3694a-201107141702.jpeg", 31500, "Đoạn văn mô tả sản phẩm Bánh mì xá xíu - chả lụa"));
        lstDish.add(new Dish(5, 7, "Bánh hamburger bò", "g78/774198/s750x750/33ed7372-3ba7-4bd3-9261-db2319b2f28d.jpg", 19800, "Đoạn văn mô tả sản phẩm Bánh hamburger bò"));
        lstDish.add(new Dish(5, 8, "Hamburger Bò Trứng- Phômai", "g78/774198/s750x750/f373b672-d37b-480f-9e20-c6052d2b-0c5735d9-201214132952.jpeg", 31500, "Đoạn văn mô tả sản phẩm Hamburger Bò Trứng- Phômai"));
        lstDish.add(new Dish(5, 8, "Hamburger trứng – phô mai", "g78/774198/s750x750/05ddc23c-d982-4464-b50f-9714f2d9-4d4c5fc0-201020073630.jpeg", 19800, "Đoạn văn mô tả sản phẩm Hamburger trứng – phô mai"));
        lstDish.add(new Dish(5, 8, "Hamburger thịt nguội – phô mai", "g78/774198/s750x750/af815396-4dfa-46ba-9bc3-1e118856-fdb633e2-201211142246.jpeg", 29700, "Đoạn văn mô tả sản phẩm Hamburger thịt nguội – phô mai"));
        lstDish.add(new Dish(5, 8, "Hamburger Chả Lụa Ft Chà Bông Heo", "g78/774198/s750x750/d3772665-45ba-4957-b3d3-4cd6d25e-7ffd7b96-201031143602.jpeg", 31500, "Đoạn văn mô tả sản phẩm Hamburger Chả Lụa Ft Chà Bông Heo"));
        lstDish.add(new Dish(5, 8, "Hamburger Chả Lụa Ft Chà Bông Gà", "g78/774198/s750x750/5754478a-e944-4a58-ab59-d52d93e1-7dc2d031-201020074323.jpeg", 31500, "Đoạn văn mô tả sản phẩm Hamburger Chả Lụa Ft Chà Bông Gà"));


        /* 5: https://www.foody.vn/ho-chi-minh/thanh-tung-quan-an-binh-dan */
        lstShop.add(new Shop(3, "Thanh Tùng - Quán Ăn Bình Dân", "52 Đường Số 5, P. Linh Xuân,  Quận Thủ Đức, TP. HCM", "", "g77/760758/prof/s576x330/foody-upload-api-foody-mobile-4-gif-180716104947.jpg"));

        lstDish.add(new Dish(6, 9, "Mì giòn xào hải sản", "ult/s750x750/deli-dish-no-image.png", 30000, "Đoạn văn mô tả sản phẩm Mì giòn xào hải sản"));
        lstDish.add(new Dish(6, 9, "Mì giòn xào thập cẩm", "ult/s750x750/deli-dish-no-image.png", 30000, "Đoạn văn mô tả sản phẩm Mì giòn xào thập cẩm"));
        lstDish.add(new Dish(6, 9, "Mì giòn xào bò", "ult/s750x750/deli-dish-no-image.png", 30000, "Đoạn văn mô tả sản phẩm Mì giòn xào bò"));
        lstDish.add(new Dish(6, 10, "Hủ tiếu xào hải sản", "ult/s750x750/deli-dish-no-image.png", 30000, "Đoạn văn mô tả sản phẩm Hủ tiếu xào hải sản"));
        lstDish.add(new Dish(6, 10, "Hủ tiếu xào bò", "ult/s750x750/deli-dish-no-image.png", 30000, "Đoạn văn mô tả sản phẩm Hủ tiếu xào bò"));
        lstDish.add(new Dish(6, 10, "Hủ tiếu xào thập cẩm", "ult/s750x750/deli-dish-no-image.png", 30000, "Đoạn văn mô tả sản phẩm Hủ tiếu xào thập cẩm"));
        lstDish.add(new Dish(6, 9, "Mì gói xào bò", "ult/s750x750/deli-dish-no-image.png", 30000, "Đoạn văn mô tả sản phẩm Mì gói xào bò"));
        lstDish.add(new Dish(6, 9, "Mì gói xào hải sản", "ult/s750x750/deli-dish-no-image.png", 30000, "Đoạn văn mô tả sản phẩm Mì gói xào hải sản"));
        lstDish.add(new Dish(6, 9, "Mì gói xào thập cẩm", "ult/s750x750/deli-dish-no-image.png", 30000, "Đoạn văn mô tả sản phẩm Mì gói xào thập cẩm"));
        lstDish.add(new Dish(6, 9, "Bún gạo xào bò", "ult/s750x750/deli-dish-no-image.png", 25000, "Đoạn văn mô tả sản phẩm Bún gạo xào bò"));

        /* 7: https://www.foody.vn/ho-chi-minh/cocorico-ga-nuong-phap-rotisserie-duong-f */
        lstShop.add(new Shop(1, "Cocorico - Gà Nướng Pháp Rotisserie - Đường F", "134 Đường F, P. An Phú,  Quận 2, TP. HCM", "", "g5/44053/prof/s576x330/foody-upload-api-foody-mobile-5-jpg-180410161049.jpg"));
        lstEvaluate.add(new Evaluate(7, 3, "ttthuc", "Mình ăn combo 2ng, hình như giá 300k, được 2 món chính và 3 món ăn kèm nha.\nMùi vị khá là đặc trưng, món mang ra nóng hổi luôn.\nMón được đecor trên 1 tấm thớt, đúng nghĩa là tấm thớt luôn, nó nặng chình chịch í 😅\nQuán cho team thích ăn cay nè, có 3 lọai sốt cay, dịu dàng, nồng nàn và dữ dội 😂😂\nCòn mình thì là team tương ớt tương cà thôi ạ 😁\nQuán có 1 lầu, không gian cũng ấm cúng, nhân viên khá nhiệt tình. Thường có chương trình khuyến mãi khi đặt bàn qua foody nha 👍🤑", "Cocorico - Gà Nướng Pháp Rotisserie -***", "19/4/2020 22:43", "g5/44053/s214x214/foody-cocorico-ga-nuong-phap-rotisserie-dien-bien-phu-583-637229329581484387.jpg;g5/44053/s214x214/foody-cocorico-ga-nuong-phap-rotisserie-dien-bien-phu-705-637229329577108990.jpg;g5/44053/s214x214/foody-cocorico-ga-nuong-phap-rotisserie-dien-bien-phu-623-637229329571796013.jpg;g5/44053/s214x214/foody-cocorico-ga-nuong-phap-rotisserie-dien-bien-phu-969-637229329571014687.jpg;"));
        lstEvaluate.add(new Evaluate(7, 2, "admin", "Từng là 1 trong những quán yêu thích của mình, tuy nhiên lần gần đây nhất đúng là thảm họa. Nhân viên có 1 người làm việc ậm ừ, trả lời khách trống không ra vẻ bận rộn (quán không có khách) . Món ăn đợi 1h15' mới đem ra, nhưng heo gà đầy dầu mỡ và có cảm giác để lâu, hôi. Đặc biệt mình và bạn bị TIÊU CHẢY hơn 2 ngày, phải nghỉ làm. Thôi Bye Bye quán mãi mãi -_-.", "Khá buồn cho chất lượng đi xuống", "8/3/2020 20:03", ""));
        lstEvaluate.add(new Evaluate(7, 3, "ntphuong", "Mình đi 2 người, gọi cái combo gồm sườn cây + gà cocorico + rau củ nướng. Kết quả là có được 3 miếng sườn bằng hai ngón tay, một góc gà nướng nhưng là gà công nghiệp mới đau nha, mà đặc biềt sườn và gà ướp dở tệ luôn, không hề thấm tháp mà lại còn hôi heo nữa chứ, và rau củ nướng là một miếng khoai tây bằng múi cau nhỏ xíu với miếng cà rốt cũng nhỏ xíu luôn. Thêm 1 ly nước chanh với 1 ly nươc ép dưa hấu, tổng thiệt hại là gần 500k mà phải ráng nhai cho hết vì thấy tiếc tiền chứ dở quá, ăn như bị cực hình vậy. Mình khuyên nếu với số tiền đó thì nên ăn nhà hàng khác, hoặc thà ăn KFC luôn cho tiết kiệm được một khoản tiền không nhỏ.", "Không đáng tiền.", "24/2/2020 18:16", ""));
        lstEvaluate.add(new Evaluate(7, 4, "ntthanh", "Mình đi ăn 4 người vào chiều chủ nhật, mùa Corona nên vắng khách lắm. Quán trang trí dễ thương, view sống ảo đẹp. Quán cũng khá dễ tìm, đối diện công viên luôn. Nhà mình gọi 1 combo gà 3-4 người 500k, kèm thêm 2 phần súp, khoai tây và bánh mì bơ tỏi.\n\nĂn rất ngon và vừa miệng, hôm nay hết gà Cocorico nên phải gọi loại gà khác, nhưng ăn vẫn rất ngon. Sườn nướng vừa miệng, sốt ngon. Súp ngon, bánh mì bơ tỏi thơm. Nhà mình ăn vừa no, tổng thiệt hại là 800k, thấy giá khá hợp lí. Quán còn dùng ống hút inox bảo vệ môi trường, mình rất thích.\n\nChị nhân viên, mà mình đoán là chủ quán do có 1 mình chỉ phục vụ à, các bạn khác nghỉ vì Corona hết rồi, chị ấy dễ thương và nhiệt tình lắm.\n\nLần sau sẽ quay lại và sẽ đặt trc món gà Cocorico để thưởng thức.", "Quán ngon, ấm cúng", "16/2/2020 21:07", ""));
        lstEvaluate.add(new Evaluate(7, 2, "dtthien", "Chiều nay mình đến gọi 2 phần:\n_ 1 gà nướng cocorino : nửa con nhưng không thấy má đùi đâu hết, chỉ có đoạn đùi nhỏ và toàn là ức, ăn ngán gần chết.Hơn nữa, nhân viên nói là gà ta, nhưng khi mang ra thì là gà công nghiệp, trời ơi tui ngánnn!\n_ 1 phần sườn cây: ƯỚp không thấm, nhạt và hôi heo chứ không hề thơm mùi sườn nướng, chưa kể là phần sườn hơn 200k mà nhỏn có 4 miếng sườn bé tẹo, chứ không phải là sườn cây dài nha!\n_ 1 ly dưa hấu ép và 1 nước chanh (size nhỏ)\nVậy mà tổng thiệt hại hết 430.000. Ăn xong đứng dậy đi về mà cảm giác tiếc tiền vô kể, quá mắc và quá dở. Thề sẽ không bao giờ quay lại đó một lần nào nữa!", "GIÁ QUÁ MẮC SO VỚI GIÁ TRỊ CỦA MÓN ĂN.", "15/1/2020 23:43", ""));
        lstEvaluate.add(new Evaluate(7, 2, "adlan", "🐣🐥🐣🐥🐣🐥\nLên cơn thèm gà nên lượn lờ và thấy COCORICO trên foody đang có chương trình book bàn wa table now được giảm 20% -> 👌🏻. Thật ra vì quán trên đường***khúc 1 chiều rất dễ đi hố nhưng vì decor rất chi là có không khí 🎄⛄️ nên bắt mắt ng đi đường lém!\nOrder thử phần cho 2-3 người dùng thì được chọn 2 món chính cỡ 1/2 và 3 món ăn kèm cỡ vừa, nên tui chọn gà cocorico🍗 và sườn cây bbq 🍖 (ah quên, nếu chọn 2 món chính đều là gà thì giá đúng y trên menu còn nếu chọn heo hay sườn thì thêm 30k/phần). 3 món kèm: cơm thảo mộc, xôi que chiên, khoai tây chiên.\nGà được quay nhưng lại k bị khô thịt, da gà giòn nhẹ và k bị ngấy mỡ. Sườn thịt rất mền, ướp bao thấm gia vị lun ík. Chỉ có k thix cái sốt cocorico ăn với gà: vị cứ lờ lợ hăng hăng khó ăn nhưng vị sốt bbq thì “thơm ngon đến giọt cúi cùng”💧. Nếu ai thix ăn kiểu đậm đà thì nên nhờ nhân viên lấy cho chai tương ướt “quán tự làm” bao ngon tê tái.\nNước ở đây giá tương đối rẻ và pha ngon lém nhaaaa🍹\nThiết nghĩ kiếm đc không gian vừa xinh xẻo vừa yên tĩnh, món ăn hợp vị giá lại k quá “đau tim” thì có thể thử....🍽", "COCORICO", "24/12/2019 23:52", "g5/44053/s160x160/foody-cocorico-ga-nuong-phap-rotisserie-dien-bien-phu-661-637128283754995827.jpg;g5/44053/s160x160/foody-cocorico-ga-nuong-phap-rotisserie-dien-bien-phu-887-637128283743255814.jpg;g5/44053/s160x160/foody-cocorico-ga-nuong-phap-rotisserie-dien-bien-phu-168-637128283733098628.jpg;g5/44053/s160x160/foody-cocorico-ga-nuong-phap-rotisserie-dien-bien-phu-684-637128283721535062.jpg;g5/44053/s160x160/foody-cocorico-ga-nuong-phap-rotisserie-dien-bien-phu-959-637128283711262631.jpg;g5/44053/s160x160/foody-cocorico-ga-nuong-phap-rotisserie-dien-bien-phu-562-637128283705012045.jpg;g5/44053/s160x160/foody-cocorico-ga-nuong-phap-rotisserie-dien-bien-phu-924-637128283695792446.jpg;g5/44053/s160x160/foody-cocorico-ga-nuong-phap-rotisserie-dien-bien-phu-358-637128283684728169.jpg;g5/44053/s160x160/foody-cocorico-ga-nuong-phap-rotisserie-dien-bien-phu-457-637128283673477137.jpg;g5/44053/s160x160/foody-cocorico-ga-nuong-phap-rotisserie-dien-bien-phu-927-637128283662069831.jpg;"));
        lstEvaluate.add(new Evaluate(7, 2, "qtrung", "Nhà hàng không thật thà,ghi là đặt qua tablenow sẽ giảm giá 20%,mà có thấy giảm đâu. Lúc đến nhà hàng mình đã đem mã code đặt đưa cho nhân viên xem, nên lúc tính tiền mình quên ko xem kỹ. Cứ tin tưởng nhà hàng này sẽ như những nhà hàng khác mà mình cũng đặt bàn qua app đó. Ai ngờ lại là ko có, thà lúc đầu mình đưa mã đặt nói luôn không giảm đi.", "Cocorico - Gà Nướng Pháp Rotisserie -***", "8/12/2019 23:53", ""));
        lstEvaluate.add(new Evaluate(7, 3, "tmduc", "Order 4 món dc mỗi gà nướng và sốt ngon", "Cocorico - Gà Nướng Pháp Rotisserie -***", "28/11/2019 21:58", "g5/44053/s800/foody-cocorico-ga-nuong-phap-rotisserie-dien-bien-phu-224-637105751264698579.jpg;"));
        lstEvaluate.add(new Evaluate(7, 5, "ntnho", "Gà ngon lắm nha, không bở, không dai, đậm vị nha.\nSườn non mềm, thấm.\nNước chắm vs sốt ớt rất đặc biệt nha\nKhông gian siêu xinh !!!!", "Quán đẹp - đồ ăn siêu siêu ngon", "28/11/2019 21:31", "g5/44053/s400x400/foody-cocorico-ga-nuong-phap-rotisserie-dien-bien-phu-479-637105735093146737.jpg;g5/44053/s400x400/foody-cocorico-ga-nuong-phap-rotisserie-dien-bien-phu-711-637105735090177742.jpg;"));
        lstEvaluate.add(new Evaluate(7, 3, "nquyen", "Nchug ok, lần mình đi 14h cả quán có mỗi bàn mình. Đói ăn thấy ngon, nếu để gọi là no thì nên kêu thêm side dish. Đồ chua rất đã. Có điều khuyên là nên ghé đúng bữa (khi vắng có thể ra đồ ăn bị lâu vì phải restart bếp cái này quán nướng nào mình đi cũng thế thui). Well có vẻ thân thiện nên mình ko xét nét chuyện giá cả vs chất lượng. Menu dễ nhìn và nhiều thứ để chọn.", "Review sau 2 tháng (mới lục lại hình)", "26/8/2019 0:35", "g5/44053/s800/foody-cocorico-ga-nuong-phap-rotisserie-dien-bien-phu-775-637023765103027815.jpg;"));
        lstDish.add(new Dish(5, 1, "1/2 gà Cocorico", "g5/44053/s750x750/2017121912415-1x1-gaccrc.jpg", 159000, "Đoạn văn mô tả sản phẩm 1/2 gà Cocorico"));
        lstDish.add(new Dish(5, 1, "1/2 heo Porchetta", "g5/44053/s750x750/2017121912430-1x1-porchetta.jpg", 182000, "Đoạn văn mô tả sản phẩm 1/2 heo Porchetta"));
        lstDish.add(new Dish(5, 1, "1/2 sườn cây BBQ", "g5/44053/s750x750/2017121912443-1x1-suonbbq.jpg", 193000, "Đoạn văn mô tả sản phẩm 1/2 sườn cây BBQ"));
        lstDish.add(new Dish(5, 1, "1/2 gà Cajun", "g5/44053/s750x750/2017121912356-1x1-gacajun.jpg", 149000, "Đoạn văn mô tả sản phẩm 1/2 gà Cajun"));
        lstDish.add(new Dish(5, 1, "1/2 gà Jalapeno", "g5/44053/s750x750/2017121912317-1x1-gacajun.jpg", 149000, "Đoạn văn mô tả sản phẩm 1/2 gà Jalapeno"));
        lstDish.add(new Dish(5, 1, "1 gà nướng Cocorico", "g5/44053/s750x750/20171219115422-1x1-gaccrc.jpg", 285000, "Đoạn văn mô tả sản phẩm 1 gà nướng Cocorico"));
        lstDish.add(new Dish(5, 1, "1 gà nướng Cajun", "g5/44053/s750x750/20171219115953-1x1-gacajun.jpg", 275000, "Đoạn văn mô tả sản phẩm 1 gà nướng Cajun"));
        lstDish.add(new Dish(5, 1, "1 sườn cây BBQ", "g5/44053/s750x750/20171219115921-1x1-suonbbq.jpg", 351000, "Đoạn văn mô tả sản phẩm 1 sườn cây BBQ"));
        lstDish.add(new Dish(5, 1, "1 heo Porchetta", "g5/44053/s750x750/20171219115658-1x1-porchetta.jpg", 341000, "Đoạn văn mô tả sản phẩm 1 heo Porchetta"));
        lstDish.add(new Dish(5, 1, "1 gà Jalapeno", "g5/44053/s750x750/2017121912244-1x1-gacajun.jpg", 275000, "Đoạn văn mô tả sản phẩm 1 gà Jalapeno"));

    }
}
