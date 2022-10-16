//document
//window

/*çoklu yorumlar*/
// camelCase
// PascalCase
// underscore
// hyphens -
//""
//''
//``

//Çıktı:
// console.log("log")
// console.error("error")
// console.warn("warn")
// console.info("info")

//değişkenler
// var x1="merhabalar";
// var x1="denmee"

// let x2="merhabalar";
// const PI=3.141519;


// var degisken=44;
// var degisken41=44;
// var _degisken41=44;
// var $degisken41=44;
// var degiskenAdi=44;

// var +degisken41=44;
// var 545degisken41=44;

//whoisting
// number=14;
// var number;
// console.log(number);

// var employeeName;
// var employee_name;
// var _employee_name;

// let employeeName="Hamit";//String
// console.log(typeof employeeName);

// let employeeSurname="Mızrak";//String
// console.log(typeof employeeSurname);

// let employeeLanguage=5;//Number
// console.log(typeof employeeLanguage);

// let employeeLanguage2=5.456;//Number
// console.log(typeof employeeLanguage2);

// let isTurkish=true; //Boolean
// console.log(typeof isTurkish);

//undefined
// var result=3>1;
// console.log(result)

//operator
// +
// console.log(4+2);

// // -
// console.log(6-2);

// // *
// console.log(6*2);

// // **
// console.log(2**5);
// console.log(Math.pow(2,5));

// // /
// console.log(9/2);

// // %
// console.log(9%2);

// console.log("***************")

// let counter=0;
// console.log(counter)
// console.log(counter++)
// console.log(counter)
// // x++

// console.log("***************")

// let counter2=0;
// console.log(counter2)
// console.log(++counter2)
// console.log(counter2)
// // ++x

// console.log("***************")

// let counter3=5;
// console.log(counter3)
// console.log(counter3--)
// console.log(counter3)
// // x--

// console.log("***************")

// let counter4=5;
// console.log(counter4)
// console.log(--counter4)
// console.log(counter4)
// y--
// --y

//!
// let data=true; 
// console.log(!data)
// ||=VEYA  &=VE

// =   -> ATAMA
// ==  -> EŞİT ancak türlerine bakmadan
// 4=="4" sonuc eşittir

// === -> EŞİT ve Türüne bakarak eşitmi (typeof data)
// 4==="4" sonuc eşit değildir


//Kullanıcıdan veri almak
// let user=prompt("Lütfen isminiz giriniz");
// console.log(user);
// console.log( typeof userData);


// //string -> number (Number)
// //number -> string (String)

// let userData=prompt("Lütfen sayı giriniz");
// console.log(Number(userData**userData));
// console.log( typeof userData);

// let userData2=prompt("Lütfen sayı giriniz");
// console.log(String(userData2**userData2));
// console.log( typeof userData);

//undefined
// var variable;
// console.log(variable);

// //Infinity
// var variable2=4/0;
// console.log(variable2);

// //NaN: not A number
// var variable3=4/"asd";
// console.log(variable3);


// //isNaN 
// console.log(isNaN(44))

// new:hafızan yer açar
// null:hafızayı siler
// zero:değeri yoktur

// escape character 
// console.log("1.satır\n2.satır")
// console.log("3.satır\"4.satır")
// console.log("4.satır\n\t5.satır")

// break: döngüyü orada sonlandırır.
// return: metodu orada sonlandırır.
// continue: sadece 1 kereye o şartın sağlandığında çalışmasın sonra devam etsin
// debugger: debug için point oluşturmaya yarar.

// Math
// console.log(Math.min(2,5,6,2,9,11,-965));
// console.log(Math.max(2,5,6,2,9,11,-965));
// console.log(Math.abs(-965));
// console.log(Math.sqrt(16));
// console.log(Math.sqrt(Math.abs(-16)));
// console.log(Math.pow(2,5));

// //yuvarlamak
// console.log(Math.ceil(4.1));
// console.log(Math.floor(4.9));
// console.log(Math.round(4.4));
// console.log(Math.round(4.5));

// //sin cos
// console.log(Math.sin(45));
// console.log(Math.cos(45));

// //Random
// console.log(Math.random()*4+1);
// console.log(Math.round(Math.random()*4+1));

// Math Ödev
// Kullanıcıda tarafından aldığımız 2 tane sayının
// s1-) Bu sayılardan en küçüğü nedir ?
// s2-) Bu sayılardan en büyüğü nedir ?
// s3-) Bu sayılardan en büyüğü karekökü nedir ?
// s4-) Bu sayılardan en büyüğü karekökünün üste yuvarlıyalım nedir ?
// s5-) Bu sayılardan en küçüğü mutlak değeri nedir ?
// s6-) Bu sayılardan en küçüğü alt taban en büyüğü üst taban şeklinde üstünü alalım ?

