function setShopId(i) {
  localStorage.setItem("shopId", i);
}
function checkNull(obj, describe){
  if(obj==null){
    
  }
}
function copyToClipboard(str) {
  var el = document.createElement("textarea");
  el.value = str;
  document.body.appendChild(el);
  el.select();
  document.execCommand("copy");
  document.body.removeChild(el);
}
function getShop() {
  var shopName = document.querySelector(
    "section > div > div > div > div:nth-child(4) > div > div.micro-header > div.main-information.disableSection > div > div > div.main-info-title > h1"
  );
  if(shopName==null)
    console.warn("shopName null");
  var shopAddress = document.querySelector(
    "section > div > div > div > div:nth-child(4) > div > div.micro-header > div.main-information.disableSection > div > div > div.disableSection > div:nth-child(1) > div"
  );
  if (shopAddress == null) console.warn("shopaddress null");

  var shopImg = document
    .querySelector(
      "section > div > div > div > div:nth-child(4) > div > div.micro-header > div.main-image > div > a > img"
    );

  if (shopImg == null) console.warn("shopimg null");

  var resultShop = `lstShop.add(new Shop(shopTypeId, "${
    shopName.innerText
  }", "${shopAddress.innerText}","", "${shopImg.src.substr(28)}"));\n`;
  var shopId = +localStorage.getItem("shopId");
  var arrUsername = [
    "admin",
    "vtluan",
    "dtthien",
    "dttha",
    "tmduc",
    "lhduc",
    "ntmkhai",
    "ntthanh",
    "ntphuong",
    "vtsau",
    "ntthap",
    "adlan",
    "ttthuc",
    "nquyen",
    "hhgiap",
    "ntnho",
    "qtrung",
    "hvhue",
  ];
  for (let i = arrUsername.length - 1; i > 0; i--) {
    const j = Math.floor(Math.random() * (i + 1));
    [arrUsername[i], arrUsername[j]] = [arrUsername[j], arrUsername[i]];
  }

  var arrEvaluate = document.querySelectorAll(
    "div.micro-right1000 > section > div > div > div > div > div.micro-left > div > div.microsite-reviews-box.fd-clearbox.micro-review-list > div.lists.list-reviews > div > ul > li"
  );
  var resultEvaluate = "";
  for (let i = 0; i < arrEvaluate.length; i++) {
    var evaTime = arrEvaluate[i].querySelector(
      "div:nth-child(2) > div.ru-stats > span"
    ).innerText;
    var evaTitle = arrEvaluate[i].querySelector(".rd-title").innerText;
    var evaContent = arrEvaluate[i].querySelector(".rd-des span").innerText;
    var evaRate =
      Math.ceil(
        arrEvaluate[i].querySelector("div.review-points.ng-scope.green > span")
          .innerText
      ) - 5;

    var evaImgsTemp = arrEvaluate[i].querySelectorAll("li> a > img");
    var evaImgs = "";
    evaImgsTemp.forEach((i) => {
      evaImgs += i.src.substr(28) + ";";
    });

    resultEvaluate += `lstEvaluate.add(new Evaluate(${shopId},${evaRate},"${arrUsername[i]}","${evaContent}","${evaTitle}","${evaTime}","${evaImgs}"));`;
  }

  copyToClipboard(resultShop);
  copyToClipboard(resultEvaluate);
  setShopId(shopId++);
}
