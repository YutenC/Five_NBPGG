$("li.logout").on("click", function (){    
    $.ajax({
        url: "/Five_NBP_gg/memberLogoutServlet",
        method: "POST",
        dataType: "json",
        success:function(){
            sessionStorage.clear();
            window.location.href="../index.html";
        }
    })
})


