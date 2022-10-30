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


// register 
$(function () {
    $("#btnSumit").click(function () {
        //variable
        let register_username, register_email, register_password;

        //trim
        register_username = jQuery.trim($("#username").val());
        register_email = jQuery.trim($("#email").val());
        register_password = jQuery.trim($("#password").val());

        //validation email
        if (register_username == "") {
            $("#validation_username").html("Kullanıcı adı boş geçilemez")
        }

        if (register_email == "") {
            $("#validation_email").html("Kullanıcı email boş geçilemez")
        }

        if (register_password == "") {
            $("#validation_password").html("Kullanıcı şifresi boş geçilemez")
        }
    });
});

////////////////////////////////////////////////////////////////////////
//Main
$(function () {
    $('[data-toggle="counter-up]').counterUp({
        delay: 10,
        time: 1000
    })
});



////////////////////////////////////////////////////////////////////////
//FOOTER
//nowdate
let nowDate = () => {
    let date = document.getElementById("now_date").innerHTML = new Date().getFullYear();
}
nowDate();

//backtop
$(function () {
    $(window).scroll(function () {
        if ($(this).scrollTop > 100) {
            $("#back_top").fadeIn('slow');
        } else {
            $("#back_top").fadeOut('slow');
        }
    });

    $("#back_top").click(function () {
        $('html, body').animate({ scrollTop: 0 }, 100, 'easeInOutExpo');
        return false;
    });
});
