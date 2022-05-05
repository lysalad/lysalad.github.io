// window.addEventListener('DOMContentLoaded', function () {
//     document.querySelector('.header').style.display = 'none';
// })

$(function () {
    $('.main_slider').slick({
        arrows: false,
        autoplay: true,
        autoplaySpeed: 1000,
        vertical: true,
        dots: true,
    });



    // $("이벤트 대상 선택").on(function(){코드}) <- 클릭시 실행  .toggleClass(클래스이름)
    // .toggleClass는 선택한 요소에 클래스 값을 넣었다 뺐다 할 수 있음
    // (예) $(요소 p).toggleClass('클래스');


    $('.mopen').on('click', function () {
        $('.gnb').toggleClass('on')

    });


    $('.mopen').click(function () {
        $(this).toggleClass("oo")
    })


})
