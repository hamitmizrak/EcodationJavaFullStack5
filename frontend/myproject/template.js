// search autocomplete
$(function () {
    const searchData = ["action", "action1", "blog", "circle", "java", "javascript"];
    $("#tags").autocomplete({
        source: searchData
    })
});

// dark light button
let darkLight = () => {
    //alert("dark light")
    document.body.classList.toggle("dark_mode");
}