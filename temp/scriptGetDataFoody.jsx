function getShop() {
  var shopName = document.querySelector(
    "section > div > div > div > div:nth-child(4) > div > div.micro-header > div.main-information.disableSection > div > div > div.main-info-title > h1"
  ).innerText;
  var shopAddress = document.querySelector(
    "section > div > div > div > div:nth-child(4) > div > div.micro-header > div.main-information.disableSection > div > div > div.disableSection > div:nth-child(1) > div"
  ).innerText;

  var shopImg = document
    .querySelector(
      "section > div > div > div > div:nth-child(4) > div > div.micro-header > div.main-image > div > a > img"
    )
    .src.substr(28);

  var resultShop = `lstShop.add(new Shop(shopTypeId, "${shopName}", "${shopAddress}","", "${shopImg}"));\n`;

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
    var evaRate = Math.ceil(
      arrEvaluate[i].querySelector("div.review-points.ng-scope.green > span")
        .innerText
    )-5;

    var evaImgsTemp = arrEvaluate[i].querySelectorAll("li> a > img");
    var evaImgs = "";
    evaImgsTemp.forEach((i) => {
      evaImgs += i.src.substr(28) + ";";
    });

    resultEvaluate += `lstEvaluate.add(new Evaluate(shopId,${evaRate},"${arrUsername[i]}","${evaContent}","${evaTitle}","${evaTime}","${evaImgs}"));`;
  }

  console.warn(resultShop);
  console.warn(resultEvaluate);
}
