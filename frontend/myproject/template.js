// search autocomplete
$(function () {
    const searchData = ["action", "action1", "blog", "circle", "java", "javascript"];
    $("#tags").autocomplete({
        source: searchData
    })
})