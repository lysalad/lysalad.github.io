$(function () {
    /////////////////////////////////////



    //   센터모드 드럽게 안되네 씁 진짜 뭐하냐

    // $('.center').slick({
    //     centerMode: true,
    //     centerPadding: '60px',
    //     slidesToShow: 5,
    //     responsive: [
    //         {
    //             breakpoint: 1200,
    //             settings: {
    //                 arrows: false,
    //                 centerMode: true,
    //                 centerPadding: '40px',
    //                 slidesToShow: 3
    //             }
    //         },
    //         {
    //             breakpoint: 480,
    //             settings: {
    //                 arrows: false,
    //                 centerMode: true,
    //                 centerPadding: '40px',
    //                 slidesToShow: 1
    //             }
    //         }
    //     ]
    // });


    $('.center').slick({
        slidesToShow: 5,
        centerMode: true,
        arrows: false,
        dots: true,
        autoplay: true,

    });

    $('.product_list .s_left').on('click', function () {
        $('.center').slick('slickPrev');
    });


    $('.product_list .s_right').on('click', function () {
        $('.center').slick('slickNext');

    });




    /////////////////////////////////////
})