//SAYI
// let sayi1=55;
// sayi1=14.5263;
// console.log(sayi1);
// console.log(typeof sayi1);

// //virgüllü sayı
// console.log(sayi1.toFixed(1));

// //bilimsel gösterim
// let bilimselGosterim=13E+5;
// console.log(bilimselGosterim);

// let bilimselGosterim2=13E-5;
// console.log(bilimselGosterim2);

// const sayi12=45000;
// console.log(sayi12.toExponential(3));

// //cast
// //const number41=Number(prompt("sayı girininiz"));

// //Infinity
// let data=44/0;
// console.log(data);

// //NaN
// let data2=44/"asd";
// console.log(data2);

// //Binary: 2 (0-1)
// let binary=0b01011;
// console.log(binary);

// //Octal 8 (0-1-2-3-4-5-6-7)
// let octal=07161;
// console.log(octal);

// //Decimal 10 (0-1-2-3-4-5-6-7-8-9)
// let decimal=10123;
// console.log(decimal);

// //Hexadecimal 16 (0-1-2-3-4-5-6-7-8-9-A-B-C-D-E-F)
// let hexadecimal=0xAbc98;
// console.log(hexadecimal);

//KELIME
let variable = "Html5 Css3 js Öğreniyorum ";
// console.log(variable.length);
// document.writeln(variable.length);
// document.writeln("<br/>"+variable.trim().length);
// document.writeln("<br/>"+variable.toUpperCase());
// document.writeln("<br/>"+variable.toLowerCase());
// document.writeln("<br/>"+variable.startsWith("H"));
// document.writeln("<br/>"+variable.endsWith(" "));
// document.writeln("<br/>"+variable.concat(" ES5+ spring"));
// document.writeln("<br/>"+variable.replace(variable,"backend"));

//saymaya sıfırdan başlar
// document.writeln("<br/>"+variable.substring(1));
// document.writeln("<br/>"+variable.substring(0,4));

// document.writeln("<br/>"+variable.charAt(0));
// document.writeln("<br/>"+variable.indexOf("js"));

//substring
//charAt
//indexOf
//lastIndexOf

/////////////////////////////////////////////////////////
// function deneme1(){
//     document.writeln("<br/>"+"parametresiz ve returnsuz function")
// }
// deneme1()


// function deneme2(adi){
//     document.writeln("<br/>"+"parametreli ve returnsuz function "+adi)
// }
// deneme2("Hamit")


// function deneme3(){
//     return "parametresiz ve returnlu function";
// }
// let resut3=deneme3();
// document.writeln("<br/>"+resut3)


// function deneme4(departmant){
//     return "parametreli ve returnlu function "+departmant;
// }
// let resut4=deneme4("IT");
// document.writeln("<br/>"+resut4)

let data1 = function () {
    let isSoftware = true;
    if (isSoftware) {
        document.writeln("<br/>" + "evet")
    } else {
        document.writeln("<br/>" + "hayır")
    }
}
//data1();


let data2 = function () {
    let isSoftware = true;
    //Ternary
    //(karar) ? "EVET" :"HAYIR" ;
    let result = (isSoftware) ? document.writeln("<br/>" + "evet") : document.writeln("<br/>" + "hayır");
}
//data2();

let data3 = function () {
    let isNumber = Number(prompt("Bir sayı giriniz778863"));
    if (isNumber == 1) {
        5
        document.writeln("<br/>" + "1")
    } else if (isNumber == 2) {
        document.writeln("<br/>" + "2")
    }
    else if (isNumber == 3) {
        document.writeln("<br/>" + "3")
    }
    else if (isNumber == 4) {
        document.writeln("<br/>" + "4")
    }
    else if (isNumber == 5) {
        document.writeln("<br/>" + "5")
    }
    else if (isNumber == 6) {
        document.writeln("<br/>" + "6")
    }
    else if (isNumber == 7) {
        document.writeln("<br/>" + "7")
    } else {
        document.writeln("<br/>" + "1<=X<=7 dışında bir sayıdır")
    }
}
//data3();



let data4 = function () {
    let isNumber = Number(prompt("Bir41 sayı giriniz778863"));

    switch (isNumber) {
        case 1:
            document.writeln("<br/>" + "1")
            break;
        case 2:
            document.writeln("<br/>" + "2")
            break;
        case 3:
            document.writeln("<br/>" + "3")
            break;
        case 4:
            document.writeln("<br/>" + "4")
            break;
        case 5:
            document.writeln("<br/>" + "5")
            break;
        case 6:
            document.writeln("<br/>" + "6")
            break;
        case 7:
            document.writeln("<br/>" + "7")
            break;

        default:
            document.writeln("<br/>" + "1<=X<=7 dışında bir sayıdır")
            break;
    }
}
//data4();

