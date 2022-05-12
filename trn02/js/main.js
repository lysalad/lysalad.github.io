$(function () {

    // 주석을 만들고 안에다 넣은 후에 일단 해보기!  초보자용 ㅎㅎ
    /////////////////////////////////////

    $('.top_banner i').on('click', function () {
        // 5000은 5초
        $('.top_banner').slideUp(2000);

    });

    // inIt reInit은  slick에서 만든 것! 뭔지는 모르겠당... 알아봐야하나?
    $('.main_slider').on('init reInit afterChange', function () {
        let current = $('.slick-current');
        // addClass까지만 하면 안되는 이유는? 잘 모르겠땅
        current.addClass('on').siblings().removeClass('on');
    });


    $('.main_slider').slick({
        arrows: false,
        dots: true,
        autoplay: true,
        pauseOnHover: false,
        pauseOnFocus: false,
    });


    // F12콘솔로그에서 변화를 확인가능



    $('.movie .dec i:nth-of-type(1)').on('click', function () {
        $('.movie video').trigger('play');
    });

    $('.movie .dec i:nth-of-type(2)').on('click', function () {
        $('.movie video').trigger('pause');
    });


    //동영상넣기

    // $('#myMovie').YTPlayer({
    //     videoURL: 'https://youtu.be/TaCdAscgpU0', containment: '.utube', autoPlay: true, mute: true, startAt: 0, opacity: 1
    // })


    $('#myMovie').YTPlayer({
        videoURL: 'https://youtu.be/Nw8EYsRiAHc?list=PLIQ31hSCknOXzwx_CDrTyCo5Mvhwv9xlt',
        containment: '.utube',
        autoPlay: true,
        mute: true,
        startAt: 0,
        opacity: 1,
        showControls: false,
        playOnlyIfVisible: true
    });

    $('.utube i:nth-of-type(1)').on('click', function () {
        $('#myMovie').YTPPlay();
    });


    $('.utube i:nth-of-type(2)').on('click', function () {
        $('#myMovie').YTPPause();
    });

    /////////////////////슬릭을 이용한 제품 슬라이드와 확대/////////////////////////



    $('.product_slider').slick({
        slidesToShow: 5,
        centerMode: true,
        arrows: false,
        dots: true,
        autoplay: true,

        responsive: [
            {
                breakpoint: 768,
                settings: {
                    slidesToShow: 1,
                }
            },

        ]

    });


    $('.product_list .s_left').on('click', function () {
        $('.product_slider').slick('slickPrev');
    });


    $('.product_list .s_right').on('click', function () {
        $('.product_slider').slick('slickNext');

    });

    /////////////////////하단 게시판창/////////////////////////////////////////

    // function에 c하나 빼먹어서 이게 안되고 있었다니 정말 충격적 그래 컴퓨터야 너는 잘못이 없지... 미안해 내가 꼼꼼하게 살피지 못해서...//////////

    // 앞에 점도 빼먹음...
    $('.tab_link>li').on('click', function () {
        var idx = $(this).index();
        // 그리고 on앞에 점하나 붙이고 removeclass(); 이거 식은땀 안흘렸다고 안되고있네 진짜 레전드다///
        $(this).addClass('on').siblings().removeClass('on');
        $('.tab_content>li').eq(idx).addClass('on').siblings().removeClass('on');
    })


    ////////하단 패밀리링크 만들기////////
    $('.footer #link').on('change', function () {
        var lik = $(this).val();
        if (lik) window.open(lik)
    })


    $('.mbtn').on('click', function () {
        $('nav').toggleClass('on')
        $(this).toggleClass('is-active')

    })


    /////////////////////////////////////////////////////


})