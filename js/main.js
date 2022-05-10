$(function () {

    // 주석을 만들고 안에다 넣은 후에 일단 해보기!  초보자용 ㅎㅎ
    /////////////////////////////////////

    $('.top_banner i').on('click', function () {
        // 5000은 5초
        $('.top_banner').slideUp(2000);

    })

    // inIt reInit은  slick에서 만든 것! 뭔지는 모르겠당... 알아봐야하나?
    $('.main_slider').on('init reInit afterChange', function () {
        let current = $('.slick-current');
        // addClass까지만 하면 안되는 이유는? 잘 모르겠땅
        current.addClass('on').siblings().removeClass('on')
    })

    $('.main_slider').slick({
        arrows: false,
        dots: true,
        autoplay: true,
        // 기본옵션 상 마우스를 올렸을땐 화면이 slick 하지 않음. 그래서 넣어주는 말.
        pauseOnHover: false,
        pauseOnFocus: false,
    });

    // F12콘솔로그에서 변화를 확인가능



    $('.movie .dec i:nth-of-type(1)').on('click', function () {
        $('.movie video').trigger('play')
    });

    $('.movie .dec i:nth-of-type(2)').on('click', function () {
        $('.movie video').trigger('pause')
    });


    //동영상넣기

    // $('#myMovie').YTPlayer({
    //     videoURL: 'https://youtu.be/TaCdAscgpU0', containment: '.utube', autoPlay: true, mute: true, startAt: 0, opacity: 1
    // })


    $('#myMovie').YTPlayer({
        videoURL: 'https://youtu.be/Qwsh9eZDLyc',
        containment: '.utube',
        autoPlay: true,
        mute: true,
        startAt: 0,
        opacity: 1,
        showControls: false,
        playOnlyIfVisible: true
    })

    $('.utube i:nth-of-type(1)').on('click', function () {
        $('#myMovie').YTPPlay();
    })


    $('.utube i:nth-of-type(2)').on('click', function () {
        $('#myMovie').YTPPause();
    })
    /////////////////////////////////////
})