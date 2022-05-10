$(function () {
    /////////////////////////////////

    $('.top_banner i').on('click', function () {
        $('.top_banner').slideUp(2000);
    })

    $('.main_slider').on('init reInit afterChange', function () {
        let current = $('.slick-current');
        // siblings에 s하나 빼먹었다고 효과 적용이 안되고 있었음,,,,,,,,
        current.addClass('on').siblings().removeClass('on')
    })

    $('.main_slider').slick({
        arrows: false,
        dots: true,
        autoplay: true,
        pauseOnHover: false,
        pauseOnFocus: false,
    })


    // 아이콘을 바꿔도 잘 돌아가게 만드는 값, i 중에 첫번째
    $('.movie .dec i:nth-of-type(1)').on('click', function () {
        $(this).trigger('play')
    })


    $('.movie .dec i:nth-of-type(2)').on('click', function () {
        $('.movie video').trigger('pause')
    })


    $('.movie .dec i:nth-of-type(2)').on('click', function () {
        $('.movie video').trigger('pause')
    })


    //////////////////////////////////
})