let data5 = function () {
    //for döngüsü
    for (let i = 1; i <= 10; i++) {
        document.write(" " + i)
    }

    document.writeln("<br/>" + "")

    //while döngüsü
    let k = 1;
    while (k <= 10) {
        document.write(" " + k)
        k++;
        // k=k+1;
        // k+=1;
    }

    document.writeln("<br/>" + "")

    //do-while döngüsü
    let m = 1;
    do {
        document.write(" " + m)
        m++;
    }
    while (m <= 10);

}
//data5();

// git / linux 
// mysql 
let data6 = function () {
    let dizi = [];
    dizi[0] = "Ahmet";
    dizi[1] = "Mehmet";
    dizi[2] = 9;
    dizi[3] = false;
    dizi[4] = 14.52;
    dizi[5] = 14.52;

    //for döngüsü(1.YOL)
    for (let i = 0; i < dizi.length; i++) {
        document.write(" " + dizi[i])
    }

    document.writeln("<br/>" + "")


    //for in (indis)
    for (let temp in dizi) {
        document.write(" " + temp)
    }

    document.writeln("<br/>" + "")

    //for of (data)
    for (let temp of dizi) {
        document.write(" " + temp)
    }

    dizi.sort()

    //EKLEMEK
    dizi.push("en son")
    dizi.unshift("en başa")

    //Foreach(4.YOL)
    document.writeln("<br/>" + "")
    dizi.forEach(function (temp) { document.write(" " + temp) })

    //ÇIKARMAK
    dizi.pop()
    dizi.shift()

    //Foreach(4.YOL)
    document.writeln("<br/>" + "")
    dizi.forEach(function (temp) { document.write(" " + temp) })
}
//data6();

let data7 = function () {
    let dizi = [1, 2, 3, 4, 5];
    let dataFilter = dizi.filter((temp) => { return temp >= 3 })
    document.write(" " + dataFilter)

    document.writeln("<br/>" + "")

    let dataMap = dizi.map((temp) => { return temp += 3 })
    document.write(" " + dataMap)
}
//data7();

/////////////////////////////////////////////////////////
// döngüler for/while do-while
// diziler
// object
let data = {
    "adi": "Hamit",
    "soyadi": "Mızrak",
    "isEngineer": true,
    "languageTech": 12
};

//Normal Function
function deneme() { }

//ES5(Anonymous Function)
let data41 = function () { }

//ES6(Arrow Function , fate function)
let data42 = () => { }

let result = () => {
    let person = {
        "firstname": "Hamit",
        "lastname": "Mızrak",
        "isLogin": true,
        "javaTech": ["spring", "springboot", "springmvc", "springsecurity"]
    }
    console.log(person)
    console.log(typeof person)
    console.log(person.firstname.toUpperCase());
    console.log(person.javaTech[0]);
    console.log(person.javaTech[person.javaTech.length - 1]);
}
//result()

let result2 = (adi, soyadi) => {
    this.adi = adi,
        this.soyadi = soyadi
    console.log(this)
}

//result2("Hamit", "Mızrak")
let sum = () => {
    setInterval(function () { console.log("merhabalar") }, 1000);
}
//sum()

//norm function
function normFunctionBirinci(number) {
    console.log(Math.pow(number, 2))
}

function normFunctionIkinci() {
    normFunctionBirinci(4)
}
normFunctionIkinci()

//callback function
function callBackFunctionBirinci(number) {
    console.log(Math.pow(number, 2))
}

function callBackFunctionIkinci(callback) {
    callback(4)
}
callBackFunctionIkinci(callBackFunctionBirinci)




//ÖDEV (if-else for break continue)
//Fonksiyonlarla
//Örnek: 1 ile kullanıcının vereceği (prompt) bitiş sayısına göre
//kullancı: 5 verdi diyelim 1<=X<=5
//1.adım: kaç tane sayı var ?
//2.adım: sayı toplamları var ?
//3.adım: kaç tane tek  sayı var ?
//4.adım: tek sayılar toplamı ?
//5.adım: tek sayılar gösterelim ?
//6.adım: kaç tane çift  sayı var ?
//7.adım: çift sayılar toplamı ?
//8.adım: çift sayılar gösterelim ?
//Eğer verilen sayılarda 7 sayısı varsa bunu eklemesin (continue)
//Eğer bitiş sayısı 100 fazla ise 100'e kadar olanlar toplansın  (break)
//Eğer kullanıcı başlangıç sayıdan küçük girerse uyaralım başlangıçtan büyük girmesini isteyelim
//Eğer kullanıcı secret-key girerse yani 44 sayısını girerse program çalışmayı direk durdursun


//DOM: Document Object Model
//JS => Html+Css+JS
let data10 = () => {
    let userData = prompt("Lütfen bir şey yazınız");
    let value = document.getElementById("paragId");
    value.innerHTML = "<mark><b>" + userData + "</b></mark>";
    //value.innerText = "<b>" + userData + "</b>";
}

//data10();